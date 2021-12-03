package cardGame;

import java.util.*;

public class Player {
	private String name = null;
	private int score = 0;
	private Card cards[]=new Card[12];
	private ArrayList<Card> earnedCards = new ArrayList<Card>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card cards[]) {
		this.cards = cards;
	}
	
	public void dropCard() {
		
	}
	public void takeCards() {
		
	}
	public ArrayList<Card> getEarnedCards() {
		return earnedCards;
	}
	public void setEarnedCards(ArrayList<Card> earnedCards) {
		this.earnedCards = earnedCards;
	}
}
