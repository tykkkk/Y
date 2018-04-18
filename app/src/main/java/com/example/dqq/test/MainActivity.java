package com.example.dqq.test;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Been.ABC = 2;
        System.out.println(Been.ABC);

        //检测读写权限
        PermisionUtils.verifyStoragePermissions(this);

//        Intent intent = new Intent( );
//        intent.setClass(MainActivity.this, Main3Activity.class);
//        startActivity(intent);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    Book book = new Book();
                    book.setBookId(100);
                    book.setBookName("新华词典");

                    User user = new User();
                    user.setMale(true);
                    user.setUserId(11);
                    user.setUserName("hhhh");
                    user.setBook(book);

                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cache.txt"));
                        objectOutputStream.writeObject(user);
                        objectOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    try {
                        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cache.txt"));
                        User newuser = (User) inputStream.readObject();
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

//        Book book = new Book();
//        book.setBookId(100);
//        book.setBookName("新华词典");
//
//        User user = new User();
//        user.setMale(true);
//        user.setUserId(11);
//        user.setUserName("hhhh");
//        user.setBook(book);
//
//        try {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cache.txt"));
//            objectOutputStream.writeObject(user);
//            objectOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cache.txt"));
//            User newuser = (User) inputStream.readObject();
//            inputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
