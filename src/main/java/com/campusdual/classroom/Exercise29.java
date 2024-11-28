package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise29 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);

        try {
            System.out.println(lista.get(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
