# Color Activity Assignment 3

## Notes

Implements a lot of what we learned in class but makes some small changes mostly in relation to functions implemented in a spinner view that isn't in a list view. List view typically uses
things like onClickListener instead of onItemSelected.

## Docstring - MainActivity

**@fun onItemSelected():** Changes the background of the view upon selecting an item from the spinner. See comments on ItemsAdapter to see how the custom adapter accepts colors.

**@fun onNothingSelected():** setOnItemSelectedListener requires that you implement this or it breaks similarly to how when you extend base adapter you must add and override 4 items requested even though you don't actually ever use getItemID.


## Docstring - ItemsAdapter

**@fun ItemsAdapter():** It takes in three things

1. context - Context represents (provides a handle to) the application environment. Can be obtained from several sources, but capabilities vary.
2. colors - Is what will be used to determine the color of the layout in the MainClass and also the font color of the item inside of the TextView         
3. items - The actual string that will be represented in the spinner/textview.

**@import Color:** Color allows you to pass colors in a variety of ways. In my implementation I use its parseColor function to pass a string that represents a color in hex format.