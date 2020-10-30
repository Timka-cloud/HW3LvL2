import java.util.*;

public class PhoneBook {
    Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String telephone){
        ArrayList<String> listTelephone = new ArrayList<>();
        listTelephone = phoneBook.get(name);
        if(listTelephone == null) listTelephone = new ArrayList<>();
        listTelephone.add(telephone);
        phoneBook.put(name, listTelephone);

    }
    public ArrayList<String> get(String name){
        return phoneBook.get(name);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
















