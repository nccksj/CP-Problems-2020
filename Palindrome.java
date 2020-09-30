import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the no to check palindrome :");
        String s=scanner.nextLine();
        if(checkPalindrome(s))
            System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean checkPalindrome(String num){
        int length=num.length();
        int i;
        for (i=0;i<length-i;i++){
            if(num.charAt(i)!=num.charAt(length-i-1))
                return false;
        }
        return true;
    }
}

