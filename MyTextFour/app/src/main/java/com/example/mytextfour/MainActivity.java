package com.example.mytextfour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;

import android.os.Bundle;

import com.example.mytextfour.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.my_layout);
        binding.setData(new DataBean(new ObservableField<>("石头"),new ObservableField<>("光泽")));
    }
}
