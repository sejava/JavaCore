package practic.FileSystem;

import java.util.Date;

/**
 * Created by pan on 18.12.16.
 */
public class TextFile extends File {
    private  String ownerName;
    private Date dateCreated;

    public TextFile(long size, Folder folder, String ownerName) {
        super(size, folder);
        this.ownerName = ownerName;
    }

    public TextFile(long size, Folder folder, Date dateCreated, String ownerName) {
        super(size, folder);
        this.ownerName = ownerName;
        this.dateCreated = dateCreated;
    }

    public TextFile(long size, Folder folder) {
        super(size, folder);
    }
}
