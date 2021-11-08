package com.example.makemebreath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.makemebreath.databinding.ActivityMainBinding

class DeviceAdapter(private val layoutId: Int) : RecyclerView.Adapter<DeviceAdapter.ViewHolder>(){

    // boite pour ranger les composants à controller
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val deviceImage = view.findViewById<ImageView>(R.id.grid_image)
        val deviceName = view.findViewById<TextView>(R.id.object_name)
        val deviceState = view.findViewById<Switch>(R.id.switch1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 5
}