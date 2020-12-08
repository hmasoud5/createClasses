class Main {
  public static void main(String[] args) {
    // create object from Sum class
    Sum s = new Sum(12, 13);
    // two variables that will add to eachother
    // must add new variable "s"

    System.out.println(s.sumOf());
    // will print out 25 because it is added from the Sum.java class
    // new variable "s" included within print statement

    Subtract m = new Subtract(14, 16);
    // two variables that will subtract to eachother
    // new variable "m"

    System.out.println(m.SubtractOf());
    // will print out -2 because it is subtracted from one another
    // new variable "m"included within print statement

    Divide d = new Divide(25, 5);
    // two variables that will divide to eachother
    // new variable "d"

    System.out.println(d.DivideOf());
    // will print out 5 because it is divided from one another
    // new variable "d" will be added within print statement

    Multiply c = new Multiply(6, 3);
    // two variables that will multiply to eachtoher
    // new variable "c"

    System.out.println(c.MultiplyOf());
    // will print out 18 because those two variables will multiply
    // new variable "c" must be within print statement
  }
  // create another class (in another file)
  // call that class Subtract and have it
  // Subtract 1 number from another
}
