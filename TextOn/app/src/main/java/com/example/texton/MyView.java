package com.example.texton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    private Context icontext;
    public MyView(Context context) {
        super(context);
        this.icontext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);

        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(20);
        paint.setShadowLayer(10,10,40,Color.RED);

        canvas.drawRGB(20,20,90);
        //canvas.drawColor(Color.BLACK);
        //canvas.drawColor(Color.parseColor("#FFFFF0"));
        canvas.drawCircle(300,400,100,paint);

        canvas.drawLine(450,550,500,600,paint);
        float[] floats = {10,10,20,200,550,10,600,200};
        canvas.drawLines(floats,paint);

        canvas.drawPoint(650,650,paint);
       /* Rect rect = new Rect(700,800,800,850);
        canvas.drawRect(rect,paint);*/
        RectF rect = new RectF(11.10F,3.40F,11.30F,11.60F);

        RectF rectF = new RectF(700,800,800,850);
        canvas.drawRoundRect(rectF,10,20,paint);

        canvas.drawArc(rectF,0,90,true,paint);
    }
}
