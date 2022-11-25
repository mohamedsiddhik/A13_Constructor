
//copy Constructor

class  Student4
{
    int a;
    String b;

    Student4(int age , String name)
    {
        b = name;
        a = age;
    }

    Student4(Student4 scopy)
    {
        a = scopy.a;
        b = scopy.b;

    }

    void  display()
    {
        System.out.println("name : " + b + " age : " + a);
    }
}


public  class Constructor6
{
    public static void main(String[] args) {

        Student4 s2 = new Student4(24,"mohamed");
        Student4 s3 = new Student4(s2);

        s2.display();
        s3.display();
    }
}