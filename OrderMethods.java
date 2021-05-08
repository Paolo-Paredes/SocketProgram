import java.util.Scanner;

public class OrderMethods
{
    public void AddChicken(Order or,Scanner in)
    {
        int toAdd = 0;

        System.out.println("Enter Amount");
        int amount = in.nextInt();

        or.setChickenAmount(or.getChickenAmount() + amount);

        toAdd = amount * 20;
        or.setChickenTotalPrice(or.getChickenTotalPrice() + toAdd);
        UpdatTotalPriceAdd(toAdd,or);
    }

    public void AddBeef(Order or,Scanner in)
    {
        int toAdd = 0;

        System.out.println("Enter Amount");
        int amount = in.nextInt();

        or.setBeefAmount(or.getBeefAmount() + amount);

        toAdd = amount * 25;
        or.setBeefTotalPrice(or.getBeefTotalPrice() + toAdd);
        UpdatTotalPriceAdd(toAdd,or);
    }

    public void DeleteChicken(Order or,Scanner in)//Rapha
    {
        int toDel = 0;

        System.out.println("Enter Amount");
        int amount = in.nextInt();

        or.setChickenTotalPrice(or.getChickenTotalPrice() - toDel);
        UpdatTotalPriceDeduct(toDel,or);

    }

    public void DeleteBeef(Order or,Scanner in)//Rapha
    {
        int toDel = 0;

        System.out.println("Enter Amount");
        int amount = in.nextInt();

        or.setBeefTotalPrice(or.getBeefTotalPrice() - toDel);
        UpdatTotalPriceDeduct(toDel,or);


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
            System.out.println("Chicken " + or.getChickenAmount() + " " + or.getChickenTotalPrice());

        if(or.getBeefAmount()>0)
            System.out.println("Beef " + or.getBeefAmount() + " " + or.getBeefTotalPrice());

        System.out.println();
        System.out.println("Total Price: " + or.getTotalPrice());
        System.out.println();

        System.out.print("Enter to Continue... ");
        String temp = in.nextLine();
    }

}
