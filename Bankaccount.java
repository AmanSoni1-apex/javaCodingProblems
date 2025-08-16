public class Bankaccount {

    private int balance;

    public Bankaccount(int balance)
    {
        if(balance>0)
        {
            this.balance=balance;
        }
    }

    public int getbalance()
    {
        return balance;
    }

    public int deposit(int amount){
        if(amount>0)
        {
            balance+=amount;
        }
        else{
            System.out.println("Invalid amount");
        }
        return 0;
    }

    public int withdraw(int amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
        }
        else{
            System.out.println("Invalid amount waa entered");
        }

        return 0;
    }
    public static void main(String[] args) {
        
        Bankaccount account = new Bankaccount(5000);
        System.out.println(account.getbalance());

        System.out.println(account.deposit(1000));

        System.out.println(account.getbalance());

        System.out.println(account.withdraw(2500));

        System.out.println(account.getbalance());
    }
}