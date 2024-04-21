package ex13_JavaCodingInterview.OnlieLibray;

public class OnlineReaderSystem {
    private Displayer displayer;
    private Library library;
    private ReaderManger readerManger;

    private Reader reader;
    private Book book;

    public OnlineReaderSystem() {
        this.displayer = new Displayer();
        this.library = new Library();
        this.readerManger = new ReaderManger();
    }

    public void displayReader(Reader reader){
        this.reader=reader;
        displayer.displayReader(reader);
    }

    public void displayReader(String email){
        this.reader=readerManger.find(email);
        if(this.reader != null)
             displayer.displayReader(reader);
    }


}
