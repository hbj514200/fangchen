package com.qq.qzone.a1336892373.fangchen.tools;

import android.util.Log;

public class jisuan31 {

    public final static double WUJIE = 514200;

    public static double[] jisuan(double[] shuju){
        double a11 = shuju[1];
        double a12 = shuju[2];
        double a13 = shuju[3];
        double b1 = shuju[4];
        double a21 = shuju[5];
        double a22 = shuju[6];
        double a23 = shuju[7];
        double b2 = shuju[8];
        double a31 = shuju[9];
        double a32 = shuju[10];
        double a33 = shuju[11];
        double b3 = shuju[12];

        double answer[] = shuju.clone();
        double d = a11*a22*a33+a12*a23*a31+a13*a21*a32-a11*a23*a32-a12*a21*a33-a13*a22*a31;

        if (d==0) { answer[0] = WUJIE;  return answer;  }
        else        answer[0] = 5.0;

        answer[1] = (b1*a22*a33+a12*a23*b3+a13*b2*a32-b1*a23*a32-a12*b2*a33-a13*a22*b3)/d;
        answer[2] = (a11*b2*a33+b1*a23*a31+a13*a21*b3-a11*a23*b3-b1*a21*a33-a13*b2*a31)/d;
        answer[3] = (a11*a22*b3+a12*b2*a31+b1*a21*a32-a11*b2*a32-a12*a21*b3-b1*a22*a31)/d;

        return answer;
        }

}
