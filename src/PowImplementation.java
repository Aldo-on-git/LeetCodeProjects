public class PowImplementation {
    public static void main(String args[]){
        System.out.println(myPow(2,-2));
    }

    public static double myPow(double x,int n){

        double result=1;
        int i=0;

        if(x==1){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(x==-1){
            if(n%2==0){
                return 1;
            }
            else{
                return -1;
            }
        }


        if(n>=0){
            while(i<n){
                result=result*x;
                i++;
            }
        }
        else{
            while(i>n){
                result = result/x;
                i--;
            }
        }

        return result;
    }
}
