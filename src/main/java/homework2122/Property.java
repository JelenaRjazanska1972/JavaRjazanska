package homework2122;

import java.util.HashSet;
import java.util.Objects;

public class Property {
    public String address;
    public String type;
    public Property(String address, String type) {
        this.address = address;
        this.type = type;
    }
    public String getAddress() {
        return address;
    }
    public String getType() {
        return type;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(address, property.address) && Objects.equals(type, property.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, type);
    }
    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public static void printPropertys(HashSet<Property> Propertys) {
        //есть ли элемент в листе
        if (Propertys.isEmpty()) {
            System.out.println("No");
        }
     for (Property property :Propertys){
        System.out.println(property.address + " " + property.getType());
}}
public static void filterByType (HashSet<Property> Propertys, String typePropertys){
    if (typePropertys.isEmpty()) {
        System.out.println("No");
    }else {
        for (Property property :Propertys){
           if (typePropertys.equalsIgnoreCase(property.getType())){
               System.out.println(property.getAddress());
           }
        }
}}
public static void  compareSets (HashSet<Property> propertys,HashSet<Property> propertysNew){
    HashSet<Property> difference =new HashSet<>(propertys);
    difference.removeAll(propertysNew);
    for (Property d:difference){

        System.out.println(d.address.toUpperCase()+ " " + d.getType());
}}
    public static void  compareSetsN (HashSet<Property> propertys,HashSet<Property> propertysNew){
        HashSet<Property> difference =new HashSet<>(propertysNew);
        difference.removeAll(propertys);
        for (Property d:difference){

        System.out.println(d.address.toUpperCase()+ " " + d.getType());
}}}











