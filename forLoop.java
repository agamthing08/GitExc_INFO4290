import java.util.Scanner;

public class forLoop {
    
        Scanner scanner = new Scanner(System.in);
    
        public void loop (String symptoms[], String viruses [], char correctAnswers[], int score) {
    
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
        }
    
    
    }
