public class Villa extends Residential {
    private int levels;

    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels < 1) {
            this.levels = 1;
            return;
        }

        this.levels = levels;
    }

    @Override
    public String toString() {
        return "Villa" + "\n" +
                "levels: " + levels + "\n" +
                super.toString();
    }

    @Override
    void taxlt() {
        System.out.println("Must pay tax of: " + (price * 0.08));
    }
}
