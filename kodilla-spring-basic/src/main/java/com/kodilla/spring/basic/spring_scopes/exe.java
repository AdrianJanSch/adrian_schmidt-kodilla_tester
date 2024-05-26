package com.kodilla.spring.basic.spring_scopes;

public class exe {
    public static String s3 = null;
    public static String s4 = "c";
    public static String s5 = "o";
    public static String s6 = "s";
    public static void exe1 (){
        String s1 = "cos";
        String s2 = "cos";

        s3 = s4+s5+s6;


        if("cos".equals(s3)) {
            System.out.println("ok");
        }
    }

    public static void main(String[] args) {
        exe.exe1();
    }
}
