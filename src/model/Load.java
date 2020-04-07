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
    private Client client;

    // Methods
    public Load(int boxes, int weight, String type, Client client) {
        boxesNum = boxes;
        weightG = weight;
        this.type = type;
        this.client = client;
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

    public Client getClient() {
        return client;
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

    public void setClient(Client newClient) {
        client = newClient;
    }

}