package practic.FileSystem;

/**
 * Created by pan on 18.12.16.
 */
public class File {
    private long size;
    private Folder folder;

    public File(long size, Folder folder) {
        this.size = size;
        this.folder = folder;
    }
}
