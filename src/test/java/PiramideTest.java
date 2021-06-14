import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PiramideTest {

    @Test
    void piramide5Sterren() throws Exception {
        Piramide piramide = new Piramide(5, '*');
        String actual = piramide.toString();
        String expected =
                  "    *\n"
                + "   ***\n"
                + "  *****\n"
                + " *******\n"
                + "*********\n";
        assertEquals(expected, actual);
    }

    @Test
    void piramideGespiegeld() throws Exception {
        Piramide piramide = new Piramide(7, '^');
        String actual = Spiegel.verticaal(piramide.toString());
        String expected =
                  "^^^^^^^^^^^^^\n"
                + " ^^^^^^^^^^^\n"
                + "  ^^^^^^^^^\n"
                + "   ^^^^^^^\n"
                + "    ^^^^^\n"
                + "     ^^^\n"
                + "      ^\n";
        assertEquals(expected, actual);
    }
}