import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.infobae.com/";
        String html = WebScrapper.cargarWeb(url);
        List<String> noticias = WebScrapper.obtenerTitulos(html);
        System.out.println(html);

        noticias.forEach(noticia-> System.out.println(noticia));
    }
}
