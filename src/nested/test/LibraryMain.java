package nested.test;

public class LibraryMain {
    public static void main(String[] args) {
        Library1 library = new Library1(3);
        library.addBook("책", "저자1");
        library.addBook("책", "저자2");
        library.addBook("책", "저자3");
        library.addBook("책", "저자4");
        library.showBooks();
    }
}
