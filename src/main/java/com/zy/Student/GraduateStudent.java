package com.zy.Student;

public class GraduateStudent extends Student{
    int thesis;
    static int pass = 70;

    public GraduateStudent(String name,int english, int math, int thesis){  //添加這段建構子是因為繼承的副類別沒有空的建構子
        super(name,english,math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math + "\t" +thesis +
                "\t" + getAverage() + "\t" + ((getAverage() >= pass)? "PASS" : "FAILED"));
        char grade;
        switch (average/10)
        {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("\t" + grade);
    }

    @Override
    public int getAverage() {
        return (english+math+thesis)/3;
    }
}
