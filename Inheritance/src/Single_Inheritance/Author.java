package Single_Inheritance;

public class Author extends Book{
    String name;
    String bio;
    public void display_info(){
        super.display_info();
        System.out.println("Name of author is-"+name);
        System.out.println("bio of author is-"+bio);
    }
}
