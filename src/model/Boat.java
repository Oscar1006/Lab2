package src.model;

import java.util.ArrayList;

public class Boat {
    // Constants
    private static final int MAX_WEIGHT_KG = 28000;
    private static final int MIN_WEIGHT_KG = 12000;
    private static final int MIN_LOADS = 2;
    // Relationships
    ArrayList<Load> loads;
    private Client company1;
    private Client company2;
    private Client company3;
    private Client company4;
    private Client company5;

    // Methods
    public Boat(Client com1, Client com2, Client com3, Client com4, Client com5) {
        company1 = com1;
        company2 = com2;
        company3 = com3;
        company4 = com4;
        company5 = com5;
    }

    public Client getClient (int id){
        Client searched = null;
        if (company1.getTradeId() == id){
            searched = company1;
        }
        else if (company2.getTradeId() == id){
            searched = company2;
        }
        else if (company3.getTradeId() == id){
            searched = company3;
        }
        else if (company4.getTradeId() == id){
            searched = company4;
        }
        else if (company5.getTradeId() == id){
            searched = company5;
        }
        return searched;
    }

    public String uploadBoat(ArrayList<Load> loads) {
        String message = "Boat uploaded";
        this.loads = loads;
        return message;
    }

    public String downloadBoat() {
        String message = "Boat downloaded";
        this.loads = null;
        return message;
    }

    public int informValue() {
        int value = 0;
        
        for (int i = 0; i < loads.size(); i++){
            value += loads.get(i).loadPrice();
        }
        return value;
    }

    public int totalWeight() {
        int w = 0;

        for (int i = 0; i < loads.size(); i++){
            w += loads.get(i).loadWeight();
        }
        return w;
    }

    public boolean posibilityToSetSail() {
        boolean posible = true;
        
        boolean thereIsPerishable = false;
        boolean thereIsDangerous = false;

        int totalWeight = totalWeight();

        for (int i = 0; i < loads.size() && !thereIsPerishable; i++){
            if (loads.get(i).getType().equalsIgnoreCase("Perishable")){
                thereIsPerishable = true;
            }
        }
        for (int i = 0; i < loads.size() && !thereIsDangerous; i++){
            if (loads.get(i).getType().equalsIgnoreCase("Dangerous")){
                thereIsDangerous = true;
            }
        }

        if (totalWeight > MAX_WEIGHT_KG){
            posible = false;
        }
        else if (totalWeight < MIN_WEIGHT_KG){
            posible = false;
        }
        else if (loads.size() < MIN_LOADS){
            posible = false;
        }
        else if (thereIsDangerous && thereIsPerishable){
            posible = false;
        }

        return posible;
    }

    public String updateCategory() {

        String categories = "";

        categories = "\n  Categories \n\n" 
        + company1.getName() + ": " + company1.getType() + "\n"
        + company2.getName() + ": " + company2.getType() + "\n"
        + company3.getName() + ": " + company3.getType() + "\n"
        + company4.getName() + ": " + company4.getType() + "\n"
        + company5.getName() + ": " + company5.getType(); 

        return categories;
    }

}