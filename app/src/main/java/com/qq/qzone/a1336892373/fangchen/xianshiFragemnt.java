package com.qq.qzone.a1336892373.fangchen;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.qq.qzone.a1336892373.fangchen.tools.fenshu;
import com.qq.qzone.a1336892373.fangchen.tools.*;

public class xianshiFragemnt extends Fragment {

    private TextView textView;
    private double[] shuju;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xianshi, container, false);
        textView = (TextView) view.findViewById(R.id.jiejue_text);
        return view;
    }

    public void xianshi(int leixin, double[] shuju){
        textView.setText("");
        this.shuju = shuju;
        if (leixin == 1)    chuli11();
        if (leixin == 2)    chuli12();
        //if (leixin == 3)    chuli13();
        //if (leixin == 4)    chuli21();
        //if (leixin == 5)    chuli31();
    }

    private void chuli11(){
        int fenzi = fenshu.getFenshu(shuju[1])[1];
        int fenmu = fenshu.getFenshu(shuju[1])[2];

        textView.setText("计算结果是：\n");

        if ( shuju[0] == jisuan11.WUJIE){
            wujie();
            return;
        }

        textView.setText(textView.getText().toString()+"x = "+shuju[1]+"\n");
        textView.setText(textView.getText().toString()+"分数表示： ");
        if (shuju[1]<0)     textView.setText(textView.getText().toString()+"-");
        textView.setText(textView.getText().toString()+ fenzi+"/"+fenmu +"\n");
    }

    private void chuli12(){
        int fenzi, fenmu;

        textView.setText("计算结果是：\n");

        if ( shuju[0] == jisuan12.WUJIE){
            wujie();
            return;
        }

        textView.setText(textView.getText().toString()+"x1 = "+shuju[1]+"\n");
        textView.setText(textView.getText().toString()+"分数表示： ");
        if (shuju[1]<0)     textView.setText(textView.getText().toString()+"-");
        fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
        textView.setText(textView.getText().toString()+ fenzi+"/"+fenmu +"\n");

        textView.setText(textView.getText().toString()+"x2 = "+shuju[2]+"\n");
        textView.setText(textView.getText().toString()+"分数表示： ");
        if (shuju[2]<0)     textView.setText(textView.getText().toString()+"-");
        fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
        textView.setText(textView.getText().toString()+ fenzi+"/"+fenmu +"\n");

    }

    private void wujie(){
        textView.setText(textView.getText().toString() + "无解\n");
    }

}
