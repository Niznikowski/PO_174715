public class AudioPlayer implements MediaPlayer{
    private String trackName;
    public AudioPlayer(String trackName){
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
