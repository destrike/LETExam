package com.teamexpde.user.letexam;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mEnglish(View view) {
        Intent plays = new Intent (this, English.class);
        startActivity(plays);
        finish();
    }

    public void mScience(View view) {
        Intent plays = new Intent (this, Science.class);
        startActivity(plays);
        finish();
    }

    public void mHekasi(View view) {
        Intent plays = new Intent (this, Hekasi.class);
        startActivity(plays);
        finish();
    }

}
