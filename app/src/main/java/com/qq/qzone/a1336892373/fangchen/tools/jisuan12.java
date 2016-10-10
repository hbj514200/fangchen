package com.qq.qzone.a1336892373.fangchen.tools;

import android.util.Log;

public class jisuan12 {

    public final static double WUJIE = 514200;

    public static double[] jisuan(double[] shuju){
        double a = shuju[1];
        double b = shuju[2];
        double c = shuju[3];
        double[] answer = shuju.clone();

        if(b*b-4*a*c<0){    answer[0] = WUJIE;   return answer;   }
        else           {    answer[0] = 5.0;                     }

        answer[1] = (-b + Math.sqrt(b*b-4*a*c))/2/a;
        answer[2] = (-b - Math.sqrt(b*b-4*a*c))/2/a;

        return answer;
        }

}
