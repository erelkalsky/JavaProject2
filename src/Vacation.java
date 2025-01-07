public class Vacation extends Residential {
    private int guests;

    public Vacation(String address, double area, double price, int parkingLots, int guests) {
        super(address, area, price, parkingLots);
        setGuests(guests);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if(guests < 1) {
            this.guests = 1;
            return;
        }

        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Vacation" + "\n" +
                "guests: " + guests + "\n" +
                super.toString();
    }

    @Override
    void taxlt() {
        System.out.println("Must pay tax of: " + (price * 0.25));
    }
}