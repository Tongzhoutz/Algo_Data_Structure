package LinearSearch;

public class Student {
    String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object student) {

        if (this == student) return true;
        if (student == null) return false;
        if (this.getClass() != student.getClass() ) return false;

        Student another = (Student) student;
        return this.name.equalsIgnoreCase(another.name);
    }
}
