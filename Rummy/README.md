# **Printing Quotes**

## **Problem Statement**

Create a program that prompts for a quote and an author. Display the quotation and author.

## **Inputs, Processes and Outputs**

**Inputs** : quote, author

**Processes** : create a quotation

**Outputs** : quotation

## **Tests**

**Inputs** : 
>quote : These aren't the droids you're looking for.
>author: Obi-Wan Kenobi

**Expected Results** :
>quotation : Obi-Wan Kenobi says, "These aren't the droids you're looking for." 

**Inputs** : 
>quote : Imagination is more important than knowledge.
>author: Albert Einstein

**Expected Results** :
>quotation : Albert Einstein says, "Imagination is more important than knowledge." 

## **Algorithm in Pseudocode**

```

import random

class Die
    
    declare public static final MAXVALUE as 6

    intialize rand as an integer value in the range of 1 to 6, inclusively
    
    initialize die as an integer
    
    constructor Die
        intialize die with the random number
    
    method getValue
        return current value of die
        
    method roll
        randomly assign new value to die
        
    method toString
        return a String representation of this object (ex. Die (value:3))
        
 class Card
 
    declare public static final DIAMOND as 0
    
    declare public static final CLUB as 1
    
    declare public static final HEART as 2
    
    declare public static final SPADE as 3
 
    declare suit as int
    
    declare rank as int
    
    constructor card(int suit, int rank)
        intializes value of suit and rank
        
    method getSuit
        returns the value of suit
        
    method getRank
        returns the value of rank
    
    method equals(Object o)
        if the object designated by the parameter is not of type Card
            return false
        if the object designated by the parameter has the same suit and the same rank as the Card
            return true
    
    method toString
        return a string with the suit and the rank of this card (suit, rank)
    
    
class Deck

    import java.util.ArrayList
    
    constructor Deck
        create an empty deck 
        
    constructor Deck(int n)
        intialize the number of ranks for the cards
        
        initializes the deck to contain 4 by n cards
        
    method size
        return the number of cards in the deck
        
    method hasCards
        returns true if and only if the deck has one or more cards
        
    method get(int pos)
        return the card at the specified position in the deck
    
    method add(Card card)
        add the specified card at the end of the deck
        
    method addAll(Deck other)
        append all the cards from other at the end of this deck, the cards are removed frm other
        
    method removeLast
        remove and return the last card of the deck
        
    method removeFirst
        remove and return the first card of the deck
        
    method remove(Card card)
        remove the first occurence of the specified card from this deck and returns true 
        
    method removeAll(Deck other)
        remove frm this deck all the cards that are contained in the deck designated by the parameter other
        
    method shuffle
        randomly permutes the cards
        
    method deal(int n)
        removes a maximum of n cards from the end of the deck, the cards are returned in a new deck
        
    method contains(Card card)
        returns true if and only if this deck  contains the specified card
    
    method containsAll(Deck other)
        reutnrs true if and only if this deck contains all the cards in the specified deck
    
    method isKind
        returns true if and only if this deck is discardable kind, so if the deck has at least two cards and all the carsd have the same rank
    
    method isSeq
        return true if and only if this deck is discardable sequence, so, if the deck has a tleast three cards, the cards all have the same suit, the cards form a sequence of consecutive ranks
        
    method sortBySuit
        sorts the cards of this deck by suits
        
    method sortByRank
        sorts the cards of this deck by rank
        
    method print
        prints the content of this deck in two ways. First, the content is printed by suit. Next, the content is printed by rank. Please note that this method has a side effect, the order of the cards is not preserved. Consequently, the method should not be called on the main deck during a game!
    
    method String toString
        return a string representation that contains all the cards in this deck

```

## **Getting Started**

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### **Prerequisites**

To install the software, you must have installed Python 3 on your computer. Please visit :

>https://www.python.org/downloads/

### **Installing**

Download PrintingQuotes.py onto your computer, open the program and run it.

In the program, enter:

>PrintingQuotes()

# **Built with**

Python


