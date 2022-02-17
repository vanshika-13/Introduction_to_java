import java.util.*;

class Burger_King {
  int choice1, choice2, vc = 0, vfc = 0, v = 0, total_bill;

  void Main_menu() {

    Scanner sc = new Scanner(System.in);
    System.out.println("---------------------------BURGER KING--------------------------------");
    System.out.println("MAIN MENU");
    while (true) {
      System.out.println("Select any option from below->");
      System.out.println("1.  Order");
      System.out.println("2.  Billing");
      System.out.println("3.  Exit");
      System.out.println("---------------------------------------------------------");
      choice1 = sc.nextInt();
      switch (choice1) {
        case 1:
          order();
          break;

        case 2:
          total_bill = bill();
          System.out.println("Total Bill = " + total_bill);
          break;

        case 3:
          exit();
          System.exit(0);
          break;

        default:
          System.out.println("Wrong input. Please re-enter");
      }
    }

  }

  void order() {
    System.out.println("What do you want to order?");
    System.out.println("Available options : ");
    System.out.println(" 1.  1 Veg Burger + 1 coke                    Rs 100");
    System.out.println(" 2.  1 Veg Burger + fries+ coke               Rs 150");
    System.out.println(" 3.  1 Veg Burger                             Rs 30");
    System.out.println("        -----------------------------------------             ");
    Scanner sc1 = new Scanner(System.in);
    choice2 = sc1.nextInt();
    if (choice2 == 1) {
      System.out.println("How many combos? ");
      vc = sc1.nextInt();
    } else if (choice2 == 2) {
      System.out.println("How many combos? ");
      vfc = sc1.nextInt();
    } else if (choice2 == 3) {
      System.out.println("How many combos? ");
      v = sc1.nextInt();
    } else {
      System.out.println("Enter correct input");
    }
  }

  int bill() {
    return vc * 100 + vfc * 150 + v * 30;
  }

  void exit() {
    System.out.println("Thank you for visiting BURGER KING");
  }

  public static void main(String[] args) {
    Burger_King m = new Burger_King();
    m.Main_menu();
  }
}
