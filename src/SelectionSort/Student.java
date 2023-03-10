package SelectionSort;

public class Student implements Comparable<Student> {
    private String name;
    private int score;


    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student another) {
        return this.score - another.score;
    }

    @Override
    public boolean equals(Object student) {

        if (this == student) return true;
        if (student == null) return false;
        if (this.getClass() != student.getClass() ) return false;

        Student another = (Student) student;
        return this.name.equalsIgnoreCase(another.name);
    }

    @Override
    public String toString() {
        return String.format("Student (name: %s, score: %d)", this.name, this.score);
    }
}
