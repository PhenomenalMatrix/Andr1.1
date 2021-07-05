package com.orozbek.andr11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    private ImageView camera, group, google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }

    private void initListeners() {
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(intent);
            }
        });

        group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "(+996) 555 555";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(phoneNumber));
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        camera = findViewById(R.id.camera_iv);
        group = findViewById(R.id.group_iv);
        google = findViewById(R.id.google_iv);
    }
}