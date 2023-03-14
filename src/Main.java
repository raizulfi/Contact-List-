import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<contact> link = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String menu = " ";

        while(!menu.equals("q")) {
            System.out.println("****************************************************************");
            System.out.println("""
                    (A)dd
                    (D)elete
                    (E)mail search
                    (P)rint List
                    (S)earch
                    (Q)uit""");
            System.out.println("****************************************************************");
            System.out.print("please enter a command: ");
            menu = scan.nextLine();
            menu = menu.toLowerCase();

            switch (menu) {
                case "a" -> { // adding contact information
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Phone No: ");
                    String PhoneNumber = scan.nextLine();
                    System.out.print("Email: ");
                    String email = scan.nextLine();
                    contact temp = new contact(name, PhoneNumber, email);
                    link.add(temp);
                }
                case "d" -> { // deleting out contact
                    if (link.size() == 0) {
                        System.out.println("There's no contact inside the book (～￣▽￣)～");
                        break;
                    }
                    System.out.print("Enter in the name: ");
                    String NameDel = scan.nextLine();
                    for (int i = 0; i < link.size(); i++){
                        if (link.get(i).name.equals(NameDel)){
                            link.remove(i);
                            System.out.println("contact with " + NameDel + " has been deleted");
                        }else{
                            System.out.println("No contact with the matching name: " + NameDel + "... (´。＿。｀) sorry");
                        }
                    }
                }
                case "e" -> { //email search
                    if (link.size() == 0) {
                        System.out.println("There's no contact inside the book (～￣▽￣)～");
                        break;
                    }
                    System.out.print("Enter in the email: ");
                    String EmailSearch = scan.nextLine();
                    System.out.println("checking contact(s) with the matching email: " + EmailSearch + "...");
                    for (contact contact : link) { // contact contact is link.get(i)
                        if (contact.email.equals(EmailSearch)) {
                            System.out.println("==================");
                            System.out.println(contact);
                            System.out.println("==================");
                        } else {
                            System.out.println("No contact with the matching email: " + EmailSearch + "... (´。＿。｀) sorry");
                        }
                    }
                }
                case "p" -> { // printing contact(s)
                    if (link.size() == 0) {
                        System.out.println("There's no contact inside the book (～￣▽￣)～");
                    }
                    else {
                        System.out.println("list of contact(s):");
                        for (contact contact : link) {
                            System.out.println("==================");
                            System.out.println(contact);
                            System.out.println("==================");
                        }
                    }
                }
                case "s" -> { // search contact (by name)
                    if (link.size() == 0) {
                        System.out.println("There's no contact inside the book (～￣▽￣)～");
                        break;
                    }
                    System.out.print("Enter in the name: ");
                    String NameSearch = scan.nextLine();
                    System.out.println("checking contact(s) with the matching name: " + NameSearch + "...");
                    for (contact contact : link) { // contact contact is link.get(i)
                        if (contact.name.equals(NameSearch)) {
                            System.out.println("==================");
                            System.out.println(contact);
                            System.out.println("==================");
                        }else{
                            System.out.println("No contact with the matching name: " + NameSearch + "... (´。＿。｀) sorry");
                        }
                    }
                }
                case "q" -> System.out.println(" (closing Contact Book) ○( ＾皿＾)っ byebye …"); // quiting
                default -> System.out.println("Unexpected value: " + menu);
            }
        }
    }
}
