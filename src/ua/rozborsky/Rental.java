package ua.rozborsky;

/**
 * Created by roman on 29.12.2016.
 */
class Rental {

    private int kind;
    private int days;
    private double basePrice;
// Other fields, constructors, get, set, etc. //

    public Rental(int kind, int days) {
        this.kind=kind;
        this.days=days;
    }


    public int getKind() {
        return kind;
    }


    public void setKind(int kind) {
        this.kind=kind;
    }


    public int getDays() {
        return days;
    }


    public void setDays(int days) {
        this.days=days;
    }


    public double getBasePrice() {
// Calculation of Price.

        return basePrice;
    }


    private double amountFor(int days, int basePrice, int kind) {
        double result;
// Another code.

        result = days * basePrice;

        if (kind == 1) {
            result = result * 1.5;
        } else if (kind == 2) {
            result = result * 2;
        } else if (kind == 3) {
            result = result * 2.5;
        }

        if (days  > 7){
            result = result * 3;
        }
// Other calculation.

        return result;
    }
// Other methods.
}