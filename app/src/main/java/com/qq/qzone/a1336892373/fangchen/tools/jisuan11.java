package com.qq.qzone.a1336892373.fangchen.tools;

public class jisuan11 {

    public final static double WUJIE = 514200;

    public static double[] jisuan(double[] shuju){
            double a = shuju[1];
            double b = shuju[2];

            if (a==0) {   shuju[0] = WUJIE;   return shuju;   }
            else      {   shuju[0] = 5.0;                     }

            for (int i=0; i<=shuju.length-1; i++)   shuju[i] = 0;
            shuju[1] = -(b/a);
            return shuju;
        }

}
