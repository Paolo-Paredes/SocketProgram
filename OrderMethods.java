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
    or.setChickenTotalPrice(getChickenTotalPrice() + toAdd);
    UpdatTotalPriceAdd(toAdd,or);
  }

  public void AddBeef(Order or,Scanner in)
  {
    int toAdd = 0;

    System.out.println("Enter Amount");
    int amount = in.nextInt();
    or.setBeefAmount(or.getBeefAmount() + amount);

    toAdd = amount * 25;
    UpdatTotalPriceAdd(toAdd,or);
  }

  public void DeleteItem()//Rapha
  {

  }

  public int UpdatTotalPriceAdd(int toAdd, Order or)
  {
    or.setTotalPrice(or.getTotalPrice() + toAdd)
  }

  public void UpdatTotalPriceDeduct()//Rapha
  {

  }
}
