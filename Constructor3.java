/* the default constructor is used to provide the default values to the object.
like 0 , null , false etc. depending on the type
 */
class  Student
{
    int id;
    String Name;
    boolean isPassed;

    double rollno ;

    void  display()
    {
        System.out.println(id + " " + Name + " " + isPassed + " " + rollno);
    }
}
public  class Constructor3
{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.display();
        s2.display();
        s3.display();
    }
}