package Giris;
import java.util.Scanner;
import java.util.*;
public class kdvProgrami {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Kdvsiz Fiyat giriniz : ");
        double kdvsizFiyat = input.nextInt();

        double kdvOrani1=0.18;
        double kdvOrani2=0.08;

        double kdvliFiyat;
        if(kdvsizFiyat>=1000){
            kdvliFiyat=(((kdvsizFiyat)+(kdvsizFiyat)*kdvOrani1));
            System.out.print("Kdvli Fiyatı:"+(kdvliFiyat));
        }
        else if(kdvsizFiyat<1000)
        {
            kdvliFiyat=(((kdvsizFiyat)+(kdvsizFiyat)*kdvOrani2));
            System.out.print("Kdvli Fiyatı:"+(kdvliFiyat));
        }
        else
        {
            System.out.print("Sonuç hatalıdır...");
        }



    }


}
