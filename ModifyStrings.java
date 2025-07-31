package Java2025;

public class ModifyStrings {
    public static void main(String[] args) {

        String input = "Automation1234Testing354";
        System.out.println(modifiedString(input));

    }

    public static String modifiedString(String input) {

        StringBuilder result = new StringBuilder();

        int sumOfDigits = 0;


        for(char ch : input.toCharArray()) {

            if(Character.isDigit(ch)) {
                sumOfDigits = sumOfDigits + Character.getNumericValue(ch);
            }else {
                if(sumOfDigits > 0) {
                    result.append(sumOfDigits);
                    sumOfDigits = 0;
                }
                result.append(ch);
            }
        }

        if(sumOfDigits > 0) {
            result.append(sumOfDigits);
        }
        return result.toString();
    }
}
