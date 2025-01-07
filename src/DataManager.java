import java.util.ArrayList;

public class DataManager {
    public static ArrayList<Property> getProperties() {
        ArrayList<Property> properties = new ArrayList<>();

        properties.add(new Plot("Kfar Saba, Weitzman 18", 300, 30_000, Plot.TYPE.URBAN));
        properties.add(new Plot("Ramat Gan, Bialik 23", 250, 44_000, Plot.TYPE.INDUSTRIAL));

        properties.add(new Apartment("Jerusalem, Emtia 2", 100, 3_500_000, 2, 4));
        properties.add(new Apartment("Kiryat Gat, Shadrot ha'atzmaot 152", 50, 1_200_000, 2, 4));

        properties.add(new Villa("Herzliya, Ramat yam 67", 1_200, 10_000_000, 4, 5));
        properties.add(new Villa("Caesarea, Dolev 95", 500, 5_000_000, 4, 5));

        properties.add(new Vacation("Eilat, Sunset 45", 80, 2_500_000, 2, 6));
        properties.add(new Vacation("Tiberias, Ginosar 33", 70, 2_000_000, 1, 4));

        properties.add(new Commercial("Tel Aviv, Azrieli 1", 400, 20_000_000, 7.5));
        properties.add(new Commercial("Haifa, Carmel 12", 350, 15_000_000, true, 6.8));

        properties.add(new Office("Raanana, Ha'park 5", 120, 3_000_000));
        properties.add(new Office("Netanya, Industrial Zone 17", 200, 5_000_000));

        return properties;
    }
}