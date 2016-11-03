package com.example.yvtc.wp110301;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String[] fruits={"蘋果","蘋果1","蘋果2","蘋果3","蘋果4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv= (ListView)findViewById(R.id.listview);
        ArrayAdapter<String>adapter=new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                fruits);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,fruits[position],Toast.LENGTH_SHORT).show();
            }
        });
    }


}
