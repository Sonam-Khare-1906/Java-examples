//class Book:
// Data members:
// name: String
// IFSC: String
// author: String
// issuedBy: String
// available: boolean
// Book(String name, String IFSC, String author, boolean available): paramete
//rized constructor for the data members
// class Library:
// Method definition:
// validateIFSC(Book details) throws Exception
// return type: String
// visibility: public
// issueBook(Book details, String name) throws Exception
// return type: String
// visibility: public
//
// class InvalidIFSCException:
// method definitions:
// InvalidIFSCException(String str)
// visibility: public
// class BookUnavailableException:
// method definitions:
// BookUnavailableException(String str)
// visibility: public

package mypack.example;
 class Book {
    String Book_name = "";
    String IFSC = "";
    String Author = "";
    String IssuedBy = "";
    boolean Available;
        public Book(String ifsc, String author, String Iby, boolean available, String Bk){
            this.Book_name=Bk;
            this.IFSC=ifsc;
            this.Author=author;
            this.IssuedBy=Iby;
            this.Available=available;

        }
    }
    class Library {
        public String validateIFSC(Book details) throws InvalidIFSCException { //Book class yeha uska ek object yeha voh details
            if (details.IFSC.matches("\\d{16}")) {
                return "IFSC is valid";
            }

            throw new InvalidIFSCException("IFSC is invalid");
        }

        public String issueBook(Book details, String name) throws BookUnavailableException { //idar bhi same lakin 2 objects yeha details  and name ka
            if (!details.Available) {
                throw new BookUnavailableException("Book is unavailable.");
            } else {
                details.Available = false;
                details.IssuedBy = name;
                return "Book is Issued by Successfully";
            }

        }
    }
       class InvalidIFSCException extends Exception {
            public InvalidIFSCException(String msg){
                super(msg);
            }
       }
       class BookUnavailableException extends Exception{
            public BookUnavailableException(String msg){
                super(msg);
            }
      }
public  class Tests {
    public static void main(String[] args) throws Exception {
        Book data = new Book("9898121234346123", "Arthashastra", "Kautilya", true, "ComputerScience");
        Library obj = new Library();
        try {
            String ans1 = obj.validateIFSC(data);  //book ka object ko bola rha yeha data
            System.out.println(ans1);
            String ans2 = obj.issueBook(data, "Steve");
            System.out.println(ans2);

        } catch (InvalidIFSCException i) {
            System.out.println(i.getMessage());
        }
        catch (BookUnavailableException u) {
            System.out.println(u.getMessage());

        }
    }
}

