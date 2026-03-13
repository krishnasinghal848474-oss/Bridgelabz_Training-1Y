package Library.Transactions;
import Library.Books.Book;
import Library.members.Member;
public class Transaction {
    public void issueBook(Book book, Member member) {
        System.out.println("Issuing"+book.title+"to"+member.name);
        System.out.println("Status: Success");
    }
}
