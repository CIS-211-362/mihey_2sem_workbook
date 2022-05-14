import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    @Test
    public void add () {
        Calc c = new Calc();
        Integer res = c.compile("[[3]]+2+1".toCharArray());
        assertEquals(15, res);
        res = c.compile("3+[2]+1".toCharArray());
        assertEquals(8, res);
        res = c.compile("3+2+[1]".toCharArray());
        assertEquals(7, res);
    }

    @Test
    public void substract () {
        Calc c = new Calc();
        Integer res = c.compile("[[3]+[1+2]]".toCharArray());
        assertEquals(24, res);
        res = c.compile("3-[2]-1".toCharArray());
        assertEquals(-2, res);
        res = c.compile("3-2-[1]".toCharArray());
        assertEquals(-1, res);
    }

    @Test
    public void mul () {
        Calc c = new Calc();
        Integer res = c.compile("[3]*2*1".toCharArray());
        assertEquals(12, res);
        res = c.compile("3*[2]*1".toCharArray());
        assertEquals(12, res);
        res = c.compile("3*2*[1]".toCharArray());
        assertEquals(12, res);
    }

    @Test
    public void div () {
        Calc c = new Calc();
        Integer res = c.compile("[3]/2/1".toCharArray());
        assertEquals(3, res);
        res = c.compile("4/[2]/1".toCharArray());
        assertEquals(1, res);
        res = c.compile("4/2/[1]".toCharArray());
        assertEquals(1, res);
    }

    @Test
    public void test1 () {
        Calc c = new Calc();
        Integer res = c.compile("[2]".toCharArray());
        assertEquals(4, res);
        res = c.compile("[3]".toCharArray());
        assertEquals(6, res);
        res = c.compile("[7]".toCharArray());
        assertEquals(14, res);
    }

    @Test
    public void test2 () {
        Calc c = new Calc();
        Integer res = c.compile("8*(10-[5])".toCharArray());
        assertEquals(0, res);
        res = c.compile("([3+2])*2-10".toCharArray());
        assertEquals(10, res);
        res = c.compile("(([3-1])*2)-10".toCharArray());
        assertEquals(-2, res);
    }
}
