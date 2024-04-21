package ex11_DesignPatten_ChoiJuHo.proxy1;


// Subject 인터페이스
interface Image {
    void display();
}

// RealSubject 클래스
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// Proxy 클래스
class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

public class ProxyPatternEx {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // 이미지 로딩이 발생하지 않음
        image1.display();
        System.out.println("---------");

        // 이미지 로딩이 발생
        image2.display();
        System.out.println("---------");

        // 이미지 로딩이 이미 발생한 경우에는 다시 로딩하지 않음
        image1.display();
        image2.display();
    }
}

