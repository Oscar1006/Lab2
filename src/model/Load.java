package src.model;

public class Load {

    // Constants
    private static final String DANGEROUS = "Dangerous";
    private static final String PERISHABLE = "Perishable";
    private static final String NONPERISHABLE = "Nonperishable";

    private static final int KG_DANGEROUS_PRICE = 390000;
    private static final int KG_PERISHABLE = 250000;
    private static final int KG_NONPERISHABLE = 80000;

    // Atributes
    private int boxesNum;
    private int weightG;
    private String type;

    // Relationship
    private Client owner;

    // Methods
    public Load(int boxes, int weight, String type, Client client) {
        boxesNum = boxes;
        weightG = weight;
        this.type = type;
        owner = client;
    }

    public int getBoxesNum() {
        return boxesNum;
    }

    public int getWeightG() {
        return weightG;
    }

    public String getType() {
        return type;
    }

    public Client getOwner() {
        return owner;
    }

    public void setBoxesNum(int boxes) {
        boxesNum = boxes;
    }

    public void setWeightG(int weight) {
        weightG = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwner(Client newClient) {
        owner = newClient;
    }

    public int loadWeight(){
        int w = 0;

        w = boxesNum * weightG;

        return w;
    }

    public int loadPrice() {
        int price = 0;
        
        if (type.equals(DANGEROUS)){
            price = KG_DANGEROUS_PRICE * loadWeight();
        }
        else if (type.equals(PERISHABLE)){
            price = KG_PERISHABLE * loadWeight();
        }
        else if (type.equals(NONPERISHABLE)){
            price = KG_NONPERISHABLE * loadWeight();
        }
        
        return price;
    } 

}