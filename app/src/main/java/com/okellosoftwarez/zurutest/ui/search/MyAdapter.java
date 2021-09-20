package com.okellosoftwarez.zurutest.ui.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {
    List<Fragment> fragmentList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();

    public void addFragment(Fragment fragment, String s){
        fragmentList.add(fragment);
        stringList.add(s);
    }
    public MyAdapter(FragmentManager fragmentManager){
        super(fragmentManager);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
//        return selected fragment

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        return tab title
        return stringList.get(position);
    }
}
