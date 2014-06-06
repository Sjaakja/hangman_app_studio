DESIGN DOCUMENT
===============

This is the design document for **Hangman - Time to save your friends**.

Databases:
----------

**My Condemned**

| NAME (unique)   | PICTURE                 | WIN STREAK        | LIVES                                |
| --------------- | ----------------------- | ----------------- | ------------------------------------ |
| *condemned one* | *reference to an image* | *number of saves* | *lives of particular condemned left* |

used by: 
- Play: To update every time you played a game.
- My Condemned: To add or delete playable condemned. It is not possible to delete condemned who are no longer playable (LIVES == 0).
- Highscores: Sorted in order WIN STREAK, LIVES, NAME, high to low (only top n condemned).

**Hangman - Words**

| WORD (unique)            | LENGTH        |
| ------------------------ | ------------- |
| *word in list delivered* | *word length* |

used by: 
- Play: To retrieve a playable word.


Activities structure:
-----------
* [Home][]
	* [Play1][]
		* [Play2][]
	* [My Condemned][]
	* [Statistics][]

[Home]: https://github.com/Sjaakja/hangman_app_studio/blob/master/doc/HOME.png
[Play1]: https://github.com/Sjaakja/hangman_app_studio/blob/master/doc/PLAY1.png
[Play2]: https://github.com/Sjaakja/hangman_app_studio/blob/master/doc/PLAY2.png
[My Condemned]: https://github.com/Sjaakja/hangman_app_studio/blob/master/doc/MYCONDEMNED.png
[Statistics]: https://github.com/Sjaakja/hangman_app_studio/blob/master/doc/STATISTICS.png