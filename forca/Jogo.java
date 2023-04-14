import javax.swing.JOptionPane;

public class Jogo {
    private String palavra;
    private StringBuilder palavraEmBranco;
    private int tentativas = 7;
    
    public Jogo(String palavra) {
        this.palavra = palavra;
        // Cria uma string com a palavra em branco
        palavraEmBranco = new StringBuilder();
        for (int i = 0; i < palavra.length(); i++) {
            palavraEmBranco.append("_");
        }
    }
    
    public void jogar() {
        while (tentativas > 0) {
            // Mostra a palavra em branco e as tentativas restantes
            JOptionPane.showMessageDialog(null, "Palavra: " + palavraEmBranco.toString() + "\nTentativas restantes: " + tentativas);
            
            // Solicita a letra do usuário
            String letra = JOptionPane.showInputDialog("Digite uma letra:");
            
            // Verifica se a letra está na palavra
            boolean acertou = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra.charAt(0)) {
                    palavraEmBranco.setCharAt(i, letra.charAt(0));
                    acertou = true;
                }
            }
            
            // Se o usuário acertou, mostra uma mensagem de parabéns
            if (acertou) {
                JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            } else {
                // Se o usuário errou, decrementa as tentativas restantes e mostra uma mensagem de erro
                tentativas--;
                JOptionPane.showMessageDialog(null, "Ops, você errou.");
            }
            
            // Verifica se o usuário acertou toda a palavra
            if (palavraEmBranco.toString().equals(palavra)) {
                JOptionPane.showMessageDialog(null, "Parabéns, você acertou a palavra " + palavra + "!");
                break;
            }
        }
        
        // Se o usuário não acertou a palavra, mostra a palavra correta
        if (tentativas == 0) {
            JOptionPane.showMessageDialog(null, "Que pena, você não conseguiu acertar a palavra " + palavra + ".");
        }
    }
}

