import java.util.Scanner;
public class whilen {
    public static void main(String[] args) {
        int n,i=1;
        Scanner sk=new Scanner(System.in);
        System.out.println("HOW MANY DOLLARS DO YOU WANT");
        n=sk.nextInt();
        while (i<=n){

            System.out.println("$");
             i++;
        }
    }
}
