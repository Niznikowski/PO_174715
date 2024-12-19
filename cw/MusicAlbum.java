public class MusicAlbum {
    private String title;
    private String artist;
    private double[] ratings;

    public MusicAlbum(String title, String artist, double[] ratings) {
        this.title = title;
        this.artist = artist;
        this.ratings = ratings;
    }

    public void dodajOcene(double ocena){
        ratings[ratings.length] = ocena;
    }
    public void usunOcene(double ocena){
        double[] tab = new double[ratings.length];
        int j = 0;
        for(double i: ratings){
            if(i != ocena){
                tab[j] = i;
                j++;
            }
        }
    }
}
