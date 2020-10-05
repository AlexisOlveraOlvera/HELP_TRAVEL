package com.mecalogik.help_travel;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class MiTourFragment extends Fragment {


    Button Call;

    ImageView ImagePrin, ImageTours, ImageVino, ImageQV, ImageGlobo;


    public MiTourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mi_tour, container, false);


        Call = v.findViewById(R.id.resrvarbtnMitour);

        ImagePrin = v.findViewById(R.id.imagePrin);
        ImageTours = v.findViewById(R.id.imageMiTour);
        ImageVino = v.findViewById(R.id.imageMiVino);
        ImageQV = v.findViewById(R.id.imageMiQV);
        ImageGlobo = v.findViewById(R.id.imageMiGlobo);

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String phone = "4411226091";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });



        String urlImagePrin = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FMiTour%2Fmi%20tour.png?alt=media&token=553ad38a-8992-42b1-bbc6-f1742a66c020";
        Glide.with(getActivity()).load(urlImagePrin).into(ImagePrin);

        String urlImageTours = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FMiTour%2FpenaTours.jpg?alt=media&token=4a0c6262-6747-4d22-81e9-7295988f1885";
        Glide.with(getActivity()).load(urlImageTours).into(ImageTours);

        String urlImageVino = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FMiTour%2FimageVino.jpg?alt=media&token=3e957ef4-e611-4b89-86a9-5490056d1f5e";
        Glide.with(getActivity()).load(urlImageVino).into(ImageVino);

        String urlImageQV = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FMiTour%2FimageQV.jpg?alt=media&token=d8d2b22e-9ccf-40d6-862f-7bbb2aa80b61";
        Glide.with(getActivity()).load(urlImageQV).into(ImageQV);

        String urlImageGlobo = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FMiTour%2Fglobo.jpg?alt=media&token=acb46dd9-9250-4eb6-a2fa-5afc7b7f25b4";
        Glide.with(getActivity()).load(urlImageGlobo).into(ImageGlobo);


        return v;
    }

}
