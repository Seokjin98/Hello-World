public class Hourglass {
  public static void main(String[] args) {
    for (int x = 1; x <= 1; x++) {
      if (x > 0) {
        drawhourglass();      
      } else {
        System.out.println("Nope");
      }
    }
  }
  
  public static void drawhourglass() {
    drawline();
    drawtop();
    drawbottom();
    drawline();
  }
  
  public static void drawline() {
    System.out.println("+------+");
  }
  
  public static void drawtop() {
    System.out.println("|\\..../|");
    System.out.println("| \\../ |");
    System.out.println("|  \\/  |");
  }
  
  public static void drawbottom() {
    System.out.println("|  /\\  |");
    System.out.println("| /..\\ |");
    System.out.println("|/....\\|");
  }
}
