package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.copy(Cell.A1).position(), is(Cell.A1));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}