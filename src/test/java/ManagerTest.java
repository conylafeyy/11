import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    private Manager manager = new Manager(5);
    private Film first = new Film(111, 1, "Cruel", "Horror");
    private Film second = new Film(222, 2, "Cruel 1", "Horror");
    private Film third = new Film(333, 3, "Cruel 2", "Horror");
    private Film fourth = new Film(444, 4, "Cruel 3", "Horror");
    private Film fifth = new Film(555, 5, "Cruel 4", "Horror");
    private Film sixth = new Film(666, 6, "Cruel 5", "Horror");

    @Test
    void shouldAddFilm() {
        manager.addFilm(first);
        manager.addFilm(second);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddOverMax() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);

        Film[] actual = manager.getAll();
        Film[] expected = new Film[]{sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }
}