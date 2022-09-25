package com.openapi.dev.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ananat");
        arrayList.add("amlesh");
        arrayList.add("Sunny Leone");
        arrayList.add("fevicol");

        Collections.sort(arrayList);
        Iterator itr=arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    }



