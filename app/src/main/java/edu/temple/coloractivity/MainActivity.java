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

/**
 * @fun onItemSelected(): Changes the background of the view upon selecting an item from the spinner. See comments on ItemsAdapter to see how the custom adapter accepts colors.
 *
 * @fun onNothingSelected(): setOnItemSelectedListener requires that you implement this or it breaks similarly to how when you extend base adapter you must add and override 4 items requested even though
 * you don't actually ever use getItemID.
 *
 * @param ((TextView) spinnerView.getSelectedView()): When the item is actually selected, we want to make sure the font is the color the background changes to.
 */

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
        items.add("Billy Kane");
        items.add("Yuri Sakazaki");
        items.add("Ash Crimson");
        items.add("Robert Garcia");
        items.add("Ryo Sakazaki");
        items.add("Athena Asamiya");

        colors.add("#D45F00");
        colors.add("#D813EC");
        colors.add("#56A961");
        colors.add("#10E1EF");
        colors.add("#6969FF");
        colors.add("#FFF6EC");
        colors.add("#FF2418");
        colors.add("#8C7696");
        colors.add("#FFAE00");
        colors.add("#FF87A9");

        final BaseAdapter adapter = new ItemsAdapter(this, items, colors);

        spinnerView.setAdapter(adapter);

        spinnerView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()  {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                ((TextView) spinnerView.getSelectedView()).setTextColor(Color.parseColor(colors.get(position)));
                mainLayout.setBackgroundColor(Color.parseColor(colors.get(position)));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView)
            {

            }
        });
    }
}

