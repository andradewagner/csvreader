package principal;

import java.util.HashMap;
import java.util.Map;

public class ArquivoCSV {
    private Map<String, String> testes;

    public ArquivoCSV() {
        testes = new HashMap<String, String>();
    }

    public Map<String, String> getTestes() {
        return testes;
    }

    public void setTestes(Map testes) {
        this.testes = testes;
    }
}
