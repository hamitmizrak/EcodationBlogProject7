package tutorials.javase;

import java.io.File;

// C:\io\ecodation
public class _21_File {

    public static void main(String[] args) {
        String URL="C:\\io\\ecodation\\eco7.txt";
        File file=new File(URL); //755

        //CAN
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println("********************************");

        //IS
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println("********************************");

        //GET
        System.out.println(file.getTotalSpace());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.getParent()+"\\"+file.getName());

        System.out.println("********************************");

        //SET
        System.out.println(file.canExecute());
        System.out.println(file.setExecutable(false));

        //YAZMAK
        //OKUMAK
    }
}
