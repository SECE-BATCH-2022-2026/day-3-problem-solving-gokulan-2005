import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Student> students = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int roll = Integer.parseInt(br.readLine());
            String name = br.readLine();
            students.add(new Student(roll, name));
        }
        for (Student s : students) {
            s.displayInfo();
        }
    }
}
class Student {
    private int rollno;
    private String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Roll No: " + rollno + ", Name: " + name);
    }
    @Override
    public int hashCode() {
        return rollno;   
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.rollno == s.rollno;
    }
}
