import java.util.Scanner;
public class caseStudy2Group5 {

    static void mainMenu(String[][]costumer){
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("===== MAIN MENU =====");
            System.out.println("1. Add Order");
            System.out.println("2. Display Order List");
            System.out.println("3. Exit");
            System.out.print("Select menu: ");
            select = sc.nextInt();
            
            if(select == 1){
                addOrder(costumer);
            }else if(select == 2){
                displayOrderList(costumer);
            }else if(select == 3){
                System.out.println("Thank you for ordering, enjoy your food!");
                break;
            }else{
                System.out.println("Select one menu on the following list. Try again.\n");
            }
        }
    }
    
    static void addOrder(String[][]costumer){
        Scanner sc = new Scanner(System.in);
        totalOrder = 0;
        if(index < costumer.length){
            System.out.println();
            System.out.print("Enter customer name: ");
            costumer[index][0] = sc.nextLine();
            System.out.print("Enter the table number: ");
            costumer[index][1] = sc.nextLine();
            totalOrder =0;
            costumer[index][2] = "";
            displayMenus(costumer);
            index++;
        }else{
            System.out.println("Order capacity is full.\n");
        }
    }
    
    static void displayMenus(String[][]costumer){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("===== CAFE MENU =====");
        System.out.println("1. Black Coffe - Rp 15000");
        System.out.println("2. Latte - Rp 22000");
        System.out.println("3. Teh Tarik - Rp 12000"); 
        System.out.println("4. Fried Noodle - Rp 18000");
        System.out.println();

        while (true) { 
            System.out.print("Select menu (enter the menu number, or 0 to finish): ");
            selectMenu = sc.nextInt();
            if(selectMenu == 0){
                break;

            } 
            if(selectMenu > 0 && selectMenu < 5 ){
                while (true) { 
                    System.out.print("Input the number of items for " + menu[selectMenu-1] + ": ");
                    item = sc.nextInt();
                    System.out.println();
                    if(item > 0){
                        costumer[index][2] += menu[selectMenu - 1] + " x " + item + " = Rp" + (price[selectMenu-1] * item) + "\n";
                        totalOrder += item * price[selectMenu-1];
                        break;
                    }else{
                        System.out.println("Invalid input. Try again.");
                        System.out.println();
                    }
                }
            }else{
                System.out.println("Invalid menu selection. Try again.");
                System.out.println();
            }
        }
        
        costumer[index][4] = Double.toString(totalOrder);
        
        System.out.println();
        System.out.println("Order added successfully.");
        System.out.println("Total price of the order: Rp " + costumer[index][4]);
        
        System.out.println();
    }

    static void displayOrderList(String[][]costumer){
        boolean notNull = false;
        System.out.println();
        System.out.println("===== ORDER LIST =====");
        for (int i = 0; i < costumer.length;i++){
                if(costumer[i][0] != null){
                    notNull = true;
                    System.out.println("Customer name: "+ costumer[i][0]);
                    System.out.println("Table Number: "+ costumer[i][1]);
                    System.out.println("Order Detail: ");
                String[] orders = costumer[i][2].split("\n");
                for(String order : orders){
                    if(!order.isEmpty()){
                        System.out.println("- " +order);
                    }
                }
                System.out.println("Total price "+ costumer[i][4]);
                System.out.println();
                }
            }
            if(!notNull){
                System.out.println("There is no order yet");
        }
        }
        static int select;
        static int index = 0;
        static int selectMenu;
        static int item;
        static double totalOrder;
        static String [] menu = {"Black Coffe", "Latte", "Teh Tarik", "Fried Noodle"}; 
        static double [] price= {15000, 22000, 12000, 18000};
        public static void main(String[] args) {
            String [][] costumer = new String[10][5];
            mainMenu(costumer);
        }
}