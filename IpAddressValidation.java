package Java2025;

public class IpAddressValidation {

    public static void main(String[] args) {

        String valid = "192.168.2.10";
        String invalid = "192.168.0.00";
        if(validateIpAddress(valid)){
            System.out.println("Valid");
        }

        if(validateIpAddress(invalid)){
            System.out.println("Invalid");
        }

    }

    public static boolean validateIpAddress(String input) {

        String[] parts = input.split("\\.");

        if(parts.length != 4){
            return false;
        }

        for(String part: parts) {

            if(part.isEmpty()) {
                return false;
            }

            for(char ch : part.toCharArray()) {
                if(!Character.isDigit(ch)) {
                    return false;
                }
            }

            int num = Integer.parseInt(part);
            if(num < 0 || num > 255) {
                return false;
            }

            if(part.length()>1 && part.charAt(0) == 0) {
                return false;
            }
        }

        return true;

    }
}
