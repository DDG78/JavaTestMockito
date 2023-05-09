import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testFindAndAddFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");

        String[] expected = {"Film1, Film2, Film3"};
        String[] actual = manager.findAll();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindLastAndAddFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");
        manager.addFilm("Film11");


        String[] expected = {"Film2, Film3, Film4, Film5, Film6, Film7, Film8, Film9, Film10, Film11"};
        String[] actual = manager.findLast();

        Assertions.assertEquals(expected, actual);
    }


}