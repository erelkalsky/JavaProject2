import java.util.ArrayList;

public class RealEstateManager {
    private String name;
    ArrayList<Property> properties;

    public RealEstateManager(String name) {
        setName(name);
        properties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            this.name = "Unknown";
            return;
        }

        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property) {
        if(property == null) {
            return;
        }

        if(properties.contains(property)) {
            System.out.println("This property already been added.");
            return;
        }

        properties.add(property);
    }

    public ArrayList<Property> propertiesByBudget(double price) {
        ArrayList<Property> budgetProperties = new ArrayList<>();

        for (Property property : properties) {
            if(property.getPrice() <= price) {
                budgetProperties.add(property);
            }
        }

        return budgetProperties;
    }

    public double totalPropertiesPrice() {
        return properties.stream().mapToDouble(Property::getPrice).sum();
    }
}
