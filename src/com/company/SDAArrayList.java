package com.company;

import java.util.ArrayList;

public class SDAArrayList {

    ArrayList<String> list = new ArrayList<>();

    public void add(String s){
        list.add(s);

    }

    public void remove(int index){
        list.remove(index);
    }

    public String get(int index){
        return list.get(index);
    }


}
