import java.util.Scanner;
import java.util.ArrayList;
public class Main extends Starting{

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;

    public static void menu(){

        ArrayList<String> Menu = new ArrayList<String>();
        Menu.add("Burgers - $80");
        Menu.add("French Fries - $60");
        Menu.add("Chicken Nuggets - $50");
        for(int i = 0; i < Menu.size(); i++) {
            System.out.println(Menu.get(i));
        }
    }

    private static void order(){

        System.out.println("Press 1 to buy Burgers, Press 2 for French Fries , Press 3 for Chicken Nuggets and Press 4 to Cancel");
        System.out.print("Press you want to buy? :");
        choose = input.nextInt();

        if(choose==1){
            System.out.println("You choose Burgers");
            System.out.print("How many Burgers do you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*80);

            System.out.println("Would you like to purchase again?");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();
            }else{
                System.out.println("Input your payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Insufficient payment");
                }else{
                    System.out.println("The total price is " + total);
                    total = pay-total;
                    System.out.println("Your change is " + total);
                }
            }
        }else if(choose==2){
            System.out.println("You chose French Fries");
            System.out.print("How many French Fries do you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*60);

            System.out.println("Would you like to purchase again?");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();
            }else{
                System.out.println("Input your payment  ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Insufficient payment");
                }else{
                    System.out.println("The total price is " + total);
                    total = pay-total;
                    System.out.println("Your change is " + total);
                }
            }
        }else if(choose==3){
            System.out.println("You chose Chicken Nuggets");
            System.out.print("How many Chicken Nuggets do you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*50);

            System.out.println("Would you like to purchase again? ");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();
            }else{
                System.out.println("Input your payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Insufficient payment");
                }else{
                    System.out.println("The total price is " + total);
                    total = pay-total;
                    System.out.println("Your change is " + total);
                }
            }
        }else if(choose==4){
            System.exit(0);
        }else{
            System.out.println("The options are only 1 to 4!");
            order();
        }
    }

    public static void main (String[] args) {
        Starting Starting = new Starting();

        System.out.println(Starting.greet);
        System.out.println(Starting.welcome + "\n");

        menu();
        order();
    }
}