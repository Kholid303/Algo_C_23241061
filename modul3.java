import java.util.Scanner;
public class modul3 {

  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    int tinggi_segitiga,a,b;

    System.out.print("Masukan tinggi segitiga: ");
    tinggi_segitiga = input.nextInt();

    System.out.println();

    for(a=1; a<=tinggi_segitiga; a++) {
      for(b=1; b<=a; b++) {
        System.out.print(" *");
      }
      System.out.println();
    }

  }
}