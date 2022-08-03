import java.util.zip.DataFormatException;
public class TesteUm {
    //Transforma os formatos de data em yyyy-MM
    public static String ConverterData(String date) throws DataFormatException {
        try {
            if (date.contains("/")) { //Se a data conter / pega yyyy MM
                String[] dataFormatada = date.split("/");
                return dataFormatada[2] + " " + dataFormatada[1];
            } else if (date.contains(" ")) {
                String[] dataFormatada = date.split(" ");
                if (dataFormatada[0].length() == 4) {
                    return dataFormatada[0] + " " + dataFormatada[1];
                } else {
                    return dataFormatada[2] + " " + dataFormatada[1];
                }
            } else { // formata para impressão em yyyy MM
                String mes = date.substring(2, 4);
                String ano = date.substring(4, 8);
                return ano + " " + mes;
            } 
        } catch (Exception e) {
            // Exemplo dos formatos que podem ser usados. //  1-dd/MM/yyyy    2-dd-MM-yyyy    3-ddMMyyyy  4-yyyy-MM-dd
            throw new DataFormatException("Formato de data invalido. Exemplo de data valido: 01/05/2018 ou 01 05 2018 ou 01052018 ou 2018 05 01");
        }
    }
    public static void main(String[] args) throws DataFormatException {
        //Inserir datas abaixo se deixar em branco código apresenta erro
        System.out.println(ConverterData("01/05/2018"));
        System.out.println(ConverterData("01 05 2018"));
        System.out.println(ConverterData("01052018"));
        System.out.println(ConverterData("2018 05 01"));
    }
}
