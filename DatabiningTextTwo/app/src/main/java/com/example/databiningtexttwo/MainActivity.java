package com.example.databiningtexttwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.databinding.library.baseAdapters.BR;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.databiningtexttwo.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private OGood good;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        good = new OGood("可比克","香脆可口",3);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setGood(good);
        binding.setListener(new Listener());

    }
    public class Listener{
        public void changeDatail() {
            good.getDetail().set("美味可口" + new Random(10));
        }
        public void changPrice() {
            good.getPirce().set(new Random().nextInt(10));
        }
    }
}
