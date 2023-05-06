package Eportfolio;

//import java.util.Objects;

public class Mutualfund {
        
    public String symbol;
    
    public String name;
    
    public int quantity;
    
    public double price;
    
    public double bookValue;
    
    public double gain;
    
    static double staticVariable;

    public static double getStaticVariable() {
        return staticVariable;
    }

    public static void setStaticVariable(double staticVariable) {
        
        Mutualfund.staticVariable += staticVariable;
        
        //System.out.println( Mutualfund.staticVariable);
    }
    
    
   
    
    

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public Mutualfund(String symbol, String name, int quantity, double price, double gain) {
        
        this.symbol = symbol;
        
        this.name = name;
        
        this.quantity = quantity;
        
        this.price = price;
        
        this.gain = gain;
        
        
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBookValue() {
        return bookValue;
    }

    public void setBookValue(double bookValue,double price,int quantity,int decider) {
        
        if(decider == 0)
        
        {
            
            double a = 0;
        
            a = price*quantity;
        
            bookValue+= a;
        
            this.bookValue = bookValue;
            
            //System.out.println(this.bookValue);
        }
        
        if(decider == 1)
        
        {
            
            this.bookValue = bookValue*(price/quantity);
            
            //System.out.println(this.bookValue);
            
        }
        
        
    }

    
    @Override
    public String toString() {
        return "Mutualfund{" + "symbol=" + symbol + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", bookValue=" + bookValue + '}';
    }
    
}
