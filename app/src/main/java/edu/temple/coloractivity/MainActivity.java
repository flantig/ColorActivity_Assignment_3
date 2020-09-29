package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerView;
    ArrayList<String> items = new ArrayList<>();
    ArrayList<String> colors = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerView = findViewById(R.id.spinner);
        final ConstraintLayout mainLayout = (ConstraintLayout) findViewById(R.id.constraint);


        items.add("Kyo Kusanagi");
        items.add("Geese Howard");
        items.add("Leona Heidern");
        items.add("Kula Diamond");

        colors.add("#D2802D");
        colors.add("#D813EC");
        colors.add("#56A961");
        colors.add("#10E1EF");

        final BaseAdapter adapter = new ItemsAdapter(this, items, colors);

        spinnerView.setAdapter(adapter);

        spinnerView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()  {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mainLayout.setBackgroundColor(Color.parseColor(colors.get(position)));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView)
            {

            }
        });
    }
}

