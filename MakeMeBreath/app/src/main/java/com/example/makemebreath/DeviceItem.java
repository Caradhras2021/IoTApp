package com.example.makemebreath;

import android.content.Context;

import java.util.function.BiPredicate;

public class DeviceItem {

    // fields
    private String name;
    private Boolean state;
    private Boolean deleted;

    // constructor
    public DeviceItem(String name, Boolean state, Boolean deleted) {
        this.name = name;
        this.state = state;
        this.deleted = deleted;
    }

    // methods
    public  String getName(){ return name; }
    public  Boolean isOn(){ return state; }
    public Boolean isDeleted(){ return state; }

}
