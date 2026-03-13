import java.util.Scanner;
class Student{
    String name;
    int age;
    int indexno;
    
    Student(String name,int age,int indexno)
    {
        this.name=name;
        this.age=age;
        this.indexno=indexno;
    }
    
    void display(){
        System.out.println("name is : "+name);
        System.out.println("age is : "+age);
        System.out.println("indexno is :"+indexno);
    }
}
public class First{
    public static void main(String[] args)
    {
        Scanner myScanner=new Scanner(System.in);
       System.out.println("Enter how much student you want to add ");
       int count=myScanner.nextInt();
       Student[] Students=new Student[count];
       for(int i=0; i<count; i++)
       {
           System.out.println("Enter your student name ");
           myScanner.nextLine();
           String name=myScanner.nextLine();
           System.out.println("Enter your age");
           int age=myScanner.nextInt();
           System.out.println("Enter your indexno");
           int indexno=myScanner.nextInt();
           Students[i] =new Student(name,age,indexno);
           
       }
       System.out.println("Your students details");
       System.out.println();
       for(int j=0; j<count; j++){
           Students[j].display();
           System.out.println();
       }
    }
}
