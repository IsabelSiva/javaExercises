package otherExammples.rent;

public class Student {
    private String name;
    private  String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
