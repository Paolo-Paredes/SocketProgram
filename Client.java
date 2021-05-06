import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client
{

 public static void main(String[] args) throws IOException
 {
   Socket s = new Socket("localhost", 4999);
   Scanner in = new Scanner(System.in);
   Order or = new Order();
   OrderMethods method = new OrderMethods();

   boolean done = false;
   int choice = 0;

     PrintWriter pw = new PrintWriter(s.getOutputStream());
     InputStreamReader isr = new InputStreamReader(s.getInputStream());
     BufferedReader br = new BufferedReader(isr);

     while(choice!=2)
     {
       Menu();
       choice = in.nextInt();

       if(choice==1)
       {
         SetOrderMenu(pw,isr,br,in,or,method);
       }

       else if(choice!=1 || choice!=2)
       {
         System.out.println("Invalid Choice");
       }
     }

   pw.close();
   in.close();
 }

 public static void Menu()
 {

     System.out.println();
     System.out.println("1.) Enter Order");
     System.out.println("2.) Quit");
     System.out.println();
     System.out.print("Enter Choice.. ");

 }


public static void SetOrderMenu(PrintWriter pw, InputStreamReader isr, BufferedReader br, Scanner in, Order or, OrderMethods method)
{
   int choice = 0;

   while(choice!=4)
   {
     System.out.println();
     System.out.println("1.) Add Items");//Paolo
     System.out.println("2.) Delete Items");//Raph
     System.out.println("3.) Check Order");//Paolo
     System.out.println("4.) Submit");

     choice = in.nextInt();

     switch(choice)
     {
       case 1:
       AddItemMenu(pw,isr,br,in,or,method);

       case 4:
       break;
     }
   }
}


 public static void AddItemMenu(PrintWriter pw, InputStreamReader isr, BufferedReader br, Scanner in, Order or, OrderMethods method)
 {
   //Add Multiple Orders - izz done
   //Add Price - izz done
   int choice = 0;

   System.out.println("Food Choices:");
   System.out.println();
   System.out.println("1.) Chicken - 20Php");
   System.out.println("2.) Beef - 25Php");
   System.out.println("3.) Cancel");
   System.out.println();
   System.out.print("Enter Choice.. ");

   switch(choice)
   {
     case 1:
     method.AddChicken(or,in);

     case 3:
     break;
   }

 }


 public static void DeleteItem()
 {

 }



}
