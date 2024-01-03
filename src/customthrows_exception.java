public class customthrows_exception {
    public static void main (String[]a){
        exceptions ee = new exceptions();
        //it depends upon on me write or not try and catch not necessary
        try {
            ee.eligibilty_vote(20);
        } catch (Exception e) {

            System.out.println("Eligible for vote");
        } finally {
            System.out.println("You are not Eligible for vote");
            System.out.println("Eligible for vote");
        }
    }
}
class AgeException extends Exception{
    public AgeException(String s){
        super(s);
    }
}
class exceptions {
    public void eligibilty_vote(int age) throws AgeException {
        if (age < 18) {          //it check the condition then it throw by the arithmetic exception for the object and throw that msg
            throw new AgeException("Not Eligible");
        } else {
            System.out.println("Eligible for vote");
        }
    }
}



