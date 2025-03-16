
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Admin admin = new Admin();
        // admin.AddItem(454,"biryani","ntietnin",554,55);
        // admin.AddItem(55,"mutton","nfdijgndifgni,",99,00);
        // admin.AddEmployee(999, "raju", 985994859, "emaokdokf.com", "asdmfidsjf.sdfojsofj");
        //  admin.AddEmployee(979, "u", 985994859, "emaokkf.com", "asdidsjf.sdfojsofj");




       while (true) {

        System.out.print("please login as 1.admin or 2.costumer");
        int choice= sc.nextInt();
          

        if(choice ==1){
        System.out.print("please choose the folowing  1. items  2. employee details");
 
        int num = sc.nextInt();
        if (num == 1){
         System.out.print("please select any one from the following  1.AddItem 2.Updateitems 3.deleteitems 4. showallitems");
         int choose = sc.nextInt();
         if(choose == 1){
             System.out.println("please enter id no ");
             int id = sc.nextInt();
             sc.nextLine();
             System.out.println("please enter name ");
             String name = sc.nextLine();
             System.out.println("please enter details ");
             String details = sc.nextLine();
             System.out.println("please enter price ");
             int price = sc.nextInt();
             System.out.println("please enter discount ");
             int discount = sc.nextInt();
             admin.AddItem(id,name,details,price,discount);
         }
        
        else if(choose ==2){
         System.out.println("please enter name of item to update ");
         String details = sc.nextLine();
         sc.nextLine();

         System.out.println("please enter new price ");
         int price = sc.nextInt();
         sc.nextLine();
         System.out.println("please enter new dicount ");
         int discount = sc.nextInt();
         sc.nextLine();
         admin.Updateitems(details,price,discount);
        }
        
        else if(choose ==3){
         System.out.println("please enter  name to delete");
         int numb = sc.nextInt();

         sc.nextLine();

         admin.DeleteItem(numb);
        }
        else if(choose == 4){
         admin.ShowAllItems();
        }
        else {
            System.out.println("please choose a correct option");
        }
     }
     else if (num ==2){
         System.out.println("please select any of below 1. add employee 2.updare employee 3.delate employee 4.showallmployees");
         int choose = sc.nextInt();
 
         if(choose == 1){
             System.out.println("please enter employe id ");
             int id = sc.nextInt();
             System.out.println("please enter name ");
             String name = sc.nextLine();
             System.out.println("please enter  number");
             int number = sc.nextInt();
             System.out.println("please enter email id ");
             String email = sc.nextLine();
             System.out.println("please enter address ");
             String address = sc.nextLine();
 
             admin.AddEmployee(id, name, number, email, address);
         }
        
        else if(choose ==2){
         System.out.println("please enter name to update ");
         String details = sc.nextLine();
         sc.nextLine();
         System.out.println("please enter  mobileno");
         int mobileno = sc.nextInt();
         System.out.println("please enter address ");
         String address  = sc.nextLine();
         admin.UpdateEmployee(details, mobileno, address);
 
        }
        else if(choose ==3){
         System.out.println("please enter name to delete ");
 
         String name = sc.nextLine();
         admin.DeleteEmployee(name);
        }
        else if(choose == 4){
         admin.ShowAllEmployees();
        }
        else {
            System.out.println("please choose a corrcect option");
        }
 
 
        
       }
}
else if(choice == 2) {
System.out.println("please select 1.addtocart 2.deletefrom cart");
{
    int select = sc.nextInt();

    if (select == 1){
    System.out.println("Please select items to add to your cart");
    System.out.println("Search item by id");
    int itemId = sc.nextInt();
    sc.nextLine(); 
    System.out.println("Please select the quantity");
    int quantity = sc.nextInt();
    sc.nextLine();
    admin.addToCart()
    
   

}

    else if( select ==2){
    System.out.println("Search item by name");
    String itemName = sc.nextLine();
    sc.nextLine();
    admin.deletefromCart(itemName);

    }

}
   
}
else {
    System.out.println("please choose a corrcect option");
}

    } 
    }
}
 
 