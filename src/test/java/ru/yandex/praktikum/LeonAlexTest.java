package ru.yandex.praktikum;

import com.example.Feline;
import com.example.LeonAlex;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LeonAlexTest {
    @Mock
    Feline feline;

    @Test
    public void getFriends() {
        List<String> listFriends = List.of("Марти", "Глория", "Мелман");
        LeonAlex leonAlex = new LeonAlex(feline);
        assertEquals(listFriends, leonAlex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() {
        LeonAlex leonAlex = new LeonAlex(feline);
        assertTrue("Нью-Йоркский зоопарк".equals(leonAlex.getPlaceOfLiving()));
    }

    @Test
    public void getKittens() {
        LeonAlex leonAlex = new LeonAlex(feline);
        assertEquals(0, leonAlex.getKittens());
    }
}
