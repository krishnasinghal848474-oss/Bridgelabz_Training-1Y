package Library.members;
public class Member {
    public String name;
    public int id;
    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void showMember() {
        System.out.println("Member"+name+"(ID"+id+")");
    }
}
