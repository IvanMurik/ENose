package com.murik.enose.ui.fragment.resultRadarChart.tab;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.murik.enose.dto.SensorDataFullParcelable;
import com.murik.enose.ui.fragment.resultRadarChart.ResultRadarChartFragment;

public class ResultRadarChartTabAdapter extends FragmentPagerAdapter {


    private SensorDataFullParcelable sensorDataFullParcelable;
    private final int PAGE_COUNT = 5;
    private String tabTitle[] = new String[]{"Total", "Endokrin", "Energy", "Health", "Bad"};

    public ResultRadarChartTabAdapter(FragmentManager fm, SensorDataFullParcelable sensorDataFullParcelable) {
        super(fm);
        this.sensorDataFullParcelable = sensorDataFullParcelable;

    }


    @Override
    public Fragment getItem(int position) {
        return ResultRadarChartFragment.newInstance(position, sensorDataFullParcelable);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }

}
