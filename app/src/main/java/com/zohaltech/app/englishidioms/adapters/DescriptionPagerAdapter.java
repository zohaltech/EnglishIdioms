package com.zohaltech.app.englishidioms.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zohaltech.app.englishidioms.fragments.DefinitionFragment;
import com.zohaltech.app.englishidioms.fragments.ExamplesFragment;
import com.zohaltech.app.englishidioms.fragments.NotesFragment;

import java.util.ArrayList;

public class DescriptionPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<String> tabTitles;
    private int               vocabId;

    public DescriptionPagerAdapter(FragmentManager fm, ArrayList<String> tabTitles, int vocabId) {
        super(fm);
        this.tabTitles = tabTitles;
        this.vocabId = vocabId;
    }

    @Override
    public int getCount() {
        return tabTitles.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return DefinitionFragment.newInstance(vocabId);
        else if (position == 1)
            return ExamplesFragment.newInstance(vocabId);
        else
            return NotesFragment.newInstance(vocabId);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
