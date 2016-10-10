package com.qq.qzone.a1336892373.fangchen.tools;

public class jisuan21 {

    public final static double WUJIE = 514200;

    public static double[] jisuan(double[] shuju){
        double a = shuju[1];
        double b = shuju[2];
        double c = shuju[3];
        double d = shuju[4];
        double e = shuju[5];
        double f = shuju[6];
        double answer[] = shuju.clone();

        if(a/b==d/e)   {    shuju[0] = WUJIE;   return shuju;   }
        else           {    shuju[0] = 5.0;                     }

        answer[1] =(c*e-b*f)/(a*e-b*d);
        answer[2] =(a*f-c*d)/(a*e-b*d);

        return answer;
        }

}
