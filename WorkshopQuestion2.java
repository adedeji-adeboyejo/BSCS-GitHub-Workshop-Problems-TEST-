package GitHubWorkshopQuestions;

class Book{
    String title; //ERROR: should be private
    String author;
    int pages;

    public Book(String bookName, String author, int numPages){ 
        title = bookName; 
        author = author; //ERROR: improper initialization
        pages = numPages;
    }

    public String getTitle(){
        return "Harry Potter and the Sorcerer's Stone"; //ERROR: should return the title of the book, not some random String
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public void displayInfo(){
        System.out.println(getTitle() + " by " + author + ", " + pages + " pages");
    }
}

class EBook extends Book{
    double fileSize;

    public EBook(String title, String author, int pages, double fileSize){
        super(title, author, pages); //ERROR: super() is missing the argument for pages
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo(String msg){ //ERROR: when overriding a method, the siganture CANNOT change
        System.out.println(title + " by " + author + ", " + pages + " pages, " + fileSize + " MB"); 
        //ERROR: since title is supposed to be a private variable, getTitle() should be used!
    }
}


public class WorkshopQuestion2 {
    public static void main(String[] args){
        Book book = new Book("1984", "George Orwell", 328);
        EBook ebook = new EBook("Clean Code", "Robert Martin", 450, 2.5);

        Book[] library = new Book[2];
        library[0] = book;
        library[1] = ebook;

        System.out.println("Welcome to the Library! Here are the available books:");
        for(int i = 0; i < library.length; i++){ //ERROR: off by one, should be "i <= library.length;"
            System.out.print("* ");
            library[i].displayInfo();
        }
    }
}
