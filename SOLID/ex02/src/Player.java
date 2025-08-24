public class Player {
    private MediaDecoder decoder;
    private MediaRender renderer;
    private FrameCache cache;

    public Player(MediaDecoder decoder, MediaRender renderer, FrameCache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    void play(byte[] fileBytes){
        // decode
        Frame f = decoder.decode(fileBytes);
        
        // draw UI
        renderer.render(fileBytes.length);
        // cache
        cache.store(f);
    }
}