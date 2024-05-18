package ru.yandex.praktikum;

import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.sql.SQLOutput;
import java.util.List;

public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        Assert.assertTrue("Мяу".equals(cat.getSound()));
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> eatList = cat.getFood();
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        String textError = "Feline питается " + foodList.toString();
        Assert.assertEquals(textError, foodList, eatList);
    }
}
