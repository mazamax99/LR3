//Спроектировать архитектуру ПО  для просмотра текстовых, мультимединых(фото,звук,видео) файлов
// и файлов произвольного формата (проектирование выполнить с учетом парадигмы ООП).
// открытие, выведение его названия
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Лабораторная работа №3");
        System.out.println("ПЭ-171 Поцуков Максим Николаевич");
        System.out.println("Условие:Спроектировать архитектуру ПО  для просмотра текстовых, мультимединых(фото,звук,видео) файлов\n" +
                " и файлов произвольного формата (проектирование выполнить с учетом парадигмы ООП).");
        System.out.println("=======================================================================================");
System.out.println("Write your path: ");
Scanner scan=new Scanner(System.in);
String path=scan.next();
File myFile= new File(path);
if(path.contains(".txt")) {
    TXT read = new TXT();
    System.out.println("Initialization file...");
    System.out.println("File name:"+read.getFileName(myFile));
    System.out.println("File weight:"+read.getFileWeight(myFile)+" bytes");
    System.out.println("Opening file...");
    System.out.println("File contains: ");
    read.reader(myFile);
}
        if(path.contains(".mp3")||path.contains(".wav")) {
            Audio read = new Audio();
            System.out.println("Initialization file...");
            System.out.println("Decoding file...");
            System.out.println("File name:"+read.getFileName(myFile));
            System.out.println("File weight:"+read.getFileWeight(myFile)+" bytes");
            System.out.println("Opening file...");
            //System.out.println("File contains: ");

        }
        if(path.contains(".avi")||path.contains(".mp4")) {
            Video read = new Video();
            System.out.println("Initialization file...");
            System.out.println("Decoding file...");
            System.out.println("File name:"+read.getFileName(myFile));
            System.out.println("File weight:"+read.getFileWeight(myFile)+" bytes");
            System.out.println("Opening file...");
            //System.out.println("File contains: ");

        }
        else
            System.out.println("Unknown format ...");
        }
        }


