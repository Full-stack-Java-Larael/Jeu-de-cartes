package cardGame;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
	
	private ArrayList<Card> Cards = new ArrayList<Card>();
	
	
	private void shuffleSet() {
		// Shuffle the cards array
		Collections.shuffle(this.Cards);
	}
	public void makeNewSet() {
		// make new cards set
			// Grounds
		this.Cards.add(new Ground("blue","sea","ground",0,0,0));
		this.Cards.add(new Ground("red","lava","ground",0,0,0));
		this.Cards.add(new Ground("green","forest","ground",0,0,0));
		this.Cards.add(new Ground("white","ground","ground",0,0,0));
		this.Cards.add(new Ground("black","cave","ground",0,0,0));
			// Creatures
		this.Cards.add(new Creature("Elephant","animal",200,200,200));
		this.Cards.add(new Creature("Tiger","animal",150,150,150));
		this.Cards.add(new Creature("Anaconda","animal",100,100,100));
		this.Cards.add(new Creature("Eagle","bird",75,75,75));
		this.Cards.add(new Creature("Gorilla","animal",50,50,50));
			// Magic
		this.Cards.add(new Magic("immortal","magic",700,700,700,"This card gives an infinity life to player for one round"));
		this.Cards.add(new Magic("Half of death","magic",700,700,700,"this card drops ennmy health by half"));
		this.shuffleSet();
	}
	public ArrayList<Card> getCards() {
		return this.Cards;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Cards.toString();
	}
}
