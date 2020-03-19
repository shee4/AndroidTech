package com.example.androidtech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void helloClick(View view) {
        TextView tw = findViewById(R.id.textView2);
        tw.setText("Glad to see ya!");
    }

    public void sadClick(View view) {
        TextView tw = findViewById(R.id.textView2);
        tw.setText("Anyway I'm glad to see ya =)");
    }


    public void mood(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView selection = (TextView) findViewById(R.id.textView3);
        selection.setText("Keep going, you doing great!");
    }
}
