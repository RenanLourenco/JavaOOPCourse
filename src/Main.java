import br.com.spotify.modelos.MinhasPreferidas;
import br.com.spotify.modelos.Musica;
import br.com.spotify.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("The light pt.II");
        musica.setArtista("Brockhampton");
        musica.setAlbum("Roadrunner");

        for (int i = 0; i < 3000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("dev");
        podcast.setHost("renan");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
        }

        System.out.println("Podcast curtidas: " + podcast.getCurtidas());
        System.out.println("Podcast reproducoes: " + podcast.getTotalReproducoes());

        System.out.println("Musica curtidas: " + musica.getCurtidas());
        System.out.println("Musica reproducoes: " + musica.getTotalReproducoes());

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();

        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);

    }
}