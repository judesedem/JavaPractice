public class BankAccount {
    private double balance;
    

    public void deposit(double money){
       if (money>0){
        balance+=money;
        System.out.println("You have deposited "+money+" in your account");
        System.out.println("Your current balance is "+balance);
       }
       else{
        System.out.println("Input valid amount!!");
       }
    }

   public void withdraw(double money){
        if (money>0 && money<=balance){
            balance-=money;
            System.out.println("You've withdrawn "+money);
            System.out.println("You current balance is "+balance);
        }
        else{
            System.out.println("Input a valid amount");
            System.out.println("You might have insufficient cash to complete transaction");
        }
    }
   
    public double getBalance(){
        return balance;
    }
    
}
