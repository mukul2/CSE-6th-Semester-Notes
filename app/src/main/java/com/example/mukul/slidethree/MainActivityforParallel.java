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
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;

public class MainActivityforParallel  extends AppCompatActivity implements MaterialTabListener,NavigationView.OnNavigationItemSelectedListener  {

    MaterialTabHost tabHost;
    ViewPager viewPager;
    ViewPagerAdapter androidAdapter;
    Toolbar toolBar;
    String [] chapter= {"Parallal 1",
            "Distributed Computing",
            "Parallal 3",
            "Parallal 4",
            "Parallal 5",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpara);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //android toolbar
        toolBar = (Toolbar) this.findViewById(R.id.toolBar);
        // toolBar.animate().translationY(-toolBar.getBottom()).setInterpolator(new AccelerateInterpolator()).start();
        toolBar.setTitle("Parallel and Distriuted Processing");


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

m.add("Parallel Chapter 1:");
            Menu mm = m.addSubMenu("Top Channels");
            mm.addSubMenu("parallel processing");
            mm.addSubMenu("Flyns classification");
            mm.addSubMenu("VAX 8600");
            mm.addSubMenu("intel i860");
            mm.addSubMenu("Dual operation in i860");
            mm.addSubMenu("Pipelining Concept");
            mm.addSubMenu("Superscaler Processor");
            mm.addSubMenu("Mismatch btn sw-hw");
            mm.addSubMenu("Mismatch solve");


            m.add("Parallel Chapter 2:");
            Menu mm2 = m.addSubMenu("Top Channels");
            mm2.addSubMenu("Distributed System");
            mm2.addSubMenu("Advantages");
            mm2.addSubMenu("Disadvantages");
            mm2.addSubMenu("Architechtural Model");
            mm2.addSubMenu("Loosely Coupled");
            mm2.addSubMenu("Tighly Coupled");
            mm2.addSubMenu("Distributed Coputing Model");
            mm2.addSubMenu("Diskless Workstation");
            mm2.addSubMenu("RPC");

            m.add("Parallel chapter 3");
            Menu mm3 = m.addSubMenu("Distributed OS");
            mm3.addSubMenu("Issues in Distributed OS design");
            mm3.addSubMenu("Design factors of D O S");
            mm3.addSubMenu("Fault");
            mm3.addSubMenu("Types of Fault");
            mm3.addSubMenu("TMR");
            mm3.addSubMenu("Distri. File System");
            mm3.addSubMenu("File service");

            m.add("Parallel chapter 4");

            Menu mm4 = m.addSubMenu("IBM RS/6000");
            mm4.addSubMenu("Physical models of share multi pro.");
            mm4.addSubMenu("UMA");
            mm4.addSubMenu("NUMA"); mm4.addSubMenu("COMA");
            mm4.addSubMenu("Implicit Parallelism");
            mm4.addSubMenu("Explicit Parallelism"); mm4.addSubMenu("Advantage of Parallel Comp");
            mm4.addSubMenu("SIMD vs MIMD");
            mm4.addSubMenu("Multi pro. vs Message Pass");
            mm4.addSubMenu("Cycles per Instructions");

            m.add("Parallel Chapter 5");


            Menu mm5 = m.addSubMenu("Throughput rate");
            mm5.addSubMenu("Architechure of parallel processing");
            mm5.addSubMenu("Shared  memory");
            mm5.addSubMenu("Shared disk");
            mm5.addSubMenu("Shared nothing");
            mm5.addSubMenu("Data dependency");
            mm5.addSubMenu("Different program flow mechanism");   mm5.addSubMenu("Control flow mechanism");
            mm5.addSubMenu("Data flow mechanism");
            mm5.addSubMenu("Hardware parallesim");
            mm5.addSubMenu("Software parallesim");
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


        if (id2.equals("Parallel Chapter 1") ||
                id2.equals("parallel processing") ||
                id2.equals("Flyns classification")||
        id2.equals("VAX 8600")||
                id2.equals("intel i860")||
                id2.equals("Dual operation in i860")||
                id2.equals("Pipelining Concept")||
                id2.equals("Superscaler Processor")||
                id2.equals("Mismatch btn sw-hw")||
                id2.equals("Mismatch solve")



                ){

            tabHost.setSelectedNavigationItem(0);
            viewPager.setCurrentItem(0);

        }else if (id2.equals( "Parallel Chapter 2")||
                id2.equals("Distrubuted System")||
                id2.equals("Advantages")||
                id2.equals("Disadvantages")||
                id2.equals("Architechtural Model")||
                id2.equals("Loosely Coupled")||
                id2.equals("Distributed Computing")||
                id2.equals("Diskless Workstation")||
                id2.equals("Tighly Coupled")||
                id2.equals("RPC")



                ) {
            tabHost.setSelectedNavigationItem(1);
            viewPager.setCurrentItem(1);

        } else if (id2.equals("Parallel Chapter 3")||
                id2.equals("Distributed OS")||
                id2.equals("Issues in Distributed OS")||
                id2.equals("Design factors of D O S")||
                id2.equals("Fault")||
                id2.equals("Types of Fault")||
                id2.equals("TMR")||
                id2.equals("Distri. File System")||
                id2.equals("File service")


                ) {
            tabHost.setSelectedNavigationItem(2);
            viewPager.setCurrentItem(2);

        } else if (id2.equals("Parallel Chapter 4")||
                id2.equals("IBM RS/6000")||
                id2.equals("Physical models of share multi pro.")||
                id2.equals("UMA")||
                id2.equals("NUMA")||
                id2.equals("COMA")||
                id2.equals("Implicit Parallelism")||
                id2.equals("Explicit Parallelism")||
                id2.equals("SIMD vs MIMD")||
                id2.equals("Multi pro. vs Message Pass")||
                id2.equals("Cycles per Instructions")

                ) {
            tabHost.setSelectedNavigationItem(3);
            viewPager.setCurrentItem(3);

        } else if (id2.equals("Parallel Chapter 5")||
                id2.equals("Throughput rate")||
                id2.equals("Architechure of parallel")||
                id2.equals("Shared memory")||
                id2.equals("Shared disk")||
                id2.equals("Shared nothing")||
                id2.equals("Data dependency")||
                id2.equals("Different program flow")||
                id2.equals("Control flow mechanism")||
                id2.equals("Data flow mechanism")||
                id2.equals("Hardware parallesim")||
                id2.equals("Software parallesim")


                ) {
            tabHost.setSelectedNavigationItem(4);
            viewPager.setCurrentItem(4);

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
               return new para1();
          else
            if (num  == 1)

                return new para2();
           else
           if (num == 2)
               return  new para3();
           else   if (num == 3)
               return  new para4();
           else
                return  new para5();





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