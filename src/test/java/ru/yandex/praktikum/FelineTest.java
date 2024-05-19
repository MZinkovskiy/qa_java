package ru.yandex.praktikum;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> eatMeat = feline.eatMeat();
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        String textError = "Feline питается " + foodList.toString();
        Assert.assertEquals(textError, foodList, eatMeat);
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        Assert.assertTrue("Кошачьи".equals(feline.getFamily()));
    }
}