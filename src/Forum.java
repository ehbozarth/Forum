import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by earlbozarth on 10/15/15.
 */
public class Forum {
    public static void main(String[] args) {

    }//End of Main Method

    static String readFile(String fileName){
        File f = new File(fileName);
        try{
            FileReader fr = new FileReader(f);
            int fileSize = (int) f.length();
            char [] fileContent = new char[fileSize];
            fr.read(fileContent);
            return new String(fileContent);
        }//End of try
        catch (Exception e){
            System.out.println("Error...Error...Error");
            return null;
        }//End of catch
    }//end of readFile

    static void writeFile(String fileName,String fileContent){
        File f = new File(fileName);
        try{
            FileWriter fw = new FileWriter(f);
            fw.write(fileContent);
            fw.close();
        }//End of Try
        catch(Exception e){
            System.out.println("Error...Error...Error");
        }//End of Catch
    }//End of wrtieFile

}//End of Forum Class
