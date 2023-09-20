public class Sqrt {
    public static void main(String args[]){
        System.out.println(sqrt(16));
    }

    public static int sqrt(int x){
        int sqrt=0;
        int start=0;

        while(start<x){
            if(x<((start+1)*(start+1)) && x>(start*start)){
                sqrt=start+1;
            }

            start += 1;
        }

        return sqrt;
    }
}
