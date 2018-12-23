import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
public class Video {
    public String getFileName(File file){
        String name=file.getName();
        return name;
    }
    public long getFileWeight(File file){
        long weight=file.length();
        return weight;
    }
//    public static void reader(File file) throws Exception{
//        FileReader fr=new FileReader(file);
//        Scanner scan=new Scanner((fr));
//        int i=1;
//        while(scan.hasNextLine()){
//            System.out.println(i+". "+scan.nextLine());
//            i++;
//        }
//        fr.close();
//
//    }

}
