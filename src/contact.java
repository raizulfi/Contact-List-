public class contact {
    String name;
    String PhoneNumber;
    String email;

    public contact(String name, String PhoneNumber, String email) {
        this.name = name;
        this.PhoneNumber = PhoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "|| name: %s \n|| Number: %s \n|| email: %s".formatted(name, PhoneNumber, email);
    }
}


