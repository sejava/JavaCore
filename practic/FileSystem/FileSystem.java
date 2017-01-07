package practic.FileSystem;

/**
 * Created by pan on 15.12.16.
 */
public class FileSystem {
    private byte systemCode;
    private long capacityInBytes;
    private String name;
    private int foldersCound;
    private int filesCound;

    public FileSystem(byte systemCode, long capacityInBytes, String name) {
        this.systemCode = systemCode;
        this.capacityInBytes = capacityInBytes;
        this.name = name;
        this.foldersCound = 0;
        this.filesCound = 0;
        //filesCount = 0;
        //foldersCount = 0;
    }

    public void setFoldersCound() {
        this.foldersCound++;
    }

    public void setFilesCound() {
        this.filesCound++;
    }
}
