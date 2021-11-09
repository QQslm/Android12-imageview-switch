package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button buttonup;
    Button buttonnext;
    ImageView imageView;

    private int[]  picture = {R.drawable.lisa1,R.drawable.jennie1};
    private int pictureIndex = 0;
    private int maxIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonnext = (Button)findViewById(R.id.buttonnext);
        buttonup = (Button)findViewById(R.id.buttonup);
        imageView = (ImageView)findViewById(R.id.imageView);
        buttonup.setOnClickListener(this::onClick);
        buttonnext.setOnClickListener(this::onClick);
        imageView.setImageResource(picture[1]);
    }
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.buttonnext:
                if (pictureIndex == maxIndex)
                {
                    pictureIndex = 0;
                }
                else
                {
                    pictureIndex = pictureIndex+1;
                }
                break;
            case R.id.buttonup:
                if (pictureIndex == 0)
                {
                    pictureIndex = maxIndex;
                }
                else
                {
                    pictureIndex = pictureIndex-1;
                }
                break;
            default:
                break;
        }
        imageView.setImageResource(picture[pictureIndex]);
    }

}