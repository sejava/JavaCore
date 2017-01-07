package practic;

import practic.FileSystem.*;
import practic.dbconfig.interfaces.DBServise;
import practic.dbconfig.interfaces.DeveloperDBServise;

/**
 * Created by pan on 18.12.16.
 */
public class Main {
    public static void main(String[] args) {



          //File system main
        FileSystem fileSystem = new FileSystem( (byte) 64, Long.MAX_VALUE, "testedFile");


        Folder folder = new Folder(fileSystem,"/pan/");
        File file = new File(32, folder);

        folder.setFiles(file);

        System.out.println("1");

        TextFile txtFile = new TextFile(100, folder);
        TextFile txtFile1 = new TextFile(100, folder, "Ann");

        System.out.println("2");

        File file1 = new TextFile(150, folder);
        File file2 = new TxtFile(250, folder);

        System.out.println("3");
        /**/
    }
}
