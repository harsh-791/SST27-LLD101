public class consoleRender implements MediaRender {
    public void render(int dataSize) {
        System.out.println("\u25B6 Playing " + dataSize + " bytes");
    }
}
