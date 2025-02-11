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
      forLoop f = new forLoop();
      f.loop(symptoms, viruses, correctAnswers, score);

        System.out.println("Game Over! Your score: " + score + "/" + symptoms.length);
        scanner.close();
    }
}
