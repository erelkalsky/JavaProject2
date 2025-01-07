public abstract class Residential extends Property {
    protected int parkingLots;

    public Residential(String address, double area, double price, int parkingLots) {
        super(address, area, price);
        setParkingLots(parkingLots);
    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        if(parkingLots < 0) {
            this.parkingLots = 0;
            return;
        }

        this.parkingLots = parkingLots;
    }

    @Override
    public String toString() {
        return "parking lots: " + parkingLots + "\n" +
                super.toString();
    }
}