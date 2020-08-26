package homework5.part2;

import java.util.LinkedList;

public class ContactDAO {
    private LinkedList<Contact> contactToList;

    public ContactDAO() {
        this.contactToList = new LinkedList<>();
    }
    public void add(Contact contact){
        contactToList.add(contact);
    }
    public void delete(Contact contact) {
        contactToList.remove(contact);
    }

    public void deleteById(int id){
//        contactToList
//                .stream()
//                .filter(contact -> {
//                    if(contact.getId() == id ){
//                        contactToList.remove(contact);
//                        System.out.println("Successfully deleted");
//                        return true;
//                    }else{
//                        System.out.println("Opps");
//                    }
//                    return false;
//                }).findFirst();
        for (Contact contact : contactToList) {
            if (contact.getId() == id){
                contactToList.remove(contact);
            }
        }
    }

    public LinkedList<Contact> getContactToList() {
        return contactToList;
    }


    @Override
    public String toString() {
        return "ContactDAO{" +
                "contactToList=" + contactToList +
                '}';
    }
}
