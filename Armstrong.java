import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number till you want to print the armstrong number :");
        int till=sc.nextInt();
        for(int i=0;i<=till;i++){
            if(check(i)){
                System.out.print(i);
                System.out.print(",");
            }
        }

    }
    public static boolean check(int num){
        int temp=0;
        int i=num;
        while (i>0){
            temp=(i%10)*(i%10)*(i%10)+temp;
            i=i/10;
        }
        if(temp==num)
            return true;
        else return false;
    }
}
