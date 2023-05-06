package c;

//import java.util.Objects;

public class Mutualfund extends Investment {
        
   
    static double staticVariable;

    public static double getStaticVariable() {
        return staticVariable;
    }

    public static void setStaticVariable(double staticVariable) {
        
        Mutualfund.staticVariable += staticVariable;
        
        //System.out.println( Mutualfund.staticVariable);
    }

    public Mutualfund(String symbol, String name, int quantity, double price, double gain) {
        super(symbol, name, quantity, price, gain);
    }
    

   

    
    @Override
    public String toString() {
        return "type = Mutualfund{" +
        "symbol=" + symbol +
        ", name=" + name +
        ", quantity=" + quantity +
        ", price=" + price +
        ", bookValue=" + bookValue +
        ", gain=" + getGain + // Add a semicolon here
        '}';
    }
    
}
