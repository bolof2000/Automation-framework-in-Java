package roughwork;


/*

Encapsulation :  Data hiding / wrapping data and methods in single unit

Data Hiding: hiding data from outside world so that they are not able to modify your data
Escapulation means makes a way to hide your data from outside world, always create create your instant variable as
private and your methods as public.



 */

public class Test {

    public int accountNumber = 123456;
    public int pinNo = 12345;
    public double balanceAmount = 100000;

    //This instance variable are accessible anywhere since they are declared public


    public void withdrawAmount(int acctNum,int pin,int amount){

        // some validation before customer can withdraw funds

        if(acctNum==accountNumber && pin ==pinNo){

            if(amount<=balanceAmount){

                //
            }
            else{

                System.out.println("insufficient ammount");
            }


        }
        else {

            System.out.println("Invalid credentials");
        }
    }

}
