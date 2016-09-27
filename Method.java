public class Method {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
    for (int x = 1; x <= 6; x++) {
      for (int y = 1; y <= x; y++) {
        System.out.print("*");
      }
      System.out.println();
      }
    }
  }
}