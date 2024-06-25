package libraryProject;

public class Library
{
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();


        book1.title = "Ogniem i Mieczem";
        book1.author = "Henryk Sienkiewicz";

        System.out.println("Wyswietl tytul i autora: " + book1.title+ " " +book1.author);
    }
}
