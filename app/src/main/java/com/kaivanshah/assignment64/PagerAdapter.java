package com.kaivanshah.assignment64;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.kaivanshah.assignment64.fragements.*;


/**
 * Created by kaivanrasiklal.s on 14-03-2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numTabs;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public PagerAdapter(FragmentManager fm, int NumTabs) {

        super(fm);
        this.numTabs = NumTabs;

    }


    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                AudioFragment oAudioFragment = new AudioFragment();
                return oAudioFragment;

            case 1:
                VideoFragment oVideoFragment = new VideoFragment();
                return oVideoFragment;

            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
