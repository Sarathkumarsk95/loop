import java.util.Scanner;
public class dowhilee {
    public static void main(String[] args) {
        int n,i=1;
        Scanner sk=new Scanner(System.in);
        System.out.println("ENTER NO OF DOLLARS");
        n= sk.nextInt();
        do {
            System.out.println("$");
            i++;
        }while (i<=n);

    }

}
