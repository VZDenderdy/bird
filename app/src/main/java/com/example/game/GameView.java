package com.example.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class GameView extends View {
    private Sprite playerBird;
    private int viewWidth;
    private int viewHeight;
    private int points = 0;
    public  GameView(Context context){
        super(context);
        Bitmap b = BitmapFactory.decodeResource(getResources(),R.drawable.player);

        int w = b.getWidth()/5;
        int h = b.getWidth()/3;
        Rect firstFrame = new Rect(0,0,w,h);
        playerBird = new Sprite(10,0,0,0,firstFrame,b);

    }



    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        viewWidth = w;
        viewHeight = h;
    }
    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        canvas.drawARGB(250, 255, 255, 255); // заливаем цветом
        playerBird.draw(canvas);
        //Paint p = new Paint();
        //p.setAntiAlias(true);
        //p.setTextSize(55.0f);
        //p.setColor(Color.WHITE);
        //canvas.drawText(points+"", viewWidth - 100, 70, p);
    }
}
