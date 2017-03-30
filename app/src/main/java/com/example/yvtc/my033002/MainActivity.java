package com.example.yvtc.my033002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String cities[] = {"台北","台中","台南","高雄"};
    String codes[]={"02","04","06","07"};
    ArrayList<Map<String,String>> mylist = new ArrayList<>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int  i ;
        lv=(ListView)findViewById(R.id.listView);
        for(i=0;i<codes.length;i++){
            Map m = new HashMap();
            m.put("city",cities[i]);
            m.put("code",codes[i]);
            mylist.add(m);
        }
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,mylist,
                android.R.layout.simple_list_item_2,new String[]{"city","code"},
                new int[]{android.R.id.text1,android.R.id.text2});
        lv.setAdapter(adapter);
    }
}
