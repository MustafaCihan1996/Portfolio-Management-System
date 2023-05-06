package Eportfolio;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.HashMap;



public class Portfolio {
  
    public static void menu()

    {

        System.out.println("1 buy");
        
        System.out.println("2 sell");

        System.out.println("3 uptade");

        System.out.println("4 GetGain");
        
        System.out.println("5 Search");

        
    }
    
    public static boolean checker(String b[],String a)
    
    {
        for(int i = 0; i<b.length; i++)
        
        {
            
            if(a.equals(b[i]))
            
            {
                
                return false;
                
            }
            
        }
        
        return true;
        
    }

    
    public static void main(String[] args) {
        
        ArrayList <Stock> stockAll = new ArrayList <Stock> ();
    
    
        ArrayList <Mutualfund> mutualFundAll = new ArrayList <Mutualfund> ();
        
        String[] words = new String[] {"q", "Q", "quit", "Quit", "QUIT", "search", "sell", "buy", "GetGain", "uptade"};
        
        String i = "start";
        
        String kindInvestment;
        
        String aaa;
        
        String bbb;
        
        boolean wordChecker = true;
        
        Scanner scan = new Scanner(System.in);
        
        
        while (!i.equals("q") && !i.equals("Q") && !i.equals("quit") && !i.equals("Quit") && !i.equals("QUIT"))
            
        {
        
            menu();
            
            i = scan.nextLine();
            
            wordChecker = checker(words,i);
            
            
            if(wordChecker == true)
            
            {
                
                System.out.println("You entered invalid option");
                
                
                
            }
            
            if(i.equals("buy"))
            
            {
                int checker = 0;
                
                System.out.println("Enter the kind of investment");
                
                
                kindInvestment = scan.nextLine();
                
                if(!(kindInvestment.equals("stock") || kindInvestment.equals("mutualfund")))
                
                {
                    
                   System.out.println("You enterred invalid investment");
                    
                }
                
                if(kindInvestment.equals("stock"))
                
                {
                    System.out.println("Enter the symbol of stock");
                    
                    aaa = scan.nextLine();
                    
                    
                            
                   for(Stock a : stockAll)
               
                        {
                   
                            if(a.symbol.equals(aaa))
                            
                            {
                                int quantityForStock = 0;
                                
                                double newPriceForStock = 0;
                                
                                System.out.println("Enter the quantity");
                                
                                quantityForStock = scan.nextInt();
                                
                                System.out.println("Enter the new price");
                                
                                newPriceForStock = scan.nextDouble();
                                
                                scan.nextLine();
                                
                                a.setPrice(newPriceForStock);
                                
                                a.setQuantity(quantityForStock);
                                
                                a.setBookValue(a.bookValue, newPriceForStock, quantityForStock,0);
                                
                                checker++;
                                
                            }
                        }
                   
                    if(checker == 0)
                    
                    {
                            
                                String stockName;
                                
                                String stockSymbol;
                                
                                int stockQuantity = 0;
                                
                                double stockPrice = 0;
                            
                                System.out.println("Enter the stock name");
                                
                                stockName = scan.nextLine();
                                
                                System.out.println("Enter the symbol");
                                
                                stockSymbol = scan.nextLine();
                                
                                System.out.println("Enter the quantity");
                                
                                stockQuantity = scan.nextInt();
                                
                                System.out.println("Enter the price");
                                
                                stockPrice = scan.nextDouble();
                                
                                scan.nextLine();
                                
                                Stock stocka  = new Stock(stockSymbol,stockName,stockQuantity,stockPrice,0);
                                
                                stocka.setBookValue(0,stockPrice, stockQuantity,0);
                                
                                stockAll.add(stocka);
                    }
                                
               }
                           
               if(kindInvestment.equals("mutualfund"))
                
                {
                   System.out.println("Enter the symbol");
                   
                   bbb = scan.nextLine();
                   
                   for(Mutualfund a : mutualFundAll)
               
                        {
                   
                            if(a.symbol.equals(bbb))
                            
                            {
                                int quantityForStock = 0;
                                
                                double newPriceForStock = 0;
                                
                                System.out.println("Enter the quantity");
                                
                                quantityForStock = scan.nextInt();
                                
                                System.out.println("Enter the new price");
                                
                                newPriceForStock = scan.nextDouble();
                                
                                scan.nextLine();
                                
                                a.setPrice(newPriceForStock);
                                
                                a.setQuantity(quantityForStock);
                                
                                a.setBookValue(a.bookValue, newPriceForStock, quantityForStock,0);
                                
                                checker++;
                            }
                        }
                
                    if(checker == 0)
                    
                    {        
                                String stockName;
                                
                                String stockSymbol;
                                
                                int stockQuantity = 0;
                                
                                double stockPrice = 0;
                            
                                System.out.println("Enter the stock name");
                                
                                stockName = scan.nextLine();
                                
                                System.out.println("Enter the symbol");
                                
                                stockSymbol = scan.nextLine();
                                
                                System.out.println("Enter the quantity");
                                
                                stockQuantity = scan.nextInt();
                                
                                System.out.println("Enter the price");
                                
                                stockPrice = scan.nextDouble();
                                
                                scan.nextLine();
                                
                                Mutualfund stocka  = new Mutualfund(stockSymbol,stockName,stockQuantity,stockPrice,0);
                                
                                stocka.setBookValue(0,stockPrice, stockQuantity,0);
                                
                                mutualFundAll.add(stocka);
                                
                    }            
                                
               } 
                       
              
            }
            
            if(i.equals("sell"))
                
            {
                String kind;
                
                String sym;
                
                int checkMe = 0;
                
                int savver = 0;
            
                System.out.println("Enter the kind of investment");
                
                kind = scan.nextLine();
                
                if(!(kind.equals("stock") || kind.equals("mutualfund")))
                
                {
                    
                   System.out.println("You enterred invalid investment");
                    
                }
                
                if(kind.equals("stock"))
                
                {
                    // dont forget gain and dont forget if  symbol does not exist;
                    System.out.println("Enter the symbol");
                    
                    sym = scan.nextLine();
                    
                    int checker = 0;
                    
                    for(int j = 0; j<stockAll.size(); j++)
               
                        {
               
                            if(stockAll.get(j).symbol.equals(sym))
                            
                            {
                                
                                System.out.println("Enter the quantity");
                                
                                int quant = 0;
                                
                                quant = scan.nextInt();
                                
                                System.out.println("Enter the price");
                                
                                double pric = 0;
                                
                                pric = scan.nextDouble();
                                
                                scan.nextLine();
                                
                                stockAll.get(j).setPrice(pric);
                                
                                if(quant == stockAll.get(j).getQuantity())
                                
                                {
                                    double comis = 9.99;
                                    
                                    double paymnt = 0;
                                    
                                    double gn = 0;
                                    
                                    paymnt = (pric*quant) - comis;
                                    
                                    gn = paymnt-stockAll.get(j).getBookValue();
                                    
                                    Stock.setStaticVariable(gn);
                                    
                                    //stockAll.remove(j);
                                    
                                    checkMe = 1;
                                    
                                    savver = j;
                                    
                                    
                                }
                                
                                if(quant<stockAll.get(j).getQuantity())
                                
                                {
                                    
                                    double comis = 9.99;
                                    
                                    double paymnt = 0;
                                    
                                    double gn = 0;
                                    
                                    int remain = 0;
                                    
                                    remain = stockAll.get(j).getQuantity()-quant;
                                    
                                    stockAll.get(j).setBookValue(stockAll.get(j).getBookValue(), remain, stockAll.get(j).getQuantity(), 1);
                                    
                                    
                                    paymnt = (pric*quant) - comis;
                                
                                    gn = paymnt-stockAll.get(j).getBookValue();
                                    
                                    Stock.setStaticVariable(gn);
                                    
                                    
                                }
                                
                                
                                
                                
                                checker++;
                                
                            }
                   
                        }
                    
                    if(checker == 0)
                    
                    {
                        
                        System.out.println("Investment does not exist");
                        
                    }
                    
                }
                
                if(checkMe == 1)
                
                {
                    
                    stockAll.remove(savver);
                    
                }
                
                checkMe = 0;
                
                if(kind.equals("mutualfund"))
                
                {
                    // dont forget gain and dont forget if  symbol does not exist;
                    System.out.println("Enter the symbol");
                    
                    sym = scan.nextLine();
                    
                    int checker = 0;
                    
                    for(int k = 0; k<mutualFundAll.size(); k++)
               
                        {
               
                            if(mutualFundAll.get(k).symbol.equals(sym))
                            
                            {
                                
                                System.out.println("Enter the quantity");
                                
                                int quant = 0;
                                
                                quant = scan.nextInt();
                                
                                System.out.println("Enter the price");
                                
                                double pric = 0;
                                
                                pric = scan.nextDouble();
                                
                                scan.nextLine();
                                
                                mutualFundAll.get(k).setPrice(pric);
                                
                                if(quant == mutualFundAll.get(k).getQuantity())
                                
                                {
                                    double comis = 45;
                                    
                                    double paymnt = 0;
                                    
                                    double gn = 0;
                                    
                                    paymnt = (pric*quant) - comis;
                                    
                                    gn = paymnt-mutualFundAll.get(k).getBookValue();
                                    
                                    Stock.setStaticVariable(gn);
                                    
                                    //mutualFundAll.remove(k);
                                    
                                    savver = k;
                                    
                                    checkMe = 1;
                                    
                                    
                                    
                                    
                                }
                                
                                if(quant<mutualFundAll.get(k).getQuantity())
                                
                                {
                                    
                                    double comis = 45;
                                    
                                    double paymnt = 0;
                                    
                                    double gn = 0;
                                    
                                    int remain = 0;
                                    
                                    remain = mutualFundAll.get(k).getQuantity()-quant;
                                    
                                    mutualFundAll.get(k).setBookValue(mutualFundAll.get(k).bookValue, remain, mutualFundAll.get(k).getQuantity(), 1);
                                    
                                    mutualFundAll.get(k).setPrice(pric);
                                    
                                    paymnt = (pric*quant) - comis;
                                
                                    gn = paymnt-mutualFundAll.get(k).getBookValue();
                                    
                                            Mutualfund.setStaticVariable(gn);
                                    
                                    
                                }
                                
                                
                                
                                
                                checker++;
                                
                            }
                   
                        }
                    
                    if(checkMe == 1)
                    
                    {
                       
                        mutualFundAll.remove(savver);
                        
                    }
                    
                    checkMe = 0;
                    
                    if(checker == 0)
                    
                    {
                        
                        System.out.println("Investment does not exist");
                        
                    }
                    
                }
                
            }
            
            if(i.equals("uptade"))
                
            {
                double priceLast;
                
                double priceTwoLast;
                
                System.out.println("Uptade your stocks' prices");
                
                for(Stock a : stockAll)
            
                    {
                
                        priceLast = scan.nextDouble();
                
                        a.setPrice(priceLast);
                
                    }
                
                System.out.println("Uptade your mutualfunds' prices");
                
                
                for(Mutualfund a : mutualFundAll)
            
                    {
                
                         priceTwoLast = scan.nextDouble();
                
                        a.setPrice( priceTwoLast);
                
                    }
                
                
                
            }
            
            if(i.equals("GetGain"))
            
            {
            
                System.out.println("Your total gain from your all portfolios " +  (Mutualfund.getStaticVariable()+ Stock.getStaticVariable()));
                
            }
            
            if(i.equals("search"))
            
            {
                ArrayList <Stock> stockAllOne = new ArrayList <Stock> ();
    
                ArrayList <Mutualfund> mutualFundAllOne = new ArrayList <Mutualfund> ();
              
                stockAllOne.addAll(stockAll);
                
                mutualFundAllOne.addAll(mutualFundAll);
                
                HashMap<Integer, Integer> saverStock = new HashMap<Integer, Integer>();
                
                 HashMap<Integer, Integer> savermutualFund = new HashMap<Integer, Integer>();
                
                int saverLoop = 0;
                
                int saverLoopTwo = 0;
                
                //ListIterator<Stock> iterator = stockAllOne.listIterator();
                
                //ListIterator<Mutualfund> iteratorTwo = mutualFundAllOne.listIterator();
                
                
                double bigger = 0;
                
                double smaller = 0;
                
                String range;
                
                String nameSearch;
                
                String symbolSearch;
                
                
                System.out.println("Enter the price range");
                
                range = scan.nextLine();
                
                if(!range.isEmpty() && !range.contains("-"))
                
                {
                
                    bigger = Double.parseDouble(range);
                    
                    for(int k = 0; k<stockAllOne.size(); k++)
                    
                    {
                        
                        if(stockAllOne.get(k).getPrice() != bigger)
                        
                        {
                            
                            saverStock.put(k, saverLoop);
                            
                            saverLoop++;
                           
                        }
                        
                        
                        
                    }
                    
                    for(int j = 0; j<mutualFundAllOne.size(); j++)
                    
                    {
                        
                        if(mutualFundAllOne.get(j).getPrice() != bigger)
                        
                        {
                            
                            savermutualFund.put(j, saverLoopTwo);
                            
                            saverLoopTwo++;
                            
                        }
                        
                       
                        
                    }
                
                }
                
                if(!range.isEmpty() && range.charAt(0) == '-')
                
                {
                    
                    String[] saver = range.split("-");
                    
                    range = saver[1];
                    
                    bigger = Double.parseDouble(range);
                    
                    for(int k = 0; k<stockAllOne.size(); k++)
                    
                    {
                        
                        if(stockAllOne.get(k).getPrice() > bigger)
                        
                        {
                            
                            saverStock.put(k, saverLoop);
                            
                            saverLoop++;
                           
                        }
                        
                        
                        
                    }
                    
                    for(int j = 0; j<mutualFundAllOne.size(); j++)
                    
                    {
                        
                        if(mutualFundAllOne.get(j).getPrice()> bigger)
                        
                        {
                            
                            savermutualFund.put(j, saverLoopTwo);
                            
                            saverLoopTwo++;
                            
                        }
                        
                       
                        
                    }
                     
                    
                }
                
                if(!range.isEmpty() && range.charAt(range.length() -1) == '-')
                
                {
                    
                    String[] saver = range.split("-");
                    
                    range = saver[0];
                    
                    bigger = Double.parseDouble(range);
                    
                    for(int h = 0; h<stockAllOne.size(); h++)
                    
                    {
                        
                        if(stockAllOne.get(h).getPrice() < bigger)
                        
                        {
                            
                            saverStock.put(h, saverLoop);
                            
                            saverLoop++;
                            
                        }
                        
                       
                        
                    }
                    
                    for(int m = 0; m<mutualFundAllOne.size(); m++)
                    
                    {
                        
                        if(mutualFundAllOne.get(m).getPrice()< bigger)
                        
                        {
                            
                           savermutualFund.put(m, saverLoopTwo);
                            
                           saverLoopTwo++;
                            
                        }
                        
                        
                        
                    }
                    
                    
                  
                }
                
                if(!range.isEmpty() && range.contains("-") && range.charAt(0) != '-' && range.charAt(range.length() -1) != '-')
                
                {
                    
                     
                    String[] saver = range.split("-");
                    
                    range = saver[0];
                    
                    bigger = Double.parseDouble(range);
                    
                    range = saver[1];
                    
                    smaller = Double.parseDouble(range);
                    
                    
                    
                    for(int l = 0; l<stockAllOne.size(); l++)
                    
                    {
                        
                        if(stockAllOne.get(l).getPrice()<smaller && stockAllOne.get(l).getPrice()>bigger)
                        
                        {
                            
                            saverStock.put(l, saverLoop);
                            
                            saverLoop++;
                            
                        }
                        
                       
                        
                    }
                    
                    
                    for(int p = 0; p< mutualFundAllOne.size(); p++)
                    
                    {
                        
                        if(mutualFundAllOne.get(p).getPrice()<smaller && mutualFundAllOne.get(p).getPrice()>bigger)
                        
                        {
                            
                            savermutualFund.put(p, saverLoopTwo);
                            
                            saverLoopTwo++;
                            
                        }
                        
                       
                        
                    }   
                    
                }
                    
                System.out.println("Enter the name");
                
                nameSearch = scan.nextLine();
                
                String[] savermj = nameSearch.split("[ ]+");
                
                
                for(int r = 0; r<stockAllOne.size(); r++)
                
                {
                
                    for(int w = 0; w<savermj.length; w++)
                
                    {
                  
                        if(!stockAllOne.get(r).getName().toLowerCase().contains(savermj[w].toLowerCase()))
                        
                        {
                            if(!saverStock.containsKey(r))
                            
                            {
                            
                                 saverStock.put(r, saverLoop);
                            
                                 saverLoop++;
                            
                            }
                           
                            
                        }
                        
                        
                    
                    
                    }
                    
                   
                }
               
                for(int a = 0; a<mutualFundAllOne.size(); a++)
                
                {
                
                    for(int s = 0; s<savermj.length; s++)
                
                    {
                  
                        if(!mutualFundAllOne.get(a).getName().toLowerCase().contains(savermj[s].toLowerCase()))
                        
                        {
                          
                            if(!savermutualFund.containsKey(a))
                            
                            {
                            
                                 savermutualFund.put(a, saverLoopTwo);
                            
                                 saverLoopTwo++;
                            
                            }
                            
                        }
                        
                        
                    
                    
                    }
                    
                    
                }
                
                System.out.println("Enter the symbol");
                
                symbolSearch = scan.nextLine();
                
                for(int u = 0; u< stockAllOne.size(); u++)
                
                {
                
                    if(!stockAllOne.get(u).getSymbol().toLowerCase().contains(symbolSearch.toLowerCase()))
                    
                    {
                       
                       if(!saverStock.containsKey(u))
                            
                        {
                            
                                 saverStock.put(u, saverLoop);
                            
                                 saverLoop++;
                            
                        }
                        
                    }
                    
                   
                    
                }
                
                 for(int c = 0; c< mutualFundAllOne.size(); c++)
                
                {
                
                    if(!mutualFundAllOne.get(c).getSymbol().toLowerCase().contains(symbolSearch.toLowerCase()))
                    
                    {
                       
                        if(!savermutualFund.containsKey(c))
                            
                            {
                            
                                 savermutualFund.put(c, saverLoopTwo);
                            
                                 saverLoopTwo++;
                            
                            }
                        
                    }
                    
                    
                    
                }
                
                 
                System.out.println("Your Search Results");
                
                for(int q = 0;  q< stockAllOne.size(); q++)
                
                {
                    if(!saverStock.containsKey(q))
                    
                    {
                    
                        
                        System.out.println( stockAllOne.get(q).getName() + " " + stockAllOne.get(q).getSymbol() + " " + stockAllOne.get(q).getPrice() + " " + stockAllOne.get(q).getBookValue());

                    
                    }
                   
                    
                }
                
                
                
                for(int g = 0; g< mutualFundAllOne.size(); g++)
                
                {
                   if(!savermutualFund.containsKey(g))
                   
                   {
                      
                        System.out.println(mutualFundAllOne.get(g).getName() + " " + mutualFundAllOne.get(g).getSymbol() + " " + mutualFundAllOne.get(g).getPrice() + " " + mutualFundAllOne.get(g).getBookValue());
                   
                   }
                    
                }
                
                stockAllOne.clear();
                
                mutualFundAllOne.clear();
                
                
             
        }
        
        
    }
    scan.close();
}
    
}