package com.example.pawsome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img =findViewById(R.id.imageView);
        Glide.with(this).asGif().load(R.raw.tenor).into(img);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             open();
            }
        });

    }
    public void open(){
        Intent intent =new Intent(this,mainpage.class);
        startActivity(intent);
    }
}