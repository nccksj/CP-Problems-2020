import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get factorial of it :");
        int num = sc.nextInt();
        System.out.println(getfact(num));
    }

    public static int getfact(int num) {
        if (num == 1 || num == 0)
            return 1;
        else return num * getfact(num - 1);
    }
}
