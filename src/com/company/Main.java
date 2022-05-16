package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SDAArrayList newArrayList = new SDAArrayList();

        newArrayList.add("Test String");
        newArrayList.add("Second test string");

        for (String s: newArrayList.list){
            System.out.println(s);
        }

        System.out.println(newArrayList.get(0));


        }
}
