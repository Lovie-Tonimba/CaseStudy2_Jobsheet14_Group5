import java.util.Scanner;
public class caseStudy2Group51 {
    static int select, index, selectMenu, item;
    static int totalOrder = 0;
    static String menuList[]={"Black coffe", "Latte", "Teh Tarik", "Fried Noodle"};
    static int [] price = {15000, 22000, 12000, 18000};
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
        if(index < costumer.length){
            System.out.println();
            System.out.print("Enter customer name: ");
            costumer[index][0] = sc.nextLine();
            System.out.print("Enter the table number: ");
            costumer[index][1] = sc.nextLine();
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
            if(selectMenu > 0 && selectMenu <= 4){
                while (true) { 
                    System.out.print("Input the number of items for " + menuList[selectMenu-1] + ": ");
                    item = sc.nextInt();
                    System.out.println();
                    if(item > 0){
                        break;
                    }else{
                        System.out.println("Invalid input. Try again.");
                        System.out.println();
                    }
                }
                costumer[index][3] = Integer.toString(item);
                totalOrder += item * price[selectMenu-1];
                costumer[index][4] = Double.toString(totalOrder);

            }else{
                System.out.println("Invalid menu selection. Try again.");
                System.out.println();
            }
        }
        costumer[index][2] = Integer.toString(selectMenu);
        
        System.out.println("Order added successfully.");
        System.out.println("Total price of the order: Rp " + costumer[index][4]);
        System.out.println();
    }

    static void displayOrderList(String[][]costumer){
        System.out.println("===== LIST ORDER =====");
        boolean hasOrder = false;
        for(int i = 0; i < index; i++){
            if (costumer[i][0] != null){
              hasOrder = true;
              System.out.println("Custumer Name: " + costumer[i][0]);
              System.out.println("Table Number: " + costumer[i][1]);
              System.out.println("Detail Order: ");
            }
        }    
       // for(int j = 0; j < orderDetails.length; j++)
}    
    public static void main(String[] args) {
        String [][] costumer = new String[50][5];
        mainMenu(costumer);
    }
}