import java.util.ArrayList;
import java.util.Scanner;
class Stock{
    String name ; 
    int numofShares;
    double sharePrice ;
    public Stock(String name , int numofShares , double sharePrice){
        this.name = name;
        this.numofShares = numofShares;
        this.sharePrice = sharePrice;
    }
    public double getStockValue(){
        return numofShares *sharePrice;

    }
}
class StockPortfollo{
    ArrayList<Stock> stockList = new ArrayList<>();
     public void addStock(String name, int shares , double price){
        stockList.add(new Stock(name, shares , price));
     }
     public void StockReport(){
        double totalValue = 0;
        System.out.println("Stock report:");
        for(Stock s: stockList){
            double value = s.getStockValue();
            totalValue+= value;
            System.out.println("stockname :"+s.name);
            System.out.println("Shares"+s.numofShares);
            System.out.println("Price"+s.sharePrice);
         

        }
         System.out.println("TOTAL STOCK PORTFOLIO VALUE = " + totalValue);
     }
 
    }

public class StockReportMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockPortfollo  portfolo = new StockPortfollo();
        System.out.println("enter no.of stocks");
        int n = sc.nextInt();
        for(int i = 0; i<n ; i++){
              System.out.println("enter details of stock"+i);

              System.out.println("stock name");
              String name = sc.next();
              System.out.println("number of shares");
              int shares = sc.nextInt();
              System.out.println("share price");
              double price = sc.nextDouble();

              portfolo.addStock(name , shares, price);
        }
        System.out.println();
        portfolo.StockReport();
        sc.close();

       

    }

}