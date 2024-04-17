import javax.swing.JOptionPane;
public class usastring {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(
				"Digite um texto qualquer:");
		System.out.println(
				"O caractere na terceira posição da String " 
				+ s + " é: " + s.charAt(2));
		System.out.println(
				"O índice da letra \"o\" é: " + s.indexOf("o"));
		String nome = "Lucas";
		System.out.println("A String nome é lucas? " + nome.equals("lucas"));
		System.out.println("A String nome é lucas com equalsIgnoreCase()? " 
		+ nome.equalsIgnoreCase("lucas"));
		System.out.println("Última ocorrência de \"s\" :" 
		+ s.lastIndexOf("s"));
		System.out.println("Tamanho do nome :" + nome.length());
		System.out.println("Trocando u por U em Lucas :" 
		+ nome.replace('u', 'U'));
		System.out.println("Lucas após a alteração:" 
				+ nome);
		System.out.println("A string inicia com \"Mar\" :" 
				+ s.startsWith("Mar"));
		System.out.println("A string termina com \"cos\" :" 
				+ s.endsWith("cos"));

        String exemplo = "NoMe-dO-pAi";
        String divida[] = exemplo.split("-");

        for (String string : divida) {
                System.out.print(string +" ");
        }
        System.out.println();
        for(int i = 0 ; i < divida.length; i++){
            System.out.println(divida[i]);
            System.out.println(divida[i].toUpperCase());
            System.out.println(divida[i].toLowerCase());
            System.out.println();
        }
	}
}