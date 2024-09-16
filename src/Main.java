import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p=1,k=0;
        int m=1;
        while (m<=n){
            m=m*p;
            k+=1;

        }
        System.out.println(k+p+1);



    }
}