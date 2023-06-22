import java.io.*;
import java.util.*;

class Main {
    public String solution(Person[] p) {
        Arrays.sort(p, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Person pe : p) {
            sb.append(pe);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Person[] p = new Person[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            p[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        bw.write(T.solution(p));
        bw.flush();
        bw.close();
    }
}

class Person {
    public int age;
    public String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name + "\n";
    }
}