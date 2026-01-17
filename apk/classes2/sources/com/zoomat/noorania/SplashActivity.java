package com.zoomat.noorania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashActivity extends Activity implements View.OnClickListener {
    /* access modifiers changed from: private */
    public static long SLEEP_TIME = 3;
    /* access modifiers changed from: private */
    public static String TAG = "com.zoomat.noorania.SplashActivity";
    protected static final int TIMER_RUNTIME = 10000;
    private int buttonsLayoutHeight;
    private int buttonsLayoutWidth;
    Display display;
    private RelativeLayout.LayoutParams layoutParams;
    protected boolean mbActive;
    /* access modifiers changed from: private */
    public ProgressBar splashProgressBar;
    private TextView splashText;
    Chronometer timerTxt;

    public void onClick(View view) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash);
        findViewById(R.id.splashActivity_progressBar_loading);
        this.display = getWindowManager().getDefaultDisplay();
        TextView textView = (TextView) findViewById(R.id.splashActivity_textView_load);
        this.splashText = textView;
        textView.setText("");
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.splashActivity_progressBar_load);
        this.splashProgressBar = progressBar;
        progressBar.setMax(300);
        this.splashProgressBar.setProgress(0);
        this.layoutParams.addRule(10, -1);
        this.splashProgressBar.setLayoutParams(this.layoutParams);
        Chronometer chronometer = (Chronometer) findViewById(R.id.dd);
        this.timerTxt = chronometer;
        chronometer.setBase(SystemClock.elapsedRealtime() + 3000);
        this.timerTxt.start();
        this.timerTxt.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            public void onChronometerTick(Chronometer chronometer) {
                if (chronometer.getText().equals("00:-2") || chronometer.getText().equals("٠٠:-٢")) {
                    SplashActivity.this.splashProgressBar.setProgress(100);
                } else if (chronometer.getText().equals("00:-1") || chronometer.getText().equals("٠٠:-١")) {
                    SplashActivity.this.splashProgressBar.setProgress(200);
                } else if (chronometer.getText().equals("00:00") || chronometer.getText().equals("٠٠:٠٠")) {
                    SplashActivity.this.splashProgressBar.setProgress(300);
                }
            }
        });
        new IntentLauncher().start();
    }

    private class IntentLauncher extends Thread {
        private IntentLauncher() {
        }

        public void run() {
            try {
                Thread.sleep(SplashActivity.SLEEP_TIME * 1000);
            } catch (Exception e) {
                Log.e(SplashActivity.TAG, e.getMessage());
            }
            SplashActivity.this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
            SplashActivity.this.finish();
        }
    }
}
