package com.qq.qzone.a1336892373.fangchen.tools;

public class jisuan11 {

    public final static double WUJIE = 514200;

    public static double[] jisuan(double[] shuju){
            double a = shuju[1];
            double b = shuju[2];
            double answer[] = shuju.clone();

            if (a==0) {   answer[0] = WUJIE;   return answer;   }
            else      {   answer[0] = 5.0;                     }

            for (int i=0; i<=answer.length-1; i++)   answer[i] = 0;
            answer[1] = -(b/a);
            return answer;
        }

}
