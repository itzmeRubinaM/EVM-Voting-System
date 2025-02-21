import java.util.Scanner;

public class EVM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int candidate1 = 0, candidate2 = 0, candidate3 = 0, nota = 0;
        int choice;

        System.out.println("Electronic Voting Machine (EVM)");
        System.out.println("1. Candidate A");
        System.out.println("2. Candidate B");
        System.out.println("3. Candidate C");
        System.out.println("4. NOTA");
        System.out.println("Enter 0 to stop voting.");

        while (true) {
            System.out.print("Enter your vote (1-4, 0 to stop): ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1 -> candidate1++;
                case 2 -> candidate2++;
                case 3 -> candidate3++;
                case 4 -> nota++;
                default -> System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();

        System.out.println("\nElection Results:");
        System.out.println("Candidate A: " + candidate1 + " votes");
        System.out.println("Candidate B: " + candidate2 + " votes");
        System.out.println("Candidate C: " + candidate3 + " votes");
        System.out.println("NOTA: " + nota + " votes");

        int maxVotes = Math.max(candidate1, Math.max(candidate2, candidate3));
        if (maxVotes == candidate1 && maxVotes == candidate2 && maxVotes == candidate3) {
            System.out.println("It's a tie between all candidates.");
        } else if (maxVotes == candidate1 && maxVotes == candidate2) {
            System.out.println("It's a tie between Candidate A and Candidate B.");
        } else if (maxVotes == candidate1 && maxVotes == candidate3) {
            System.out.println("It's a tie between Candidate A and Candidate C.");
        } else if (maxVotes == candidate2 && maxVotes == candidate3) {
            System.out.println("It's a tie between Candidate B and Candidate C.");
        } else if (maxVotes == candidate1) {
            System.out.println("Winner: Candidate A");
        } else if (maxVotes == candidate2) {
            System.out.println("Winner: Candidate B");
        } else if (maxVotes == candidate3) {
            System.out.println("Winner: Candidate C");
        } else {
            System.out.println("No winner.");
        }
    }
}