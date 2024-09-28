
import java.util.ArrayList;
import java.util.Collections;

class Card
{
  String suit;
  String rank;

  public Card(String s, String r)
  {
    this.suit = s;
    this.rank = r;
  }


  @Override
  public String toString()
  { return rank+" of "+suit; }
  
}

class Deck
{
  ArrayList<Card> cards;
  // String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
  // String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  public Deck()
  {
    cards = new ArrayList<>();
    InitializeDeck();
  }

  public void InitializeDeck()
  {
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // for each loop to make all cards 
    for(String s : suits)
    {
      for (String r : ranks) 
      {
        cards.add(new Card(s, r));
      }
    }
  }

  public void shuffle()
  {
    Collections.shuffle(cards);
  }

  public void display()
  {
    int i=1; 
    for(Card card : cards)
    {
      System.out.print(String.format("%-20s",card));
      if(i%4==0) System.out.println();
      i++;
    }
  }

}

public class prac_part7_2 {
  public static void main(String[] args) {
    Deck d = new Deck();
    System.out.println("\nBefore Shuffeling\n");
    d.display();
    System.out.println("\nAfter Shuffeling\n");
    d.shuffle();
    d.display();
    System.out.println("\n");
    
  }
}
