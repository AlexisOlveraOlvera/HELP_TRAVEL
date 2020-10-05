package com.mecalogik.help_travel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ToursActivity extends AppCompatActivity {

    ImageView Acueductour, MiTour, MotoTour, PeñaTour;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);

        getSupportActionBar().hide();


        Acueductour = findViewById(R.id.imageAcueductour);
        MiTour = findViewById(R.id.imageMitour);
        MotoTour = findViewById(R.id.imageMotoTour);
        PeñaTour = findViewById(R.id.imagePeñaTour);


        Acueductour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAcueductour = new Intent(getApplicationContext(), AcueducDespleActivity.class);
                startActivity(intentAcueductour);
            }
        });


        MiTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMiTour = new Intent(getApplicationContext(), MiTourDespleActivity.class);
                startActivity(intentMiTour);
            }
        });


        MotoTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMoto = new Intent(getApplicationContext(), MotoDespleActivity.class);
                startActivity(intentMoto);
            }
        });

        PeñaTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPeña = new Intent(getApplicationContext(), PenaTourActivity.class);
                startActivity(intentPeña);
            }
        });



        String urlAcue = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FTours%2Facueductour.png?alt=media&token=40fc00a2-d9a7-45c2-ae30-2cbd3b2e66d7";
        Glide.with(getApplicationContext()).load(urlAcue).into(Acueductour);

        String urlMiTour = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FTours%2Fmi%20tour.png?alt=media&token=a05ec00d-45b8-4a83-ba8e-7cd48b26eb22";
        Glide.with(getApplicationContext()).load(urlMiTour).into(MiTour);


        String urlMmoto = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FTours%2Fmoto%20tours.png?alt=media&token=4c8c9a2b-37ee-42b7-b9c6-eb5c7a43405f";
        Glide.with(getApplicationContext()).load(urlMmoto).into(MotoTour);


        String urlPeña = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FTours%2Fla%20pe%C3%B1a%20tours.png?alt=media&token=3d829ccf-752a-4e84-9d4e-62b301e2fdff";
        Glide.with(getApplicationContext()).load(urlPeña).into(PeñaTour);



    }
}
