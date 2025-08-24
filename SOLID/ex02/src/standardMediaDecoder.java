public class standardMediaDecoder implements MediaDecoder {
    public Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
}
