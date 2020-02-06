/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoCard;

/**
 *
 * @author bhari
 */
public class UnoCard {
 
        public enum Suit {WILD, WILDDRAWFOUR, SKIP, REVERSE, DRAWTWO, ACTION};
        public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,};
        public enum color{blue, yellow, red};
        private final Suit suit;
        private final Value value;
        private final color color;

        public Card(Suit s, Value gVal){
        
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
public color getColor(){
return this.color;
}
}
/* @author Mohammad Hossein Bahri */


