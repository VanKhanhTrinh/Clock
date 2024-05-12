import java.io.File;
import java.util.Scanner;

public class BT2 {
    public static void deletePath(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                deleteDirectory(file);
                System.out.println("Đã xoá thư mục: " + path);
            } else {
                file.delete();
                System.out.println("Đã xoá tệp tin: " + path);
            }
        } else {
            System.out.println("Đường dẫn '" + path + "' không tồn tại.");
        }
    }

    public static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }

    public static void main(String[] args) {
        String path = "";
        System.out.println("Hãy nhập đường dẫn đến thư mục( hoặc file) cần xóa: ");
        Scanner sc = new Scanner(System.in);
        path = sc.nextLine();
        deletePath(path);
    }
}