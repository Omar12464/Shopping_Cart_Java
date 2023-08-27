import java.util.ArrayList;
import java.util.List;

public class Users {
    List<Product> Laptop = new ArrayList<>(1000);
    List<Product> Phone = new ArrayList<>(1000);
    List<Product> Earphone = new ArrayList<>(1000);
    List<Product> TV = new ArrayList<>(1000);
    Product Device_Info=new Product();
    int idCounter = 0;
    public void Increment_ID(){
         idCounter++;
    }
    public void ShowCategories() {
        System.out.println("Available categories:");
        System.out.println("1) Laptops");
        System.out.println("2) Phones");
        System.out.println("3) Televisions");
        System.out.println("4) Headphones");
    }

    public void getcategories(int cat) {
        if (cat == 1) {
            System.out.println("1. Dell");
            System.out.println("2. HP");
            System.out.println("3. MSI");
        } else if (cat == 2) {
            System.out.println("1. Samsung");
            System.out.println("2.IPhone");
            System.out.println("3. Xiaomi");
        } else if (cat == 3) {
            System.out.println("1. Samsung");
            System.out.println("2.Sony");
            System.out.println("3. LG");
        } else if (cat == 4) {
            System.out.println("1. Oraimo");
            System.out.println("2.Anker");
            System.out.println("3. MiBuds");
        }else{
            System.out.println("Invalid Choice");
        }
    }
    public void getdevices(int category,int device) {
        Product Device=new Product(category, device);
        if(category==1){
            if(device==1){
                Device.category="Laptop";
                Device.device="Dell";
                Device.price=35000;
                Device.id =idCounter;
                Increment_ID();
                Device_Info=Device;
                Laptop.add(Device);
            } else if (device==2) {
                Device.category="Laptop";
                Device.device="HP";
                Device.id =idCounter;
                Increment_ID();
                Device.price=60000;
                //boolean b = Device == new Product("Laptop", "HP", 60000);
                Device_Info=Device;
                Laptop.add(Device);
            }else if (device==3) {
                Device.category="Laptop";
                Device.device="MSI";
                Device.price=40000;
                Device.id =idCounter;
                Increment_ID();
                // boolean b = Device == new Product("Laptop", "MSI", 40000);
                Device_Info=Device;
                Laptop.add(Device);
            }
        } else if (category==2) {
            if(device==1){
                Device.category="Phone";
                Device.device="Samsung";
                Device.price=4000;
                Device.id =idCounter;
                Increment_ID();
             //   boolean b = Device == new Product("Phone", "Samsung", 4000);
                Device_Info=Device;
                Phone.add(Device);
            } else if (device==2) {
                Device.category="Phone";
                Device.device="IPhone";
                Device.price=3000;
                Device.id =idCounter;
                Increment_ID();
//    boolean b = Device == new Product("Phone", "IPhone", 3000);
                Device_Info=Device;
                Phone.add(Device);
            }else if (device==3) {
                Device.category="Phone";
                Device.device="Xiaomi";
                Device.price=2000;
                Device.id =idCounter;
                Increment_ID();
            //    boolean b = Device == new Product("Phone", "Xiaomi", 2000);
                Device_Info=Device;
                Phone.add(Device);
            }
        } else if (category==3) {
            if(device==1){
                Device.category="TV";
                Device.device="Samsung";
                Device.price=8000;
                Device.id =idCounter;
                Increment_ID();
               // boolean b = Device == new Product("TV", "Samsung", 8000);
                Device_Info=Device;
                TV.add(Device);
            } else if (device==2) {
                Device.category="TV";
                Device.device="Sony";
                Device.price=6000;
                Device.id =idCounter;
                Increment_ID();
            //    boolean b = Device == new Product("TV", "Sony", 6000);
                Device_Info=Device;
                TV.add(Device);
            }else if (device==3) {
                Device.category="TV";
                Device.device="LG";
                Device.price=4000;
                Device.id =idCounter;
                Increment_ID();
            //    boolean b = Device == new Product("TV", "LG", 4000);
                Device_Info=Device;
                TV.add(Device);
            }
        } else if (category==4) {
            if(device==1){
                Device.category="EarPhones";
                Device.device="Oraimo";
                Device.price=800;
                Device.id =idCounter;
                Increment_ID();
            //    boolean b = Device == new Product("EarPhones", "Oraimo", 800);
                Device_Info=Device;
                Earphone.add(Device);
            } else if (device==2) {
                Device.category="EarPhones";
                Device.device="Anker";
                Device.price=600;
                Device.id =idCounter;
                Increment_ID();
            //    boolean b = Device == new Product("EarPhones", "Anker", 600);
                Device_Info=Device;
                Earphone.add(Device);
            }else if (device==3) {
                Device.category="EarPhones";
                Device.device="MiBuds";
                Device.price=400;
                Device.id =idCounter;
                Increment_ID();
            //    boolean b = Device == new Product("EarPhones", "MiBuds", 400);
                Device_Info=Device;
                Earphone.add(Device);
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
  public void Display(){

        for (Product laptop : Laptop) {
                    System.out.println("ID: "+laptop.id);
                    System.out.println("Category: " + laptop.category);
                    System.out.println("Device: " + laptop.device);
                    System.out.println("Price: $" + laptop.price);
                    System.out.println("-------------------");
        }

        for (Product phone : Phone) {
            System.out.println("ID: "+phone.id);
            System.out.println("Category: " + phone.category);
            System.out.println("Device: " + phone.device);
            System.out.println("Price: $" + phone.price);
            System.out.println("-------------------");
        }

        for (Product Tele : TV) {
            System.out.println("ID: "+Tele.id);
            System.out.println("Category: " + Tele.category);
            System.out.println("Device: " + Tele.device);
            System.out.println("Price: $" + Tele.price);
            System.out.println("-------------------");
        }
        for (Product Earphone : Earphone) {
            System.out.println("ID: "+Earphone.id);
            System.out.println("Category: " + Earphone.category);
            System.out.println("Device: " + Earphone.device);
            System.out.println("Price: $" + Earphone.price);
            System.out.println("-------------------");
        }
    }

  public void remove(int id){
      boolean removed = false;

      for (Product product : Laptop) {
          if (product.id == id) {
              Laptop.remove(product);
              removed = true;
              break;
          }
      }

      if (!removed) {
          for (Product product : Phone) {
              if (product.id == id) {
                  Phone.remove(product);
                  removed = true;
                  break;
              }
          }
      }

      if (!removed) {
          for (Product product : TV) {
              if (product.id == id) {
                  TV.remove(product);
                  removed = true;
                  break;
              }
          }
      }

      if (!removed) {
          for (Product product : Earphone) {
              if (product.id == id) {
                  Earphone.remove(product);
                  removed = true;
                  break;
              }
          }
      }

      if (removed) {
          System.out.println("Product with ID " + id + " has been removed.");
      } else {
          System.out.println("Product with ID " + id + " was not found.");
      }
  }

    public void modify(int id, int newCategory, int newDevice) {
        remove(id);
        getdevices(newCategory, newDevice);
        System.out.println("Order with ID " + id + " has been modified.");
    }
  }


