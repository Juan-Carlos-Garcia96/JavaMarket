package Products;

public class Products {

    private int id;
    private String description;
    private int  prices;
    private double pices;
    private boolean IsActive;

    public Products(){

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

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }
}
