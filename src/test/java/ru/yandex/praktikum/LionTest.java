package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    String sex;

    public LionTest() {
        this.sex = "Самец";
    }

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(feline, sex);
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        List<String> listFood = List.of(new String[]{"Животные", "Птицы", "Рыба"});
        Lion lion = new Lion(feline, sex);
        when(feline.getFood("Хищник")).thenReturn(listFood);
        assertEquals(listFood, lion.getFood());
    }
}