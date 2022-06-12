package chap5;

class Book {
    private String title, writer;
    private int pages;

    public Book(String title, int pages, String writer) {
        this.title = title;
        this.pages = pages;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "책이름:" + title + "\n페이지 수:" + pages + "\n저자:" + writer;
    }
}

public class Magazine extends Book{
    public Magazine(String title, int pages, String writer, String date) {
        super(title, pages, writer);
        this.date = date;
    }

    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n발매일:" + date;
    }

    public static void main(String[] args) {
        Magazine a = new Magazine("잡지A", 10, "기자A", "2010년 2월 25일");
        Magazine b = new Magazine("잡지B", 20, "기자B", "2010년 3월 8일");

        System.out.println(a);
        System.out.println(b);
    }
}
