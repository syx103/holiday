package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ObservableList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        list = new ObservableArrayList<>();
        list.add("study");
        list.add("work");
        list.add("up");
        binding.setList(list);
        binding.setChang(new Change());
    }
    public class Change {
        public void chang() {
            for (int i = 0 ;i < list.size();i ++) {
                list.set(i,"已改变为" + i);
            }
        }
    }
}
