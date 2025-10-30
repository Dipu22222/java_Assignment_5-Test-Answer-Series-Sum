import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many times you want to try: ");
        int t = input.nextInt();  

        for (int i = 1; i <= t; i++) {
            System.out.print("Enter number for case " + i + ": ");
            int n = input.nextInt();

      
            System.out.print("Series: ");
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
                if (j < n) {
                    System.out.print("+");
                }
            }

           
            int sum = (n * (n + 1)) / 2;

            System.out.println(" = " + sum);
            System.out.println("----------------------");
        }

        input.close();
    }
}
