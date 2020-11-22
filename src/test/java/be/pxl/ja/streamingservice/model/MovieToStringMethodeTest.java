package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieToStringMethodeTest {

    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.TEENS);
    }

    @Test
    public void toStringMethodWithReleaseDate() {

        movie.setReleaseDate(LocalDate.of(1983, 10, 22));
        LocalDate jaar = movie.getReleaseDate();

        String toStringMethodeTest = movie.getTitle() + " (" + jaar.getYear() + ")";
        assertEquals(toStringMethodeTest, movie.toString());
    }

    @Test
    public void toStringMethodWithoutReleaseDate() {

        assertEquals("Titanic", movie.toString());
    }
}
