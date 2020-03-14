package src.model;

public class Client {

    // Constants
    public static final String NORMAL = "Normal";
    public static final String SILVER = "Silver";
    public static final String GOLD = "Gold";
    public static final String PLATINUM = "Platinum";

    public static final double TO_SILVER = 35000;
    public static final double TO_GOLD = 55000;
    public static final int TO_PLATINUM = 5000000;

    // Atributes
    private String name;
    private int tradeId;
    private String type;
    private double kgTransported;
    private int totalPaid;

    // Relationship
    private Date expeditionDate;

    // Methods
    public Client(String name, int id, Date date) {
        this.name = name;
        this.tradeId = id;
        this.type = NORMAL;
        this.kgTransported = 0;
        this.totalPaid = 0;
        this.expeditionDate = date;
    }

    public String getName() {
        return name;
    }

    public int getTradeId() {
        return tradeId;
    }

    public String getType() {
        return type;
    }

    public double getKgTransported() {
        return kgTransported;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public Date getExpeditionDate() {
        return expeditionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTradeId(int id) {
        this.tradeId = id;
    }

    public void setKgTransported(double kg) {
        kgTransported = kg;
    }

    public void setTotalPaid(int paid) {
        totalPaid = paid;
    }

    public void updateCategory(){
        if(kgTransported > TO_SILVER)
            type = SILVER;
        else if(kgTransported > TO_GOLD)
            type = GOLD;
        else if(totalPaid > TO_PLATINUM)
            type = PLATINUM;
    }
}