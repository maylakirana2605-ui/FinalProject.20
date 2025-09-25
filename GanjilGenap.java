import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println(number + "adalah bilangan genap");
        }
        else {
             System.out.println(number + "adalah bilangan ganjil");
        }

    }
    
}
