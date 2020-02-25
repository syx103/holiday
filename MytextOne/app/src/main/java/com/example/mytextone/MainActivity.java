package com.example.mytextone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String data = "hihi";
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //intent.putExtra("name",data);
                //startActivity(intent);
                startActivityForResult(intent,1);
//               Toast.makeText(MainActivity.this,"点击成功",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnData = data.getStringExtra("name");
                    Log.e("MAINTIVITY",returnData);
                }
                break;
            default:
        }
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
                Toast.makeText(MainActivity.this,"You click add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove:
                Toast.makeText(MainActivity.this,"You click remove",Toast.LENGTH_SHORT).show();
                break;
            default :
        }
        return true;
    }
}
