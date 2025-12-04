import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class JavaCopyFile {

    public static void main(String[] args) throws InterruptedException, IOException {

        File source = new File("/Users/oleg/Documents/программирование/системное программирование/8 лаба (асинхронность)/source.txt");
        File destination = new File("/Users/oleg/Documents/программирование/системное программирование/destination.txt");
        long start = System.nanoTime();
        copyFileUsingJava7Files(source, destination);
        System.out.println("Время копирования файла с помощью класса Files Java 7 = " + (System.nanoTime() - start));

        File source1 = new File("/Users/oleg/Documents/программирование/системное программирование/8 лаба (асинхронность)/source1.txt");
        File destination1 = new File("/Users/oleg/Documents/программирование/системное программирование/destination1.txt");
        moveFileUsingJava7Files(source1, destination1);
        System.out.println("Время перемещения файла = " + (System.nanoTime() - start));
    }

    private static void copyFileUsingJava7Files(File source, File destination) throws IOException {
        Files.copy(source.toPath(), destination.toPath());
    }

    private static void moveFileUsingJava7Files(File source, File destination) throws IOException {
        Files.move(source.toPath(), destination.toPath());
    }

}