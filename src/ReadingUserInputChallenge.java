import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            System.out.println("Enter number #" + (count + 1) + ":");
            boolean hasNext = scanner.hasNextInt();

            if (hasNext) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("Sum all numbers is " + sum);
        scanner.close();
    }
}
