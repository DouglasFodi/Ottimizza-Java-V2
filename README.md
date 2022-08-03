"# Ottimizza-Java-V2" 

Teste Realizado no dia "03/08/2022"


Parte 4

1.) Cria e inicializa ou instancia um array de inteiros

```java
  int [] abas = {0,1,2};
```
2.) Verifica se uma *String* começa com 0, caso sim inicia um *loop for* até 10, para remover os zeros repetidos.  
Faz isso por verificar se o caractere inicial da string é 0 e assim poder removê-lo.

```java
    if (documento.startsWith("0")) {
      for (int xx=0;xx<10;xx++) {
        if (documento.length() > 1 && documento.startsWith("0")) {
          documento = documento.substring(1);
        }
      }
    }
```
3.)  Cria e inicializa uma *String* editável, para posteriormente poder inserí-la em um arquivo.
Na linha 4, abre um arquivo para fazer sua edição, na linha 5, edita o arquivo utilizando a *String* anteriormente criada.

```java
    StringBuilder txtDados = new StringBuilder();
    txtDados.append("Este é um exemplo de dados para um arquivo");
    String filename = "C:/Arquivos/teste.txt";
    writer = new FileWriter(filename);
    writer.writeNewFile(txtDados.toString());
```
4.) Função para filtrar uma data. Na linha 1 define a data. Na linha 2 verifica se a data possui o tamanho correto inserido no código. Na linha 3 e 4 extraem o mês e ano da data. Se caso o mês seja 0, ele faz a conversão para 12, e o ano é convertido para o ano anterior. Na última linha uma *String* é declarada, usando uma função para adicionar dois zeros ao início dela, indicando um dia inexistente. 
`Resultado = "00/05/2018"`

```java
    String dataMovimento = "07/05/2018";
    if(dataMovimento.length() > 9){
      int mesRef = Integer.parseInt(dataMovimento.substring(3,5)) - 1;
      int anoRef = Integer.parseInt(dataMovimento.substring(6,10));
      if (mesRef == 0) {
        mesRef = 12;
        anoRef = anoRef - 1;
      }
      mesAnoX = StringUtil.leftPad( String.valueOf(mesRef),2,"0") + "/"
                                    + String.valueOf(anoRef);
    }
```
