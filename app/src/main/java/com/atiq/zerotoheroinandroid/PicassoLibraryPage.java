package com.atiq.zerotoheroinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoLibraryPage extends AppCompatActivity {
    ImageView picassoImageDisplay;
    Button changeImagePicasso;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_library_page);

        changeImagePicasso=findViewById(R.id.changeImagePicasso);
        picassoImageDisplay=findViewById(R.id.picassoImageDisplay);

        Picasso.get().load("https://i.ibb.co/k81m8xT/image-1.png").placeholder(R.drawable.bd_nature).into(picassoImageDisplay);

        changeImagePicasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://i.ibb.co/3mS6Kmh/image.png").placeholder(R.drawable.bd_nature).error(R.drawable.bd_flag).into(picassoImageDisplay);
            }
        });

    }
}