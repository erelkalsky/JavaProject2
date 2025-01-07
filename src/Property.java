public abstract class Property {
    protected String address;
    protected double area;
    protected double price;

    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address == null || address.isEmpty()) {
            this.address = "Na, na";
            return;
        }

        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area < 0) {
            this.area = 0;
            return;
        }

        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0) {
            this.price = 0;
            return;
        }

        this.price = price;
    }

    @Override
    public String toString() {
        return "Address: " + address + "\n" +
                "Area: " + area + "\n" +
                "Price: " + price;
    }

    abstract void taxlt();
}