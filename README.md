# VeggieGame
VeggieGame - JavaFX game

-- Game in development

Rules:
- Single-Player
- Game takes place on a 12x12 board
- On each field of the board there is one of the eight types of elements present in the game
- The player, by making appropriate moves, connects the elements on the board into groups, causing them to explode, for which he gets points.
- The fields left by the elements are filled with new elements, using gravity.
  using gravity: the elements that are still on the board fall down as low as possible, then from the top the board is replenished with new random elements.

There are 8 types of elements - 4 basic and 4 advanced, which differ in their behavior:

BASIC ELEMENTS - vegetables (for each such element that explodes, the player receives 50 points).
- Carrot
- Onion
- Cucumber
- Beetroot

ADVANCED ELEMENTS - fruits (for each such element that explodes, the player receives 100 points).
- Pineapple: when this element is activated, the entire row in which the element lies explodes.
- Plum: when this element is activated, the entire column in which the element lies explodes.
- Peach: when this element is activated, all neighboring elements(3x3 square) also explode.
- Pear: when this element is activated, the entire growing pear in which the element lies explodes.

...more to come.
