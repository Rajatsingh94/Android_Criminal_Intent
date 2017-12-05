package com.example.borrower.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingletonFragmentContainer {

    private static final String EXTRA_CRIME_ID="com.example.borrower.criminalintent_crime_id";

    @Override
    protected Fragment createFrgment() {
        UUID crimeid = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeid);
    }



    public static Intent newIntent(Context packagecontext, UUID crimeid)
    {
        Intent intent = new Intent(packagecontext,CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeid);
        return intent;


    }

}
