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
        Log.i("测试区：x1,x2,x3", x1+" "+x2+" "+x3);
        return answer;
        }

    public void findFS(double a, double b, double c, double d) {
        double A = b*b-3*a*c;
        double B = b*c-9*a*d;
        double C = c*c-3*b*d;
        double deta = B*B-4*A*C;
        Log.i("deta: ", ""+deta);

        if(A==0&&B==0){
            //盛金公式1
            x1 = (-b)/(3*a);
        }

        if(deta>0){
            //盛金公式2
            double Y1 = A*b + 3*a*( (-B + Math.sqrt(deta))/2 );
            double Y2 = A*b + 3*a*( (-B - Math.sqrt(deta))/2 );
            x1 = ( -b - lifang(Y1) - lifang(Y2)) / (3*a);
        }

        if(deta==0 && A!=0){
            //盛金公式3
            double K = B/A;
            x1 = (-b)/a + K;
            x2 = (-K)/2;
            x3 = (-K)/2;
        }

        if(deta<0 && A>0){
            double T = ( 2*A*b - 3*a*B )/( 2*Math.sqrt(A*A*A) );
            double xita=  Math.acos(T);

            x1 = ( -b - 2*Math.sqrt(A)*Math.cos(xita/3) ) / ( 3*a );
            x2 = ( -b + Math.sqrt(A)*(Math.cos(xita/3)+Math.sqrt(3)*Math.sin(xita/3)) ) / (3*a);
            x3 = ( -b + Math.sqrt(A)*(Math.cos(xita/3)-Math.sqrt(3)*Math.sin(xita/3)) ) / (3*a);
        }

    }

    private double lifang(double n){
        //用于数字的开三次方，有效处理负数
        if (n>0){
            return Math.pow(n, 1.0/3.0);
        } else {
            return -Math.pow(-n, 1.0/3.0);

        }
    }

}
