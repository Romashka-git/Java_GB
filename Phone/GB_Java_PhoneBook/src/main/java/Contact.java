import java.util.HashSet;
import java.util.Set;

public class Contact {
    String name;
    Set<String> phones;

    public Contact(String name, String phone) {
        this.name = name;
        this.phones = new HashSet<>();
        this.phones.add(phone);
    }

    public void addPhone(String phone) {
        this.phones.add(phone);
    }

    public int phoneCount() {
        return this.phones.size();
    }

    public void print(){
        System.out.printf("%s: ",this.name);
        for (String i : this.phones) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
