package com.example.texton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int max = (int)(Runtime.getRuntime().maxMemory() / 1024);
    int cacheSize = max / 8;
    LruCache<String,Bitmap> stringBitmapLrcuCache = new LruCache<String, Bitmap>(cacheSize) {
        @Override
        protected int sizeOf(String key, Bitmap value) {
            return value.getRowBytes() * value.getHeight() / 1024;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = findViewById(R.id.UI);
        linearLayout.addView(new MyView(MainActivity.this));
    }
    public static Bitmap decode(Resources res,int resId,int reqwidth,int reqhight) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res,resId,options);
        options.inSampleSize = calculateInSampleSize(options,reqwidth,reqhight);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res,resId,options);
    }
    public  static int calculateInSampleSize(BitmapFactory.Options options,int w,int h) {
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSamplesize = 1;
        if (height > h || width > w) {
            final  int hh = height / 2;
            final int hw = width / 2;
            while ((hh / inSamplesize) > h && (hw / inSamplesize) >= w) {
                inSamplesize *= 2;
            }
        }
        return inSamplesize;
    }
}
