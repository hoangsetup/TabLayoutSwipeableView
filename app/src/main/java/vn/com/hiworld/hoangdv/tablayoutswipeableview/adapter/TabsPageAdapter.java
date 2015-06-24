package vn.com.hiworld.hoangdv.tablayoutswipeableview.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import vn.com.hiworld.hoangdv.tablayoutswipeableview.fragment.GamesFragment;
import vn.com.hiworld.hoangdv.tablayoutswipeableview.fragment.MoviesFragment;
import vn.com.hiworld.hoangdv.tablayoutswipeableview.fragment.ToprateFragment;

/**
 * Created by hoangdv on 24/06/2015.
 */
public class TabsPageAdapter extends FragmentPagerAdapter {

    public TabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new ToprateFragment();
            case 1: return new GamesFragment();
            case 2: return new MoviesFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
