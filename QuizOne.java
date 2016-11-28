import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        System.out.println("Enter Start to begin.");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String dialogue = scanner.nextLine();
            dialogue = dialogue.toUpperCase();
            int close = 0;
            switch (dialogue) {
                case "START":
                    System.out.println("Hello");
                    System.out.println("How are you?");
                    System.out.println("Let's begin!");
                    System.out.println("What is the capitol city of Washington State?");
                    break;
                case "OLYMPIA":
                    System.out.println("Correct!");
                    panel.clear();
                    for (int k = 0; k < 150; k++) {
                        g.setColor(Color.GREEN);
                        g.fillOval(80 + k, (120 + k), 40, 40);
                        panel.sleep(10);
                    }
                    for (int j = 150; j < 350; j++) {
                        g.setColor(Color.GREEN);
                        g.fillOval(80 + j, (420 - j), 40, 40);
                        panel.sleep(10);
                    }
                    break;
                default :
                    System.out.println("Wrong! Guess again!");
                    panel.clear();
                    for (int l = 1; l < 300; l++) {
                        g.setColor(Color.RED);
                        g.fillOval(80 + l, (100 + l), 40, 40);
                        panel.sleep(10);
                    }

                    for (int i = 300; i > 1; i--) {
                        g.setColor(Color.RED);
                        g.fillOval(80 + i, (400 - i), 40, 40);
                        panel.sleep(10);
                    }
                    break;
            }
        }
    }
}