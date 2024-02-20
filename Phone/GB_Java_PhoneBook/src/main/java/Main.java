public class Main {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.addContact("Bob", "+7-999-999-00-00");
        phonebook.addContact("Tom", "+7-999-999-00-01");
        phonebook.addContact("Mot", "+7-999-999-00-02");
        phonebook.addContact("Vot", "+7-999-999-00-03");
        phonebook.addContact("Scot", "+7-999-999-00-04");
        phonebook.addContact("Bob", "+7-999-999-00-20");
        phonebook.addContact("Bob", "+7-999-999-00-30");

        phonebook.print();
    }
}
