package com.project.aftab.netzero;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by NicsMac on 15-03-28.
 */

public class LeaderboardActivity extends Activity {

        ListView listview;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.leaderboard_list);
            listview = (ListView) findViewById(R.id.leaderboard_list);
            ListView listView = (ListView) this.findViewById(R.id.leaderboard_list);

            //Adapter to create bus schedule list

            for (int i=1; i<=99; i++){
                String[] string = new String[] {"#"+i, "username" +i ,i +" KJ"};
                AdapterList adapter = new AdapterList(
                        this, string);
                listView.setAdapter(adapter);
            }
        }
    }
