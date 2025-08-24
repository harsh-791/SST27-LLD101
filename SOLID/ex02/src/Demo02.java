public class Demo02 {
    public static void main(String[] args) {
        MediaDecoder decoder = new standardMediaDecoder();
        MediaRender renderer = new consoleRender();
        FrameCache cache = new InMemoryFrameCache();
        Player player = new Player(decoder, renderer, cache);
        player.play(new byte[]{1,2,3,4});
    }
}
