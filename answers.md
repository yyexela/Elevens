# answers.md
## a2
1) A `Deck` contains an `ArrayList` of `Card` objects. The deck then return the size of the list, say whether it is empty, and *deal* a card by returning one at a specific index.  
2) The deck contains 6 cards since there are 3 cards and 2 suits (3*2=6).  
3) `ranks` contains all face cards (Jack, Queen, King, Ace) and numbers 2 through 10 inclusive. `suits` is spades, hearts, diamonds, and clubs. `pointValues` are the respective number if not a face card, 11 if an Ace, and 10 for the rest of the cards (remaining face cards).  
4) Yes, but only for `ranks` and `pointValues`. The rank and point value have to have the same index in the array in order to be assigned to the same card.  
