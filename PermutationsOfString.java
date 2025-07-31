package Java2025;

public class PermutationsOfString {

    public static void main(String[] args) {
        /*First call: generatePermutations("", "ABC")

        Picks 'A' → next: generatePermutations("A", "BC")

        Picks 'B' → next: generatePermutations("AB", "C")

        Picks 'C' → now: generatePermutations("ABC", "") → prints "ABC"*/

        String input = "ABC";

        System.out.println("Permutations of " + input + ":");

        generatePermutations("", input);

    }

    static void generatePermutations(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutations(
                        prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1)
                );
            }
        }
    }
}
