package com.wudi.demo;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/19 10:21
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        s2.intern();
        System.out.println(s1 == s2); //false
        System.out.println(s1 == s2.intern()); //true
        System.out.println(s2 == s2.intern()); //false
    }
}
