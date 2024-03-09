import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static ByteArrayOutputStream baos;
    static PrintStream ps;


    @BeforeAll
    static void preparing() {
        baos = new ByteArrayOutputStream();
        ps = new PrintStream(baos);
        System.setOut(ps);
    }

    @Test
    void testSout() {  //but its usually not important for backend
        System.out.print("test log");
        String res = baos.toString();
        Assertions.assertEquals("test log", res);
    }


}