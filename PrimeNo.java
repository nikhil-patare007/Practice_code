package Java2025;

public class PrimeNo {

    public static void main(String[] args) {
        int num = 12;
        if(isPrime(num)) {
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }

    public static boolean isPrime( int num) {

        if(num<=1) return  false;
        if(num ==2) return  true;
        if(num %2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return  false;
            }
        }
        return true;
    }
}
