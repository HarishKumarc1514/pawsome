package com.example.pawsome.Tab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.pawsome.R;

import java.util.ArrayList;
import java.util.List;


public class ThirdFragment extends Fragment {

    public ThirdFragment() {

    }

    ViewFlipper viewFlipper;
    View v1;
    String srctext;
    Integer images[]={R.raw.img1, R.raw.img2, R.raw.img3, R.raw.img4, R.raw.img5};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v1 = inflater.inflate(R.layout.fragment_third,container,false);
        Spinner spinner5 =(Spinner)v1.findViewById(R.id.Breedsspinner);
        viewFlipper = v1.findViewById(R.id.imageflipper);
       // srctext = spinner5.getSelectedItem().toString();

        ArrayAdapter<CharSequence> orderadapter =ArrayAdapter.createFromResource(
                v1.getContext(),R.array.Breed, android.R.layout.simple_spinner_item);
        orderadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(orderadapter);

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


//        if(srctext == "German Shepherd") {
//            images = new int[]{R.raw.germanshepherdimg1, R.raw.germanshepherdimg2, R.raw.germanshepherdimg3,
//                    R.raw.germanshepherdimg4, R.raw.germanshepherdimg5, R.raw.germanshepherdimg6,
//                    R.raw.germanshepherdimg7, R.raw.germanshepherdimg8, R.raw.germanshepherdimg9,
//                    R.raw.germanshepherdimg10, R.raw.germanshepherdimg11, R.raw.germanshepherdimg12,
//                    R.raw.germanshepherdimg15};
//            }


        for (int image : images) { flipperimages(image); }

        return v1;
    }

    public void flipperimages(int imgage){
        ImageView imageView =new ImageView(v1.getContext());
        imageView.setImageResource(imgage);

        viewFlipper.addView(imageView,0);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(v1.getContext(),android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(v1.getContext(),android.R.anim.slide_out_right);

    }
}