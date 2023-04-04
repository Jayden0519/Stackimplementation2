import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.

class StackExMethodsTest
{
    @Test
    public void testIsEmptyTrue()
    {
        System.out.println("isEmpty");
        assertTrue( instance.isEmpty() );
    }

    @Test
    public void testIsEmptyFalse()
    {
        System.out.println("isEmpty");
        instance.push( 1 );
        assertFalse(instance.isEmpty() );
    }

    @Test
    public void testPopEx()
    {
        System.out.println("pop");
        exeception.except( IndexOutOfBoundsException.class );
        Integer peek = instance.pop();
    }





}
