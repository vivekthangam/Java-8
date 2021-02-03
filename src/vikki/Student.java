package vikki;

public class Student {
    protected String name;     // first name
    protected int age;      // last name

    private String first;     // first name
    private String last;      // last name
    private String email;     // email address
    private int section;      // section number

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String first, String last, String email, int section) {
        this.first = first;
        this.last = last;
        this.email = email;
        this.section = section;
    }

    // return true if the invoking object's section is less than that of b
    public boolean less(Student b) {
        Student a = this;
        return a.section < b.section;
    }

    // return a string representation of the invoking object
    public String toString() {
        return name+" "+age+" " +section + " " + first + " " + last + " " + email;
    }
}