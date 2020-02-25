package com.example.mytextthree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mytextthree.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements UserClickListener{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setListener(this);
    }

    @Override
    public void click(View view) {
        Toast.makeText(this,"方法引用",Toast.LENGTH_SHORT).show();
    }
}
