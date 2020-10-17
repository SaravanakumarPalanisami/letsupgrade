
class Employee{
    int age;
    String name,city;
    public void display(){
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The city is "+city);
    }
    public static void main(String[] args) {
        
        Employee e1=new Employee();
        e1.age=22;
        e1.name="Saurabh";
        e1.city="Chennai";
        e1.display();
        Employee e2=new Employee();
        e2.age=32;
        e2.name="Saravana";
        e2.city="Salem";
        e2.display();



        
    }
}