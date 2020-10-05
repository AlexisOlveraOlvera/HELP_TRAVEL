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
public class PenaTourFragment extends Fragment {


    Button Call;
    ImageView ImagePrin, ImageTour, ImageVino, ImageQV, ImageEsca;


    public PenaTourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pena_tour, container, false);


        Call = v.findViewById(R.id.resrvarbtnPena);

        ImagePrin = v.findViewById(R.id.imagePrin);
        ImageTour = v.findViewById(R.id.imagePenatour);
        ImageVino = v.findViewById(R.id.imagePenaVino);
        ImageQV = v.findViewById(R.id.imagePenaQV);
        ImageEsca = v.findViewById(R.id.imagePenaEsca);

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String phone = "4411226091";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });


        String urlPrin = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FLaPe%C3%B1aTours%2Fpena_tours.jpg?alt=media&token=7cbcf31e-d1df-4c50-a343-08e9758873ac";
        Glide.with(getActivity()).load(urlPrin).into(ImagePrin);


        String urlTour = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FLaPe%C3%B1aTours%2Fpena.jpg?alt=media&token=5d4655ea-100e-4208-97b3-a815b83e32de";
        Glide.with(getActivity()).load(urlTour).into(ImageTour);


        String urlVino = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FLaPe%C3%B1aTours%2Fvino.jpg?alt=media&token=299b28ae-a41f-4fd6-b610-506a22f0bd95";
        Glide.with(getActivity()).load(urlVino).into(ImageVino);


        String urlQV = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FLaPe%C3%B1aTours%2Fqueso%20y%20vino.jpg?alt=media&token=40f85261-14d3-42f9-ad34-276a8add287b";
        Glide.with(getActivity()).load(urlQV).into(ImageQV);


        String urlEsca = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Tours%2FLaPe%C3%B1aTours%2Fescalada.jpg?alt=media&token=d78bbaee-190b-488c-99d7-55961b8b41d2";
        Glide.with(getActivity()).load(urlEsca).into(ImageEsca);





        return v;
    }

}
