package com.mecalogik.help_travel;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;
import com.synnapps.carouselview.ViewListener;


public class MainActivity extends AppCompatActivity {



    ImageView Tours, Museos;
    ImageView Image3, Image4, Image5, Image6;

   SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        Tours = findViewById(R.id.imageTours);
        Museos = findViewById(R.id.imageMuseos);

        Image3 = findViewById(R.id.imageView4);
        Image4 = findViewById(R.id.imageView5);
        Image5 = findViewById(R.id.imageView6);
        Image6 = findViewById(R.id.imageView7);






       sliderLayout = findViewById(R.id.sliderprinci);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.WORM);
        sliderLayout.setSliderTransformAnimation ( SliderAnimations .SIMPLETRANSFORMATION );
        sliderLayout.setScrollTimeInSec(4);

        setSliderViews();


        Tours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTours = new Intent(getApplicationContext(),ToursActivity.class);
                startActivity(intentTours);
            }
        });

        Museos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMuseos = new Intent(getApplicationContext(), MuseosActivity.class);
                startActivity(intentMuseos);
            }
        });



        Image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "En Construcción", Toast.LENGTH_SHORT).show();
            }
        });

        Image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "En Construcción", Toast.LENGTH_SHORT).show();
            }
        });


        Image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "En Construcción", Toast.LENGTH_SHORT).show();
            }
        });

        Image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "En Construcción", Toast.LENGTH_SHORT).show();
            }
        });



    }




    private void setSliderViews() {
        for (int i = 0; i <= 2; i++) {

            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Menu%20Principal%2Fp_2.jpg?alt=media&token=156095a2-cca5-4b46-8e3c-984a13d3f72b");
                    break;

                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Menu%20Principal%2Fp_3.jpg?alt=media&token=5b22cdae-2926-497f-b0a0-ad4ecae09f25");
                    break;

                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Menu%20Principal%2FWhatsApp%20Image%202020-09-04%20at%203.28.21%20PM.jpeg?alt=media&token=66ae6f0d-6b0f-4cab-a28a-0ec56259f424");
                    break;


            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(MainActivity.this, "" + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });

            sliderLayout.addSliderView(sliderView);

        }
    }


}
