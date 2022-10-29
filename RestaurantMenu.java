// 6.	Create a restaurant menu in switch where if we select any option the program should show the price of that food item.
 

import java.util.*;

class RestaurantMenu {
    public static void main(String args[]) {
        int menuitem;
        String order;
        Scanner or = new Scanner(System.in);
        System.out.println("\n\t\t\tH&Y Restaurant");
        System.out.println("\t---------------Menue---------------");
        System.out.println("\n");
        System.out.println("\t\t1.Chicken Biryani:");
        System.out.println("\t\t2.Shami Kabab:");
        System.out.println("\t\t3.Nihari");
        System.out.println("\t\t4.:Beef biryani");
        System.out.println("\t\t5.Mutton karhai:");
        System.out.println("\t\t6.Chicken Karhai:");
        System.out.println("\t\t7.Naan:");
        System.out.println("\t\t8.Cold drink:");
        System.out.println("\n\tSelect menu from 1 to 8 for Price of Menu:");
        menuitem = or.nextInt();
        switch (menuitem) {
            case 1: {
                ;
                order = "\tChicken Biryani";
                System.out.println("chicken Biryani = 120Rs");
            }
                break;
            case 2: {
                order = "\tShami Kabab";
                System.out.println("Shami Kabab = 80Rs");
            }
                break;
            case 3: {
                order = "\tNihari";
                System.out.println("Nihari = 200rs");
            }
                break;
            case 4: {
                order = "\tBeef Biryani";
                System.out.println("\tBeef Biryani = 250Rs");
            }
                break;
            case 5: {
                order = "\tMutton karhai";
                System.out.println("\tMutton karhai = 2000Rs");
            }
                break;
            case 6: {
                order = "\tChicken karhai";
                System.out.println("\tChicken Karhai = 1200Rs");
            }
                break;
            case 7: {
                order = "\tNaan";
                System.out.println("\tNaan = 30Rs");
            }
                break;
            case 8: {
                order = "\tCold drink";
                System.out.println("\tCold drink = 70Rs");
            }
                break;
            default: {
                order = "\tnot in menu";
                System.out.println("\tYou selected the item which is not in our menu: ");
            }
        }
        System.out.println("\t\t Thanks for coming in \"H&Y Restaurant\":");
    }
}
