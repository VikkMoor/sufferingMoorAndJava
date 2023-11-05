package sem1.HW.templates;

// To show prime numbers 1...1000

public class Answer2 {
    public void printPrimeNums() {
        boolean isPrime;
        for (int i = 2; i < 1000; i++) {
            isPrime = false;
            for (int j = 2; j < 1000; j++) {
                if (i >= j && i % j == 0) {
                    if (j == i) {
                        isPrime = true;
                    }
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    }

    public static void main(String[] args) {

            Answer2 ans = new Answer2();
            ans.printPrimeNums();
    }
}

