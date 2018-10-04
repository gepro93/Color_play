package com.example.gerg.colorplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private TextView RedColor;
    private TextView GreenColor;
    private TextView BlueColor;
    private SeekBar RedColorGomb;
    private SeekBar GreenColorGomb;
    private SeekBar BlueColorGomb;

    int red = 0;
    int green = 0;
    int blue = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        RedColorGomb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                red = i;
                getWindow().getDecorView().setBackgroundColor(rgb(red, green, blue));
                RedColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                RedColor.setBackgroundColor(rgb(red, green, blue));
                BlueColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                BlueColor.setBackgroundColor(rgb(red, green, blue));
                GreenColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                GreenColor.setBackgroundColor(rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        GreenColorGomb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                green = i;
                getWindow().getDecorView().setBackgroundColor(rgb(red, green, blue));
                GreenColor.setText("Green");
                RedColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                RedColor.setBackgroundColor(rgb(red, green, blue));
                BlueColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                BlueColor.setBackgroundColor(rgb(red, green, blue));
                GreenColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                GreenColor.setBackgroundColor(rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        BlueColorGomb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blue = i;
                getWindow().getDecorView().setBackgroundColor(rgb(red, green, blue));
                BlueColor.setText("Blue");
                RedColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                RedColor.setBackgroundColor(rgb(red, green, blue));
                BlueColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                BlueColor.setBackgroundColor(rgb(red, green, blue));
                GreenColor.setTextColor(rgb(255-red, 255-green, 255-blue));
                GreenColor.setBackgroundColor(rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void init() {
        RedColor = findViewById(R.id.RedColor);
        GreenColor = findViewById(R.id.GreenColor);
        BlueColor = findViewById(R.id.BlueColor);
        RedColorGomb = findViewById(R.id.RedColorGomb);
        GreenColorGomb = findViewById(R.id.GreenColorGomb);
        BlueColorGomb = findViewById(R.id.BlueColorGomb);
        getWindow().getDecorView().setBackgroundColor(rgb(red, green, blue));
        RedColor.setBackgroundColor(rgb(0, 0, 0));
        GreenColor.setBackgroundColor(rgb(0, 0, 0));
        BlueColor.setBackgroundColor(rgb(0, 0, 0));
        RedColor.setTextColor(rgb(255, 255, 255));
        GreenColor.setTextColor(rgb(255, 255, 255));
        BlueColor.setTextColor(rgb(255, 255, 255));
    }
}
