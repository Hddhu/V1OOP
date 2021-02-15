package Practicum2B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    public void testEmptyName(){
        Voetbalclub empty = new Voetbalclub("");
        assertEquals("FC  0 0 0 0 0", empty.toString());
    }

    @Test
    public void testNullName(){
        Voetbalclub empty = new Voetbalclub(null);
        assertEquals("FC  0 0 0 0 0", empty.toString());
    }

    @Test
    public void testWinnen(){
        Voetbalclub club1 = new Voetbalclub("club1");
        club1.verwerkResultaat('w');
        assertEquals(3, club1.aantalPunten());
        assertEquals("club1  1 1 0 0 3", club1.toString());
    }

    @Test
    public void testGelijk(){
        Voetbalclub club1 = new Voetbalclub("club1");
        club1.verwerkResultaat('g');
        assertEquals(1, club1.aantalPunten());
        assertEquals("club1  1 0 1 0 1", club1.toString());
    }

    @Test
    public void testVerloren(){
        Voetbalclub club1 = new Voetbalclub("club1");
        club1.verwerkResultaat('v');
        assertEquals(0, club1.aantalPunten());
        assertEquals("club1  1 0 0 1 0", club1.toString());
    }

    @Test
    public void testVerkeerdeInvoer(){
        Voetbalclub club1 = new Voetbalclub("club1");
        club1.verwerkResultaat('w');
        assertEquals(3, club1.aantalPunten());
        assertEquals("club1  1 1 0 0 3", club1.toString());
        club1.verwerkResultaat('f');
        assertEquals(3, club1.aantalPunten());
        assertEquals("club1  1 1 0 0 3", club1.toString());
    }

    @Test
    public void testWinstGelijkVerloren(){
        Voetbalclub club1 = new Voetbalclub("club1");
        club1.verwerkResultaat('w');
        assertEquals(3, club1.aantalPunten());
        assertEquals("club1  1 1 0 0 3", club1.toString());
        club1.verwerkResultaat('g');
        assertEquals(4, club1.aantalPunten());
        assertEquals("club1  2 1 1 0 4", club1.toString());
        club1.verwerkResultaat('v');
        assertEquals(4, club1.aantalPunten());
        assertEquals("club1  3 1 1 1 4", club1.toString());
    }
}