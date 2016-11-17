package GameNationBackEnd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lucas on 17/11/2016.
 */
public class GameTest {

    @Test
    public void NewGameCustomConstructor() {
        Game game = new Game("hey", "some description", "wuk.jpg");

        assertEquals("hey", game.getName());
        assertEquals("some description", game.getDescription());
        assertEquals("./img/wuk.jpg", game.GetImagePath());
    }
}