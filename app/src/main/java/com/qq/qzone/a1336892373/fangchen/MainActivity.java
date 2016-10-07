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
import com.qq.qzone.a1336892373.fangchen.tools.list_str;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.main_listview);
        listView.setAdapter( new myadapter(MainActivity.this, R.layout.list_item, list_str.getStr()) );
        listView.setOnItemClickListener(this);
    }

    public class myadapter extends ArrayAdapter<Integer> {
        int resouId;
        public myadapter(Context context, int textId, List<Integer> object) {
            super(context, textId, object);
            resouId = textId;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if (convertView == null)    view = LayoutInflater.from(getContext()).inflate(resouId, null);
            else                        view = convertView;
            ImageView imageView = (ImageView) view.findViewById(R.id.item_imageview);
            imageView.setImageResource(getItem(position));
            return view;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity.this, jiejueActivity.class);
        intent.putExtra("leixin", ++position);
        startActivity(intent);
    }


}
