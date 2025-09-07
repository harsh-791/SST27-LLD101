package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    static Decoder dec = new Decoder();
    static FilterEngine fe = new FilterEngine();
    static Encoder enc = new Encoder();

    public static Path process(Path src, Path out, Double scale) {

        Frame[] frames = dec.decode(src);
        frames = fe.grayscale(frames);
        frames = fe.scale(frames, scale);

        Path ans = enc.encode(frames, out);
        return ans;
    }
}
