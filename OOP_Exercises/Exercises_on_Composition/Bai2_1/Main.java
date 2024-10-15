package Exercises_on_Composition.Bai2_1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(author1);
        author1.setEmail("paulTan@nowhere.com");
        System.out.println("Name is: " + author1.getName());
        System.out.println("Email is: " + author1.getEmail());
        System.out.println("Gender is: " + author1.getGender());

        Book book1 = new Book("Java for dummy", author1, 19.95, 99);
        System.out.println(book1);

        book1.setPrice(29.95);
        book1.setQty(28);
        System.out.println("Name is: " + book1.getName());
        System.out.println("Name is: " + book1.getPrice());
        System.out.println("Name is: " + book1.getQty());
        System.out.println("Name is: " + book1.getAuthor());
        System.out.println("Author's name is: " + book1.getAuthor().getName());
        System.out.println("Author's email is: " + book1.getAuthor().getEmail());

        Book book2 = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(book2);
    }
}
