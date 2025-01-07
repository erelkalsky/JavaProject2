public class Plot extends Property {
    public enum TYPE {
        URBAN,
        AGRICULTURAL,
        INDUSTRIAL
    }

    private TYPE type;

    public Plot(String address, double area, double price, TYPE type) {
        super(address, area, price);
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plot:" + "\n" +
                "type: " + type.toString().toLowerCase();
    }

    @Override
    void taxlt() {
        switch (type) {
            case URBAN:
                System.out.println("Must pay tax of: " + (price * 0.10));
                break;
            case AGRICULTURAL:
                System.out.println("Must pay tax of: " + (price * 0.05));
                break;
            case INDUSTRIAL:
                System.out.println("Must pay tax of: " + (price * 0.02));
                break;
            default:
                System.out.println("Error --> plot type undefined.");
        }
    }
}