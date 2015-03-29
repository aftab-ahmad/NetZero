package com.project.aftab.netzero;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class LeaderboardTabAndList extends TabActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard_fragment);

        // create the TabHost that will contain the Tabs
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        TabSpec tab1 = tabHost.newTabSpec("Community");
        TabSpec tab2 = tabHost.newTabSpec("Province");
        TabSpec tab3 = tabHost.newTabSpec("Canada");

        tab1.setIndicator("City");
        tab1.setContent(new Intent(this,LeaderboardActivity.class));

        tab2.setIndicator("Province");
        tab2.setContent(new Intent(this,LeaderboardActivity.class));

        tab3.setIndicator("Canada");
        tab3.setContent(new Intent(this,LeaderboardActivity.class));

        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
}
