import java.lang.module.FindException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
      int not;
      Scanner input = new Scanner(System.in);
      System.out.println("How many friends do you have ");
      not = input.nextInt();
      String[] names = new String[not];

      for (int index = 0 ; index < not; index++){
          System.out.println("Enter the name of friend " + (index + 1));
          names[index] = input.next();
      }
      input.close();
      System.out.println(" Your friends are ");
      for (int index = 0 ; index < not; index++){
          System.out.println(names[index]);
      }

         */

      int antal;
      Scanner input = new Scanner(System.in);
      System.out.println("antal anställda som man vill betala ut löner till");
      antal = input.nextInt();
      int [] mony = new int[antal];
      double val;
      for (int index = 0; index< antal; index++){
          System.out.println("Mata in första blöp"+ (index + 1));
          mony[index] = input.nextInt();
        }
      input.close();
      for (int index = 0; index< antal; index++){
          val = mony[index] * 0.60;
          System.out.println(mony[index]+val);
      }
    }
}