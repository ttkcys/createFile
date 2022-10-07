package workingwithfiles;

import java.io.File;
import java.io.IOException;

public class WorkingWithFiles {

    public static void main(String[] args) {
        File file = new File("D:\\JavaDemos\\Files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Created File");
            }else{
                System.out.println("The file already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
