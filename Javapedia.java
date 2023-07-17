package Javapedia;

import java.util.Arrays;
import java.util.Scanner;

public class Javapedia {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("**********JavaPedia**********");
    System.out.println("How many historical figures will you register?");
    int figures = scan.nextInt();
    String[][] database = new String[figures][3];

    for (int i = 0; i < database.length; i++) {
      System.out.println("\nFigure " + (i + 1));
      for (int j = 0; j < database[i].length; j++) {
        switch (j) {
          case 0:
            System.out.print("\tName: ");
            database[i][j] = scan.next();
            break;
          case 1:
            System.out.print("\tDate of birth: ");
            database[i][j] = scan.next();
            break;
          case 2:
            System.out.print("\tOccupation: ");
            database[i][j] = scan.next();
            break;
          default:
            break;
        }

      }

    }
    scan.close();

    print2DArray(database);
  }

  public static void print2DArray(String[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.print("\n");
    }

  }

}
