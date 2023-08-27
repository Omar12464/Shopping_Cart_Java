import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Users User = new Users();
        Scanner myobj = new Scanner(System.in);
        int x=0;
        int cate;
        int dev;
        while (x != 0||x!=4) {
            System.out.println("Select an option:");
            System.out.println("1.Place O1rder");
            System.out.println("2.Remove");
            System.out.println(("3.Modify"));
            System.out.println(("4.DisplayALL"));
            x = myobj.nextInt();
            switch (x){
                case 1:
                    User.ShowCategories();
                    System.out.println("Enter Which category you want");
                    cate = myobj.nextInt();
                    User.getcategories(cate);
                    System.out.println("Enter Which device you want");
                    dev = myobj.nextInt();
                    User.getdevices(cate, dev);
                    break;
                    case 2:
                        System.out.println("Enter the ID of the product to remove:");
                        int removeId = myobj.nextInt();
                        User.remove(removeId);
                        break;
                    case 3:
                        System.out.println("Enter the ID of the product to modify:");
                        int modifyId = myobj.nextInt();
                        System.out.println("Enter the new category:");
                        int newCategory = myobj.nextInt();
                        System.out.println("Enter the new device:");
                        int newDevice = myobj.nextInt();
                        User.modify(modifyId, newCategory, newDevice);
                        break;
                case 4:
                    User.Display();

            }


            }




        }
    }

