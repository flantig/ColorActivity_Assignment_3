package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @fun ItemsAdapter(): It takes in three things
 *          1. context - Context represents (provides a handle to) the application environment. Can be obtained from several sources, but capabilities vary.
 *
 *          2. colors - Is what will be used to determine the color of the layout in the MainClass and also the font color of the item inside of the TextView
 *
 *          3. items - The actual string that will be represented in the spinner/textview.
 *
 * @import Color: Color allows you to pass colors in a variety of ways. In my implementation I use its parseColor function to pass a string that represents a color in hex format.
 *
 */

public class ColorAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> items;
    ArrayList<String> colors;

    public ColorAdapter(Context context, ArrayList<String> items, ArrayList<String> colors) {
        this.context = context;
        this.items = items;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    public Object getColor(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        TextView textView = new TextView(context);
        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(Color.parseColor(getColor(position).toString()));
        return textView;

    }
}
