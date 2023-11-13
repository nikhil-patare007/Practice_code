package test;

public class CountOfCharactersOfString {
    public static void main(String[] args) {
        String input = "Hello, this is an example of counting vowels.";

        char [] arr =  input.toCharArray();
        int count = 0 ;
        for(char ch : arr) {
            if(Character.isLetter(ch)) {
                count++;
            }
        }

        System.out.println(count);

        long count2 = input.chars().boxed().filter(Character::isLetter).count();
        System.out.println(count2);
    }
}
