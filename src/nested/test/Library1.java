package nested.test;

public class Library1 {

    private Book[] books;

    private int bookCount = 0;

    public Library1(int size) {
        books = new Book[size];

    }

    public void addBook(String title, String author) {
        if(bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 출력 목록 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목 : " + books[i].title + ", 저자 : " + books[i].author);
        }

    }

    private static class Book {
        private String title;

        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
