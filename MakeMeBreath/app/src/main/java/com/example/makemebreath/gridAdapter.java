package com.example.makemebreath;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class gridAdapter extends BaseAdapter {

    Context context;
    String[] objectNames;
    Boolean[] objectStates;
    Boolean[] objectDeleted;
    int[] objectImages;

    LayoutInflater inflater;

    public gridAdapter(Context context, String[] objectNames, Boolean[] objectStates, Boolean[] objectDeleted, int[] objectImages) {
        this.context = context;
        this.objectNames = objectNames;
        this.objectStates = objectStates;
        this.objectDeleted = objectDeleted;
        this.objectImages = objectImages;
    }

    @Override
    public int getCount() {
        return objectNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null) {
            convertView = inflater.inflate(R.layout.grid_item, null);
        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.object_name);
        ToggleButton toggleButton = convertView.findViewById(R.id.switch1);
        ImageView deleteImageView = convertView.findViewById(R.id.deleteImageView);

        imageView.setImageResource(objectImages[position]);
        textView.setText(objectNames[position]);
        toggleButton.setChecked(objectStates[position]);




        return convertView;
    }
}
