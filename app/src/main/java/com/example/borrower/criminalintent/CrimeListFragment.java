package com.example.borrower.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by borrower on 12/5/17.
 */

public class CrimeListFragment extends Fragment {

  private RecyclerView mrecycleview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_crime_list,container,false);

        mrecycleview = view.findViewById(R.id.crime_recyle_view);
        mrecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }
}
