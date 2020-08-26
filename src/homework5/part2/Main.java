package homework5.part2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Contact user1 = new Contact(
                1,
                "Leanne Graham",
                Company.Apple,
                "Bret",
                "Sincere@april.biz",
                "1-770-736-8031 x56442",
                Department.support
        );
        Contact user2 = new Contact(
                1,
                "Leanne Graham",
                Company.Apple,
                "Bret",
                "Sincere@april.biz",
                "1-770-736-8031 x56442",
                Department.support
        );
        Contact user3 = new Contact(
                3,
                "Ervin Howell",
                Company.Microsoft,
                "Antonette",
                "Shanna@melissa.tv",
                "010-692-6593 x0912",
                Department.factory
        );
        Contact user4 = new Contact(
                4,
                "Clementine Bauch",
                Company.Itel,
                "Samantha",
                "Nathan@yesenia.net",
                "1-463-123-4447",
                Department.tech
        );
        Contact user5 = new Contact(
                5,
                "Patricia Lebsack",
                Company.Apple,
                "Karianne",
                "Julianne.OConner@kory.org",
                "93-170-9623 x156",
                Department.factory
        );
        Contact user6 = new Contact(
                6,
                "Chelsey Dietrich",
                Company.Itel,
                "Kamren",
                "Lucio_Hettinger@annie.cz",
                "(254)954-1289",
                Department.support
        );
        Contact user7 = new Contact(
                7,
                "Mrs. Dennis Schulist",
                Company.Microsoft,
                "Leopoldo_Corkery",
                "Karley_Dach@jasper.info",
                "1-770-736-831 x56442",
                Department.tech
        );
        Contact user8 = new Contact(
                8,
                "Kurtis Weissnat",
                Company.Apple,
                "Elwyn.Skiles",
                "Telly.Hoeger@billy.biz",
                "2-770-736-8031 x56442",
                Department.factory
        );
        Contact user9 = new Contact(
                9,
                "Nicholas Runolfsdottir",
                Company.Itel,
                "Maxime_Nienow",
                "Sherwood@april.biz",
                "9-770-736-8031 x56442",
                Department.support
        );
        Contact user10 = new Contact(
                10,
                "Glenna Graham",
                Company.Microsoft,
                "Delphine",
                "Delphine@april.biz",
                "0-770-736-8031 x56442",
                Department.tech
        );
        ContactDAO list = new ContactDAO();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);
        list.add(user10);
//        list.deleteById(9);
//        System.out.println(list.getContactToList());

//        -знайти всі унікальні контакти
//        List<Contact> collect = list.getContactToList()
//                .stream()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        -знайти всі унікальні контакти з певного департаменту.
//        List<Contact> contactStream = list.getContactToList()
//                .stream()
//                .distinct()
//                .filter(contact -> contact.getDepartmnet() == Department.support);
//        System.out.println(contactStream);
//        -знайти всі унікальні контакти з певного департаменту
//        посортувавши їх по імейлу .
        List<Contact> collect = list.getContactToList()
                .stream()
                .distinct()
                .filter(contact -> contact.getDepartmnet() == Department.factory)
                .sorted(Comparator.comparing(Contact::getEmail))
                .collect(Collectors.toList());
        System.out.println(collect);



    }
}
