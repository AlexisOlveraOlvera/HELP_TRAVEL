package com.mecalogik.help_travel;


import android.content.ActivityNotFoundException;
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
public class DonBernaFragment extends Fragment {

    Button Call, Face, Ubicacion;
    ImageView ImagePrinc, ImageDonTour;


    public DonBernaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_don_berna, container, false);


        Call = v.findViewById(R.id.resrvarbtnDonBerna);
        Face = v.findViewById(R.id.button3);
        Ubicacion = v.findViewById(R.id.ubicacionbtn);

        ImagePrinc = v.findViewById(R.id.imagePrin);
        ImageDonTour = v.findViewById(R.id.imageDonTours);


        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String phone = "4411226091";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        Face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookAppIntent;

                try {
                    facebookAppIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/390620737757534"));
                    startActivity(facebookAppIntent);
                } catch (ActivityNotFoundException e) {
                    facebookAppIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/lashistoriasdedonberna-390620737757534"));
                    startActivity(facebookAppIntent);
                }
            }
        });

        Ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentUbicacion = new Intent(getActivity(),DonBernaMapsActivity.class);
                startActivity(intentUbicacion);
            }
        });


        String urlPri = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Museos%2FDon%20Berna%2Fdon%20berna.jpg?alt=media&token=d68ef4fb-46c6-4a3d-9ed0-8ffd1b6db067";
        Glide.with(getActivity()).load(urlPri).into(ImagePrinc);

        String urlDon = "https://firebasestorage.googleapis.com/v0/b/helptravel-da9b2.appspot.com/o/Museos%2FDon%20Berna%2Fimage.jpg?alt=media&token=0250ecff-8653-4b9e-b1c8-1ae57863b913";
        Glide.with(getActivity()).load(urlDon).into(ImageDonTour);



        return v;
    }

}
