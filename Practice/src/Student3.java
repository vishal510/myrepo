class Student3{
int id;
String name;

void display(){System.out.println(id+" "+name);}

public static void main(String args[]){
Student3 s1=new Student3();
s1.id = 101;
s1.name = "vishal";
Student3 s2=new Student3();
s1.display();
s2.display();
}
}