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

public class Person{

    private String name;
    private int age;
    private int pid;
    
    
    Person(String name)
    {
        this.name=name;
    }

    Person(String name , int age){
        this.name=name;
        this.age=age;

    }

    Person(String name , int age , int pid)
    {
        this.name=name;
        this.age=age;
        this.pid=pid;
    }

    public static void main(String[] args) {
        Person p1=new Person("aman");    
        Person p2=new Person("Ashutosh",23);    
        Person p3=new Person("chintu",23,1);
        
        System.out.println(p2.pid);
        System.out.println(p3.pid);
        System.out.println(p1.pid);
    }
}

     
