public class ValidateIPAddress {
    public static void main(String[] args){
        System.out.println(validIpAddress("01.01.01.01"));
    }

    public static String validIpAddress(String queryIP){
        if(queryIP.matches( "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$")){
            String[] verifyZero = queryIP.split("\\.");

            for(String s : verifyZero){
                if(s.startsWith("0") && s.length()>1){
                    return "Neither";
                }
            }

            return "IPv4";
        }
        if(queryIP.matches("^([0-9A-Fa-f]{0,4}:){2,7}([0-9A-Fa-f]{1,4}$|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4})$")){
            String[] verifySize = queryIP.split(":");

            for(String s: verifySize){
                if(s.length()<1 || s.length()>4){
                    return "Neither";
                }
            }
            return "IPv6";
        }

        return "Neither";
    }
}
