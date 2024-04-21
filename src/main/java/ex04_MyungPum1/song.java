package ex04_MyungPum1;

public class song {

    private String title;

    song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        song mySong = new song("Nessun Dorma  ");
        song yourSong = new song("공주는 잠 못");
        System.out.println("내 노래는" + mySong.getTitle());
        System.out.println("내 노래는" + yourSong.getTitle());
    }

}
