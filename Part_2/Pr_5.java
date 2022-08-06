// Develop a Program that illustrate method overloading concept. 

import java.util.*;;

public class Pr_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S_name,S_roll,S_branch,P_name,P_degree;
        int experience;
        long salary;
        System.out.println("Student Information");
        System.out.print("Name of student : ");
        S_name = s.next();
        System.out.print("Roll no of student : ");
        S_roll = s.next();
        System.out.print("Branch student studies in : ");
        S_branch = s.next();
        System.out.println("Faculty Information");
        System.out.print("Name of professor : ");
        P_name = s.next();
        System.out.print("Degree of professor : ");
        P_degree = s.next();
        System.out.print("Experience of teaching : ");
        experience = s.nextInt();
        System.out.print("His/her salary : ");
        salary = s.nextLong();
        System.out.println("**********************************");
        System.out.println("Information of Student : ");
        Student.information(S_roll,S_name,S_branch);        
        System.out.println("**********************************");
        System.out.println("Information of professor : ");
        Student.information(P_name,P_degree,experience, salary);
    }

    public class Student {
        public static void information(String roll_no,String name,String branch)
        {
            System.out.println("The name of the Student is  :"+name);
            System.out.println("The roll no of the student is  "+roll_no);
            System.out.println(name+ " studies in "+branch);
        }
        public static void information(String name ,String degree,int experience,long salary)
        {
            System.out.println("Name of the professor is  :"+name);
            System.out.println(name+" has compleated "+degree);
            System.out.println(name+ "have "+experience+" years of teaching");
            System.out.println(name+ " has been given "+salary+" rs of salary per year");
        }
        
    }
}


