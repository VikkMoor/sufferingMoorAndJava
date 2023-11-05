package sem1.HW.readyMade;
//autotests bout prime numbers

class Answer2 {
    public void printPrimeNums() {
        for (int i = 1; i < 1001; i++) {
            int k = 0;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) k++;
            }
            if (k < 2) System.out.println(i);
        }
    }

    public static void main (String[]args){
        Answer2 ans = new Answer2();
        ans.printPrimeNums();
    }
}