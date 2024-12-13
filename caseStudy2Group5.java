import java.util.Scanner;
public class caseStudy2Group5 {

    static int select;
    static int index;
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
        
    }

    static void displayOrderList(String[][]costumer){
        
    }
}