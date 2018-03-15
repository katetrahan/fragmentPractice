package com.example.guest.mood;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.moodButton)Button mMoodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mMoodButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        if (v == mMoodButton) {
            FragmentManager fm = getFragmentManager();
            MoodDialogFragment moodDialogFragment = new MoodDialogFragment();
            moodDialogFragment.show(fm, "Sample Fragment");
        }
    }

}
