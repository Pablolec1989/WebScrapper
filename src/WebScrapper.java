import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WebScrapper {

    public static List<String> obtenerTitulos(String html) {
        List<String> titulares = new ArrayList<>();
        String[] corteh2_inicial = html.split("<h3");

            for (String noticia : corteh2_inicial) {
                String[] corteh2_final = noticia.split("</h3>");

                String titularSucio = corteh2_final[0];
                String[] splitTitularSucio = titularSucio.split(">");
                String titular = splitTitularSucio[1];

                if(titular.length() > 20);
                titulares.add(titular);
            }
        return titulares;
    }

    public static String cargarWeb(String urlStr) {
        String html="";

        try {
            URL url = new URL(urlStr);
            InputStreamReader reader = new InputStreamReader(url.openStream());
            BufferedReader buffer = new BufferedReader(reader);

            String linea;

            do
            {
                linea = buffer.readLine();
                html += linea;
            }
            while (linea != null);
            buffer.close();

        }catch (Exception exception){
            System.out.println("Hubo un problema al cargar la web");
        }
        return html;
    }
}
