package com.example.mytext;

import android.database.Observable;

import androidx.databinding.ObservableField;

public class DataBase {
    private ObservableField<String> usename;
    private ObservableField<String> password;
    public DataBase(ObservableField<String> usename,ObservableField<String> password) {
        this.password = password;
        this.usename = usename;
    }

    public ObservableField<String> getPassword() {
        return password;
    }

    public ObservableField<String> getUsename() {
        return usename;
    }
}
