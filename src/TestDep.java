

class Deposit
{

    static int balance=1000;
    synchronized void dep()
    {
        balance=balance+1000;
        System.out.println(balance);
    }
}

class Alpha extends Thread
{
    Deposit d;
    Alpha()
    {
        start();
    }
    public void run()
    {
        d=new Deposit();
        d.dep();

    }
}

class TestDep
{
    public static void main(String arg[])
    {
        Deposit d=new Deposit();
        Alpha x=new Alpha();
        Alpha y=new Alpha();

    }
}




