package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentaryTest {

    private static final String TITLE = "Planet Earth";

    @Test
    public void DocumentaryConstructor() {
        //act
        Documentary documentary = new Documentary(TITLE, Rating.TEENS);

        //assert
        assertEquals(TITLE, documentary.getTitle());
        assertEquals(Rating.TEENS, documentary.getMaturityRating());
        assertEquals(Genre.DOCUMENTARY, documentary.getGenre());
    }
}
