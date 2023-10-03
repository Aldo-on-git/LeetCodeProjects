public class CountingBit {
    public static void main(String[] args){
        countBit(5);
    }

    public static int[] countBit(int n){
        int[] results = new int[n+1];
        String byteString;
        int counterOnes;

        for(int i=0;i<n+1;i++){
            byteString = Integer.toBinaryString(i);
            counterOnes=0;
            for(int j=0;j<byteString.length();j++){
                if(byteString.charAt(j)=='1'){
                    counterOnes++;
                }
            }

            results[i]=counterOnes;
        }

        return results;
    }
}
