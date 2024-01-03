//4.A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
// We have to print the money deposited by him in a particular bank.
//Create a class 'Bank' with a method 'getBalance' which returns 0.
// Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance'
// which returns the amount deposited in that particular bank.
// Call the method 'getBalance' by the object of each of the three banks.
package mypack.example;
public class Bank {
    int deposit;
    public Bank(){

    }
    public int getBalance() {
        return 0;
    }
    public static void main(String[] args){
   Bank_A A=new Bank_A();
   A.getBalance();
        Bank_B B=new Bank_B();
        B.getBalance();
        Bank_C C=new Bank_C();
        C.getBalance();
    }
    }
    class Bank_A extends Bank{
    public Bank_A(){
    }
    public int getBalance(){ //Method overridden
        deposit=1000;
        System.out.println("A boy has his money deposited in banks-Bank A"+" "+deposit);
        return deposit;
    }
}
class Bank_B extends Bank{
    public Bank_B(){
    }
    public int getBalance(){  //method overriding
        deposit=1500;
        System.out.println("A boy has his money deposited in banks-Bank B"+" "+deposit);
        return deposit;
    }
}
class Bank_C extends Bank{
    public Bank_C(){
    }
    public int  getBalance(){
        deposit=1500;
        System.out.println("A boy has his money deposited in banks-Bank C"+" "+deposit);
        return deposit;

    }
}
