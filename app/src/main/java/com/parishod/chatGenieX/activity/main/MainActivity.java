package com.parishod.chatGenieX.activity.main;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProvider;

import com.parishod.chatGenieX.R;
import com.parishod.chatGenieX.activity.BaseActivity;
import com.parishod.chatGenieX.viewmodel.SwipeToKillAppDetectViewModel;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new ViewModelProvider(this).get(SwipeToKillAppDetectViewModel.class);
    }
}