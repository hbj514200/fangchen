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
    private String wujie;
    private String jisuanjieguo;
    private String x_shi;
    private String fenshubiaoshi;
    private String wuweiyijie;
    private String pinxin;
    private String shishujieguo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xianshi, container, false);
        textView = (TextView) view.findViewById(R.id.jiejue_text);
        string_init();

        return view;
    }

    private void string_init(){
        this.wujie = getResources().getString(R.string.wujie);
        this.jisuanjieguo = getResources().getString(R.string.jisuanjieguo);
        this.x_shi = getResources().getString(R.string.x_shi);
        this.fenshubiaoshi = getResources().getString(R.string.fenshu);
        this.wuweiyijie = getResources().getString(R.string.wuweiyijie);
        this.pinxin = getResources().getString(R.string.pinxin);
        this.shishujieguo = getResources().getString(R.string.shishujieguo);
    }

    private void wujie(){
        textView.append(wujie+"\n");
    }


    public void xianshi(int leixin, double[] shuju){
        textView.setVisibility(View.VISIBLE);
        textView.setText("");
        this.shuju = shuju;
        if (leixin == 1)    chuli11();
        if (leixin == 2)    chuli12();
        if (leixin == 3)    chuli13();
        if (leixin == 4)    chuli21();
        if (leixin == 5)    chuli31();
    }

    private void chuli11(){
        int fenzi = fenshu.getFenshu(shuju[1])[1];
        int fenmu = fenshu.getFenshu(shuju[1])[2];

        textView.setText(jisuanjieguo+"\n\n");

        if ( shuju[0] == jisuan11.WUJIE){
            wujie();
            return;
        }

        textView.append(x_shi+shuju[1]+"\n");
        textView.append(fenshubiaoshi);
        if (shuju[1]<0)     textView.append("-");
        textView.append(fenzi+"/"+fenmu +"\n");
    }

    private void chuli12(){
        int fenzi, fenmu;

        textView.setText(jisuanjieguo+"\n\n");

        if ( shuju[0] == jisuan12.WUJIE){
            wujie();
            return;
        }

        textView.append("x1 = "+shuju[1]+"\n");
        textView.append(fenshubiaoshi);
        if (shuju[1]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
        textView.append(fenzi+"/"+fenmu +"\n\n");

        textView.append("x2 = "+shuju[2]+"\n");
        textView.append(fenshubiaoshi);
        if (shuju[2]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
        textView.append(fenzi+"/"+fenmu +"\n");

    }

    private void chuli13(){
        int fenzi, fenmu;
        textView.setText(shishujieguo+"\n");

        if (shuju[1]!=jisuan13.WUJIE){
            textView.append("x1 = "+shuju[1]+"\n");
            textView.append(fenshubiaoshi);
            if (shuju[1]<0)     textView.append("-");
            fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
            textView.append(fenzi+"/"+fenmu +"\n\n");
        } else          textView.append("x1"+wujie+"\n\n");

        if (shuju[2]!=jisuan13.WUJIE){
            textView.append("x2 = "+shuju[2]+"\n");
            textView.append(fenshubiaoshi);
            if (shuju[2]<0)     textView.setText("-");
            fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
            textView.append(fenzi+"/"+fenmu +"\n\n");
        } else          textView.append("x2"+wujie+"\n\n");

        if (shuju[3]!=jisuan13.WUJIE){
            textView.append("x3 = "+shuju[3]+"\n");
            textView.append(fenshubiaoshi);
            if (shuju[3]<0)     textView.setText("-");
            fenzi = fenshu.getFenshu(shuju[3])[1];  fenmu = fenshu.getFenshu(shuju[3])[2];
            textView.append(fenzi+"/"+fenmu +"\n");
        } else          textView.append("x3"+wujie+"\n");

    }

    private void chuli21(){
        int fenzi, fenmu;

        textView.setText(jisuanjieguo+"\n\n");

        if ( shuju[0] == jisuan31.WUJIE){
            textView.append( pinxin+"\n\n");
            return;
        }

        textView.append("x = "+shuju[1]+"\n");
        textView.append(fenshubiaoshi);
        if (shuju[1]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
        textView.append( fenzi+"/"+fenmu +"\n\n");

        textView.append("y = "+shuju[2]+"\n");
        textView.append(fenshubiaoshi);
        if (shuju[2]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
        textView.append( fenzi+"/"+fenmu +"\n");
    }

    private void chuli31(){
        int fenzi, fenmu;

        textView.setText(jisuanjieguo+"\n\n");

        if ( shuju[0] == jisuan31.WUJIE){
            textView.append( wuweiyijie+"\n\n");
            return;
        }

        textView.append("x = "+shuju[1]+"\n");
        textView.append(fenshubiaoshi);
        if (shuju[1]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
        textView.append( fenzi+"/"+fenmu +"\n\n");

        textView.append("y = "+shuju[2]+"\n");
        textView.append(fenshubiaoshi);
        if (shuju[2]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
        textView.append( fenzi+"/"+fenmu +"\n\n");

        textView.append("z = "+shuju[3]+"\n");
        textView.append(fenshubiaoshi);
        if (shuju[3]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[3])[1];  fenmu = fenshu.getFenshu(shuju[3])[2];
        textView.append( fenzi+"/"+fenmu +"\n\n");
    }

}
