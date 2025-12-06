import java.util.Scanner;

class 301{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();
        
        if(num==0){
            System.out.println("This is Zero number. ");
        }
        else{
            String evenOdd = (num %2 == 0) ? "Even" : "Odd";

            String posNeg = (num > 0) ? "Positive" : "Negative";

            System.out.println("This number is " + evenOdd + " and " + posNeg + " number. ");
        }
        
    }
}
