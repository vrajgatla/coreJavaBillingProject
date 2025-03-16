
import java.util.ArrayList;
import java.util.List;

public  class Admin{
    Admin admin = new Admin();



    List<Items> items = new ArrayList<>();
    List<Employees> employees= new ArrayList<>();
    List<Cart> cart = new ArrayList<>();



    public void addToCart(Items cartitem) {
       cart.add(cartitem);

        
   }

    public void  deletefromCart(String id){
        for(Cart carts :cart){
            if(carts.getItem().getItemName().equals(id)){
                cart.remove(carts);
            }
        }
    }
    

    public void AddItem(long itemId, String itemName, String details, int price, int discount){
        Items item =  new Items(itemId,itemName,details, price , discount );
        items.add(item);
        System.out.println("new item atted to menu" );
    }

    public void ShowAllItems() {
        for (Items item : items) {
            System.out.println(item);
        }
    }



    public void Updateitems(String name,int price , int discount){
        for(Items item:items){
            if (item.getItemName() == name){
                item.setPrice(price);
                item.setDiscount(discount);
                System.out.print("updated successfully");
            }
            else{
                System.out.println("item  not found");
            }
        }
    }


            
    public void DeleteItem(int num) {
        for (Items item : items) {
            if (item.getItemId().equals(num)) {
                items.remove(item);
                System.out.println("Item removed: " + item);
                return; 
            }
        }
        System.out.println("Item not found: " + num);
    }



    public void AddEmployee(int employeeId, String employeeName, int mobileNo, String emailId, String address){
        Employees employee = new Employees(employeeId,employeeName,mobileNo,emailId,address);
        employees.add(employee);
        System.out.println("employee added");
    }






    public void  ShowAllEmployees(){
        for(Employees employee :employees){
            System.out.println("employee details "+employee);
        }
    }


    
    public void DeleteEmployee(String name) {
        for (Employees employee : employees) {
            if (employee.getEmployeeName().equals(name)) {
                employees.remove(employee);
                System.out.println("Employee removed: " + employee);
                return;
            }
        }
        System.out.println("Employee not found: " + name);
    }


    public void UpdateEmployee(String name,int mobileno,String address){
        for(Employees employee:employees){
            if (employee.getEmployeeName().equals(name)){
                employee.setMobileNo(mobileno);
                employee.setAddress(address);
                System.out.println("deleted successfully");
            }
        }
        
    }
}
        

    // Items items = new Items(3345,"biryani","extra spicy",400,6);
// Items item2 = new Items(3345,"biryani","extra spicy",400,6);

// System.out.println(item2);

// Employee employee  = new Employee(445,"raju",99989898,"raju.email.com","hyeeejfihfdsfidshfih");
// System.out.println(employee);

    // System.out.println("Enter your id or name here");
    // Scanner sc= new Scanner( System.in);
    // String id = sc.nextLine();
    // System.out.println("enter your password");
    // String passcode = sc.nextLine();

    // System.out.println("your id is created");

