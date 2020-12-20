package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
//        WeatherFragment weatherFragment = new WeatherFragment();
//        getSupportFragmentManager().beginTransaction().add(
//                R.id.Weather_container, weatherFragment).commit();
//        ForecastFragment forecastFragment = new ForecastFragment();
//        getSupportFragmentManager().beginTransaction().add(
//                R.id.Fragment_container, forecastFragment).commit();
        PagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);

        Log.i("Weather", "onCreate() is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather", "onStart() is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather", "onResume() is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather", "onPause() is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather", "onStop() is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy() is called");
    }

    public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 3;
        private String titles[] = new String[] {"Ha Noi", "Paris", "Toulouse"};

        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int page) {
            switch (page) {
                case 0:
                    return new WeatherAndForecastFragment();
                case 1:
                    return new WeatherAndForecastFragment();
                case 2:
                    return new WeatherAndForecastFragment();
                default:
                    return new WeatherAndForecastFragment();
            }
        }

        @Override
        public CharSequence getPageTitle(int page) {
            return titles[page];
        }
    }
}

