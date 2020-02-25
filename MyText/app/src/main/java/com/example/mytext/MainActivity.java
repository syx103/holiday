package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;

import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;

import com.example.mytext.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private DataBase dataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        dataBase = new DataBase(new ObservableField<String>(),new ObservableField<String>());
        binding.setDatabase(dataBase);
        binding.setUpdata(new Updata());
    }
    public class Updata{
        public void changeUsername(Editable editable) {
            dataBase.getUsename().set(editable.toString());
        }
        public void changePassword(Editable editable) {
            dataBase.getPassword().set(editable.toString());
        }
    }
}
