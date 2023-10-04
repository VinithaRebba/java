import java.util.*;
public class studentGradeCalculator {
    public static void main(String args[]){
        System.out.println("enter your marks in 5 subjects out of 100");
    Scanner sc=new Scanner(System.in);
    int subjects=5;
    String grade;
    System.out.println("enetr your marks in chemistry");
    int chemistry=sc.nextInt();
    System.out.println("enetr your marks in maths");
    int maths=sc.nextInt();
    System.out.println("enetr your marks in science");
    int science=sc.nextInt();
    System.err.println("enetr your marks in social");
    int social=sc.nextInt();
    System.out.println("enetr your marks in english");
    int english=sc.nextInt();
    int sum=(chemistry+maths+science+social+english);
    int totalmarks=sum;
    int average=(totalmarks/5);
    if (average>=91 && average<=100){
        grade="A";
    }
    else if(average>=81 && average<=90){
        grade="B";
    }
    else if (average>=71 && average<=80){
        grade="C";
    }
    else if(average>=61 && average<=70){
        grade="D";
    }
    else{
        grade="E";
    }
    System.out.println("total marks are"+totalmarks+" "+"total average is "+average+" "+"garde is "+grade);
    }
}

    