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

    private void wujie(){
        textView.append("无解\n");
    }


    public void xianshi(int leixin, double[] shuju){
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

        textView.setText("计算结果是：\n");

        if ( shuju[0] == jisuan11.WUJIE){
            wujie();
            return;
        }

        textView.append("x = "+shuju[1]+"\n");
        textView.append("分数表示： ");
        if (shuju[1]<0)     textView.append("-");
        textView.append(fenzi+"/"+fenmu +"\n");
    }

    private void chuli12(){
        int fenzi, fenmu;

        textView.setText("计算结果是：\n");

        if ( shuju[0] == jisuan12.WUJIE){
            wujie();
            return;
        }

        textView.append("x1 = "+shuju[1]+"\n");
        textView.append("分数表示： ");
        if (shuju[1]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
        textView.append(fenzi+"/"+fenmu +"\n");

        textView.append("x2 = "+shuju[2]+"\n");
        textView.append("分数表示： ");
        if (shuju[2]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
        textView.append(fenzi+"/"+fenmu +"\n");

    }

    private void chuli13(){
        int fenzi, fenmu;
        textView.setText("所有实数结果是：\n");

        if (shuju[1]!=jisuan13.WUJIE){
            textView.append("x1 = "+shuju[1]+"\n");
            textView.append("分数表示： ");
            if (shuju[1]<0)     textView.append("-");
            fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
            textView.append(fenzi+"/"+fenmu +"\n");
        } else          textView.append("x1无解\n");

        if (shuju[2]!=jisuan13.WUJIE){
            textView.append("x2 = "+shuju[2]+"\n");
            textView.append("分数表示： ");
            if (shuju[2]<0)     textView.setText("-");
            fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
            textView.append(fenzi+"/"+fenmu +"\n");
        } else          textView.append("x2无解\n");

        if (shuju[3]!=jisuan13.WUJIE){
            textView.append("x3 = "+shuju[3]+"\n");
            textView.append("分数表示： ");
            if (shuju[3]<0)     textView.setText("-");
            fenzi = fenshu.getFenshu(shuju[3])[1];  fenmu = fenshu.getFenshu(shuju[3])[2];
            textView.append(fenzi+"/"+fenmu +"\n");
        } else          textView.append("x3无解\n");

    }

    private void chuli21(){
        int fenzi, fenmu;

        textView.setText("计算结果是：\n");

        if ( shuju[0] == jisuan12.WUJIE){
            textView.append("两条直线\n平行 或 相等\n");
            return;
        }

        textView.append("x = "+shuju[1]+"\n");
        textView.append("分数表示： ");
        if (shuju[1]<0)     textView.setText("-");
        fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
        textView.append(textView.getText().toString()+ fenzi+"/"+fenmu +"\n");

        textView.append(textView.getText().toString()+"y = "+shuju[2]+"\n");
        textView.setText("分数表示： ");
        if (shuju[2]<0)     textView.setText("-");
        fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
        textView.append(fenzi+"/"+fenmu +"\n");
    }

    private void chuli31(){
        int fenzi, fenmu;

        textView.setText("计算结果是：\n");

        if ( shuju[0] == jisuan31.WUJIE){
            textView.append( "方程组没有唯一解\n");
            return;
        }

        textView.append("x = "+shuju[1]+"\n");
        textView.append("分数表示： ");
        if (shuju[1]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[1])[1];  fenmu = fenshu.getFenshu(shuju[1])[2];
        textView.append( fenzi+"/"+fenmu +"\n");

        textView.append("y = "+shuju[2]+"\n");
        textView.append("分数表示： ");
        if (shuju[2]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[2])[1];  fenmu = fenshu.getFenshu(shuju[2])[2];
        textView.append( fenzi+"/"+fenmu +"\n");

        textView.append("z = "+shuju[3]+"\n");
        textView.append("分数表示： ");
        if (shuju[3]<0)     textView.append("-");
        fenzi = fenshu.getFenshu(shuju[3])[1];  fenmu = fenshu.getFenshu(shuju[3])[2];
        textView.append( fenzi+"/"+fenmu +"\n");
    }

}
