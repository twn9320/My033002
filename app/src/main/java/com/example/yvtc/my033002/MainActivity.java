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
    int imgs[]= {R.drawable.tp,R.drawable.tc,R.drawable.tn,R.drawable.kh};
    ArrayList<Map<String,Object>> mylist = new ArrayList<>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int  i ;
        lv=(ListView)findViewById(R.id.listView);
        for(i=0;i<codes.length;i++){
            Map<String,Object> m = new HashMap();
            m.put("city",cities[i]);
            m.put("code",codes[i]);
            m.put("img",imgs[i]);
            mylist.add(m);
        }
        //R.layout.myitem 為 自訂layout   textView textView2也是自訂layout內的物件
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,mylist,
                R.layout.myitem,new String[]{"city","code","img"},
                new int[]{R.id.textView,R.id.textView2,R.id.imageView});
        lv.setAdapter(adapter);
    }
}
