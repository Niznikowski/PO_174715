public class Vector extends ComputerGraphic {
    public Vector(int width, int height, String fileName){
        super(width, height, fileName);
    }
    @Override
    public void loadFile(String fileName){
        System.out.println("Loading file: " + fileName);
    }
    @Override
    public void saveFile(String fileName){
        System.out.println("Saving file: " + fileName);
    }
}
