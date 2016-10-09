package com.qq.qzone.a1336892373.fangchen.tools;

public class fenshu {

    public static int[] getFenshu(double n){

        if (n<0)    n=-n;

        int fenzi=0, fenmu=0, answer[]=new int[5];
        answer[1]=0;   answer[2]=0;
            int zi=0, mu=1, mubiao=(int)(n*10000);
            for(zi=0; zi<=100; zi++){
                for(mu=1; mu<=100; mu++){
                    if(Math.abs(mubiao-zi*10000/mu)<3)	{		answer[1]=zi;	answer[2]=mu;	  break; }
                }
                if(mu<=100) break;
            }

        return answer;
    }

}
