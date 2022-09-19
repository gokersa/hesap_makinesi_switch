

import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        System.out.print("İlk sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        n2 = input.nextInt();
        System.out.print(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme\n ");
        System.out.print("Seçiminiz:");

        select = input.nextInt();

        switch (select) {

            case 1:

                System.out.print("Toplam:"+ (n1+n2));

                break;

            case 2:

                System.out.print("Çıkarma:" + (n1-n2));

                break;
            case 3:

                System.out.print("Çarpma:"+ (n1*n2));

                break;
            case 4:

                if (n2!=0){
                System.out.print("Bölme:" + (n1/n2)); }
                else {
                System.out.print("Sıfıra bölünemez");
                }

                break;

            default:

                System.out.print("Girdiğiniz değerlere göre işlem yapılamaz!");



        }

    }
}
