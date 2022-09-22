package Game;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MathGame {
  static void menu() {
    System.out.println("1:Arithmetic with integers\n2:Arithmetic with decimals");
    Scanner enterMenu = new Scanner(System.in);
    int menu = enterMenu.nextInt();

    switch (menu) {
      case 1:
      tryArithmeticIntegers();
      break;
      case 2:
      tryArithmeticDecimals();
      break;
      default:
      menu();
    }
  }

  static void tryArithmeticIntegers() {
    try{
      ArithmeticIntegers.arithmeticIntegers();
    }
    catch (InputMismatchException ex) {
      tryArithmeticIntegers();
   }
  }

  static void tryArithmeticDecimals() {
    try{
      ArithmeticDecimals.arithmeticDecimals();
    }
    catch (InputMismatchException ex) {
      tryArithmeticDecimals();
   }
  }
  public static void main(String[] args) {
    menu();
  }
}  