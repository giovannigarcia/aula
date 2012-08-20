/*!
 *
 *  This file is part of Baralho.
 *
 *  Copyright 2012  Cristiano Ribeiro <cristiano.daitx@gmail.com>
 *
 *  Copyright 2012  Evair Severo <evairsevero@gmail.com>
 *
 *    
 *
 *
 *  This library is free software; you can redistribute it and/or
 *	
 *  modify it under the terms of the GNU Lesser General Public
 *
 *  License as published by the Free Software Foundation; either
 *	
 *  version 2.1 of the License, or (at your option) any later version.
 *	
 *	
 *  This library is distributed in the hope that it will be useful,
 *	
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *	
 *  Lesser General Public License for more details.
 *	
 *	
 *  You should have received a copy of the GNU Lesser General Public
 *	
 *  License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 *	
 */
/*!Insere uma determinada carta no monte de descarte.
 *@param D - Baralho de descarte onde vai ser inserida a carta.
 */
Baralho atualizaDescarte (Baralho D);

/*!Retorna a carta que está em uma determinada posição do baralho de descarte.
 *@param D - Baralho de descarte.
 *@param pos - Posição da carta.
 */
lista mostraDescarte(Baralho D, int pos);

/*!Função interna. É utilizada apenas em outras funções.
 *@param D - Baralho de descarte.
 *@param carta - número da carta que vai ser inserida.
 *@param naipe - naipe da carta que vai ser inserida.
 */
Baralho insereCartaDescarte(Baralho D, int carta, char naipe);

/*!Remove uma carta do baralho de descarte e retorna a mesma.
 *@param D - Baralho de descarte.
 *@param pos - Posição do baralho em que vai ser removida a carta.
 */
lista retiraDescarte (Baralho* D, int pos);
