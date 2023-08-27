
public class Product {
    String category;

    String device;

    int price;
    int cat_id;
    int device_id;

    int id=0;

    public Product() {
        this.category = "0";
        this.device = "0";
        this.price = 0;
        this.id = ++id;
    }
    public Product(String category, String device, int price) {
        this.category = category;
        this.device = device;
        this.price = price;
        this.id = ++id;
    }
    public  Product(int category_id,int device_id){
        this.cat_id=category_id;
        this.device_id=device_id;
        this.id = ++id;
    }
}

