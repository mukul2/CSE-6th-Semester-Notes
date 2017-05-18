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

public class MainActivityforArtificial extends ActionBarActivity implements MaterialTabListener ,NavigationView.OnNavigationItemSelectedListener {

    MaterialTabHost tabHost;
    ViewPager viewPager;
    ViewPagerAdapter androidAdapter;
    Toolbar toolBar;
    String [] chapter= {"Introduction",
            "Intelligent Agents",
            "Problem-solving",
            "Searching",
            "Artificial 5",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainai);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //android toolbar
        toolBar = (Toolbar) this.findViewById(R.id.toolBar);
        // toolBar.animate().translationY(-toolBar.getBottom()).setInterpolator(new AccelerateInterpolator()).start();
        toolBar.setTitle("Artificial Intelligence");


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

        /*    Menu m = navigationView.getMenu();



           m.add("Introduction");
            Menu mm = m.addSubMenu("Defination");
            mm.addSubMenu("Example");
            mm.addSubMenu("Intelligence");
            mm.addSubMenu("Turing Test");
            mm.addSubMenu("Peas for Medical");
            mm.addSubMenu("Peas for image analysis");
            mm.addSubMenu("Peas for part picking robot");
            mm.addSubMenu("Peas for Refinary Controller");








            m.add("Intelligent Agent");
            Menu mm2 = m.addSubMenu("Agent");
            mm2.addSubMenu("Rational Agent");
            mm2.addSubMenu("Advantage of Rational Agent");
            mm2.addSubMenu("Foundation of AI");
            mm2.addSubMenu("Agent interact with environment");
            mm2.addSubMenu("Omniscience vs Rational agent");
            mm2.addSubMenu("Types of Environment");
            mm2.addSubMenu("Types of Agent program");
            mm2.addSubMenu("Simple reflex agents");
            mm2.addSubMenu("Model based reflex agent");
            mm2.addSubMenu("Goal based agents");
            mm2.addSubMenu("Utility based agents");






            m.add("Problem Solving");
            Menu mm3 = m.addSubMenu("Knowldge representation");
            mm3.addSubMenu("Expert System");
            mm3.addSubMenu("Benifits of expert System");
            mm3.addSubMenu("Knowldge vs Intelligence");
            mm3.addSubMenu("Applications of AI");
            mm3.addSubMenu("Importance of AI");
            mm3.addSubMenu("Types of problems");
            mm3.addSubMenu("Knowldge");


            m.add("Searching");
            Menu mm4 = m.addSubMenu("Bredth first search");
            mm4.addSubMenu("Depth first search");
            mm4.addSubMenu("Criteria for search strategies");
            mm4.addSubMenu("Prove A* search");
            mm4.addSubMenu("Fuzzy logic");
            mm4.addSubMenu("Predicate logic");
            mm4.addSubMenu("Blind search");
            mm4.addSubMenu("Admissible heuristics");

            m.add("AI ");

            Menu mm5 = m.addSubMenu("Place of AI in computer Science");
            mm5.addSubMenu("Define AI");
            mm5.addSubMenu("Characterisrics of expert system");
            mm5.addSubMenu("Propositional logic and Predicate logic");
            mm5.addSubMenu("Inference rule");
            mm5.addSubMenu("Artificial Nural Network");
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


        if (id2.equals("Introduction")||
                id2.equals("Defination")||
                id2.equals("Example")||
                id2.equals("Intelligence")||
                id2.equals("Turing Test")||
                id2.equals("Peas for Medical")||
                id2.equals("Peas for image analysis")||
                id2.equals("Peas for part picking robot")||
                id2.equals("Peas for Refinary Controller")

                ) {

            tabHost.setSelectedNavigationItem(0);
            viewPager.setCurrentItem(0);

        }else if (id2.equals( "Intelligent Agents")||
                id2.equals("Agent")||
                id2.equals("Rational Agent")||
                id2.equals("Advantage of Rational Agent")||
                id2.equals("Foundation of AI")||
                id2.equals("Agent interact with environment")||
                id2.equals("Omniscience vs Rational agent")||
                id2.equals("Types of Environment")||
                id2.equals("Types of Agent program")||
                id2.equals("Simple reflex agents")||
                id2.equals("Model based reflex agent")||
                id2.equals("Goal based agents")||
                id2.equals("Utility based agents")





                ) {
            tabHost.setSelectedNavigationItem(1);
            viewPager.setCurrentItem(1);

        } else if (id2.equals("Problem-solving")||
                id2.equals("Knowldge representation")||
                id2.equals("Expert System")||
                id2.equals("Benifits of expert System")||
                id2.equals("Knowldge vs Intelligence")||
                id2.equals("Applications of AI")||
                id2.equals("Importance of AI")||
                id2.equals("Types of problems")||
                id2.equals("Knowldge")


                ) {
            tabHost.setSelectedNavigationItem(2);
            viewPager.setCurrentItem(2);

        } else if (id2.equals("Searching")||
                id2.equals("Bredth first search")||
                id2.equals("Depth first search")||
                id2.equals("Criteria for search strategies")||
                id2.equals("Prove A* search")||
                id2.equals("Fuzzy logic")||
                id2.equals("Predicate logic")||
                id2.equals("Blind search")||
                id2.equals("Admissible heuristics")

                ) {
            tabHost.setSelectedNavigationItem(3);
            viewPager.setCurrentItem(3);

        } else if (id2.equals("AI")||
                id2.equals("Place of AI in computer Science")||
                id2.equals("Define AI")||
                id2.equals("Characterisrics of expert system")||
                id2.equals("Propositional logic and Predicate logic")||
                id2.equals("Inference rule")||
                id2.equals("Artificial Nural Network")


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
               return new artifi1();
          else
            if (num  == 1)

                return new artifi2();
           else
           if (num == 2)
               return  new artifi3();
           else   if (num == 3)
               return  new artifi4();
           else
                return  new artifi5();





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