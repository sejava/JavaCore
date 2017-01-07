package practic.FileSystem;

/**
 * Created by pan on 18.12.16.
 */
public class Folder {
    private File[] files = new File[1000];
    private String path;

    private int idex =0;

    public Folder(FileSystem fileSystem, String path) {
        this.path = path;
        fileSystem.setFoldersCound();
    }

    public void setFiles(File file) {
        files[idex] = file;
        idex++;
    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
