package src.model;

public class Boat {
    //Constants
    private static final int MAX_WEIGHT_KG = 28000;
    private static final int MIN_WEIGHT_KG = 12000;

    //Relationships
    private Load loads[];
    private Client company1;
    private Client company2;
    private Client company3;
    private Client company4;
    private Client company5;

    //Methods
    public Boat (Client com1, Client com2, Client com3, Client com4, Client com5){
        company1 = com1;
        company2 = com2;
        company3 = com3;
        company4 = com4;
        company5 = com5;
    }
    
    public String uploadBoat (Load loads[]){
        String message = "Boat uploaded";
        this.loads = loads;
        return message;
    }
}