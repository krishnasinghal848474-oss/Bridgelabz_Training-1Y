package Single_Inheritance;

public class Runner {
    public static void main(String[] args) {
        Author a=new Author();
        a.title="Effective java";
        a.year=2024;
        a.name="Joshua Bloch";
        a.bio="Software engineer";
        a.display_info();
    }
}
