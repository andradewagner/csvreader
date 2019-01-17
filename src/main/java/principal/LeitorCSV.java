package principal;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.PropertyResourceBundle;

public class LeitorCSV {

    public static Map<String, String> lerArquivoCSV() {

        String caminhoCSV = "";
        Map conteudoCSV = new HashMap<String, String>();

        File arquivoProperties = new File("src/main/resources/config.properties");
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(arquivoProperties));
            PropertyResourceBundle prb = new PropertyResourceBundle(is);
            Enumeration<String> atributos = prb.getKeys();
            while(atributos.hasMoreElements()) {
                caminhoCSV = prb.getString(atributos.nextElement());
                carregarArquivo(caminhoCSV, conteudoCSV);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return conteudoCSV;
    }

    private static void carregarArquivo(String caminhoCSV, Map conteudoCSV) {

        String linha = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(caminhoCSV));

            //descartando primeira linha
            br.readLine();

            while((linha = br.readLine()) != null) {
                String[] cenarios = linha.split(",");
                conteudoCSV.put(cenarios[0].trim(), cenarios[1].trim());
            }

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
