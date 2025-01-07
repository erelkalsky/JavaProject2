import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static RealEstateManager realEstateManager = new RealEstateManager("Erel");
    static final String OPTIONS_STRING = "Enter option number: \n" +
            " 1 --> Property search\n" +
            " 2 --> Financial report\n" +
            " 3 --> Commercial real estate yield\n" +
            " 4 --> Properties by city\n" +
            " 5 --> Number of cities\n" +
            "-1 --> Exit program";

    public static void main(String[] args) throws PriceException {
        addProperties();

        final Scanner scanner = new Scanner(System.in);

        System.out.println(OPTIONS_STRING);
        int option = scanner.nextInt();

        while(option != -1) {

            switch (option) {
                case 1 -> propertiesList();
                case 2 -> financialReport();
                case 3 -> commercialYield();
                case 4 -> propertiesByCity();
                case 5 -> numberOfCities();
            }

            System.out.println("------------------------------\n");
            System.out.println(OPTIONS_STRING);
            option = scanner.nextInt();
        }
    }

    private static void addProperties() {
        for (Property property : DataManager.getProperties()) {
            realEstateManager.addProperty(property);
        }
    }

    private static void propertiesList() throws PriceException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter budget price: ");
        double price = scanner.nextDouble();

        if (price < 0) {
            throw new PriceException("Price cannot be negative.");
        }

        for (Property property : realEstateManager.propertiesByBudget(price)) {
            System.out.println(property + "\n");
        }
    }

    private static void financialReport() {
        for (Property property : realEstateManager.properties) {
            property.taxlt();
        }
    }

    private static void commercialYield() {
        double totalYield = 0.0;

        for (Property property : realEstateManager.properties) {
            if(property instanceof Commercial) {
                totalYield += ((Commercial) property).getYield();
            }
        }

        System.out.println("The total yield of commercial properties: " + totalYield);
    }

    private static void propertiesByCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name: ");
        String cityName = scanner.nextLine();
        cityName = formattedCityName(cityName);

        for (Property property : realEstateManager.properties) {
            String propertyCity = property.getAddress().split(", ")[0];
            if(cityName.equals(propertyCity)) {
                System.out.println(property);
            }
        }
    }

    private static String formattedCityName(String cityName) {
        String[] splits = cityName.toLowerCase().split("-| ");
        String formattedString = "";

        for (String split : splits) {
            formattedString += ((char)(split.charAt(0) - 32)) + split.substring(1) + " ";
        }

        return formattedString.trim();
    }

    private static void numberOfCities() {
        HashSet<String> cities = new HashSet<>();

        System.out.println("Different cities: ");

        for (Property property : realEstateManager.properties) {
            String propertyCity = property.getAddress().split(", ")[0];
            if(!cities.contains(propertyCity)) {
                cities.add(propertyCity);
                System.out.println(propertyCity);
            }
        }

        System.out.println("Total properties in different cities: " + cities.size());
    }

    static class PriceException extends Exception {
        public PriceException(String message) {
            super(message);
        }
    }
}