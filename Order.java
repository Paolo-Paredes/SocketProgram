public class Order
{
    int c_amount = 0;
    int b_amount = 0;
    int c_price = 0;
    int b_price = 0;
    int total_price = 0;

    public int getChickenAmount()
    {
        return c_amount;
    }

    public int getBeefAmount()
    {
        return b_amount;
    }

    public int getChickenTotalPrice()
    {
        return c_price;
    }

    public int getBeefTotalPrice()
    {
        return b_price;
    }

    public int getTotalPrice()
    {
        return total_price;
    }

    public void setChickenAmount(int c_amount)
    {
        this.c_amount = c_amount;
    }

    public void setBeefAmount(int b_amount)
    {
        this.b_amount = b_amount;
    }

    public void setChickenTotalPrice(int c_price)
    {
        this.c_price = c_price;
    }

    public void setBeefTotalPrice(int b_price)
    {
        this.b_price = b_price;
    }

    public void setTotalPrice(int total_price)
    {
        this.total_price = total_price;
    }

}
