package tutorials.javase;

import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

// C:\io\ecodation
@Log4j2
public class _21_FileReaderWriter {

    //  const
    private static final String URL = "C:\\io\\ecodation\\eco7.txt";

    //USER DATA
    public static String userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String user = klavye.nextLine().concat(" ").concat(String.valueOf(new Date(System.currentTimeMillis())));
        return user;
    }

    //WRITE
    public static void myFileWriter(String url) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(URL, true))) {
            String data = userData();
            bufferedWriter.write(data+"\n");
            bufferedWriter.flush();
            System.out.println("Başarılı bir şekilde yazıldı");
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //READER
    public static void myFileReader(String url) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(URL))) {
            StringBuilder stringBuilder = new StringBuilder();
            String rows = "";

            while ((rows = bufferedReader.readLine()) != null) {
                stringBuilder.append("\n").append(rows);
            }
            String data = stringBuilder.toString();
            log.info(data);
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //CHOOICE
    public static void allFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen seçim yapınız.");
        System.out.println("1-)Yazmak\n2-)Okumak\n3-)Exit");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                myFileWriter(URL);
                break;

            case 2:
                myFileReader(URL);
                break;

            case 3:
                System.out.println("Çıkış yapılıyor");
                System.exit(0);
                break;

            default:
                System.out.println("Lütfen belirtilenleri seçiniz");
                break;
        }
    }

    public static void main(String[] args) {
        while (true){
            allFile();
        }
    }
}
