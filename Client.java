import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Client
{

    public static void main(String[] args) throws IOException
    {
        Socket s = new Socket("localhost", 4999);
        Scanner in = new Scanner(System.in);
        Order or = new Order();
        OrderMethods method = new OrderMethods();
        String str = "Client: ";

        Random rand = new Random();
        int upperbound = 1000;
        int maxTime = 60;

        int id = rand.nextInt(upperbound);
        int time = rand.nextInt(maxTime);

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
                SetOrderMenu(pw,isr,br,in,or,method,id,time);
            }

            else if(choice!=1 && choice!=2)
            {
                System.out.println("Invalid Choice");
            }
        }
        pw.println("Client: Terminate System");
        pw.flush();

        System.out.println("Client: Disconnected");

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


    public static void SetOrderMenu(PrintWriter pw, InputStreamReader isr, BufferedReader br, Scanner in, Order or, OrderMethods method, int id, int time)
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


            if(choice==1)
            {
                AddItemMenu(pw,isr,br,in,or,method);
            }

            if(choice==2)
            {
                DelItemMenu(pw, isr, br, in, or, method);
            }

            if(choice==3){
                method.checkOrder(or,in);}

            if(choice==4)
                break;

        }

        if(or.getChickenAmount() > 0 && or.getBeefAmount() > 0)
        System.out.println();
        System.out.println();
        System.out.println("Order Details");
        System.out.println("-------------------------------");
        System.out.println("Order ID: " + "202100" + id );
        System.out.println("Estimated Time: " + time + " minutes");
        System.out.println("-------------------------------");
        method.checkOrder(or,in);
        System.out.println("-------------------------------");
        System.out.println();
    }


    public static void AddItemMenu(PrintWriter pw, InputStreamReader isr, BufferedReader br, Scanner in, Order or, OrderMethods method)
    {
        //Add Multiple Orders - izz done
        //Add Price - izz done
        int choice = 0;

        while(choice!=3)
        {
            System.out.println();
            System.out.println("Food Choices:");
            System.out.println();
            System.out.println("1.) Chicken - 20Php");
            System.out.println("2.) Beef - 25Php");
            System.out.println("3.) Back");
            System.out.println();
            System.out.print("Enter Choice.. ");

            choice = in.nextInt();

            if(choice==1)
                method.AddChicken(pw,isr,br,or,in);

            if(choice==2)
                method.AddBeef(pw,isr,br,or,in);

            if(choice==3)
                break;

            if(choice>3)
                System.out.println("Invalid Choice");
        }



    }

    public static void DelItemMenu(PrintWriter pw, InputStreamReader isr, BufferedReader br, Scanner in, Order or, OrderMethods method)
    {
        int choice = 0;

        while(choice != 3)
        {
            System.out.println();
            System.out.println("Food Choices:");
            System.out.println();
            System.out.println("1.) Chicken: " + or.getChickenAmount());
            System.out.println("2.) Beef " + or.getBeefAmount());
            System.out.println("3.) Back");
            System.out.println();
            System.out.print("Enter Choice.. ");

            choice = in.nextInt();

            if(choice == 1)
                method.DeleteChicken(pw,isr,br,or,in);

            if(choice == 2)
                method.DeleteBeef(pw,isr,br,or,in);

            if(choice == 3)
                break;

            if(choice > 3)
                System.out.println("Invalid Choice");
        }
    }


}
