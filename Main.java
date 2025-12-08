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

import java.util.Scanner;

class 305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first  number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        int start = first;
        int end = second;

        if (first > second) {
            start = second;
            end = first;
        }


        // แสดงผลลัพธ์ชุดแรก
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // ขึ้นบรรทัดใหม่

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }
}

