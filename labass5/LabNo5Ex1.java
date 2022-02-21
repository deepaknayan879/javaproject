import java.util.Scanner;
public class LabNo5Ex1 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("enter the age");
int age = s.nextInt();
try {
   if(age < 15) 
    throw new AgeException("you are small");
   else
    System.out.println("you are young");
  }
  catch(AgeException ag) {
   System.out.println(ag);
 }}}