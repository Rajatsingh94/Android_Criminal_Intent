package com.example.borrower.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by borrower on 12/5/17.
 */

public abstract class SingletonFragmentContainer  extends FragmentActivity{

    protected abstract Fragment createFrgment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment==null)
        {
            fragment = createFrgment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }
}
