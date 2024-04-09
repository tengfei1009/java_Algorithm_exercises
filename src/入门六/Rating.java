package 入门六;

public class Rating {
    int num;
    int grade;
    int exp;

    int zong;
    public Rating() {

    }

    public Rating(int num, int grade, int exp) {
        this.num = num;
        this.grade = grade;
        this.exp = exp;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSum (){
        return grade+ exp;
    }
    public int getZong(){
        return 7*grade+3*exp;
    }
}


