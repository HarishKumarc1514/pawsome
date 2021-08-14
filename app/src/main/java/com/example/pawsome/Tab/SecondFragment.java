package com.example.pawsome.Tab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.pawsome.R;

import java.util.Random;

public class SecondFragment extends Fragment implements  View.OnClickListener {

    public SecondFragment() {

    }

    Random rd = new Random();
    Button button1;
    ImageView imageView1;ImageView imageView2;ImageView imageView3;ImageView imageView4;
    ImageView imageView5;ImageView imageView6;ImageView imageView7;ImageView imageView8;
    ImageView imageView9;
    Integer images[] ={R.raw.img1,R.raw.img2,R.raw.img3,R.raw.img4,R.raw.img5,R.raw.germanshepherdimg1,
            R.raw.germanshepherdimg2,R.raw.germanshepherdimg3,R.raw.germanshepherdimg4,
            R.raw.germanshepherdimg5,R.raw.germanshepherdimg6,R.raw.germanshepherdimg7,R.raw.germanshepherdimg8,
            R.raw.germanshepherdimg9,R.raw.germanshepherdimg10,R.raw.germanshepherdimg11,R.raw.germanshepherdimg12,
            R.raw.germanshepherdimg13,R.raw.germanshepherdimg14,R.raw.germanshepherdimg15,R.raw.germanshepherdimg16};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       final View v = inflater.inflate(R.layout.fragment_second,container,false);

        Spinner spinner1 =(Spinner) v.findViewById(R.id.Breedsspinner);
        Spinner spinner2 =(Spinner) v.findViewById(R.id.typespinner);
        Spinner spinner3 =(Spinner) v.findViewById(R.id.catergoryspinner);
        Spinner spinner4 =(Spinner) v.findViewById(R.id.Breedspinner);
        button1 = (Button) v.findViewById(R.id.morebutton);
         imageView1 =(ImageView) v.findViewById(R.id.srcimg1);
         imageView2 =(ImageView) v.findViewById(R.id.srcimg2);
         imageView3 =(ImageView) v.findViewById(R.id.srcimg3);
         imageView4 =(ImageView) v.findViewById(R.id.srcimg4);
         imageView5 =(ImageView) v.findViewById(R.id.srcimg5);
         imageView6 =(ImageView) v.findViewById(R.id.srcimg6);
         imageView7 =(ImageView) v.findViewById(R.id.srcimg7);
         imageView8 =(ImageView) v.findViewById(R.id.srcimg8);
         imageView9 =(ImageView) v.findViewById(R.id.srcimg9);

        imageView1.setImageResource(images[rd.nextInt(images.length)]);
        imageView2.setImageResource(images[rd.nextInt(images.length)]);
        imageView3.setImageResource(images[rd.nextInt(images.length)]);
        imageView4.setImageResource(images[rd.nextInt(images.length)]);
        imageView5.setImageResource(images[rd.nextInt(images.length)]);
        imageView6.setImageResource(images[rd.nextInt(images.length)]);
        imageView7.setImageResource(images[rd.nextInt(images.length)]);
        imageView8.setImageResource(images[rd.nextInt(images.length)]);
        imageView9.setImageResource(images[rd.nextInt(images.length)]);

        button1.setOnClickListener(this);

        ArrayAdapter<CharSequence> orderadapter =ArrayAdapter.createFromResource(
                v.getContext(),R.array.order, android.R.layout.simple_spinner_item);
        orderadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(orderadapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> typeadapter =ArrayAdapter.createFromResource(
                v.getContext(),R.array.type, android.R.layout.simple_spinner_item);
        typeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(typeadapter);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> catadapter =ArrayAdapter.createFromResource(
                v.getContext(),R.array.category, android.R.layout.simple_spinner_item);
        catadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(catadapter);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> breedadapter =ArrayAdapter.createFromResource(
                v.getContext(),R.array.Breed, android.R.layout.simple_spinner_item);
        breedadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(breedadapter);

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return v;
    }


    @Override
    public void onClick(View v) {
        if(v== button1){
            imageView1.setImageResource(images[rd.nextInt(images.length)]);
            imageView2.setImageResource(images[rd.nextInt(images.length)]);
            imageView3.setImageResource(images[rd.nextInt(images.length)]);
            imageView4.setImageResource(images[rd.nextInt(images.length)]);
            imageView5.setImageResource(images[rd.nextInt(images.length)]);
            imageView6.setImageResource(images[rd.nextInt(images.length)]);
            imageView7.setImageResource(images[rd.nextInt(images.length)]);
            imageView8.setImageResource(images[rd.nextInt(images.length)]);
            imageView9.setImageResource(images[rd.nextInt(images.length)]);
        }
    }
}