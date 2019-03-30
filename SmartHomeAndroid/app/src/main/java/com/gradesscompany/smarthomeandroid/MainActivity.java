package com.gradesscompany.smarthomeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar) findViewById(R.id.brightnessAndContrastSeekBar);
        seekBar.setOnSeekBarChangeListener(new BrightnessContrastSeekBarListener());

    }
}
