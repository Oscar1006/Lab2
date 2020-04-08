package src.model;

public class Client {

    // Constants
    private static final String NORMAL = "Normal";
    private static final String SILVER = "Silver";
    private static final String GOLD = "Gold";
    private static final String PLATINUM = "Platinum";

    private static final double TO_SILVER = 35000;
    private static final double TO_GOLD = 55000;
    private static final int TO_PLATINUM = 5000000;

    private static final double SILVER_DISCOUNT = 0.985;
    private static final double GOLD_DISCOUNT = 0.97;
    private static final double PLATINUM_DISCOUNT = 0.95;

    // Atributes
    private String name;
    private int tradeId;
    private String type;
    private double kgTransported;
    private int totalPaid;
    private double discount;

    // Relationship
    private Date expeditionDate;

    // Methods
    public Client(String name, int id, Date date) {
        this.name = name;
        this.tradeId = id;
        this.type = NORMAL;
        this.kgTransported = 0;
        this.totalPaid = 0;
        this.discount = 0;
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

    public double getDiscount() {
        return discount;
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

    public void updateType() {
        if (kgTransported > TO_SILVER)
            type = SILVER;
        else if (kgTransported > TO_GOLD)
            type = GOLD;
        else if (totalPaid > TO_PLATINUM)
            type = PLATINUM;
    }

    public void updateDiscount() {
        if (type.equals(SILVER))
            discount = SILVER_DISCOUNT;
        else if (type.equals(GOLD))
            discount = GOLD_DISCOUNT;
        else if (type.equals(PLATINUM))
            discount = PLATINUM_DISCOUNT;
    }
}