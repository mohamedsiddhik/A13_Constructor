
class  Student2
{
    int a;
    String b;
    double c;
    boolean d;
    char e;

    Student2(int id  , String name  , double percentage , boolean isPassed , char grade )
    {
         a = id;
         b = name;
        c = percentage;
        d = isPassed;
        e = grade;
    }

    void  display()
    {
        System.out.println(a + " " +b + " " + c+ " " +d+ " " +e  );
    }
}
public  class Constructor4
{
    public static void main(String[] args) {
        Student2 s1 = new Student2(101,"magesh babu" , 77.5,true, 'A' );
        Student2 s2 = new Student2(102,"Nandamuri balakrishna " , 67.8,false,'C');
        Student2 s3 = new Student2(103, "Allu arjun" , 89.4,true,'A');

        s1.display();
        s2.display();
        s3.display();
    }
}