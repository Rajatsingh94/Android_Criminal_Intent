package com.example.borrower.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by borrower on 12/5/17.
 */

public class CrimeLab {

    private static CrimeLab mcrimelab;
    private List<Crime> mcrime;


    public static CrimeLab get(Context context)
    {
        if(mcrimelab==null)
        {
            mcrimelab= new CrimeLab(context);
        }
            return mcrimelab;
    }

    private CrimeLab(Context context)
    {
        mcrime = new ArrayList<Crime>();

        for(int i =0;i<100;i++)
        {
            Crime crime = new Crime();
            crime.setMtitle("Crime # "+ i);
            crime.setMcrimesolvedcheckbox(i %2 ==0);
            mcrime.add(crime);
        }
    }

    public List<Crime> getCrime()
    {
        return mcrime;
    }

    public Crime getCrime(UUID id)
    {
        for(Crime crime: mcrime)
        {
            if(crime.getId().equals(id))
            {
                return  crime;
            }
        }
        return null;
    }
}
