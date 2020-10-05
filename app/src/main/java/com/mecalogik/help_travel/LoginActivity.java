package com.mecalogik.help_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {


    EditText EmailL;
    EditText ContraseñaL;
    Button AccesoL;
    TextView Registro;

    private String emial = "";
    private String password = "";

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();


        EmailL = findViewById(R.id.correoLogin);
        ContraseñaL = findViewById(R.id.passwordLogin);
        AccesoL = findViewById(R.id.btnLogin);
        Registro = findViewById(R.id.txtRegisterLogin);

        mAuth = FirebaseAuth.getInstance();


        AccesoL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emial = EmailL.getText().toString().trim();
                password = ContraseñaL.getText().toString().trim();

                if (!emial.isEmpty() && !password.isEmpty()) {
                    loginUsers();

                } else {
                    Toast.makeText(LoginActivity.this, "Completar los campos", Toast.LENGTH_SHORT).show();
                }


            }
        });

        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);
            }
        });


    }
    private void loginUsers() {

        mAuth.signInWithEmailAndPassword(emial, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "No se puedo iniciar sesion verificar los datos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (mAuth.getCurrentUser() != null) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }

    }

}

