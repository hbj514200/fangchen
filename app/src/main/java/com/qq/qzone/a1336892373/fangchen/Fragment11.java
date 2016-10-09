package com.qq.qzone.a1336892373.fangchen;

import com.qq.qzone.a1336892373.fangchen.tools.jisuan11;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fragment11 extends Fragment {

    private GridView gridView;
    private double[] shuju = new double[30];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_11, container, false);

        gridView = (GridView) view.findViewById(R.id.gridview);
        ListAdapter adapter = new Myadapter(getActivity(), getData(), R.layout.grid_item, new String[]{"name","edit"}, new int[]{R.id.grid_text, R.id.grid_edit});
        gridView.setAdapter(adapter);

        Button button = (Button) view.findViewById(R.id.jisuan_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm  = getActivity().getFragmentManager();
                xianshiFragemnt xianshi = (xianshiFragemnt) fm.findFragmentById(R.id.jiejue_xianshi);
                xianshi.xianshi(1, jisuan11.jisuan(shuju) );
                int flag = 0;
                for (int i=1; i<=2; i++)
                    if (shuju[i]==514200)   flag = 1;
                if (flag == 0){
                    double[] tem = shuju;
                    xianshi.xianshi(1, tem );
                } else
                    Toast.makeText(getActivity(), "请输入全部数据", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private List<Map<String,Object>> getData(){
        List<Map<String,Object>> datalist = new ArrayList<Map<String,Object>>();
        for (int i=1; i<=2; i++){
            Map<String,Object> map = new HashMap<String,Object>();
            datalist.add(map);
        }
        return datalist;
    }

    public class Myadapter extends SimpleAdapter {

        public Myadapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
            super(context, data, resource, from, to);
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            String[] st = new String[]{"", "a: ", "b: "};
            LayoutInflater inflater = getActivity().getLayoutInflater();
            convertView = inflater.inflate(R.layout.grid_item, null);
            TextView textView = (TextView) convertView.findViewById(R.id.grid_text);
            textView.setText(st[position+1]);
            final EditText editText = (EditText) convertView.findViewById(R.id.grid_edit);
            editText.addTextChangedListener(new TextWatcher() {
                @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
                @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
                @Override
                public void afterTextChanged(Editable editable) {
                    if (!editText.getText().toString().equals(""))
                        shuju[position+1] = Double.parseDouble(editText.getText().toString());
                    else
                        shuju[position+1] = 514200;
                }
            });
            return convertView;
        }
    }

}
