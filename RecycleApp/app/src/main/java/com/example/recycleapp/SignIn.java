package com.example.recycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

public class SignIn extends AppCompatActivity {
    public boolean isWXAppInstalledAndSupported() {

        IWXAPI msgApi = WXAPIFactory.createWXAPI(this, null);
        msgApi.registerApp(SyncStateContract.Constants._ID);
        boolean sIsWXAppInstalledAndSupported = msgApi.isWXAppInstalled() && msgApi.isWXAppSupportAPI();
        return sIsWXAppInstalledAndSupported;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Button button = findViewById(R.id.signin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isWXAppInstalledAndSupported()) { 
                    // 用户是否安装微信客户端
                    // send oauth request
                final SendAuth.Req req = new SendAuth.Req();
                req.scope = "snsapi_userinfo";
                req.state = "none";
                api.sendReq(req);
                finish();
                } else {
                    // TODO: 这里需要引导用户去下载微信客户端
                    Toast.makeText(SignIn.this, "用户没有安装微信", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

