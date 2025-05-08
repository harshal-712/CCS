import java.util.Scanner;

public class RSA {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int M= 5;
        int temp=M;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two prime numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        if (!isPrime(num1) || !isPrime(num2)) {
            System.out.println("You have not entered prime numbers");
            return;
        }

        System.out.println("You entered prime numbers: " + num1 + " and " + num2);
        System.out.println("You entered numbers: " + num1 + " and " + num2);
        System.out.println("Encrypted message is:"+M);
        int n= num1 * num2;
        System.out.println("Value of n is:"+n);
        int e = 7;
        System.out.println("Value of e is:"+e);
        int fi =(num1 - 1) * (num2 - 1);
        System.out.println("Value of fi is:"+fi);
        int d=0;
        for (int i=1; ; i++){
            if((fi*i)/e==0){
            d=((fi*i)+1)/e;
            break;
        }
    }
    for(int j=1;j<e;++j){
        M*=temp;
    }
    int c=M%n;
    System.out.println("Decrypted Message is:"+c);
}
}