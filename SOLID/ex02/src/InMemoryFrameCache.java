class InMemoryFrameCache implements FrameCache {
    private Frame lastFrame;
    
    public void store(Frame frame) {
        this.lastFrame = frame;
    }
    
    public boolean hasLastFrame() {
        return lastFrame != null;
    }
}