/* constructor overloading is technique for having more then one constructor
with different parameter
 */

class  Employee
{
    String a;
    int b;
    String c;
    Employee()
    {

    }

    Employee(String name)
    {
        a = name;
    }

    Employee(int EmpNo , String Role)
    {
        b = EmpNo;
        c = Role;
    }

    void  display()
    {
//        System.out.println("Employee Details");
////        System.out.println("Employee name : ");
////        System.out.println("Employee No : ");
////        System.out.println("Employee Job Role : ");
//        System.out.println("Employee Details "+ "Employee Name " + a + "Employee no " + b + "Employee Job Role" + c);
        System.out.println(a +" " + b + " " + c);
    }
}

public  class Constructor5
{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("prabu");
        Employee e3 = new Employee(111,"Full-stack dev");

        e1.display();
        e2.display();
        e3.display();



    }
}