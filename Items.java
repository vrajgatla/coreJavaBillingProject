

public class Items {

    private Long ItemId;
    private  String ItemName;
    private String Details;
    private int Price;
    private int Discount;

    
    public   Long getItemId() {
        return ItemId;
    }
    public void setItemId(Long itemId) {
        this.ItemId = itemId;
    }
    public  String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }
    public String getDetails() {
        return Details;
    }
    public void setDetails(String details) {
        this.Details = details;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        this.Price = price;
    }
    
    public int getDiscount() {
        return Discount;
    }
  
    public void setDiscount(int discount) {
        this.Discount = discount;
    }
    public Items(long itemId, String itemName, String details, int price, int discount) {
        this.ItemId = itemId;
        this.ItemName = itemName;
        this.Details = details;
        this.Price = price;
        this.Discount = discount;
    }
    
    
    public Items() {
    }
    @Override
    public String toString() {
        return "Items [ItemId=" + ItemId + ", ItemName=" + ItemName + ", Details=" + Details + ", Price=" + Price
                + ", Discount=" + Discount + "]";
    }
    
}
