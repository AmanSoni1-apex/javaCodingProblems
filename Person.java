//  public class Person {
//     private String name;

//         Person(String name)
//         {
//             this.name=name;
//         }

//         String getname(){
//             return name;
//         }

//         public static void main(String[] args) {
//             Person p1= new Person("aman");
//             Student s1= new Student("Ashutoh",52);
//             p1.getname();
//             s1.showstudentinfo();
//         }
// }
// class Student extends Person{
//     // private String name;
//     private int rollno;

//     Student(String name , int rollno){
//         super("Student");
//         // this.name=name;
//         this.rollno=rollno;

//     }

//     void showstudentinfo()
//     {
//         System.out.println("The name of the student is :- "+getname()+" and the rollno of this student is :- "+rollno);
//     }
// }

// class person{
//     private String name;

//     person(String name){
//         this.name=name;
//     }

//     public static void main(String[] args) {
//         person p1 =new person("aman");
//         Student s1 =new Student("aman");

//     }

// }
// class Student extends person{
//     private String name;

//     Student()
//     {
//         super("student");
//     }

//     void showinfo()
//     {
//         System.out.println("The name of the parent is :- "+super.name +" and the name of the child is :- "+this.name);
//     }
// }

// public class Person{

//     private String name;

//     Person(String name)
//     {
//         this.name=name;
//     }

//     static void changeName(Person p1)
//     {
//         p1.name="updated name";
//     }
//     public static void main(String[] args) {

//      Person p1=new Person("aman");

//      System.out.println(p1.name);

//      changeName(p1);

//      System.out.println(p1.name);

//     }
// }

// public class Person{

//     private String name;

//     Person(String name)
//     {
//         this.name=name;
//     }

// static void changename(Person p1)
// {
//     p1.name="ashutosh";
// }
//     public static void main(String[] args) {
//         Person p1=new Person("aman");

//         System.out.println(p1.name);

//         changename(p1);

//         System.out.println(p1.name);
//     }
// }

// public class Person{

//     private String name;
//     Person(String name)
//     {
//         this.name=name;
//     }

//   static void changeName(Person p1)
//     {
//        p1.name="Ashutosh is the new updated name";
//     }

//     public static void main(String[] args) {
//         Person p1= new Person("john");
//         changeName(p1);
//         System.out.println(p1.name);
//     }
// }

// public class Person{

//     private String name;
//     private int age;
//     private int pid;

//     Person(String name)
//     {
//         this.name=name;
//     }

//     Person(String name , int age){
//         this.name=name;
//         this.age=age;

//     }

//     Person(String name , int age , int pid)
//     {
//         this.name=name;
//         this.age=age;
//         this.pid=pid;
//     }

//     public static void main(String[] args) {
//         Person p1=new Person("aman");    
//         Person p2=new Person("Ashutosh",23);    
//         Person p3=new Person("chintu",23,1);

//         System.out.println(p2.pid);
//         System.out.println(p3.pid);
//         System.out.println(p1.pid);
//         System.out.println(p1.name);
//         System.out.println(p1.age);
//     }
// }

// import java.time.Period;


import java.util.*;

// class Person {
//     public static void main(String[] args) {
//         List<student> p = new ArrayList<>();

//         p.add(new student("aman",24 ,"male"));
//         p.add(new student("Ashutosh",23,"male"));
//         p.add(new student("shivangi",24,"female"));
//         p.add(new student("chanchal",25,"female"));

//         Collections.sort(p,new namecomparator());
//         System.out.println(p);
//         // Collections.sort(p,new gendercomparator());
//         // Collections.sort(p,new agecomparator());
//         // Collections.sort(p , new Comparator<student>(){
//         //     public int compare(student s1, student s2)
//         //     {
//         //         // return s1.gender.compareTo(s2.gender);
//         //         return s1.age-s2.age;
//         //     }
//         // });
//         // System.out.println(p.toString());
//     }
// }

// class student{
//     String name;
//     int age;
//     String gender;

//     student(String name , int age, String gender)
//     {
//         this.gender=gender;
//         this.age=age;
//         this.name=name;

//     }

//     @Override
//     public String toString()
//     {
//         return  name + "("+age+")" + " gender "+gender;
//     }
// }

// class agecomparator implements Comparator<student>{

//     public int compare(student s1 , student s2)
//     {
//         return s2.age-s1.age;
//     }
// }

// class namecomparator implements Comparator<student>{

//     public int compare(student s1 , student s2)
//     {
//         return s1.name.compareTo(s2.name);
//     }
// }

// class gendercomparator implements Comparator<student>{
//     public int compare(student s1 , student s2)
//     {
//         return s1.gender.compareTo(s2.gender);
//     }
// }

// class Person implements Comparable<Person>{

//     String name;
//     int id;
//     String gender;
//     int salary;

//     Person(String name , int id, String gender , int salary)
//     {
//         this.gender=gender;
//         this.salary=salary;
//         this.name=name;
//         this.id=id;
//     }

//     public int compareTo(Person other){
//         // return this.gender.compareTo(other.gender);
//         return this.salary-other.salary;
//     }

//     // public String toString()
//     // {
//     //     return id+"-"+name+"-"+gender+"-"+salary;
//     // }

//     public static void main(String[] args) {

//         Person p1=new Person("ama",52,"male",4500000);
//         List<Person> l=new ArrayList<>();

//         l.add(new Person("Aman",1 ,"male",100000));
//         l.add(new Person("Ashutosh",2 , "male",200000));
//         l.add(new Person("Chintu",3,"male",3000000));

//         // Collections.sort(l);
//         System.out.println(p1);
//         // System.out.println(p1.getClass());
//     }
// }

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> pr = new ArrayList<>();
        pr.add(new Person("aman", 25));
        pr.add(new Person("am", 23));

        Collections.sort(pr, new Agecomparator());
        System.out.println(pr);
    }

    public String toString() {
        return name + "-" + age;
    }

}

class Agecomparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.age - p2.age;
    }
}

class nameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}
