import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int day = Integer.parseInt(s[1]);
            int month = Integer.parseInt(s[2]);
            int year = Integer.parseInt(s[3]);
            students.add(new Student(s[0], day, month, year));
        }

        Collections.sort(students);
        System.out.println(students.get(n - 1).name);
        System.out.println(students.get(0).name);
    }
}

class Student implements Comparable<Student>{
    String name;
    int day;
    int month;
    int year;

    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int compareTo(Student s) {
        if (year == s.year && month == s.month) {
            if (day > s.day) return 1;
            else if (day < s.day) return -1;
            else return 0;
        } else if (year == s.year) {
            if (month > s.month) return 1;
            else return -1;
        } else if (year > s.year) return 1;
        else return -1;
    }
}