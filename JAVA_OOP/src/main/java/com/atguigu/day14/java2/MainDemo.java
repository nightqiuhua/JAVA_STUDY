package com.atguigu.day14.java2;

public class MainDemo {
    public static void main(String[] args) {
        for(int i=0;i<args.length-1;i++){
            System.out.println("*****" + args[i]);

            int num = Integer.parseInt(args[i]);
            System.out.println("#####" + num);
        }
    }
}
