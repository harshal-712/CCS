import java.util.Scanner;

public class Diffie {
    public static boolean isPrime(int a) {
        if (a <= 1) return false;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Prime number: ");
        int num = sc.nextInt();
        
        if (!isPrime(num)) {
            System.out.println("You have not entered a prime number");
            return;
        }
        System.out.println("You entered a prime number: " + num);
        System.out.println("Enter Primitive Root:");
        int PR = sc.nextInt();
        System.out.println("Primitive root is:"+PR);
        System.out.println("Enter Private key for user A:");
        int PK1 = sc.nextInt();
        System.out.println("Private key for user A is:"+PK1);
        System.out.println("Enter Private key for user B:");
        int PK2 = sc.nextInt();
        System.out.println("Private key for user B is:"+PK2);
        int yA= (int) Math.pow(PR,PK1)%num;
    System.out.println("Public Key for User A:"+ yA);

    int yB = (int) Math.pow(PR, PK2)%num;
    System.out.println("Public Key for User B:"+ yB);

    int K_ab1 = (int) Math.pow(yB, PK1)%num;
    int K_ab2 = (int) Math.pow(yA, PK2)%num;

    System.out.println("Secret Key for User A:"+K_ab1);
    System.out.println("Secret Kay for User B:"+K_ab2);
    }
}