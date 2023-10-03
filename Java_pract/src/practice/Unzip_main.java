package practice;


public class Unzip_main {
    public static void main(String[] args) {
        String zipFilePath = "/home/aditya/Downloads/Study.zip";
        String destDirectory = "/home/aditya/Music";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }
}