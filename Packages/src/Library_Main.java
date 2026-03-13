import Library.Books.Book;
import Library.members.Member;
import Library.Transactions.Transaction;
public class Library_Main {
    public static void main(String[] args) {
        Book b = new Book("Clean Code", "Robert Martin");
        b.showBook();
        Member m = new Member("Gaurav", 101);
        m.showMember();
        Transaction t = new Transaction();
        t.issueBook(b, m);
    }
}
