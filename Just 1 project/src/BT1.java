import java.io.File;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        String path;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn: ");
        path = sc.nextLine();
        File file = new File(path);
        long fileSize = file.length();
        System.out.println(fileSize + "KB");
    }

}

