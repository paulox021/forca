import javax.swing.JOptionPane;

public class JogoDaForca {
    private static String[] palavras = {"banana", "laranja", "abacaxi", "uva", "limao","maca","abacate","laranja","pera","morango"};
    
    public static void jogar() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String email = JOptionPane.showInputDialog("Digite seu email:");
        
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) ao Jogo da Forca, " + nome + " (" + email + ")!");
        
        // Seleciona uma palavra aleatória da lista de palavras-chave
        String palavra = palavras[(int) (Math.random() * palavras.length)];
        
        Jogo jogo = new Jogo(palavra);
        jogo.jogar();
    }
}
