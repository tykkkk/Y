package com.example.dqq.test;

/**
 * Created by dqq on 2018/3/27.
 */

public class CarWrong {

    public void carwrong(int i) throws CarWrongException{
        if (i == 0){
            throw new CarWrongException("没有了");
        } else if (i == 1){
            throw new CarWrongException("没电了");
        }
    }
}
