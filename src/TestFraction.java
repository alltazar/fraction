import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFraction{

    @Test
    public void check1(){
        Fraction f = Fraction.div(4,5);

        assertEquals(4,f.getNum_());

        assertEquals(8,Fraction.sub(f,2).getNum_());

        assertEquals(20,Fraction.div(f,4).getDen_());

        assertEquals(10,Fraction.div(f,2).getDen_());

        assertEquals(8,Fraction.sub(2,f).getNum_());

        assertEquals(-4,Fraction.sub(f,-1).getNum_());

        assertEquals(-15,Fraction.div(-3,f).getNum_());

        assertEquals(4,Fraction.div(-3,f).getDen_());

        assertEquals(20,Fraction.div(f,f).getNum_());

        assertEquals(20,Fraction.div(f,f).getDen_());

    }

    @Test(expected = NullPointerException.class)
    public void check2(){
        Fraction f = Fraction.div(4,null);

        assertEquals(4,f.getNum_());
    }

    @Test(expected = NullPointerException.class)
    public void check3(){
        Fraction f = null;

        assertEquals(4,Fraction.div(-3,f).getNum_());
    }
}