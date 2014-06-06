DESIGN DOCUMENT
===============

This is the design document for **Hangman - Time to save your friends**.

Databases:

My Condemned
| NAME (unique)   | PICTURE                 | WIN STREAK        | LIVES                                |
| --------------- | ----------------------- | ----------------- | ------------------------------------ |
| *condemned one* | *reference to an image* | *number of saves* | *lives of particular condemned left* |

used by: 
- Play: To update every time you played a game.
- My Condemned: To add or delete playable condemned. It is not possible to delete condemned who are no longer playable (LIVES == 0).
- Highscores: Sorted in order WIN STREAK, LIVES, NAME, high to low (only top n condemned).

Hangman - Words
| WORD (unique)            | LENGTH        |
| ------------------------ | ------------- |
| *word in list delivered* | *word length* |

used by: 
- Play: To retrieve a playable word.


| Tables        | Are           | Cool  |
| ------------- | ------------- | ----- |
| *col 3 is*      | right-aligned | $1600 |
