import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackExMethodsTest {

    @Test
    void testEmpty()
    {
            StackExTest videoGames = new StackExTest();
            videoGames.getNum();
            assertTrue(videoGames.getNum().matches("please try again"));

    }



    }
