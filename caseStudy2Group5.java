import java.util.Scanner;
public class caseStudy2Group5 {

    static int select;
    static int index;
    static String menu [] ={"Black Coffe", "Latte", "Teh Tarik", "Fried Noodle"};
    static int menulist [] = new int [menu.length];
    public static void main(String[] args) {
        String [][] costumer = new String[10][5];
        mainMenu(costumer);
    }
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
            index++;
            displayMenus(costumer);
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

        for (int i = 0; i < 10; i++) {
            System.out.print("Select menu (enter the menu number, or 0 to finish): ");
            int menuSelect = sc.nextInt();
            if(menuSelect == 0){
                break;
            }
            for (int j = 0; j < menu.length; j++) {
                switch (menuSelect) {
                    case 1:
                        System.out.println("Input the number of items for " + menu[j]);
                        break;
                    case 2:
                    default:
                        throw new AssertionError();
                }
            }
        }
    }

    static void displayOrderList(String[][]costumer){
        boolean notNull = false;
        System.out.println();
        System.out.println("===== ORDER LIST =====");
        for (int i = 0; i < costumer.length;i++){
            if(costumer[i][0] != null){
                notNull = true;
                for(int j = 0; j < costumer[i].length;j++){
                    switch (j) {
                        case 0:
                        System.out.print("Costumer name: " + costumer[i][j]);
                        break;
                        case 1:
                        System.out.print("Table number: "+ costumer[i][j]);
                        break;
                        case 2:
                        for(k = 0; k<costumer[i][j];)
                        System.out.print("Detail order: ");
                        System.out.print(costumer [i][j] + costumer[i][3]);
                        break;
                    }
                }
            }
        }
        
    }
}