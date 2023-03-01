import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double alis, satis,kdv1=0.18,kdv2=0.08;


        Scanner inp = new Scanner(System.in);

        System.out.print("Alış fiyatını Girin :");
        alis = inp.nextDouble();

        if (alis <= 1000) {
            System.out.println("KDV Tutarınız %18");
            satis=alis*kdv1;
            satis=(alis*kdv1)+alis;
            System.out.println("KDV dahil satış fiyatınız :"+satis);

        }
        else
        {
            System.out.println("KDV Turarınız %8");
            satis=kdv2*alis;
            satis=(alis*kdv2)+alis;
            System.out.println("KDV dahil satış fiyatınız :"+satis);

        }







    }
}