package Products;

public class Products {

    private int id;
    private  String name;
    private String description;
    private double prices;
    private int pices;
    private String type;

    public Products(int id,String name,  String description, int prices, int pices, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.prices = prices;
        this.pices = pices;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
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

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getPices() {
        return pices;
    }

    public void setPices(int pices) {
        this.pices = pices;
    }

    public String getType(){
        return  type;
    }

    public void setType(String type){
        this. type = type;
    }

}
