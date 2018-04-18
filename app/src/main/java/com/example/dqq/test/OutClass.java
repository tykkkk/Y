package com.example.dqq.test;

/**
 * Created by dqq on 2018/3/28.
 */

public class OutClass extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i= 0; i<10; i++){
            System.out.println(currentThread().getName()+i);
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    //
//    OutClass(int a){
//        System.out.println("最外部类");
//    }
//
//    OutClass(){
//        System.out.println("空");
//    }
//
//    public void prt(){
//        OutClass outClass = new OutClass(){
//        };
//    }
}
