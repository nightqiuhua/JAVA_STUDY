package com.atguigu.base.day04;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReadWriteLock {
    public static void main(String[] args) {
        final ReadWriteLockDemo rw = new ReadWriteLockDemo();
        new Thread(new Runnable() {
            public void run() {
                rw.set((int)(Math.random() * 101));
            }
        },"Write:").start();

        for(int i=0; i<100;i++){
            new Thread(new Runnable() {
                public void run() {
                    rw.get();
                }
            }).start();
        }




    }

}

class ReadWriteLockDemo{
    private int number = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void get(){
        lock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() + " : " + number);
        }finally {
            lock.readLock().unlock();
        }
    }

    public void set(int number){
        lock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName());
            this.number = number;
        }finally {
            lock.writeLock().unlock();
        }
    }

}