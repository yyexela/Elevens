# Activity 7
## Questions
1)  
* A place to show the cards (a flat surface, like a table)  
* A deck of cards  
* A discard pile  
* A draw pile  
2)  
* Shuffle the deck  
* Set-up the deck (9 cards face up)  
* Discard a pair or triplet  
* Draw additional cards after a discard  
* Check if the game is over  
.* No additional combinations can be made  
.* All cards have been discarded  
* Put the discard pile into the draw pile, shuffle, and then set-up the deck (resetting the game)  
3) No, the checks for pairs that add to 11 and the triplets check are not implemented. Additionally, the `isLegal` check is not implemented (to ensure the move is allowed).  
4)  
a) `dealMyCards` is found in the `ElevensBoard` constructor, and the `newGame` method  
b) `isLegal` and `anotherPlayIsPossible`  
c) Returned list:  
Index | Card  
`-------------`  
0: 0  
1: 1  
2: 3  
3: 6  
4: 7  
(ArrayList size is 4)  
d) 
```java
	public static void printCards(ElevensBoard board){
		String complete = "";
		ArrayList<Integer> index = cardIndexes();
		
		for(int i = 0; i < index.size(); i++){
			Card card = board.cardAt(index.get(i));
			complete += card.toString + "" + '\n' + "";
		}

		System.out.println(complete);
    }
```
e) `anotherPlayIsPossible` since the player doesn't select these cards, all card combinations are checked (so you need to know where a card exists).  
