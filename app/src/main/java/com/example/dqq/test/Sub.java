package com.example.dqq.test;

import android.util.Log;

/**
 * Created by dqq on 2018/3/19.
 */

public  class Sub extends Base {

    public void addSub(){
        i = -1;
        j = -2;
//        k = -3;
        add();

        Sub sub = new Sub();
        Base base = new Base();
    }

    public void addSub(int i){
        System.out.println(i);
    }

    private void add(int i){

    }

    public static void print(){
        Log.e("Sub:", "Sub");
    }

    public void write(){
        Base.print();
        Sub.print();
}
}
