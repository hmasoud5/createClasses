public class Sum 
{
//attributes--variables
//these int numbers could only be private to the Sum class
private int num1;
private int num2;


//constructor --assigns
//will be assigned to main class 
public Sum(int number1, int number2)
{
 num1 = number1;
 num2 = number2;
 //number1 number2 will be assigned to main class
}

//behaviors--methods
public int sumOf()
{
 return num1 + num2; 
  //num1 added by num2
 }
}