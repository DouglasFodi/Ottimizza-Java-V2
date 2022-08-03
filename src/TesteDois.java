public class TesteDois {

    public static String concatenarString(String[] text) {
        StringBuilder concatenarString = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
            concatenarString.append(text[i]);
            concatenarString.append(" "); // faz o espaçamento entre cada palavra.
        }

        String textConcatenado = concatenarString.toString();

        return textConcatenado;
    }

    public static void main(String[] args) {
        System.out.println(concatenarString(new String[] { "CARLOS", "EDUARDO", "DA", "COSTA", "XAVIER" }));
        // Retorno pós estar concatenado
    }
}