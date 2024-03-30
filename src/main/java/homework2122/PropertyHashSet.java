package homework2122;

import java.util.HashSet;

public class PropertyHashSet {

    public PropertyHashSet() {
    }

    public static void main(String[] args) {
        Property propertyOne = new Property("Berlin,Karlsbader Straße ", "Сommercial");
        Property propertyTwo = new Property("Augsburg, Königsplatz", "Сommercial");
        Property propertyThree = new Property("Berlin,Grünwald", "House");
        Property propertyFour = new Property("Augsburg,Innsbrucker Straße", "House");
        Property propertyFive = new Property("Berlin, Britz", "Apartament");
        Property propertySix = new Property("Augsburg, Anne-Frank-Straße", "Apartament");
        Property propertySeven = new Property("Augsburg, Anne-Frank-Straße", "Apartament");

        HashSet<Property> propertys = new HashSet<>();
        propertys.add(propertyOne);
        propertys.add(propertyTwo);
        propertys.add(propertyThree);
        propertys.add(propertyFour);
        propertys.add(propertyFive);
        propertys.add(propertySix);
        propertys.add(propertySeven);

        Property propertyСommercial = new Property("Berlin,Karlsbader Straße ", "Сommercial");
        Property propertyApartament = new Property("Augsburg, Berliner Allee", "Apartament");
        Property propertyHouse = new Property("Augsburg,Hochvogelstraße", "House");

        HashSet<Property> propertysNew = new HashSet<>();
        propertysNew.add(propertyСommercial);
        propertysNew.add(propertyApartament);
        propertysNew.add(propertyHouse);

        Property.printPropertys(propertys);
        Property.printPropertys(propertysNew);
        Property.filterByType(propertys, "Сommercial");
        Property.compareSets(propertys, propertysNew);
        Property.compareSetsN(propertys, propertysNew);
    }
}
