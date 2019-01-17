package principal;

public class NIOLeitorArquivoCSV {

    public static void main(String [] args) {
        ArquivoCSV csv = new ArquivoCSV();
        csv.setTestes(LeitorCSV.lerArquivoCSV());
        System.out.println(csv.getTestes());
    }
}
