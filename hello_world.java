
package com.mycompany.hello_world;
import java.util.Scanner;

public class hello_world 
{
  static Scanner scanner = new Scanner(System.in);
  public static int firstVar, secondVar, flag,flag1=0;
  public static boolean mFlag = false;
  
  public static void main(String[] args)
  {
      //System.out.print("Hello World!!!");
      String getTask = scanner.nextLine();
      String[] def = new String[3];
      def = getTask.split("\\s");
      firstVar = getNums(def[0]);
      secondVar = getNums(def[2]);
      
      if (flag == flag1)
      {
        System.out.print("Не правильный ввод!");
        System.exit(0);
      }
      else
      {
          if (flag>0)
          {
              printRomeDigits(Math.abs(makeOp(def[1])));
          }
          else
          {
              System.out.print(makeOp(def[1]));
          }
      }
      
  }
  
  public static int makeOp(String name)
  {
      int result;
      switch (name)
      {
          case("+"):
              result = firstVar+secondVar; 
              break;
          case("/"):
              result = firstVar/secondVar; 
              break;
          case("*"):
              result = firstVar*secondVar; 
              break;
          case("-"):
              result = firstVar-secondVar; 
              if (result < 0) mFlag = true;
              break;    
          default:
              result = 0;
              break;
      }
      return result;
  }
  
  public static int getNums(String name)
  {
      int result;
      
      switch (name)
      {
          case  ("I"):
              result = 1;
              flag++;
              break;
          case  ("II"):
              result = 2;
              flag++;
              break;
          case  ("III"):
              result = 3;
              flag++;
              break;
          case  ("IV"):
              result = 4;
              flag++;
              break;
          case  ("V"):
              result = 5;
              flag++;
              break;
          case  ("VI"):
              result = 6;
              flag++;
              break;
          case  ("VII"):
              result = 7;
              flag++;
              break;
          case  ("VIII"):
              result = 8;
              flag++;
              break;
          case  ("IX"):
              result = 9;
              flag++;
              break;
          case  ("X"):
              result = 10;
              flag++;
              break;
          case  ("1"):
              result = 1;
              flag1++;
              break;
          case  ("2"):
              result = 2;
              flag1++;
              break;
          case  ("3"):
              result = 3;
              flag1++;
              break;
          case  ("4"):
              result = 4;
              flag1++;
              break;
          case  ("5"):
              result = 5;
              flag1++;
              break;
          case  ("6"):
              result = 6;
              flag1++;
              break;
          case  ("7"):
              result = 7;
              flag1++;
              break;
          case  ("8"):
              result = 8;
              flag1++;
              break;
          case  ("9"):
              result = 9;
              flag1++;
              break;
          case  ("10"):
              result = 10;
              flag1++;
              break;
          default:
              System.out.print("Не правильные данные!");
              System.exit(0);
              result = 0;
              break;
        }
      
      return result;
  }
  
  public static int printRomeDigits(int digit)
  {
      int count;
      
      
      if (digit<100 && digit != 0)
      {
          if (mFlag) {System.out.print("-");}
          count = digit/10;
          
            switch(count)
         {
             case(0):
                 System.out.print("");
                 break;   
             case(1):
                 System.out.print("X");
                 break;
             case(2):
                 System.out.print("XX");
                 break;
             case(3):
                 System.out.print("XXX");
                 break;
             case(4):
                 System.out.print("XL");
                 break;
             case(5):
                 System.out.print("L");
                 break;
             case(6):
                 System.out.print("LX");
                 break;
             case(7):
                 System.out.print("LXX");
                 break;
             case(8):
                 System.out.print("LXXX");
                 break;
             case(9):
                 System.out.print("XC");
                 break;
         }
            count = digit%10;
            switch (count)
            {
                case(0):
                    System.out.print("");
                    break;   
                case(1):
                    System.out.print("I");
                    break;
                case(2):
                    System.out.print("II");
                    break;
                case(3):
                    System.out.print("III");
                    break;
                case(4):
                    System.out.print("IV");
                    break;
                case(5):
                    System.out.print("V");
                    break;
                case(6):
                    System.out.print("VI");
                    break;
                case(7):
                    System.out.print("VII");
                    break;
                case(8):
                    System.out.print("VIII");
                    break;
                case(9):
                    System.out.print("IX");
                    break;     
            }
      }
      else if (digit == 100)
      {
          System.out.print("C");
      }
      else 
      {
          System.out.print("Ноль");
      }
      
      return 0;
  }
}
