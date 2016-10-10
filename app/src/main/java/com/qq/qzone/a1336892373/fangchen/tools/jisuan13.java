package com.qq.qzone.a1336892373.fangchen.tools;

import android.util.Log;

public class jisuan13 {

    public final static double WUJIE = 514200;
    private double x1 = WUJIE;
    private double x2 = WUJIE;
    private double x3 = WUJIE;

    public  double[] jisuan(double[] shuju){
        double a = shuju[1];
        double b = shuju[2];
        double c = shuju[3];
        double d = shuju[4];

        double[] answer = shuju.clone();

        findFS(a,b,c,d);

        answer[1] = x1;
        answer[2] = x2;
        answer[3] = x3;
        return answer;
        }

    private void findFS(double m, double n, double t, double s) {
        double a=n/m;
        double b=t/m;
        double c=s/m;
        double q=(a*a-3*b)/9;
        double r=(2*a*a*a-9*a*b+27*c)/54;
        if(r*r<q*q*q) {
            //三个解
            t=Math.acos(r/Math.sqrt(q*q*q));
            x1=-2*Math.sqrt(q)*Math.cos(t/3)-a/3;
            x2=-2*Math.sqrt(q)*Math.cos((t+2*Math.PI)/3)-a/3;
            x3=-2*Math.sqrt(q)*Math.cos((t-2*Math.PI)/3)-a/3;
        } else {
            //一个解
            int sgn=(r>=0)?1:-1;
            double u=-sgn*Math.pow((Math.abs(r)+Math.sqrt(r*r-q*q*q)),1./3);
            double v=(u!=0)?q/u:0;
            x1=u+v-a/3;
        }
    }

}
