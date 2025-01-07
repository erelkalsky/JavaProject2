public class Commercial extends Property {
    private boolean storeroom = false;
    private double yield;

    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
    }

    public Commercial(String address, double area, double price, boolean storeroom, double yield) {
        super(address, area, price);
        this.storeroom = storeroom;
        setYield(yield);
    }

    public boolean isStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if(yield < 0.0) {
            this.yield = 0.0;
            return;
        }

        this.yield = yield;
    }

    @Override
    public String toString() {
        return "Commercial" + "\n" +
                "storeroom: " + storeroom + "\n" +
                "yield: " + yield + "\n" +
                super.toString();
    }

    public void expectedYield() {
        System.out.println("Expected yield: " + (price * (yield / 100) / 12));
    }

    @Override
    void taxlt() {
        System.out.println("Must pay tax of: " + (price * 0.05));
    }
}
