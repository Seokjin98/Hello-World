public class Guessing {
  public static void main(String[] args) {
    for (int x = 1; x <= 35; x++) {   
    int guess = x;   
      if (guess < 20) {
        System.out.println("You lose, try again!");  
      } else if (guess <= 29) {
        System.out.println("You are getting closer!");
      } else if (guess < 25) {
        System.out.println("Keep guessing!");
      } else if (guess == 30) {
        System.out.println("You guessed right!");
      } else {
        System.out.println("Give up...");
      }
    }
  }
}