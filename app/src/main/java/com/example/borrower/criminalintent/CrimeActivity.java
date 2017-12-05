package com.example.borrower.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends SingletonFragmentContainer {

    @Override
    protected Fragment createFrgment() {
        return new CrimeFragment();
    }


}
