package com.example.root.a;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Weather weather_data[] = new Weather[]
                {
                        new Weather(R.drawable.ic_launcher_background, "Cloudy"),
                        new Weather(R.drawable.ic_launcher_foreground, "Showers"),
                        new Weather(R.drawable.ic_launcher_background, "Snow"),
                        new Weather(R.drawable.ic_launcher_background, "Storm"),
                        new Weather(R.drawable.ic_launcher_foreground, "Sunny")
                };

        WeatherAdapter adapter = new WeatherAdapter(this,
                R.layout.listview_item_row, weather_data);


        listView1 = (ListView)findViewById(R.id.listView1);


        listView1.setAdapter(adapter);
    }
}

