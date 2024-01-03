package mypack.example;

public class Stocks {
    public static void main(String[] args) throws Exception {
        Stocks s = new Stocks(10.0f);
        try{
            s.checkRate(15.0F);
            System.out.println("Stock Rate is Good");
        }catch (StockHighException h){
            System.out.println("Stock Rate is High Profit"+" " +h.getMessage());
        }
        catch (StockLowException l){
            System.out.println("Stock Rate is Loss"+" "+l.getMessage());
        }catch (Exception e){
            System.out.println("Stock Rate is Lossesssss.............");
        }
    }

    float stockRate;

    public Stocks(float stockRate) { //Constructor
        this.stockRate = stockRate;
    }

    public String checkRate(float Rate) throws Exception { //method checkrate Exception
            if (stockRate < 0.8*stockRate) {
                throw new StockHighException("Under Profit");
            } else if (stockRate > 0.8*stockRate) {
                throw new StockLowException("Under Loss");
            } else {
                return "Hope to raise";
            }
        }
}
    class StockHighException extends Exception {   //Another class for creating StockHighException
        public StockHighException(String msg) {    //constructor
            super(msg);
        }
    }

    class StockLowException extends Exception {  //Another class for creating StockLowException
        public StockLowException(String msg) {   //constructor
            super(msg);

        }
    }

