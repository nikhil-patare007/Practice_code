package Java2025;

public class PermutationOfNumber {

    public static void main(String[] args) {

        int input = 123;

        String inputString = String.valueOf(input);
        System.out.println("Permutations of " + input + ":");

        generatePermutations("", inputString);
    }

    static void generatePermutations( String prefix, String remaining) {
        if(remaining.isEmpty()) {
            System.out.println(prefix);
        }else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutations(
                prefix + remaining.charAt(i),
                remaining.substring(0,i) + remaining.substring(i+1));
            }
        }
    }
}
