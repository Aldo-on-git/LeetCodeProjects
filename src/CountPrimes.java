import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args){
        System.out.println(countPrimes(499979));
    }

    public static int countPrimes(int n){
        final boolean[] primeCandidates = new boolean[n]; // defaults to false
        Arrays.fill(primeCandidates, true);
        int counter=0;


        for (int candidate = 2; candidate < n; candidate++) {
            if (primeCandidates[candidate]) {
                counter++;
                if(candidate*candidate<n){
                    for (int j = 2 * candidate; j < n; j += candidate) {
                        primeCandidates[j] = false;
                    }
                }
            }

        }

        return counter;
    }
}
