public class MagicalString {
    public static void main(String[] args){
        System.out.println(magicalString(1));
    }

    public static int magicalString(int n){
        StringBuilder st=new StringBuilder("122");
        int startIndex=2;
        int endIndex=st.length();
        int counter=0;

        //string generation
        while(st.length()<n){
            if(st.charAt(startIndex)=='1'){
                if(st.charAt(endIndex-1)=='1'){
                    st.append(2);
                }

                else{
                    st.append(1);
                }

                endIndex++;
            }
            else{
                if(st.charAt(endIndex-1)=='1')
                    st.append(22);
                else
                    st.append(11);
                endIndex+=2;
            }
            startIndex++;
        }

        //count 1's cycle
        for(int i=0;i<n;i++){
            if(st.charAt(i)=='1')
                counter++;
        }

        return counter;
    }
}
