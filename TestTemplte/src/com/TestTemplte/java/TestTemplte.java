package com.TestTemplte.java;


import java.util.ArrayList;

public class TestTemplte {
    private static final int NUM = 1;
    public static final int zzz = 1;
    public static final int HHH = 2;
    public static final String GGG = "jjjs";
    public static final int VVV = 50;

    /**
     * name 客户名字
     */
    private int name;
    /**
     * 手机号码
     */
    private int phone;
    /**
     * email address
     */
    private int emil;

    
    
    public static void main(String[] args) {
        System.out.println("TestTemplte.main");
        test();
    }

    public static void test() {
        System.out.println("TestTemplte.test");
        int z = 0;
        int f = 10;
        System.out.println(f);
        System.out.println("f = " + f);
        System.out.println(z);


        ArrayList array = new ArrayList();
        array.add(123);
        array.add(456);
        array.add(567);
        for (Object o : array) {
            
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println("i = " + i);
        }
        for (int i = array.size() - 1; i >= 0; i--) {
            
        }

        if (array == null) {

        }
        if (array != null) {

        }
        if (array != null) {

        }
        if (array == null) {

        }


    }
    public void testUpdate(){

    }

}
