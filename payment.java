class payment {

    void processpayment()
    {
        System.out.println("Your payment has been processed ");
    }
    public static void main(String[] args) {
        payment p1=new payment();
        p1=new Debitcardpayment();
        p1.processpayment();
    }
}
class Creditpayment extends payment{
    @Override
    void processpayment()
    {
        System.out.println("Your credit card payment has been processed ");
    }
}
class Debitcardpayment extends payment{

    @Override
    void processpayment()
    {
        System.out.println("Your debit card payment has been processed ");
    }
}