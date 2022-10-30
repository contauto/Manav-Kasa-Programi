import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double ucret=0;
        Scanner scanner=new Scanner(System.in);
        String[] meyveler={"Armut","Elma","Domates","Muz","Patlican"};
        double[] kgFiyatları={2.14,3.67,1.11,0.95,5.00};
        double[] kacKilo={0,0,0,0,0};
        for (int i=0;i< meyveler.length;i++) {
            System.out.println(meyveler[i]+" Kaç Kilo ? : ");
            kacKilo[i]=scanner.nextDouble();
            ucret=ucret+kacKilo[i]*kgFiyatları[i];
        }
        System.out.println("Toplam Tutar : "+ucret);
    }
}
