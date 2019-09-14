package com.example.singhhansexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView note1 = (TextView) findViewById(R.id.textView7);
        note1.setBackgroundColor(Color.parseColor("#AA3456"));
    }
}
