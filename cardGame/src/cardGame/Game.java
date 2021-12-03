package cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Game {
	
	private ArrayList<Card> Cards = new ArrayList<Card>();
	
	public Game() {
		this.makeNewSet();
	}
	private void shuffleSet() {
		// Shuffle the cards array
		Collections.shuffle(this.Cards);
	}
	public void makeNewSet() {
		// make new cards set
			// Grounds
		this.Cards.add(new Ground("blue","sea","ground",0,0,8));
		this.Cards.add(new Ground("red","lava","ground",0,0,10));
		this.Cards.add(new Ground("green","forest","ground",0,0,6));
		this.Cards.add(new Ground("white","ground","ground",0,0,4));
		this.Cards.add(new Ground("black","cave","ground",0,0,2));
			// Creatures
		
		Random r = new Random();
		int low = 10;
		int high = 100;
		
		
		
		this.Cards.add(new Creature("Mammoth","animal",200,200,r.nextInt(high-low) + low));
		this.Cards.add(new Creature("wolf","animal",150,150,r.nextInt(high-low) + low));
		this.Cards.add(new Creature("Anaconda","animal",100,100,r.nextInt(high-low) + low));
		this.Cards.add(new Creature("Eagle","bird",75,75,r.nextInt(high-low) + low));
		this.Cards.add(new Creature("Gorilla","animal",50,50,r.nextInt(high-low) + low));
			// Magic
		this.Cards.add(new Magic("immortal","magic",700,700,700,"This card gives an infinity life to player for one round"));
		this.Cards.add(new Magic("Half of death","magic",700,700,500,"this card drops ennmy health by half"));
		this.shuffleSet();
	}
	public ArrayList<Card> getCards() {
		return this.Cards;
	}
	
	public int roundWinner(ArrayList<Card> table) {
		if(table.get(0).getAttack() > table.get(1).getAttack()) {			
			return 1;
		}else if(table.get(0).getAttack() < table.get(1).getAttack()) {
			return 2;
		}else {
			return 3;
		}
	}
	public int playerScore(ArrayList<Card> cards) {
			int socre = 0;
			for (int i = 0; i < cards.size(); i++) {
				socre =+ cards.get(i).getScore();
			}
		return socre;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Cards.toString();
	}
}
