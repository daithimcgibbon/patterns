package command;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying system is " + osName);
        if(osName.contains("windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
