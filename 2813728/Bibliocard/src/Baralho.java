/**
 * @author Anderson fortes e Francis Diego Almeida
 */
/**
 *  
 *  Copyright (c) 2012 Anderson Fortes e Francis Almeida
 *  
 *  Este arquivo � parte do programa Baralho
 *
 *  Baralho � um software livre; voc� pode redistribui-lo e/ou modifica-lo dentro dos termos da Licen�a P�blica Geral Menor GNU como 
 *  publicada pela Funda��o do Software Livre (FSF); na vers�o 2 da icen�a, ou (na sua opni�o) qualquer vers�o.
 *  
 *  Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUA��O a qualquer
 *  MERCADO ou APLICA��O EM PARTICULAR. Veja a Licen�a P�blica Geral Menor GNU para maiores detalhes.
 *  
 *  Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral Menor GNU junto com este programa, se n�o, escreva para a Funda��o do Software
 *  Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe que implementa as funcoes para o jogo de cartas
 */
public class Baralho {

    private ArrayList<Carta> pilha = new ArrayList<>();
    private ArrayList<Carta> descartados = new ArrayList<>();
    
    /**
     * Construtor do baralho.
     */
    public Baralho() {
        
        ArrayList<String> naipes = new ArrayList<>();
        
        naipes.add("Espada");
        naipes.add("Basto");
        naipes.add("Copas");
        naipes.add("Ouro");
       
        Carta carta;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                carta = new Carta(naipes.get(i), j+1);
                pilha.add(carta);
            }
        }
    }

    /**
     * Metodo que embaralha as cartas
     *
     */
    public void embaralhar() {
        Collections.shuffle(pilha);
        
    }

    /**
     * Metodo que corta em duas partes e passa a parte de cima para baixo
     *
     */
    public void cortar(int posicao) {
    	
    	if(posicao<0){
            System.err.println("N�mero de corte deve ser maior que zero");
        }

        if(pilha.size()<posicao){
            System.err.println("N�mero de corte deve ser menor que o n�mero de cartas");
        }
    	
        else{
            ArrayList<Carta> temp = new ArrayList<Carta>();
        
            for(int i=posicao;i<pilha.size();i++)
                temp.add(pilha.get(i));

            for(int i=0;i<posicao;i++)
                temp.add(pilha.get(i));
        
            Collections.copy(pilha, temp);
        }
    }

    /**
     * Metodo que retorna a primeira carta do monte de cartas
     *
     */
    public Carta getPrimeiraCarta() {
        return pilha.remove(0);
    }

    /**
     * Metodo que retorna a ultima carta do monte de cartas
     *
     */
    public Carta getUltimaCarta() {
    	return pilha.remove(pilha.size()-1);
    }
    /**
     * Metodo que move a carta do topo para o fim
     *
     */
    public void moverPrimeiraParaOFim() {
    	pilha.add(pilha.remove(0));
    }

    /**
     * Metodo que descarta uma carta de determinado valor e naipe
     *
     */
    public void Descartar(String naipe, int num) {
    	for (int i = 0; i < pilha.size(); i++) {
    		if (pilha.get(i).getNaipe()==naipe && pilha.get(i).getNum()==num) {
    			descartados.add(pilha.get(i));
    			pilha.remove(i);
    		}
    	}
        
    }
    /**
     * Metodo que mostra o monte de cartas descartadas
     *
     */
    public void visualizarDescartadas() {
    	for(int i=0;i<descartados.size();i++)
    		System.out.println("numero: " + descartados.get(i).getNum() + ", naipe: " + descartados.get(i).getNaipe());
    }
    /**
     * Metodo que permite visualizar o monte principal das cartas
     *
     */
    public void exibirPilha() {
        for (int i = 0; i < pilha.size(); i++) {
            System.out.println("numero: " + pilha.get(i).getNum() + ", naipe: " + pilha.get(i).getNaipe());
        }
    }
    /**
     * Metodo que permite ver as cartas do monte de descarte
     *
     */
    public Carta verCartaDescartada(int posicao) {
        return descartados.get(posicao);
    }
}