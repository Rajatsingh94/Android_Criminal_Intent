package com.example.borrower.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by borrower on 12/4/17.
 */

public class CrimeFragment extends Fragment {

    private Crime mcrime;
    EditText mtexttitle;
    Button mdatebutton;
    CheckBox mcrimesolvedcheckbox;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mcrime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime,container,false);



        mtexttitle =  (EditText) view.findViewById(R.id.crime_title_textview);
        mtexttitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    mcrime.setMtitle(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        mdatebutton = (Button)view.findViewById(R.id.date_button);
        mdatebutton.setText(mcrime.getMdate().toString());
        mdatebutton.setEnabled(false);


        mcrimesolvedcheckbox = (CheckBox) view.findViewById(R.id.crime_solve_checkbox);
        mcrimesolvedcheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mcrime.setMcrimesolvedcheckbox(b);
            }
        });


        return view;
    }




}
