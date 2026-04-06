
// public class Horse {
//     String breed="Mustang";
//     int age=12;
//     double price=123456;
//     String sound="neigh";
//     Boolean isAlive=true;

//     void kill(){
//         isAlive=false;
//         System.out.print("You just killed the horse!!");
//     }

//     void resurrect(){
//         isAlive=true;
//         System.out.print("Jesus resurrected the horse!");
       
//     }
//      Horse(String breed,int age,double price){
//             this.breed=breed;
//             this.age=age;
//             this.price=price;

//         }


// }

public class Student{

    String name;
    int age;
    float gpa;
    String course;


    Student(String name,int age,float gpa,String course){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        this.course=course;
}
void study(){
    System.out.println(name+" is studying!");
}

} 

