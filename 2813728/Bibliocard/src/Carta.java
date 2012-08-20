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

/**
     * Classe que define um objeto do tipo Carta, bem como m�todos getters e setters.
     *
     */
public class Carta {

    private String naipe;
    private int num;

   
    public Carta(String naipe, int num) {
        this.naipe = naipe;
        this.num = num;
    }


	public String getNaipe() {
		return naipe;
	}


	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
    
    
}