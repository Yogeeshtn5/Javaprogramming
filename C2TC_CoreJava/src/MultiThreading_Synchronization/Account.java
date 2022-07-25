package MultiThreading_Synchronization;

public class Account {

	static int Balance=10000;
	public static void main(String[] args) {
		AClass oa=new AClass();
		
		DepositThread dt1=new DepositThread(oa, 5000,"First");
		DepositThread dt2=new DepositThread(oa, 4000,"Second");
		WithdrawThread wt1=new WithdrawThread(oa, 2000, "First");
		WithdrawThread wt2=new WithdrawThread(oa, 1000, "Second");
		dt1.start();
		dt2.start();
		wt1.start();
		wt2.start();
		try
        {
        dt1.join();
        dt2.join();
        wt1.join();
        wt2.join();
        }
        catch(Exception e)
        {
        }
System.out.println("Total balance is: "+Balance);
	}

}