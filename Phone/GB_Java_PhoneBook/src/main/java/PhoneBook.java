import java.util.*;

public class PhoneBook {
    Map<String, Contact> contacts = new HashMap<>();

    public void addContact (String name, String phone) {
        if (this.contacts.containsKey(name)) {
            Contact contact = this.contacts.get(name);
            contact.addPhone(phone);
        } else {
            Contact contact = new Contact(name, phone);
            this.contacts.put(name, contact);
        }
    }

    public void print() {
        List<Contact> list = new ArrayList<>(this.contacts.values());
        Collections.sort(list, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c2.phoneCount() - c1.phoneCount();
            }
        });
        for (Contact contact : list) {
            contact.print();
        }
    }

}
