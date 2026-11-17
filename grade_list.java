import java.util.Scanner;

public class DSA_Activity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data Structure: Array - 5 ka grades
        int[] grades = new int[5];

        System.out.println("Enter 5 grades:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        // Algorithm: Pangita highest ug lowest
        int highest = grades[0];
        int lowest = grades[0];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
            sum = sum + grades[i];
        }

        double average = (double) sum / 5;

        System.out.println("\n--- Result ---");
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Average: " + average);

        input.close();
    }
}
