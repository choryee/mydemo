package ex08_Java_ParkEunJong;

public class JavaVersionCheck {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println("Java 버전: " + version);
    }
}