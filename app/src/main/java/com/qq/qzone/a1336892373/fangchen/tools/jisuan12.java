package com.qq.qzone.a1336892373.fangchen.tools;

import android.util.Log;

public class jisuan12 {

    public final static double WUJIE = 514200;

    public static double[] jisuan(double[] shuju){
            double a = shuju[1];
            double b = shuju[2];
            double c = shuju[3];

        Log.i("jiejue", "a: "+a+"b: "+b+"c: "+c);

            if(b*b-4*a*c<0){    shuju[0] = WUJIE;   return shuju;   }
            else           {    shuju[0] = 5.0;                     }

            shuju[1] = (-b + Math.sqrt(b*b-4*a*c))/2/a;
            shuju[2] = (-b - Math.sqrt(b*b-4*a*c))/2/a;
            return shuju;
        }

}
