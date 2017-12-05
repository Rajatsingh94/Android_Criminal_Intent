package com.example.borrower.criminalintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by borrower on 12/5/17.
 */

public class CrimeListFragment extends Fragment {

  private RecyclerView mrecycleview;

  private class CrimeHolder extends RecyclerView.ViewHolder implements View.OnClickListener
  {
      public TextView mtextview;
      public CheckBox msolvedcheckbox;
      public TextView mdateview;

      public CrimeHolder(View itemView) {
          super(itemView);
          itemView.setOnClickListener(this);
          mtextview = (TextView) itemView.findViewById(R.id.list_item_crime_title_text_view);
          mdateview = (TextView) itemView.findViewById(R.id.list_item_crime_date_text_view);
          msolvedcheckbox = (CheckBox) itemView.findViewById(R.id.list_item_checkbox_solved);
      }

      private Crime mcrimebind;

      public void bindcrime(Crime crime)
      {
          mcrimebind = crime;
          mtextview.setText(crime.getMtitle());
          mdateview.setText(crime.getMdate().toString());
          msolvedcheckbox.setChecked(crime.isMcrimesolvedcheckbox());




      }

      @Override
      public void onClick(View view) {
            Intent intent = CrimePagerActivity.newIntent(getActivity(),mcrimebind.getId());
            startActivity(intent);

      }
  }

    private class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder>
    {

        public List<Crime> mcrime;




        public CrimeAdapter(List<Crime> crimes)
        {
            mcrime = crimes;
        }
        @Override
        public CrimeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_crime,parent,false);
            return new CrimeHolder(view);
        }

        @Override
        public void onBindViewHolder(CrimeHolder holder, int position) {

            Crime crime = mcrime.get(position);
            holder.bindcrime(crime);

        }



        @Override
        public int getItemCount() {
            return mcrime.size();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_crime_list,container,false);

        mrecycleview = view.findViewById(R.id.crime_recyle_view);
        mrecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateui();
        return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        updateui();
    }

    private CrimeAdapter mcrimeadapter;

    private void updateui()
    {
        CrimeLab crimeLab = CrimeLab.get(getActivity());

        List<Crime> crime = crimeLab.getCrime();

        if(mcrimeadapter==null) {
            mcrimeadapter = new CrimeAdapter(crime);
            mrecycleview.setAdapter(mcrimeadapter);
        }
        else
        {
            mcrimeadapter.notifyDataSetChanged();
        }
    }


}
