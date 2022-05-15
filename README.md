# ProblemALG004r
Project instructions
Write a Class called ProblemALG004r to do the following:



Write out the Magic Square of any odd dimension n (i.e. n is an odd number)



A Magic Square has the following properties:

The sum of all the rows are the same (assume this total is X)
The sum of all the columns is also X
The sum of the two diagonals is also X


Example:



A solution to a 3 X 3 Magic Square is:

8 1 6

3 5 7

4 9 2



The sum of each row, column and diagonal is 15.



Your program should also accept another parameter (called rotation) that specifies the position of the starting 1

in the solution (it should be obvious that every 90 degree rotation of the magic square produces the same

solution – except the starting 1 will be in a different position in each case).



Thus, if rotation = 0, then the starting 1 is top middle (as per above);



If rotation = 1, then the starting 1 is right middle

If rotation = 2, then the starting 1 is bottom middle

If rotation = 3, then the starting 1 is left middle



This will become clearer in the following pages where I describe the rotation parameter in more detail.



The general algorithm for solving an odd Magic Square is as follows (refer to 5 X 5 magic square below):

Always start on the top row in the middle column (i.e. that is where 1 goes)
In general, the next number will always be in the square which you get to when you move up in a diagonal fashion (one square up and one square to the right);
If, when moving in a diagonal fashion, you move out of the square on the top, then you go all the way down to last square at the bottom of that column (e.g. see movement below from 1 to 2 and also from 8 to 9)
If, when moving in a diagonal fashion, you move out of the square on the right side, you go all the way to left most column of that row (e.g. see movement below from 3 to 4 and also from 16 to 17)
If, when moving in a diagonal fashion, you clash with a number already in the square, you simply go down 1 square (e.g. see movement below from 5 to 6 and also from 20 to 21)
If, when moving in a diagonal fashion, you move out of the square on the topmost right side, you treat this also as a clash, and you simply move down 1 square (e.g. see movement below from 15 to 16 – note, however, this rule only ever happens once in every odd magic square)


Following this algorithm, we can produce a 5X5 square as per below (note: I will refer to this as the original

square where rotation = 0, this will become clearer in the section below where I explain the rotation

parameter).


Using your program, write out a 7 X 7 Magic Square. Simply write out the numbers in a row / column format (without all the borders to the square)



Now, to explain the rotation parameter:

A rotation = 0 simply means produce the Magic Square exactly as per above, and do NOT rotate it all – I will refer to this square as the original square (this will become clearer for other values of rotation – see below)



For rotation = 1, you simply rotate the original square 1 X 90 degrees, so the rotated 5 X 5 Magic Square must now look like this (if rotation = 1)


For rotation = 2, you simply rotate the original square 2 X 90 degrees, so the rotated 5 X 5 Magic Square must

now look like this (if rotation = 2)



For rotation = 3, you simply rotate the original square 3 X 90 degrees, so the rotated 5 X 5 Magic Square must

now look like this (if rotation = 3)



