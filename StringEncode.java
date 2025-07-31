package Java2025;

public class StringEncode {

    public static void main(String[] args) {

        System.out.println(StringEncode.encode("aaabbcccca"));

    }

    public static String encode(String input) {

        if(input ==  null && input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length() ; i++) {

            if(input.charAt(i) ==  input.charAt( i-1)) {
                count ++;
            } else {
                result.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }

        result.append((input.charAt(input.length() -1))).append(count);

        return  result.toString();
    }
}
