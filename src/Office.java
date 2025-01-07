public class Office extends Property {
    public Office(String address, double area, double price) {
        super(address, area, price);
    }

    @Override
    public String toString() {
        return "Office: " + "\n" +
                super.toString();
    }

    @Override
    void taxlt() {
        System.out.println("Must pay tax of: " + (price * 0.05));
    }
}
