package com.mecalogik.help_travel;


import android.*;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class AcueducFragment extends Fragment {

    Button Call, Facebook, Ubicacion;
    ImageView Image, ImageTu, ImageVino, ImageQV, ImageEco, ImageGlobo;

    public AcueducFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_acueduc, container, false);


        Call = v.findViewById(R.id.resrvarbtnAcu);
        Image = v.findViewById(R.id.imagePrin);
        ImageTu = v.findViewById(R.id.imageAcueTours);
        ImageVino = v.findViewById(R.id.imageVino);
        ImageQV = v.findViewById(R.id.imageQV);
        ImageEco = v.findViewById(R.id.imageEco);
        ImageGlobo = v.findViewById(R.id.imageGlobo);


        Facebook = v.findViewById(R.id.button3);

        Ubicacion = v.findViewById(R.id.button4);





        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), " En Construcción", Toast.LENGTH_SHORT).show();
            }
        });


        Ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), " En Construcción", Toast.LENGTH_SHORT).show();
            }
        });





        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String phone = "4411226091";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });



        String urlPrin = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FAcueducTours%2Fprincipal.jpg?alt=media&token=2793053a-ec33-420c-8768-b1caae243df0";
        Glide.with(getActivity()).load(urlPrin).into(Image);

        String urlImageTours = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FAcueducTours%2FpenaTours.jpg?alt=media&token=252098aa-8cae-4988-abec-007bdc3b55fd";
        Glide.with(getActivity()).load(urlImageTours).into(ImageTu);


        String urlImageVino = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FAcueducTours%2FimageVino.jpg?alt=media&token=816d2bc9-6530-4b5c-93fd-36456a831e1e";
        Glide.with(getActivity()).load(urlImageVino).into(ImageVino);


        String urlImageQV = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FAcueducTours%2FimageQV.jpg?alt=media&token=4160246d-efc6-46a5-aae2-27d624f7a2d4";
        Glide.with(getActivity()).load(urlImageQV).into(ImageQV);


        String urlImageEco = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FAcueducTours%2Fecotu.jpg?alt=media&token=a2953fed-13f9-4cb8-b45f-8cb7dd212799";
        Glide.with(getActivity()).load(urlImageEco).into(ImageEco);

        String urlImageGlobo = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FAcueducTours%2Fglobo.jpg?alt=media&token=3d08055a-8cf3-47b0-9dfe-9324cf8afb12";
        Glide.with(getActivity()).load(urlImageGlobo).into(ImageGlobo);

        return v;
    }


}
