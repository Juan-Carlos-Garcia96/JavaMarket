package Products;

public class Products {

    private int id;
    private String description;
    private int  prices;
    private double pices;
    private String type;

    public Products(int id, String description, int prices, double pices, String type) {
        this.id = id;
        this.description = description;
        this.prices = prices;
        this.pices = pices;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public double getPices() {
        return pices;
    }

    public void setPices(double pices) {
        this.pices = pices;
    }

    public String getType(){
        return  type;
    }

    public void setType(String type){
        this. type = type;
    }

}
