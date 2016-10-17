package com.qq.qzone.a1336892373.fangchen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.qq.qzone.a1336892373.fangchen.tools.list_str;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        ListView  listView = (ListView) findViewById(R.id.main_listview);
        listView.setAdapter( new myadapter(MainActivity.this, R.layout.list_item, list_str.getStr()) );
        listView.setOnItemClickListener(this);

        ImageView  imageView = (ImageView) findViewById(R.id.main_guanyu);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this, guanyuActivity.class) );
            }
        });
    }

    public class myadapter extends ArrayAdapter<Integer> {
        int resouId;
        public myadapter(Context context, int textId, List<Integer> object) {
            super(context, textId, object);
            resouId = textId;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null)    convertView = LayoutInflater.from(getContext()).inflate(resouId, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.item_imageview);
            imageView.setImageResource(getItem(position));
            return convertView;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity.this, jiejueActivity.class);
        intent.putExtra("leixin", ++position);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sendBroadcast( new Intent("com.qq.qzone.a1336892373.fangchen.ads") );
    }
}
