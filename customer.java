package com.example;

public class customer {
    int amount,accno;
    static String type="saving",bank="PNB";
    public static void main(String[] args) {
        customer c1 = new customer();
        customer c2 = new customer();
        c1.amount = 5000;
        c2.amount = 6000;
        c1.accno = 101;
        c2.accno = 102;
        System.out.println(bank);
        System.out.println(c1.amount);
        System.out.println(c1.accno);
        System.out.println(type);
        System.out.println(c2.amount);
        System.out.println(c2.accno);
        System.out.println(type);
    }

}
