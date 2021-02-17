package practica.practicum2b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    void legeNaam() {
        Voetbalclub hoi = new Voetbalclub("");
        assertEquals("FC 0 0 0 0 0", hoi.toString());
    }

    @Test
    void nullNaam() {
        Voetbalclub hoi = new Voetbalclub(null);
        assertEquals("FC 0 0 0 0 0", hoi.toString());
    }

    @Test
    void fouteInput() {
        Voetbalclub hoi = new Voetbalclub("cooleclub");
        hoi.verwerkResultaat('w');
        hoi.verwerkResultaat('c');
        hoi.verwerkResultaat('c');
        hoi.verwerkResultaat('f');
        hoi.verwerkResultaat('v');

        assertEquals("cooleclub 2 1 0 1 3", hoi.toString());
    }

    @Test
    void testToString() {
        Voetbalclub hoi = new Voetbalclub("cooleclub");
        hoi.verwerkResultaat('w');
        hoi.verwerkResultaat('v');
        hoi.verwerkResultaat('g');
        assertEquals("cooleclub 3 1 1 1 4", hoi.toString());
    }

    @Test
    void testAlleenGelijk() {
        Voetbalclub hoi = new Voetbalclub("cooleclub");
        hoi.verwerkResultaat('g');
        hoi.verwerkResultaat('g');
        hoi.verwerkResultaat('g');
        assertEquals("cooleclub 3 0 3 0 3", hoi.toString());
    }

    @Test
    void testAlleenWins() {
        Voetbalclub hoi = new Voetbalclub("cooleclub");
        hoi.verwerkResultaat('w');
        hoi.verwerkResultaat('w');
        hoi.verwerkResultaat('w');
        assertEquals("cooleclub 3 3 0 0 9", hoi.toString());
    }

    @Test
    void testAlleenLosses() {
        Voetbalclub hoi = new Voetbalclub("cooleclub");
        hoi.verwerkResultaat('v');
        hoi.verwerkResultaat('v');
        hoi.verwerkResultaat('v');
        assertEquals("cooleclub 3 0 0 3 0", hoi.toString());
    }

    @Test
    void testAantalPuntenWin() {
        Voetbalclub hoi = new Voetbalclub("cooleclub");
        hoi.verwerkResultaat('w');
        assertEquals(3, hoi.aantalPunten());
    }

    @Test
    void testAantalPuntenGelijk() {
        Voetbalclub hoi = new Voetbalclub("cooleclub");
        hoi.verwerkResultaat('g');
        assertEquals(1, hoi.aantalPunten());
    }

    @Test
    void testAantalPuntenVerloren() {
        Voetbalclub hoi = new Voetbalclub("cooleclub");
        hoi.verwerkResultaat('b');
        assertEquals(0, hoi.aantalPunten());
    }
}
