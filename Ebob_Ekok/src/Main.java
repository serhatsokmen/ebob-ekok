import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1,n2,ekok=1,ebob = 1, i = 1;
        System.out.print("ilk sayiyi girin : ");
        n1 = scan.nextInt();
        System.out.print("ikinci sayiyi girin : ");
        n2 = scan.nextInt();

        while(i <= n1) {

            if(n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }

            i++;
        }

        System.out.println("girilen iki sayinin ebobu : "+ebob);


        while(i <= n1*n2) {

            if(n1 % i == 0 && n2 % i == 0) {
                ekok = i;
                break;
            }

            i++;
        }

        System.out.println("girilen iki sayinin ekoku : "+ekok);
    }
}