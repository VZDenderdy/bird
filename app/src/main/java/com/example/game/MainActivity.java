package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.SurfaceHolder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));;
    }
}

class GameThread extends Thread{
    SurfaceHolder surfaceHolder;
    Context context;
    float burdX=0;
    float burdY=0;
    float goalX=0;
    float goalY=0;
    boolean running = true;
    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void run() {
        super.run();
        while (running) {
            Canvas canvas = surfaceHolder.lockCanvas();
            canvas.drawColor(Color.GREEN);
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }
}