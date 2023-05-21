import static org.junit.Assert.*;

import org.junit.Test;

import org.example.EmbaralhadorA;
import org.example.EmbaralhadorB;

public class TestShuffle {

    @Test
    public void testEmbaralhadorA() {

        EmbaralhadorA aux = new EmbaralhadorA();
        String auxb = "testShuffle";
        assertNotEquals(aux.embaralhar(auxb), auxb);
    }
    @Test
    public void testEmbaralhadorB() {

        EmbaralhadorB e = new EmbaralhadorB();
        String s = "shuffle";
        assertEquals(e.embaralhar(s), "elffuhs");
    }
}