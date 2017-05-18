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

public class MainActivityforPeripheral extends ActionBarActivity implements MaterialTabListener ,NavigationView.OnNavigationItemSelectedListener {

    MaterialTabHost tabHost;
    ViewPager viewPager;
    ViewPagerAdapter androidAdapter;
    Toolbar toolBar;
    String [] chapter= {"Peri1",
            "Peri2",
            "Peri3",
            "Peri4",
            "Peri5",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainperi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //android toolbar
        toolBar = (Toolbar) this.findViewById(R.id.toolBar);
        // toolBar.animate().translationY(-toolBar.getBottom()).setInterpolator(new AccelerateInterpolator()).start();
        toolBar.setTitle("Peripheral");


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

            m.add("Page 1");
            Menu mm = m.addSubMenu("DMA");
            mm.addSubMenu("Interface Unit");
            mm.addSubMenu("Laser Printer");
            mm.addSubMenu("");
            mm.addSubMenu("");



            m.add("Page 2");
            Menu mm2 = m.addSubMenu("DMA");
            mm2.addSubMenu("Assynchronous Serial interface");
            mm2.addSubMenu("BSR mode of 8255 I/O ports");
            mm2.addSubMenu("I/O modes");
           ;



            m.add("Page 3");
            Menu mm3 = m.addSubMenu("Handshake model 1");
            mm3.addSubMenu("OMR vs OCR");
            mm3.addSubMenu("Memory mapped I/O");




            m.add("Page 4");
            Menu mm4 = m.addSubMenu("Relay Circuit");
            mm4.addSubMenu("Stepper Motor Interfacing");
            mm4.addSubMenu("Cathode ray tube");

            m.add("Page 5");
            Menu mm5 = m.addSubMenu("Dynamic Scattering LCD");
            mm5.addSubMenu("Explain RS-232-c/v.24");
            mm5.addSubMenu("Dot matrix printer");


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


        if (id2.equals("Application of PPI")||
                id2.equals("Assynchronous Serial Interface")||
                id2.equals("Computer Peripherals")||
                id2.equals("DMA")||
                id2.equals("Interface Unit")||
                id2.equals("Computer Interfacing")||
                id2.equals("Basic interfacing unit")||
                id2.equals("Laser printer")

                ) {

            tabHost.setSelectedNavigationItem(0);
            viewPager.setCurrentItem(0);

        }else if (id2.equals( "Assynchronous Serial interface")||
                id2.equals("BSR mode")||
                id2.equals("I/O modes")




                ) {
            tabHost.setSelectedNavigationItem(1);
            viewPager.setCurrentItem(1);

        } else if (id2.equals("Page 3")||
                id2.equals("Handshake model 1")||
                id2.equals("OMR vs OCR")||
                id2.equals("Memory mapped I/O")||
                id2.equals("Peripheral Mapped I/O")||
                id2.equals("Serial vs parallel transmission")||
                id2.equals("PIC")||
                id2.equals("Application of PIC")




                ) {
            tabHost.setSelectedNavigationItem(2);
            viewPager.setCurrentItem(2);

        } else if (id2.equals("Barcode")||
                id2.equals("How barcode works")||
                id2.equals("Application of Barcode")||
                id2.equals("Relay Circuit")||
                id2.equals("How relay circuit works")||
                id2.equals("Stepper motor Interfacing")||
                id2.equals("Cathode ray tube")


                ) {
            tabHost.setSelectedNavigationItem(3);
            viewPager.setCurrentItem(3);

        } else if (id2.equals("Conditions for transfering data")||
                id2.equals("Synchronous vs Assynchronous transmission")||
                id2.equals("Dynamic scattering LCD")||
                id2.equals("RS-232 c /v.25")||
                id2.equals("Floppy disk controller")||
                id2.equals("Dot matrix printer")||
                id2.equals("Keybord encoder")


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
               return new peri1();
          else
            if (num  == 1)

                return new peri2();
           else
           if (num == 2)
               return  new peri3();
           else   if (num == 3)
               return  new peri4();
           else
                return  new peri5();





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