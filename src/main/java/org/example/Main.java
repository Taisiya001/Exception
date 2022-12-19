package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getResult(Arrays.asList(1, null, 5, 6, 7, 8)).toString());
    }
    List<Integer> getResult(List<Integer> list1){
        try {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                if(list1.get(i) == null) {
                    result.add(i);
                    throw new IllegalStateException("Значение null индекс " + result);}
            }
            return result;
        }catch (IllegalStateException e){
            System.out.println("Значение null");
        }
        finally {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                if(list1.get(i) == null) {
                    result.add(i);
                }
            }
            return result;
        }
        }

    }
