package com.example.makemebreath;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.List;

public class gridAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;

    List<DeviceItem> deviceItems;

    public gridAdapter(Context context, List<DeviceItem> deviceItems) {
        this.context = context;
        this.deviceItems = deviceItems;
    }

    @Override
    public int getCount() {
        return deviceItems.size();
    }

    @Override
    public Object getItem(int position) {
        return deviceItems.get(position) ;
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

        textView.setText(deviceItems.get(position).getName());
        toggleButton.setChecked(deviceItems.get(position).isOn());

        return convertView;
    }
}
