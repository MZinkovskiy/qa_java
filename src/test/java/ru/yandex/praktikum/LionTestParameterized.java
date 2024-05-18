package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestParameterized {
    String sex;
    boolean result;

    @Mock
    private Feline feline;

    @Parameterized.Parameters
    public static Object[][] sexData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    public LionTestParameterized(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Test
    public void doesHaveMane() {
        Lion lion = new Lion(feline, sex);
        assertEquals(result, lion.doesHaveMane());
    }
}
