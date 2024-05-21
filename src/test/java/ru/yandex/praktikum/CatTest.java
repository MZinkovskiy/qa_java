package ru.yandex.praktikum;

import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.SQLOutput;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        Assert.assertTrue("Мяу".equals(cat.getSound()));
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        String textError = "Feline питается " + foodList.toString();
        when(feline.eatMeat()).thenReturn(foodList);
        List<String> eatList = cat.getFood();
        Assert.assertEquals(textError, foodList, eatList);
    }
}

