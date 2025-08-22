package utils;

import java.io.*;
import java.nio.file.*;

public class FileManager {

    // إنشاء ملف جديد
    public static boolean createFile(String path) {
        try {
            File file = new File(path);
            if (file.exists()) return false;
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // كتابة نص إلى الملف (استبدال المحتوى)
    public static boolean writeFile(String path, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // إضافة نص إلى الملف (Append)
    public static boolean appendToFile(String path, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(content);
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // قراءة ملف كامل كنص
    public static String readFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // حذف ملف
    public static boolean deleteFile(String path) {
        try {
            return Files.deleteIfExists(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // التحقق من وجود الملف
    public static boolean fileExists(String path) {
        return Files.exists(Paths.get(path));
    }
}
