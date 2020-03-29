package com.hyh.autotext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import com.hyh.autolib.automaitcEditText.AutoEditText;

public class MainActivity extends AppCompatActivity {
    private AutoEditText mAutoEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAutoEditText = findViewById(R.id.aet_input);
        mAutoEditText.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        //mAutoEditText.setTypeface(Typeface.createFromAsset(getAssets(),"HYQiHei-55S.ttf"));
        mAutoEditText.requestFocus();
    }
}
