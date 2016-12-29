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
//    Клас Customer містить в собі дані про клієнта, а метод amountFor() вираховує ціну оренди, в залежності від кількості днів, базової ціни та виду оренди.
//    Таким чином, метод amountFor(), знаходячись в класі Customer порушуе принцип Single Responsibility Principle (Принцип єдиної відповідальності).
//    Тому метод amountFor() необхідно перенести з класу Customer в клас Rental, який містить дані про кількість днів, на які було орендовано помешкання, базову ціну та вид оренди.
//    Самі назви класів Rental (оренда) та Customer (клієнт) вказують на те що більш логічним буде зберігати та отримувати ціну оренди в класі Rental.
//    Як покращення якості коду замість використання в методі amountFor() конструкції this.days, this.basePrise та this.kind значення краще передати через параметри методу.
//    Це зробить зручнішим тестування методу.
//    Також, замість використання типу double для розрахунку та зберігання ціни, доцільніше використати BigDecimal, що дозволить уникнути втрати точності.
