package com.example.pawsome.Tab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pawsome.R;

import java.util.Random;

public class FirstFragment extends Fragment implements View.OnClickListener{


    public FirstFragment() {
    }
    ImageView imageView;
    Button button1;
    Button button2;
    Random rd = new Random();
    Integer images[] ={R.raw.img1,R.raw.img2,R.raw.img3,R.raw.img4,R.raw.img5,R.raw.germanshepherdimg1,
            R.raw.germanshepherdimg2,R.raw.germanshepherdimg3,R.raw.germanshepherdimg4,
            R.raw.germanshepherdimg5,R.raw.germanshepherdimg6,R.raw.germanshepherdimg7,R.raw.germanshepherdimg8,
            R.raw.germanshepherdimg9,R.raw.germanshepherdimg10,R.raw.germanshepherdimg11,R.raw.germanshepherdimg12,
            R.raw.germanshepherdimg13,R.raw.germanshepherdimg14,R.raw.germanshepherdimg15,R.raw.germanshepherdimg16};

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v1 = inflater.inflate(R.layout.fragment_first, container, false);
        button1 = (Button) v1.findViewById(R.id.likebutton);
        button2 = (Button) v1.findViewById(R.id.unlikebutton);
        imageView =(ImageView) v1.findViewById(R.id.randomimage);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        return v1;
    }

    @Override
    public void onClick(View v) {
     if(v== button1){imageView.setImageResource(images[rd.nextInt(images.length)]);}
     else if(v==button2){imageView.setImageResource(images[rd.nextInt(images.length)]);}
     else { Toast.makeText(this.getContext(),"Please click button", Toast.LENGTH_SHORT).show();}
    }
}