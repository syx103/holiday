package com.example.mytextone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Intent intent = getIntent();
//        String s = intent.getStringExtra("name");
//        Log.e("MAIN2ACTIVITY",s);
        Intent intent = new Intent();
        intent.putExtra("name","123");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                Toast.makeText(Main2Activity.this,"You click add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove:
                Toast.makeText(Main2Activity.this,"You click remove",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }
}
