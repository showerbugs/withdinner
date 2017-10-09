package showerbugs.withdinner;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class WeekTabPagerAdapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public WeekTabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        int weekNum = position + 1;
        return TimeTableListFragment.newInstance(weekNum);
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
