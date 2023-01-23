import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(sayiAsalMi());
        System.out.println(mukemmelSayiKontrol());
        System.out.println(arkadasSayiKontrol());
    }

    static boolean sayiAsalMi(){
        System.out.println("# Asal sayi kontrolu #");
        System.out.print("# Sayi giriniz: ");
        int num=scanner.nextInt();
        if (num<=0){
            return false;
        }else if(num==1){
            return true;
        }else{
            for(int i=2;i<num;i++){
                if (num%i==0){
                    return false;
                }
            }
            return true;
        }

    }

    static boolean mukemmelSayiKontrol(){
        System.out.println("# Mukemmel sayi kontrolu #");
        System.out.println("# Sayi giriniz: ");
        int num=scanner.nextInt();
        int toplam=0;
        if(num<=0){
            return false;
        }
        for(int i=1;i<num;i++){
            if(num%i==0){
                toplam+=i;
            }
        }
        if (toplam==num)
            return true;
        return false;
    }

    static boolean arkadasSayiKontrol(){
        System.out.println("# Arkadas sayi kontrolu #");
        System.out.print("# 1. Sayiyi giriniz: ");
        int num=scanner.nextInt();
        System.out.print("# 2. Sayiyi giriniz: ");
        int num2=scanner.nextInt();
        int num_sum=0,num2_sum=0;
        if(num<=0||num2<=0)
            return false;
        for (int i=1;i<num;i++){
            if (num%i==0)
                num_sum+=i;
        }
        for (int i=1;i<num2;i++){
            if (num2%i==0)
                num2_sum+=i;
        }
        if(num2==num_sum&&num==num2_sum)
            return true;
        else
            return false;
    }
}
