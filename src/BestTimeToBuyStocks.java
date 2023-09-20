import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyStocks {
    public static void main(String args[]){
        int nums[] = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices){
        int maxProfit=0;
        int lastPrice=Integer.MAX_VALUE;

        for(int num : prices){
            if(num<lastPrice){
                lastPrice=num;
            }

            if(maxProfit<(num-lastPrice)){
                maxProfit=num-lastPrice;
            }
        }

        return maxProfit;
    }
}
