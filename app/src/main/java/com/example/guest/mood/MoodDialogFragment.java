package com.example.guest.mood;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MoodDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        final View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);
        // rootView is just another variable name: What’s important here is that this variable holds the inflated layout and therefore has access to the Views we need to retrieve. Cool!

        Button cancelButton = (Button) rootView.findViewById(R.id.cancelButton);
        Button submitButton = (Button) rootView.findViewById(R.id.submitButton);

        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });


        final RadioGroup surveyRadioGroup = (RadioGroup) rootView.findViewById(R.id.moodRadioGroup); //pull group

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = surveyRadioGroup.getCheckedRadioButtonId();
                final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId);
                Log.d("testing", selectedRadioButton.getText().toString());
                dismiss();
            }
        });


        return rootView;
    }




}
