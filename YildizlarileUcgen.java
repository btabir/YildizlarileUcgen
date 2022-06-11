package Hesaplamalar;

import java.util.Scanner;

public class YildizlarileUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space1 = 1; space1 <= (n - i); space1++) {
                System.out.print(" ");
            }
            for (int star1 = 1; star1 <= (2 * i) - 1; star1++) {
                System.out.print("*");
            }
            System.out.println();
            }
        for (int i=1;i<=n;i++){
            for (int space2=1; space2<=i;space2++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

