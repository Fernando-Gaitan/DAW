package Ch11;

public class Rational {
    private int numerator;
    private int denominator;
    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }
    public void negate() {
        this.numerator *= -1;
    }
    public void invert() {
        int num = this.numerator;
        this.numerator = this.denominator;
        this.denominator = num;
    }
    public Rational reduce() {
        int gcd = gcd(this.numerator,	this.denominator);
        return new Rational(this.numerator / gcd,	this.denominator / gcd);
    }
    private int	gcd(int m,int n) {
        if	(m	% n == 0) {
            return n;
        }
        else {
            return gcd(n,m	% n);
        }
    }
    public Rational add(Rational that) {
        Rational added = new Rational(this.numerator * that.denominator + that.numerator * this.denominator, this.denominator * that.denominator);
        added.reduce();
        return added;
    }
    public double toDouble() {
        return this.numerator * 1.0/this.denominator;
    }
    public static void main(String[] args) {
        Rational num = new Rational(1, 2);
        Rational num2 = new Rational(1, 3);
        System.out.println(num.add(num2));
    }
}
