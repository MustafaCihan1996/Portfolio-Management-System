package newInvestment;

//mport java.util.Objects;

public class Stock extends Investment {

   
    
    
    static double staticVariable;

    public static double getStaticVariable() {
        return staticVariable;
    }

    public static void setStaticVariable(double staticVariable) {
        Stock.staticVariable += staticVariable;
        
        //System.out.println( Stock.staticVariable);
    }

    public Stock(String symbol, String name, int quantity, double price, double gain) {
        super(symbol, name, quantity, price, gain);
    }

    

    @Override
    public String toString() {
        return "type = Stock{" + "symbol=" + symbol + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", bookValue=" + bookValue + '}';
    }
    
   
    
}
