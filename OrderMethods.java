import java.util.Scanner;
import java.io.*;

public class OrderMethods
{
    public void AddChicken(PrintWriter pw, InputStreamReader isr, BufferedReader br,Order or,Scanner in)
    {
        int toAdd = 0;

        System.out.println("Enter Amount");
        int amount = in.nextInt();

        or.setChickenAmount(or.getChickenAmount() + amount);

        toAdd = amount * 20;
        or.setChickenTotalPrice(or.getChickenTotalPrice() + toAdd);
        UpdatTotalPriceAdd(toAdd,or);
        pw.println(or.getChickenAmount() + "x Chicken has been added!");
        pw.flush();
    }

    public void AddBeef(PrintWriter pw, InputStreamReader isr, BufferedReader br,Order or,Scanner in)
    {
        int toAdd = 0;

        System.out.println("Enter Amount");
        int amount = in.nextInt();

        or.setBeefAmount(or.getBeefAmount() + amount);

        toAdd = amount * 25;
        or.setBeefTotalPrice(or.getBeefTotalPrice() + toAdd);
        UpdatTotalPriceAdd(toAdd,or);
        pw.println(or.getBeefAmount() + "x Beef has been added!");
        pw.flush();
    }

    public void DeleteChicken(PrintWriter pw, InputStreamReader isr, BufferedReader br,Order or,Scanner in)//Rapha
    {
        int toDel = 0;

        System.out.println("Enter Amount");
        int amount = in.nextInt();
        int temp = or.getChickenAmount() - amount;

        if(temp>0)
        {
          or.setChickenAmount(or.getChickenAmount() - amount);

          or.setChickenTotalPrice(or.getChickenTotalPrice() - toDel);
          UpdatTotalPriceDeduct(toDel,or);
          pw.println(amount + "x Chicken has been Deleted!");
          pw.flush();
        }

        else if(temp<0)
        {
          System.out.println("Amount is already empty!");
        }
    }

    public void DeleteBeef(PrintWriter pw, InputStreamReader isr, BufferedReader br,Order or,Scanner in)//Rapha
    {
        int toDel = 0;

        System.out.println("Enter Amount");
        int amount = in.nextInt();
        int temp = or.getBeefAmount() - amount;

        if(temp>0)
        {
          or.setBeefAmount(or.getBeefAmount() - amount);

          or.setBeefTotalPrice(or.getBeefTotalPrice() - toDel);
          UpdatTotalPriceDeduct(toDel,or);
          pw.println(amount + "x Beef has been Deleted!");
          pw.flush();
        }

        else if(temp<0)
        {
          System.out.println("Amount is already empty!");
        }

    }

    public int UpdatTotalPriceAdd(int toAdd, Order or)
    {
        int sum = 0;
        or.setTotalPrice(or.getTotalPrice() + toAdd);
        sum = or.getTotalPrice() + toAdd;

        return sum;
    }

    public int UpdatTotalPriceDeduct(int toDel, Order or)//Rapha
    {
        int dif = 0;
        or.setTotalPrice(or.getTotalPrice() - toDel);
        dif = or.getTotalPrice() + toDel;

        return dif;

    }

    public void checkOrder(Order or, Scanner in)
    {
        System.out.println();

        if(or.getChickenAmount()>0)
            System.out.println("Chicken x" + or.getChickenAmount() + " " + or.getChickenTotalPrice());

        if(or.getBeefAmount()>0)
            System.out.println("Beef x" + or.getBeefAmount() + " " + or.getBeefTotalPrice());

        System.out.println();
        System.out.println("Total Price: " + or.getTotalPrice());
        System.out.println();
    }

}
