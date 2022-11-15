public class CardDeck {

    private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT]; // 카드 덱
    private int card_count; // 덱에 현재 남아있는 카드의 장수
    // Invariant: deck[0], .., decl[card_count-1] 에 카드가 있다.

    /** CardDeck 카드 한 벌 생성  */
    public CardDeck() {
        createDeck();
    }

    private void createDeck() {
        createSuit(Card.SPADES);
        createSuit(Card.HEARTS);
        createSuit(Card.CLUBS);
        createSuit(Card.DIAMONDS);
    }

    private void createSuit(String which_suit) {
        for(int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i++) {
            deck[card_count] = new Card(which_suit, i);
            card_count = card_count + 1;
        }
    }

    /** 카드 덱에서 무작위로 카드를 한 장 선택하여 내줌
     * @return 카드 덱에서 무작위로 한 장 뽑아줌
     *         없으면 카드 1벌을 새로 만들고 무작위로 한 장 뽑아줌   */
    public Card drawCard() {
        if (card_count == 0) // will never be negative!
            createDeck();
        int the_picked = (int)(Math.random() * card_count);
        Card the_card_drawn = deck[the_picked];
        for (int i = the_picked+1; i < card_count; i++)
            deck[i-1] = deck[i];
        card_count -= card_count;
        return the_card_drawn;
    }

}