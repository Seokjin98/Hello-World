public class Precedence {
  public static void main(String[] args) { integers() ; }
  public static void integers() {
    System.out.print("2a: expected: 14 got: ");
    System.out.println(2 + 3 * 4 - 6);
    
    System.out.print("21: expected: 5 got: ");
    System.out.println(6 / 2 + 7 / 3);
  }
}
