public class Main {
    public static void main(String[] args){

    }
}

class Fraction{
    private int num_;
    private int den_;

    Fraction(int num, int den){
        num_ = num;
        den_ = den;
    }

    public int getNum_() {
        return num_;
    }

    public int getDen_() {
        return den_;
    }

    static Fraction mul(Fraction f, int a){
        return new Fraction(f.num_*a, f.den_);
    }

    static Fraction div(Fraction f, int a){
        if (a == 0){
            throw new ArithmeticException();
        }
        return new Fraction(f.num_,f.den_*a);
    }

    static Fraction mul(int a, Fraction f){
        return new Fraction(f.num_*a, f.den_);
    }

    static Fraction div(int a, Fraction f){
        return new Fraction(f.den_*a, f.num_);
    }

    static Fraction div(int a, int b){
        if (b == 0){
            throw new ArithmeticException();
        }
        return new Fraction(a,b);
    }

    static Fraction div(Fraction f1, Fraction f2){
        if (f1.den_ == 0 || f2.num_ == 0){
            throw new ArithmeticException();
        }
        return new Fraction(f2.den_*f1.num_, f2.num_*f1.den_);
    }

    static Fraction sub(int a, Fraction f){
        return new Fraction(f.den_*a - f.num_*a, f.den_*a);
    }

    static Fraction sub(Fraction f1, Fraction f2){
        return new Fraction(f2.den_*f1.num_ - f2.num_*f1.den_, f2.den_*f1.den_);
    }

    static Fraction add(int a, Fraction f){
        return new Fraction(f.den_*a + f.num_*a, f.den_*a);
    }

    static Fraction add(Fraction f1, Fraction f2){
        return new Fraction(f2.den_*f1.num_ + f2.num_*f1.den_, f2.den_*f1.den_);
    }
}