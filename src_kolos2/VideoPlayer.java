public class VideoPlayer implements MediaPlayer{
    private String trackName;
    public VideoPlayer(String trackName){
        this.trackName = trackName;
    }
    @Override
    public void play(String trackName) {
        System.out.println("Playing " + trackName);
    }
    @Override
    public void pause(){
        System.out.println("Paused");
    }
    @Override
    public String getCurrentTrack(){
        return trackName;
    }
}
