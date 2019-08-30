package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String List ="List";
    private ArrayList<CharSequence> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Save (View view) {
        EditText inputfield = findViewById(R.id.Txt);
        String word = inputfield.getText().toString();
        words.add(word);
        inputfield.setText("");
    }

    public void Clear (View view) {
        words.clear();
    }

    public void Show (View view)

    {
        TextView output = findViewById(R.id.view);
        if (words.isEmpty()) {
            output.setText("empty");

        } else {
            output.setText(words.toString());
        }

    }
}
