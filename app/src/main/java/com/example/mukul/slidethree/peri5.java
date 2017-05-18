package com.example.mukul.slidethree;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP on 4/4/2016.
 */

public class peri5 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // TextView textView = new TextView(container.getContext());
        // tab page content
        //textView.setText("Android Tab Content");
       // textView.setGravity(Gravity.CENTER);
        return inflater.inflate(R.layout.peri5, container, false);
    }
}