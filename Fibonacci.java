import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter no of terms you want to print :");
            int num = scanner.nextInt();
            int[] arr = new int[num];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            for (int i:arr) {
                System.out.print(i);
                System.out.print(",");
            }
        }
    }

