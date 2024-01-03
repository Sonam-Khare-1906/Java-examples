public class throwkey_exception {
    public void eligibility_vote(int age) {
        if (age < 18) {          //it check the condition then it throw by the arithmetic exception for the object and throw that msg
            throw new ArithmeticException("Not Eligible");
        } else {
            System.out.println("Eligible for vote");
        }
    }
        public static void main(String[] a){
           throwkey_exception ee=new throwkey_exception();
           ee.eligibility_vote(25);

           //it depends upon on me write or not try and catch not necessary
//           try{
//               ee.eligibility_vote(20);
//           }catch (Exception e){
//
//               e.printStackTrace();
//           }
//           finally {
//               System.out.println("You are not Eligible for vote");
//               System.out.println("Eligible for vote");
//           }
        }
    }
