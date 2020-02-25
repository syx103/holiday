package com.example.databindingtext4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import android.os.Bundle;

import com.example.databindingtext4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ObservableList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ObservableArrayList<>();
        list.add("study");
        list.add("work");
        list.add("up");
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setList(list);
        binding.setChang(new change());
    }
    public class change {
        public void updata() {
            for (int i = 0; i < list.size();i ++) {
                list.set(i,"以改变为" + i);
            }
        }
    }
}
