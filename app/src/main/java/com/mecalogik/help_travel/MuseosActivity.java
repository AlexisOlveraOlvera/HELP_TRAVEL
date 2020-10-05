package com.mecalogik.help_travel;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;

        import com.bumptech.glide.Glide;

public class MuseosActivity extends AppCompatActivity {

    ImageView Donberna, Insectos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museos);

        getSupportActionBar().hide();


        Donberna = findViewById(R.id.imageDon);
        //Insectos = findViewById(R.id.imageInse);

        Insectos = findViewById(R.id.imageInsec);

        Donberna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDon = new Intent(getApplicationContext(), DonBernaDespleActivity.class);
                startActivity(intentDon);

            }
        });



        String urlDon = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Museos%2FMuseos%2Fdon%20berna.png?alt=media&token=6705722a-2d16-4f36-848b-9d1361d691d1";
        Glide.with(getApplicationContext()).load(urlDon).into(Donberna);

        String urlInsec = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Museos%2FMuseos%2Finsectos.png?alt=media&token=19437ab8-b4ac-4d98-ae65-f5fb6965e731";
        Glide.with(getApplicationContext()).load(urlInsec).into(Insectos);


    }
}
