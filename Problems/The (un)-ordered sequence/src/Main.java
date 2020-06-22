import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int orderAsc = 0;
        int orderDesc = 0;
        boolean isDesc = true;
        boolean isAsc = true;

        int number = scanner.nextInt();
        orderAsc = number;
        orderDesc = number;
        while (scanner.hasNext()) {

            int numberNext = scanner.nextInt();

            if (numberNext == 0) {
                break;
            }
            if (numberNext >= orderAsc) {
                orderAsc = numberNext;
                isDesc = false;
            } else if (numberNext <= orderDesc) {
                orderDesc = numberNext;
                isAsc = false;
            } else {
                isAsc = false;
                isDesc = false;
            }
        }
        System.out.println(isAsc || isDesc);
    }
}