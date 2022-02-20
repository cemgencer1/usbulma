import java.util.Scanner;
public class usbulma {
    public static void main(String[]args){
        int p,k;
        int sonuc=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Üssü alınacak sayı :");
        p= inp.nextInt();
        System.out.print("Üs Olacak Sayı :");
        k= inp.nextInt();

        for ( int i =1;i<=k;i++){
            sonuc*=p;
            
        }
        
        System.out.print("Sonuç :" + sonuc);
    }
}
