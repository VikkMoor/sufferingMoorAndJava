package sem5.HW.readyMade;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

        if (phoneBook.containsKey(name)){
            ArrayList<Integer> list = phoneBook.get(name);
            list.add(phoneNum);
        }
        else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, list);
        }
    }

    public ArrayList<Integer> find(String name) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        if (phoneBook.containsKey(name)){
            arrayList = phoneBook.get(name);
        }
        return arrayList;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {

        return phoneBook;

    }

    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}
