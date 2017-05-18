package com.example.mukul.slidethree;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;

public class MainActivity extends ActionBarActivity implements MaterialTabListener,NavigationView.OnNavigationItemSelectedListener {

    MaterialTabHost tabHost;

    ViewPager viewPager;
    ViewPagerAdapter androidAdapter;
    Toolbar toolBar;
    String [] chapter= {"Introduction to Digital Signal Processing",
            "Discrete fourier Transform",
            "The Z Transform",
            "Implementation of Discrete-Time Systems",
            "Design of Digital Filters",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolBar = (android.support.v7.widget.Toolbar) this.findViewById(R.id.toolBar);
        this.setSupportActionBar(toolBar);
        //android toolbar


        //android toolbar
        toolBar = (android.support.v7.widget.Toolbar) this.findViewById(R.id.toolBar);
        // toolBar.animate().translationY(-toolBar.getBottom()).setInterpolator(new AccelerateInterpolator()).start();
        toolBar.setTitle("Digital Signal Processing");


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





           

          /*  Menu m = navigationView.getMenu();



          //  for(int j =0;j<chapter.length;j++)
           // {
                m.add("Introduction to Digital Signal Processing");
            Menu mm = m.addSubMenu("DSP");
            mm.addSubMenu("Block diagram");
            mm.addSubMenu("A/D converter");
            mm.addSubMenu("Apps of DSP");
            mm.addSubMenu("Advantage of DSP");
            mm.addSubMenu("Disadvantage of DSP");
            mm.addSubMenu("Signal");
            mm.addSubMenu("Discrete Time Signal");
            mm.addSubMenu("Continus Time Signal");
            mm.addSubMenu("Periodic Time Signal");
            mm.addSubMenu("Unit Step Signal");
            mm.addSubMenu("Analog vs Digital");
            mm.addSubMenu("A/D sonversion");
            mm.addSubMenu("Sampling");
            mm.addSubMenu("");



            m.add("Discrete fourier Transform");
            Menu mm2 = m.addSubMenu("Define");
            mm2.addSubMenu("Inverse DFT");
            mm2.addSubMenu("FFT");
            mm2.addSubMenu("Need of FFT");
            mm2.addSubMenu("Apps of FFT");
            mm2.addSubMenu("DTFT");
            mm2.addSubMenu("");
            mm2.addSubMenu("");
            mm2.addSubMenu("");






            m.add("The Z Transform");
            Menu mm3 = m.addSubMenu("Define");
            mm3.addSubMenu("Inverse Z transform");
            mm3.addSubMenu("");
            mm3.addSubMenu("");
            mm3.addSubMenu(""); mm3.addSubMenu("");
            mm3.addSubMenu("");





            m.add("Implementation of Discrete-Time Systems");
            Menu mm4 = m.addSubMenu("Conditions for Linearity");
            mm4.addSubMenu("Examples");
            mm4.addSubMenu("Memory System");
            mm4.addSubMenu("Memoryless System");
            mm4.addSubMenu("Properties of Convolution");
            mm4.addSubMenu("Calculating Convolution sum");
            mm4.addSubMenu("Properties of ROC Z transform");
            mm4.addSubMenu("Adaptive filter");
            mm4.addSubMenu("An important mathe");
            mm4.addSubMenu("");




            m.add("Design of Digital Filters");
            Menu mm5 = m.addSubMenu("Filter Design Steps");
            mm5.addSubMenu("Digital filter");
            mm5.addSubMenu("Block diagram");
            mm5.addSubMenu("Advantage of Digital Filter");
            mm5.addSubMenu("Disdvantage of Digital Filter");
            mm5.addSubMenu("Digital filter vs Analog filter");
            mm5.addSubMenu("Classifications of Digital filter");
            mm5.addSubMenu("FIR advantage");
            mm5.addSubMenu("FIR disadvantage");
            mm5.addSubMenu("Linear phase characterized of FIR filter");
            mm5.addSubMenu("General impulse response of FIR filter");
            mm5.addSubMenu("Transfer function of FIR filter");
            */

           // }
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


        if (id2.equals("Introduction to DSP")||
                id2.equals("DSP")||
                id2.equals("Block diagram of DSP")||
                id2.equals("Analog to Digital Converter")||
                id2.equals("Digital Signal Processor")||
                id2.equals("Digital to Analog converter")||
                id2.equals("Applications of DSP")||
                id2.equals("Advantages of DSP")||
                id2.equals("Disadvantages of DSP")||
                id2.equals("Define Signal")||
                id2.equals("Discrete time Signal")||
                id2.equals("Continous Time Signal")||
                id2.equals("Periodic Signal")||
                id2.equals("Unit Step Signal")||
                id2.equals("Analog Signal vs Digital Signal")||
                id2.equals("Analog o Digital Conversion")||
                id2.equals("Sampling")


                ) {

            tabHost.setSelectedNavigationItem(0);
          viewPager.setCurrentItem(0);

        }else if (id2.equals( "Discrete fourier Transform")||
                id2.equals("Inverse DFT")||
                id2.equals("FFT")||
                id2.equals("Need of FFT")||
                id2.equals("Applications of FFT")||
                id2.equals("DTFT")





                ) {
            tabHost.setSelectedNavigationItem(1);
            viewPager.setCurrentItem(1);

        } else if (id2.equals("The Z Transform")||
                id2.equals("Defination")||
                id2.equals("Inverse Z transform")




                ) {
            tabHost.setSelectedNavigationItem(2);
            viewPager.setCurrentItem(2);

        } else if (id2.equals("Implementation of Discrete-Time Systems")||
                id2.equals("Implementation of Discrete-Time Systems")||
                id2.equals("Conditions to check")||
                id2.equals("Examples")||
                id2.equals("Memory System")||
                id2.equals("Memoryless System")||
                id2.equals("Convolution Properties")||
                id2.equals("Commutative Property")||
                id2.equals("Associative Property")||
                id2.equals("Distributive property")||
                id2.equals("Calculationg Convolution sum")||
                id2.equals("ROC of Z transform")||
                id2.equals("Adaptive filter")||
                id2.equals("An important math")
              







                ) {
            tabHost.setSelectedNavigationItem(3);
            viewPager.setCurrentItem(3);

        } else if (id2.equals("Design of Digital Filters")||
                id2.equals("Defination")||
                id2.equals("Filter design steps")||
                id2.equals("Block diagram")||
                id2.equals("Advantage of Digital filtering")||
                id2.equals("Disadvantage of Digital filtering")||
                id2.equals("Analog filter vs Digital Filter")||
                id2.equals("Classifications of Digital filter")||
                id2.equals("FIR filter design")||
                id2.equals("Advantage of FIR filter")||
                id2.equals("Disadvantage of FIR filter")||
                id2.equals("Necessary and sufficient condition")||
                id2.equals("Impulse response of FIR")||
                id2.equals("Transfer function of FIR")



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
               return new AndroidFragment();
          else
            if (num  == 1)

                return new DiscreteFourierTransform();
           else
           if (num == 2)
               return  new Ztrans();
           else   if (num == 3)
               return  new discreteTimeSignal();

 else
                return  new designOfDigitalFilters();



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