public class IntegerToRoman {
    public static void main(String args[]){
        System.out.println(IntegerToRoman(1994));
    }

    public static String IntegerToRoman(int num){
        String romanNumber="";

        while(num!=0){
            if(num==4){
                romanNumber= romanNumber+"IV";
                num=num-4;
                continue;
            }
            if(num==9){
                romanNumber= romanNumber+"IX";
                num=num-9;
                continue;
            }
            if(num>=1000){
                romanNumber= romanNumber+"M";
                num=num-1000;
                continue;
            }
            if(num<1000 && num>=500){
                if(num>=900){
                    romanNumber = romanNumber+"CM";
                    num=num-900;
                }
                else{
                    romanNumber = romanNumber+"D";
                    num=num-500;
                }
                continue;
            }
            if(num<500 && num>=100){
                if(num>=400){
                    romanNumber = romanNumber+"CD";
                    num=num-400;
                }
                else{
                    romanNumber = romanNumber+"C";
                    num=num-100;
                }
                continue;
            }
            if(num<100 && num>=50){
                if(num>=90){
                    romanNumber = romanNumber+"XC";
                    num=num-90;
                }
                else{
                    romanNumber = romanNumber+"L";
                    num=num-50;
                }
                continue;
            }
            if(num<50 && num>=10){
                if(num>=40){
                    romanNumber = romanNumber+"XL";
                    num=num-40;
                }
                else{
                    romanNumber = romanNumber+"X";
                    num=num-10;
                }
                continue;
            }
            if(num<10 && num>=5){
                romanNumber = romanNumber+"V";
                num=num-5;
                continue;
            }
            if(num<5){
                romanNumber = romanNumber+"I";
                num=num-1;
                continue;
            }
        }

        return romanNumber;
    }
}
