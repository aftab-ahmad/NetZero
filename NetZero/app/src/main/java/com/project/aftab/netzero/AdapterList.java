package com.project.aftab.netzero;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by NicsMac on 15-03-29.
 */
public class AdapterList extends ArrayAdapter<String> {

    private final String[] values;
    private final Context context;

    public AdapterList(Context context, String[] values) {
        super(context, R.layout.leaderboard_list_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.leaderboard_list_item, parent, false);
        TextView rank = (TextView) rowView.findViewById(R.id.rank);
        TextView name = (TextView) rowView.findViewById(R.id.user);
        TextView score = (TextView) rowView.findViewById(R.id.score);
        rank.setText(values[0]);
        name.setText(values[1]);
        score.setText(values[2]);

        return rowView;

    }

}
