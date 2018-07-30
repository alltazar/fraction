import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFraction{

    @Test
    public void check1(){
        Fraction f = Fraction.div(4,5);

        assertEquals(4,f.getNum_());

        assertEquals(8,Fraction.mul(f,2).getNum_());

        assertEquals(20,Fraction.div(f,4).getDen_());

        assertEquals(10,Fraction.div(f,2).getDen_());

        assertEquals(8,Fraction.mul(2,f).getNum_());

        assertEquals(-4,Fraction.mul(f,-1).getNum_());

        assertEquals(-15,Fraction.div(-3,f).getNum_());

        assertEquals(4,Fraction.div(-3,f).getDen_());

        assertEquals(20,Fraction.div(f,f).getNum_());

        assertEquals(20,Fraction.div(f,f).getDen_());

        assertEquals(0,Fraction.sub(f,f).getNum_());

        assertEquals(25,Fraction.sub(f,f).getDen_());

        assertEquals(3,Fraction.sub(3,f).getNum_());

        assertEquals(15,Fraction.sub(3,f).getDen_());

        assertEquals(27,Fraction.add(3,f).getNum_());

        assertEquals(15,Fraction.add(3,f).getDen_());

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

    @Test(expected = ArithmeticException.class)
    public void check4(){
        Fraction f = Fraction.div(4,5);

        Fraction.div(f,0).getDen_();
    }

    @Test(expected = ArithmeticException.class)
    public void check5(){
        Fraction.div(4,0);
    }

    @Test(expected = ArithmeticException.class)
    public void check6(){
        Fraction f = Fraction.div(4,0);
        Fraction f2 = Fraction.div(0,9);

        Fraction.div(f,f2).getDen_();
    }
}