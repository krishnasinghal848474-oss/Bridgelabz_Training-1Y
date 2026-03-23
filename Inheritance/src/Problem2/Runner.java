package Problem2;

public class Runner {
    public static void main(String[] args)
    {
        Manager m = new Manager();
        m.name="Krishna";
        m.id=101;
        m.salary=90000;

        Developer d = new Developer();
        d.name="Aadarsh";
        d.id=102;
        d.salary=80000;

        Intern i = new Intern();
        i.name="Gaurav";
        i.id=103;
        i.salary=70000;

        m.Display_details();
        d.Display_details();
        i.Display_details();
    }

}

