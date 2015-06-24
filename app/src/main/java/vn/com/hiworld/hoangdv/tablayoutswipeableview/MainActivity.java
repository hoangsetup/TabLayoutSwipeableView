package vn.com.hiworld.hoangdv.tablayoutswipeableview;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import vn.com.hiworld.hoangdv.tablayoutswipeableview.adapter.TabsPageAdapter;
import vn.com.hiworld.hoangdv.tablayoutswipeableview.fragment.MyToast;


public class MainActivity extends FragmentActivity {
    private ViewPager pager;
    private TabsPageAdapter adapter;
    private ActionBar actionBar;
    private String[] tabs = {"Top Rate", "Games", "Moves"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager)findViewById(R.id.pager);
        actionBar = getActionBar();
        adapter = new TabsPageAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for(String s : tabs){
            actionBar.addTab(actionBar.newTab().setText(s).setTabListener(new ActionBar.TabListener() {
                @Override
                public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                    pager.setCurrentItem(tab.getPosition(), true);
                }

                @Override
                public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

                }

                @Override
                public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

                }
            }));
        }
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                actionBar.getTabAt(i).select();
                new MyToast(MainActivity.this, actionBar.getTabAt(i).getText()+"");
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
}
