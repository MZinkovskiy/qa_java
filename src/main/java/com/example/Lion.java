package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Feline feline;

    public Lion(Feline feline, String sex) throws IndexOutOfBoundsException {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new IndexOutOfBoundsException("Используйте допустимые значения пола животного - самей или самка");
        }
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
