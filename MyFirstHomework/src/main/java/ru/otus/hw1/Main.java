package ru.otus.hw1;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");

        ArrayList<String> stringList = new ArrayList<String>();
        for (int i = 0; i < args.length; i++) {
            stringList.add(args[i]);
        }

        System.out.println(Joiner.on("|").join(stringList));

    }


}
