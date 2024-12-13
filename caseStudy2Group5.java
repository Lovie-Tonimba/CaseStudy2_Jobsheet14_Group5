import java.util.Scanner;
public class caseStudy2Group5 {

    static int select;
    static int index = 0;
    public static void main(String[] args) {
        String [][] costumer = new String[10][4];
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
        if (index < costumer.length){
            System.out.print("enter costumer name: ");
            costumer[index][0] = sc.nextLine();
            System.out.print("enter number table: ");
            costumer[index][1] = sc.nextLine();
            System.out.println();
        }
        String menuName;
        menuName = sc.nextLine();
        
        System.out.println("==== MENU KAFE ====");
        System.out.println("1. kopi hitam - Rp 15.000");
        System.out.println("2. latte - Rp 22.000");
        System.out.println("3. teh tarik - Rp 12.000");
        System.out.println("4. mie goreng - Rp 18.000");
        costumer[index][2] = menuName;
    
        while (true){
            
        }

    }

    static void displayOrderList(String[][]costumer){
        
    }
}