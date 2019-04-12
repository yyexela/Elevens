# Activity 9
## Questions
1) `size` is not an abstract method because the method returns the size of the cards array, which is in the constructor of `Board`. The constructor handles the board size change, not the `size` method.  
2) There are no abstract methods dealing with the selection, removal, or replacement of the cards array because they all work the same regardless of the game type (the same for Elevens, Tens, and Thirteens).  
3)  
a) Yes, the `Board` interface would still allow a polymorphic relationship with `isLegal` and `anotherPlayIsPossible`.  
b) The new design *would not* work as well as the `abstract Board` class design because the abstract design contains methods that the sub-classes implement whereas the interface does not.  