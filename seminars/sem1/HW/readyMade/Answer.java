package sem1.HW.readyMade;
//autotests bout prime numbers

import java.util.ArrayList;

class Answer {
    public void printPrimeNums() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        boolean flag = true;

        for (int i = 3; i < 1000; i++) {
            flag = true;
            for (int j = 0; j < list.size(); j++) {
                if (i % list.get(j) == 0) {flag = false; break;}
            }
            if (flag == true) {list.add(i);}
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    // It was the other class here for checking and displaying the result on the screen in autotests:
    public static void main (String[]args){
        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}