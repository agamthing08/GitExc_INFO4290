import java.util.Scanner;

public class VirusDiagnosisGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Symptoms of the robot
        String[] symptoms = {
            "Robot is sending spam emails.",
            "Robot's screen is displaying random pop-ups.",
            "Robot is running very slowly.",
            "Robot's files are being encrypted."
        };

        // Possible viruses
        String[] viruses = {
            "A. Trojan Horse",
            "B. Adware",
            "C. Ransomware",
            "D. Worm"
        };

        // Correct answers for each symptom
        char[] correctAnswers = {'D', 'B', 'A', 'C'};

        System.out.println("Welcome to the Virus Diagnosis Game!");
        System.out.println("Identify the virus based on the robot's symptoms.\n");

        int score = 0;

        // Loop through each symptom
        for (int i = 0; i < symptoms.length; i++) {
            System.out.println("Symptom: " + symptoms[i]);
            for (String virus : viruses) {
                System.out.println(virus);
            }
            System.out.print("Choose the correct virus (A, B, C, or D): ");
            char answer = scanner.next().toUpperCase().charAt(0);

            if (answer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + correctAnswers[i] + ".\n");
            }
        }

        System.out.println("Game Over! Your score: " + score + "/" + symptoms.length);
        scanner.close();
    }
}