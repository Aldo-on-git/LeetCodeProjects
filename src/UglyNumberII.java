public class UglyNumberII {
    public static void main(String[] args){
        System.out.println(nthUglyNumber(1352));
    }

    public static int nthUglyNumber(int n){
        int ugly[]=new int[n];
        ugly[0]=1;

        int factor2=0,factor3=0,factor5=0;
        for(int i=1;i<n;i++){
            int min=Math.min(ugly[factor2]*2,Math.min(ugly[factor3]*3,ugly[factor5]*5));
            if(min==ugly[factor2]*2){
                factor2++;
            }
            if(min==ugly[factor3]*3){
                factor3++;
            }
            if(min==ugly[factor5]*5){
                factor5++;
            }
            ugly[i]=min;
        }
        return ugly[n-1];
    }
}
