package edu.northeastern.ashish;

public class AddMoneyInMyBank implements Runnable{
    int salary ;

    public AddMoneyInMyBank(int salary){
        this.salary = salary;
    }

    @Override
    public void run() {
        while(true){
            synchronized (Main.lockAccount){ // Takes 1000 times more time
                Main.moneyInMyBank =  Main.moneyInMyBank +  salary;
                System.out.println(Thread.currentThread().getName() +
                        " Added money in your bank Total = " + Main.moneyInMyBank);
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
