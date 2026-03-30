import java.util.Scanner;
class Student{
  String name;
  int marks;
  
  Student(String name,int marks){
      this.name=name;
      this.marks=marks;
  }
  void display(){
      System.out.println("student name is -: "+name);
      System.out.println(name+" student marks is-: "+marks);
  }
}

public class First{
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        int count=myScanner.nextInt();
        myScanner.nextLine();
        Student[] students=new Student[count];
        for(int i=0; i<count; i++){
            System.out.println("Enter your "+i+"  student name");
            String name=myScanner.nextLine();
            System.out.println("Enter your student "+name+" marks");
            int marks=myScanner.nextInt();
            myScanner.nextLine();
            students[i]=new Student(name,marks);
        }
      System.out.println("Student details");
      for(int j=0; j<count; j++){
        students[j].display();
      }
      int highest_marks=students[0].marks;
      String highest_marks_student=students[0].name;
      int lowest_marks=students[0].marks;
      String lowest_marks_student=students[0].name;
      for(int m=1; m<count; m++){
          if(highest_marks<(students[m].marks)){
              highest_marks=students[m].marks;
              highest_marks_student=students[m].name;
          }
          if(lowest_marks>(students[m].marks)){
              lowest_marks=students[m].marks;
              lowest_marks_student=students[m].name;
          }
      }
      System.out.println("Highest marks Student is-: ");
      System.out.println(highest_marks_student+":"+highest_marks);
      System.out.println("lowest marks Student is-: ");
      System.out.println(lowest_marks_student+":"+lowest_marks);
    }
}






