package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    String sex;

    public LionTest() {
        this.sex = "Самец";
    }

    @Test
    public void getKittens() {
        Lion lion = new Lion(new Feline(), sex);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        List<String> listFood = List.of(new String[]{"Животные", "Птицы", "Рыба"});
        Lion lion = new Lion(new Feline(), sex);
        assertEquals(listFood, lion.getFood());
    }
}
