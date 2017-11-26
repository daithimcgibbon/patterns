package command;

public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in unix");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in unix");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in unix");
    }
}
