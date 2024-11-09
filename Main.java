class Employee{
    int empno;
    String name;
    float sal;

    Employee(){
        System.out.println("******");
        empno= 101;
        name= "Tanishq";
        sal= 450000f;
    }

    public void displaydetails(){
        System.out.println(empno + '|' + name + '|' +sal );
    }
}

class Main{
    public static void main(String[] args){
        Employee emp1= new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.displaydetails();
        emp2.displaydetails();
        emp3.displaydetails();

    }
}