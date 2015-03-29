package com.project.aftab.netzero;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/* *Adapter for loading fragments on main activity */
public class PagerAdapter extends FragmentPagerAdapter {

    private final String[] TITLES = { "Budget", "Dashboard", "Profile"};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public Fragment getItem(int position) {

        Bundle data = new Bundle();

        switch (position)
        {
            case 0: // show favourites
                return SuperAwesomeCardFragment.newInstance(position);

            case 1: // show nextbux
                return SuperAwesomeCardFragment.newInstance(position);

            case 2:
                return SuperAwesomeCardFragment.newInstance(position);
        }

        return null;
    }
}