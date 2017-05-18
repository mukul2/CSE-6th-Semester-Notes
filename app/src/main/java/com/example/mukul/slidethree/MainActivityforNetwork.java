package com.example.mukul.slidethree;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;

public class MainActivityforNetwork extends ActionBarActivity implements  MaterialTabListener,NavigationView.OnNavigationItemSelectedListener {

    MaterialTabHost tabHost;
    ViewPager viewPager;
    ViewPagerAdapter androidAdapter;
    Toolbar toolBar;
    String [] chapter= {"Inroduction",
            "Frame relay",
            "Network Layer",
            "Data link layer",
            "Various","Transmision Media","Network security"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainnet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //android toolbar
        toolBar = (Toolbar) this.findViewById(R.id.toolBar);
        // toolBar.animate().translationY(-toolBar.getBottom()).setInterpolator(new AccelerateInterpolator()).start();
        toolBar.setTitle("Computer Network");


        this.setSupportActionBar(toolBar);

        //tab host
        tabHost = (MaterialTabHost) this.findViewById(R.id.tabHost);
        viewPager = (ViewPager) this.findViewById(R.id.viewPager);

        //adapter view
        androidAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(androidAdapter);
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int tabposition) {
                tabHost.setSelectedNavigationItem(tabposition);
            }
        });

        //for tab position
        for (int i = 0; i < androidAdapter.getCount(); i++) {
            tabHost.addTab(
                    tabHost.newTab()
                            .setText(chapter[i])
                            .setTabListener(this)
            );


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
/*
            Menu m = navigationView.getMenu();



            for(int j =0;j<chapter.length;j++)
            {
                m.add(chapter[j]);

            }
            */
        }

        }


    //tab on selected
    @Override
    public void onTabSelected(MaterialTab materialTab) {

        viewPager.setCurrentItem(materialTab.getPosition());
    }

    //tab on reselected
    @Override
    public void onTabReselected(MaterialTab materialTab) {

    }

    //tab on unselected
    @Override
    public void onTabUnselected(MaterialTab materialTab) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        CharSequence id2 = item.getTitle();


        if (id2.equals("Inroduction")
) {

            tabHost.setSelectedNavigationItem(0);
            viewPager.setCurrentItem(0);

        }else if (id2.equals( "Frame relay")
 ) {
            tabHost.setSelectedNavigationItem(1);
            viewPager.setCurrentItem(1);

        } else if (id2.equals("Network Layer")

 ) {
            tabHost.setSelectedNavigationItem(2);
            viewPager.setCurrentItem(2);

        } else if (id2.equals("Data link layer")  ) {
            tabHost.setSelectedNavigationItem(3);
            viewPager.setCurrentItem(3);

        } else if (id2.equals("Various")) {
            tabHost.setSelectedNavigationItem(4);
            viewPager.setCurrentItem(4);
        } else if (id2.equals("Transmision Media")) {
            tabHost.setSelectedNavigationItem(5);
            viewPager.setCurrentItem(5);
        } else if (id2.equals("Network security")) {
            tabHost.setSelectedNavigationItem(6);
            viewPager.setCurrentItem(6);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    // view pager adapter
    private class ViewPagerAdapter extends FragmentStatePagerAdapter {

        public ViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public Fragment getItem(int num) {




           if(num == 0)
               return new net1();
          else
            if (num  == 1)

                return new net2();
           else
           if (num == 2)
               return  new net3();
           else   if (num == 3)
               return  new net4();
           else if(num== 4)
                return  new net5();
           else if(num== 5)
               return  new net6();
           else if(num== 6)
               return  new net7();
           else
               return  new net8();






        }




        @Override
        public int getCount() {
            return chapter.length;
        }

        @Override
        public CharSequence getPageTitle(int tabposition) {
            return "Chapter  " + tabposition;
        }

    }
}