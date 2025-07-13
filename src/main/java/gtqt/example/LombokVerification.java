package gtqt.example;

// LombokVerification.java
import lombok.Getter;

@Getter
public class LombokVerification {
    private final String status = "WORKING";

    public static void main(String[] args) {
        LombokVerification instance = new LombokVerification();
        System.out.println("Lombok status: "+instance.getStatus());
        System.out.println("Verification complete!");
    }
}