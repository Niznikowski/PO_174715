public abstract class ComputerGraphic {
    private int width;
    private int height;
    private String fileName;
    public ComputerGraphic(int width, int height, String fileName) {
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }
    public abstract void loadFile(String fileName);
    public abstract void saveFile(String fileName);
}
