import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest  {

    @Test
    public void testSum() {

        Quickmaths m = new Quickmaths();
        assertEquals(10,m.sum(5,5));
    }

    @Test
    public void testGennemsnit() {
        Quickmaths m = new Quickmaths();
        assertEquals(5,m.gennemsnit(5,5));
    }

}