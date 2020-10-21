package week3.exercisec;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator,int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getDenominator() {
        return denominator;
    }
    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public Fraction copy(){
        Fraction copy = new Fraction(this.getNumerator(),this.getDenominator());

        return copy;
    }

    public Fraction add(Fraction fraction){
        Fraction addedFractions = new Fraction();

        if(this.getDenominator()!=fraction.getDenominator()){
            addedFractions.setDenominator(fraction.getDenominator()*this.getDenominator());
            addedFractions.setNumerator(this.getDenominator()*fraction.getNumerator() +
                    this.getNumerator()*fraction.getDenominator());
        }
        else {
            addedFractions.setNumerator(fraction.getNumerator()+this.getNumerator());
            addedFractions.setDenominator(fraction.getDenominator());
        }
        return addedFractions;
    }

    public boolean equals(Fraction fraction){
        if(this.getNumerator() == fraction.getNumerator() &&
                this.getDenominator() == fraction.getDenominator())
            return true;
        else
            return false;
    }

    public Fraction subtract(Fraction fraction){
        Fraction subtracted = new Fraction();

        if(this.getDenominator() == fraction.getDenominator()){
            subtracted.setDenominator(fraction.getDenominator());
            subtracted.setNumerator(this.getNumerator() - fraction.getNumerator());
        }
        else{
            subtracted.setDenominator(this.getDenominator() * fraction.getDenominator());
            subtracted.setNumerator(this.getNumerator()*fraction.getDenominator()-
                    fraction.getNumerator()*this.getDenominator());
        }

        return subtracted;
    }

    public Fraction multiply(Fraction fraction){
        Fraction multiplied = new Fraction(this.getNumerator()* fraction.getNumerator(),
                this.getDenominator()* fraction.getDenominator());

        return multiplied;
    }

    public Fraction divide(Fraction fraction){
        Fraction divided = new Fraction(this.getNumerator() * fraction.getDenominator(),
                this.getDenominator() * fraction.getNumerator());

        return divided;
    }

    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }
}
