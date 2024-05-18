package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionExceptionTest {
    private static final String EXCEPTION_MESSAGE = "Используйте допустимые значения пола животного - самей или самка";
    String sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {null},
                {"Не самец и не самка"},
        };
    }

    public LionExceptionTest(String sex) {
        this.sex = sex;
    }

    @Test
    public void doesHaveMane() {
        IndexOutOfBoundsException indexOutOfBoundsException =
                Assert.assertThrows(IndexOutOfBoundsException.class, () -> {
                    new Lion(new Feline(), sex);
                });
        Assert.assertEquals(EXCEPTION_MESSAGE, indexOutOfBoundsException.getMessage());
    }
}
