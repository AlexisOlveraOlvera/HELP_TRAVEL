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
public class MotoToursFragment extends Fragment {


    Button Call;
    ImageView ImagePrin, ImageTour;


    public MotoToursFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_moto_tours, container, false);

        Call = v.findViewById(R.id.resrvarbtnMoto);

        ImagePrin = v.findViewById(R.id.imagePrin);
        ImageTour = v.findViewById(R.id.imagePenaTour);

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String phone = "4411226091";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });




        String urlImagePri = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FMotoTours%2Fmototour.png?alt=media&token=bec84073-4ffa-4670-9190-47f2d509e19a";
        Glide.with(getActivity()).load(urlImagePri).into(ImagePrin);



        String urlImagePenaTour = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FMotoTours%2Flogo.jpeg?alt=media&token=9060704f-d6ff-4c23-9975-16efef502986";
        Glide.with(getActivity()).load(urlImagePenaTour).into(ImageTour);


        return v;
    }

}
