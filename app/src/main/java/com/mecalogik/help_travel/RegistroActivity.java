package com.mecalogik.help_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class RegistroActivity extends AppCompatActivity {


    EditText NombresR, ApellidosR, CorreoElectronicoR, Contraseña, ConfirmacionCon;
    Button AccesoR;


    public String name= "";
    public String apellidos= "";
    public String email= "";
    public String password= "";
    public String confirmacion= "";

    FirebaseAuth mAuth;
    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        getSupportActionBar().hide();


        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();


        NombresR = findViewById(R.id.nombreEtxR);
        ApellidosR = findViewById(R.id.areatxR);
        CorreoElectronicoR = findViewById(R.id.correoEtxR);
        Contraseña = findViewById(R.id.contraseñaEtxR);
        ConfirmacionCon = findViewById(R.id.contraseñaConfirEtxR);

        AccesoR = findViewById(R.id.accesobtnR);









        AccesoR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                name = NombresR.getText().toString().trim();
                apellidos = ApellidosR.getText().toString().trim();
                email = CorreoElectronicoR.getText().toString().trim();
                password = Contraseña.getText().toString().trim();
                confirmacion = ConfirmacionCon.getText().toString().trim();


                if (password.equals("") || confirmacion.equals("")){
                    Toast.makeText(RegistroActivity.this, "No es la contraseña", Toast.LENGTH_SHORT).show();

                } else
                if (!name.isEmpty() && !apellidos.isEmpty() && !email.isEmpty() && !password.isEmpty()){
                    if (password.length() >=6){
                        registerUser();

                    }else {
                        Toast.makeText(RegistroActivity.this, "La contaseña debe tener minimo 6 carateres", Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(RegistroActivity.this, "Registar Campos", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }


    private void registerUser(){
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(Task<AuthResult> task) {
                if (task.isSuccessful()){

                    Map<String, Object> map = new HashMap<>();
                    map.put("name", name);
                    map.put("apellidos", apellidos);
                    map.put("email", email);
                    map.put("password", password);

                    String id = mAuth.getCurrentUser().getUid();

                    mDatabase.child("Users").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(Task<Void> task2) {
                            if (task2.isSuccessful()){
                                startActivity(new Intent(RegistroActivity.this, MainActivity.class));
                                finish();
                            }else {
                                Toast.makeText(RegistroActivity.this, "Error al crear Usuario", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }else {
                    Toast.makeText(RegistroActivity.this, "El Correo o el Usuario ya existe intente con uno diferente.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();

        if (mAuth.getCurrentUser() != null){
            startActivity(new Intent(RegistroActivity.this, MainActivity.class));
            finish();
        }
    }
}
