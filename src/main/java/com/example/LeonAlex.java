package com.example;

import java.util.List;

public class LeonAlex extends Lion {
    public LeonAlex(Feline feline) throws IndexOutOfBoundsException {
        super(feline, "Самец");
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
