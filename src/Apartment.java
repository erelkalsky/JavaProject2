public class Apartment extends Residential {
    private int rooms;

    public Apartment(String address, double area, double price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(rooms < 1) {
            this.rooms = 1;
            return;
        }

        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Apartment" + "\n" +
                "rooms: " + rooms + "\n" +
                super.toString();
    }

    @Override
    void taxlt() {
        System.out.println("Must pay tax of: " + (price * 0.08));
    }
}
