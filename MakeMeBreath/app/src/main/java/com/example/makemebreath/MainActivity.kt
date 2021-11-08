package com.example.makemebreath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import android.widget.ListView
import com.example.makemebreath.databinding.ActivityMainBinding
import com.example.makemebreath.databinding.HomeFragmentBinding
import com.example.makemebreath.fragments.HomeFragment


class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()

        /*
        val objectsName = listOf<String>("Device 401", "Device 402", "Device 403")
        val objectsState = listOf<Boolean>(true, true, true)
        val objectsDeleted = listOf<Boolean>(false, false, false)

        val  deviceitemList = mutableListOf<DeviceItem>(
            DeviceItem("Device 401", true, false),
        DeviceItem("Device 402", true, false),
            DeviceItem("Device 403", true, false)
        )

        //var gridview: GridView = findViewById(R.id.deviceGridView)
        //gridview.adapter = gridAdapter(this@MainActivity,deviceitemList)
*/
    }
}