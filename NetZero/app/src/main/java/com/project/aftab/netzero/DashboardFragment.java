package com.project.aftab.netzero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by aftab on 2015-03-28.
 */

public class DashboardFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dashboard_fragment, container, false);

        CardView cardView = (CardView) view.findViewById(R.id.card3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), UsageActivity.class);
                startActivity (intent);
            }
        });

        CardView cardView1 = (CardView) view.findViewById(R.id.card_view);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), RateActivity.class);
                startActivity (intent);
            }
        });

        return view;
    }

}
