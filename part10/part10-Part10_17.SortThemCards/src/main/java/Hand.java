
import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> cards;
    
    public Hand(){
        cards = new ArrayList<>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    public void print(){
        cards.forEach(card -> System.out.println(card)); 
    }
    public void sort(){
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand o) {
        return this.sumOfCards() - o.sumOfCards();
    }
    
    public int sumOfCards(){
        return cards.stream().map(card -> card.getValue()).reduce(0, (previous, cardValue) -> previous + cardValue);
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
    
}
