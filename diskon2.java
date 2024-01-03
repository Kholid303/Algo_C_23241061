import java.util.Scanner;
public class tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan total belanja: ");
        int totalBlanja  = scanner.nextInt();

        System.out.print("Apakah menggunakan member? (y/n)");
        char menggunakanMember = scanner.next().charAt(0);

        int diskon =0;
        if (menggunakanMember =='y') {
            if (totalBlanja > 100000 && totalBlanja <= 500000) {
                diskon = 15000;
            } else if (totalBlanja > 500000) {
                diskon = 50000;
            }
        } else {
            if (totalBlanja >100000) {
                diskon = 5000;
            }
        }
        System.out.println("Total belanja setelah diskon: " +(totalBlanja - diskon));   
    }
}
