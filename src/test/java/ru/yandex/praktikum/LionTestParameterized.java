package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

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
//
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }

    public LionTestParameterized(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Test
    public void doesHaveMane() throws Exception {
        MockitoAnnotations.initMocks(this);
        Lion lion = new Lion(feline, sex);
        assertEquals(result, lion.doesHaveMane());
    }
}