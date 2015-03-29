package com.project.aftab.netzero;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by aftab on 2015-03-28.
 */
public class BudgetFragment extends Fragment {

    Button manageBudget, month1, month3, year;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.budget_fragment, container, false);

        manageBudget = (Button) view.findViewById(R.id.manageBudget);
        month1 = (Button) view.findViewById(R.id.month1);
        month3 = (Button) view.findViewById(R.id.month2);
        year = (Button) view.findViewById(R.id.year);

        manageBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

                final AlertDialog dialog = builder.create();
                LayoutInflater inflater = getActivity().getLayoutInflater();

                final View dialogLayout = inflater.inflate(R.layout.input_dialog, null);
                dialog.setView(dialogLayout);
                dialog.setTitle("Schedule Budget");
                dialog.show();

                Button solve = (Button) dialogLayout.findViewById(R.id.solve);
                solve.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        EditText payment = (EditText) dialogLayout.findViewById(R.id.paymentField);
                        EditText interval = (EditText) dialogLayout.findViewById(R.id.intervalField);

                        //Toast.makeText(getActivity().getApplicationContext(), ""+payment + " " + interval  , Toast.LENGTH_SHORT).show();
                        if (Integer.parseInt(interval.getText().toString()) == 0) {
                            Toast.makeText(getActivity().getApplicationContext(), "Please enter a valid value."  , Toast.LENGTH_SHORT).show();
                        }
                        else {
                            double perWeek = Integer.parseInt(payment.getText().toString()) / Integer.parseInt(interval.getText().toString());
                            Toast.makeText(getActivity().getApplicationContext(), "Budget of: $" + perWeek + " set!", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    }
                });
            }
        });

        return view;
    }


}
