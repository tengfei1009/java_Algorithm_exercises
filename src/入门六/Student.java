package 入门六;

public class Student {
    private String name;
    private int c;
    private int m;
    private int e;

    public Student(String name, int c, int m, int e) {
        this.name = name;
        this.c = c;
        this.m = m;
        this.e = e;
    }

    public String getName() {
        return name;
    }

    public int getC() {
        return c;
    }

    public int getM() {
        return m;
    }

    public int getE() {
        return e;
    }

    public int getTotal() {
        return c + m + e;
    }
}
