package cardGame;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Game game = new Game();
		game.makeNewSet();
		ArrayList<Card> cards = game.getCards();
		//System.out.println(game);
		System.out.println("Type : "+cards.get(0).getType()+", "+"Name : "+cards.get(0).getName()+", "+"Score : "+cards.get(0).getScore()+", "+"Life : "+cards.get(0).getLife()+", "+"Attack : "+cards.get(0).getAttack());
		System.out.println("Type : "+cards.get(1).getType()+", "+"Name : "+cards.get(1).getName()+", "+"Score : "+cards.get(1).getScore()+", "+"Life : "+cards.get(1).getLife()+", "+"Attack : "+cards.get(1).getAttack());
		System.out.println("Type : "+cards.get(2).getType()+", "+"Name : "+cards.get(2).getName()+", "+"Score : "+cards.get(2).getScore()+", "+"Life : "+cards.get(2).getLife()+", "+"Attack : "+cards.get(2).getAttack());
		System.out.println("Type : "+cards.get(3).getType()+", "+"Name : "+cards.get(3).getName()+", "+"Score : "+cards.get(3).getScore()+", "+"Life : "+cards.get(3).getLife()+", "+"Attack : "+cards.get(3).getAttack());
		System.out.println("Type : "+cards.get(4).getType()+", "+"Name : "+cards.get(4).getName()+", "+"Score : "+cards.get(4).getScore()+", "+"Life : "+cards.get(4).getLife()+", "+"Attack : "+cards.get(4).getAttack());
		System.out.println("Type : "+cards.get(5).getType()+", "+"Name : "+cards.get(5).getName()+", "+"Score : "+cards.get(5).getScore()+", "+"Life : "+cards.get(5).getLife()+", "+"Attack : "+cards.get(5).getAttack());
		System.out.println("Type : "+cards.get(6).getType()+", "+"Name : "+cards.get(6).getName()+", "+"Score : "+cards.get(6).getScore()+", "+"Life : "+cards.get(6).getLife()+", "+"Attack : "+cards.get(6).getAttack());
		System.out.println("Type : "+cards.get(7).getType()+", "+"Name : "+cards.get(7).getName()+", "+"Score : "+cards.get(7).getScore()+", "+"Life : "+cards.get(7).getLife()+", "+"Attack : "+cards.get(7).getAttack());
		System.out.println("Type : "+cards.get(8).getType()+", "+"Name : "+cards.get(8).getName()+", "+"Score : "+cards.get(8).getScore()+", "+"Life : "+cards.get(8).getLife()+", "+"Attack : "+cards.get(8).getAttack());
		System.out.println("Type : "+cards.get(9).getType()+", "+"Name : "+cards.get(9).getName()+", "+"Score : "+cards.get(9).getScore()+", "+"Life : "+cards.get(9).getLife()+", "+"Attack : "+cards.get(9).getAttack());
		System.out.println("Type : "+cards.get(10).getType()+", "+"Name : "+cards.get(10).getName()+", "+"Score : "+cards.get(10).getScore()+", "+"Life : "+cards.get(10).getLife()+", "+"Attack : "+cards.get(10).getAttack());
		System.out.println("Type : "+cards.get(11).getType()+", "+"Name : "+cards.get(11).getName()+", "+"Score : "+cards.get(11).getScore()+", "+"Life : "+cards.get(11).getLife()+", "+"Attack : "+cards.get(11).getAttack());
	}
}
