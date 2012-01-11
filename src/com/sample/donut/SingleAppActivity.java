package com.sample.donut;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class SingleAppActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
