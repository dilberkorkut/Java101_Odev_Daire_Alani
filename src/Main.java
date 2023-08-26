import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, alpha ;
        double pi =3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz:" );
        r = input.nextInt();
        System.out.print("Merkez acinin olcusunu giriniz: ");
        alpha = input.nextInt();

        double alan = (pi * (r*r) * alpha ) / 360;
        System.out.println( "Daire diliminin alani: " + alan );


    }
}