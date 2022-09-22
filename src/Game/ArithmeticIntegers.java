package Game;

import java.util.Scanner;
import java.util.Random;

public class ArithmeticIntegers {
  static void arithmeticIntegers() {
    Scanner enterType = new Scanner(System.in);
      System.out.println("Enter math type \n 1:All Arithmetic \n 2:Addition \n 3:Subtraction \n 4:Multiplication \n 5:Division \nm:Return to menu");
      int type = enterType.nextInt();
      switch (type) {
        case 1:
        arithmeticIntegersMath(true, true, true, true);
        break;
        case 2:
        arithmeticIntegersMath(true, false, false, false);
        break;
        case 3:
        arithmeticIntegersMath(false, true, false, false);
        break;
        case 4:
        arithmeticIntegersMath(false, false, true, false);
        break;
        case 5:
        arithmeticIntegersMath(false, false, false, true);
        break;
        default:
        arithmeticIntegers();
      }
    }

  static void arithmeticIntegersMath(Boolean addition, Boolean subtraction, Boolean multiplication, Boolean division) {
    boolean correct = false;
    Random random = new Random();
    int num1 = random.nextInt(10);
    int num2 = random.nextInt(10) + 1;
    int operatorNum = random.nextInt(4);
    String operator = "+";
    int answer = num1 + num2; 

         if (operatorNum == 0 && addition) {
              operator = "+";
              answer = num1 + num2;
          } else if (operatorNum == 1 && subtraction) {
              operator = "-";
              answer = num1 - num2;
          } else if (operatorNum == 2 && multiplication) {
              operator = "*";
              answer = num1 * num2;
          } else if (operatorNum == 3 && division) {
              if(num1 % num2 == 0) {
              answer = num1 / num2;
              operator = "/";
              } else {
                  answer = num1 % num2;
                  operator = "%";
              }
          } else {
              arithmeticIntegersMath(addition, subtraction, multiplication, division);
          }

    System.out.println(num1 + operator + num2 + "=");

    while (!correct) {
      Scanner enterProblem = new Scanner(System.in);
        int num = enterProblem.nextInt();
        if (num == answer) {
          System.out.println("Correct Answer!");
          arithmeticIntegersMath(addition, subtraction, multiplication, division);
        } else {
          System.out.println("Wrong! Try again.");
  }
      }
  }
  
  public ArithmeticIntegers() {
    arithmeticIntegers();
  }
}