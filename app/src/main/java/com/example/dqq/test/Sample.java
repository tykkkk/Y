package com.example.dqq.test;

import android.util.Log;

/**
 * Created by dqq on 2018/3/20.
 */

public class Sample implements TTT{

    static int a = 5;
    static int b = 10;

    static {
        Log.e("aaaaaaa:", String.valueOf(++a));
//        System.out.println("第一次a--：" + a);
//        System.out.println("第一次a：" + a++);
//        System.out.println("第一次a++：" + a);
    }

    static {
        Log.e("bbbbbb:", String.valueOf(++a));
//        System.out.println("第二次a--：" + a);
//        System.out.println("第二次a：" + a++);
//        System.out.println("第二次a++：" + a);
    }

    public static void main( ){
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        Log.e("cccccccc:", String.valueOf(++b));
        System.out.println("最后一次a：" + a);
    }

    @Override
    public void go() {

    }

    @Override
    public void tr() {

    }

    @Override
    public void add() {

    }
}
