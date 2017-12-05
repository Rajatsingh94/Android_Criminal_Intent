package com.example.borrower.criminalintent;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class CrimeListActivity extends SingletonFragmentContainer {

    @Override
    protected Fragment createFrgment() {
        return new CrimeListFragment();
    }

}
