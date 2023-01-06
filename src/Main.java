import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1- Toplama\n" +
                "2- Çıkarma\n" +
                "3- Çarpma\n" +
                "4- Bölme");
        System.out.print("İşlem seçiniz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama işlemi sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu : " + (n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez...");
                        break;
                    default:
                        System.out.println("Bölme işlemi sonucu : " + (n1 / n2));
                        break;
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçtiniz...");
        }

    }
}
