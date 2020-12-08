class Main {
  public static void main(String[] args) {
    // create object from Sum class
    Sum s = new Sum(12, 13);

    System.out.println(s.sumOf());

    Subtract m = new Subtract(14, 16);

    System.out.println(m.SubtractOf());

    Divide d = new Divide(25, 5);

    System.out.println(d.DivideOf());

    Multiply c = new Multiply(6, 3);

    System.out.println(c.MultiplyOf());
  }
  // create another class (in another file)
  // call that class Subtract and have it
  // Subtract 1 number from another
}
