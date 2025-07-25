/*************************************************************************
 *
 *              Inheritance Main class
 *
 ************************************************************************/

public class Main
{
    public static void main (String[]args)
    {
        Person someone = new Person("Adel",60);     //grand parent
        Student student1= new Student("Ahmed Adel",28,"Sd1R3",'A'); //parent 1
        Teacher teacher1= new Teacher("Mustafa Adel",35,"teach1R3","Math"); //parent 2
        UnderGradStudent UG1= new UnderGradStudent("Omar Mustafa Adel",18,"UG101",'B',"History",2023); //child 1
        GraduatedStudent GS1= new GraduatedStudent("Osama Mustafa Adel",20,"GS503",'A',2029);       //child 2

        System.out.println("\nGrand/Super parent Data: ");
        System.out.println("******");
        someone.displayInfo();
        someone.celebratingBirthday();
        System.out.printf("_____________________________________\n");

        System.out.println("\n1st parent Data (Student): ");
        System.out.println("******");

        student1.displayInfo();
        student1.celebratingBirthday();
        student1.study();
        System.out.printf("_____________________________________\n");
        System.out.println("\n2nd parent Data (Teacher): ");
        System.out.println("******");
        teacher1.displayInfo();
        teacher1.celebratingBirthday();
        teacher1.teach();
        System.out.printf("_____________________________________\n");

        System.out.println("\n1st grand child Data (UnderGraduated Student): ");
        System.out.println("******");
        UG1.displayInfo();
        UG1.declaringMajor();
        System.out.printf("_____________________________________\n");

        System.out.println("\n2nd grand child Data (Graduated Student): ");
        System.out.println("******");
        GS1.displayInfo();
        GS1.declareGraduationYear();

        System.out.println("");

    }
}
