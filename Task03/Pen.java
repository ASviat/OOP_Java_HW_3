package Task03;

/**
 * Pen
 */
public class Pen {

    String madeBy;
    int length;
    int price;

    public Pen(String madeBy, int length, int price) {
        this.madeBy = madeBy;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
       
        return String.format("\nПроизводитель: %s\nДлина: %d\nСтоимость: %d рублей\n",madeBy,length,price);
    }

}