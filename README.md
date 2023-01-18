# Chuck-Norris-Cipher-Encoder
Stage 1/5: Analyze the words
Description
To begin with, you will learn how to divide an encrypted message into the characters that it contains. You will need this for further work.

Objectives
In this stage, your program should:

Read a string from a console. The input contains a single line.
Output all characters in the string, separated by one space (including the space characters themselves).

Stage 2/5: The binary world
Description
In this stage, you'll learn how to convert each character of a string into a binary form. Any ASCII character has a size of 7 bits; in binary, the form is 0 and 1. For example, the character A has a decimal value of 65. The binary representation is 1000001. b is 98 in decimal or 1100010 in binary. The space character is 32 in decimal value or 0100000 in binary.

In this stage, you will learn to represent characters in binary form.

Objectives
In this stage, your program should:

Read a string from a console. The input contains a single line.
Print The result: line, followed by each character of input on a separate line, formatted as <char> = <binary value>.
Note that the binary representation must be 7-bit, even if the first digits are zeros. The Integer.toBinaryString() and String.format() methods can help you with that.

Stage 3/5: Chuck Norris encrypts only with zeros
Description
Binary with 0 and 1 is good, but binary with only 0 is even better! This encoding has a name — the Chuck Norris Unary Code.

Let's convert our text into a sequence of zeros and spaces!

Objectives
The encoding principle is simple. The input message consists of ASCII characters (7-bit). You need to transform the text into the sequence of 0 and 1 and use the Chuck Norris technique. The encoded output message consists of blocks of 0. A block is separated from another block by a space.

Two consecutive blocks are used to produce a series of the same value bits (only 1 or0 values):

First block: it is always 0 or 00. If it is 0, then the series contains 1, if not, it contains 0
Second block: the number of 0 in this block is the number of bits in the series
Let's take a simple example with a message which consists of only one character C. The C symbol in binary is represented as 1000011, so with Chuck Norris technique this gives:

0 0 (the first series consists of only a single 1);
00 0000 (the second series consists of four 0);
0 00 (the third consists of two 1)
So C is coded as: 0 0 00 0000 0 00
Make sure, that an encoding of a single character sequence is not separated. For example, 000 should be encoded as 00 000 and not as 00 0 00 0 00 0 or 00 0 00 00 or 00 00 00 0

In this stage, your program should:

Read a string from a console. The input contains a single line.
Print The result: line, followed by a line with an encoded message.

Stage 4/5: Try to understand it
Try to understand it
 Hard
 21 minutes
251 users solved this stage. Latest completion was 3 minutes ago.
9 / 9 Prerequisites
Sizes and ranges
Type casting
Calling a method
Primitive and reference types
Array
Study group: Chuck Norris Cipher Encoder
 17 members
avatar
Julija Spodre (you)
avatar
okiDoki
avatar
Christopher Cameron
and 14 more members
Description
In this stage, you will write a decoder for a cipher. You need to transform the encrypted message into its original format.

Objectives
Your program receives a string of zeros and spaces and converts it to readable text. You must parse the string to the blocks of zeroes and decode the message the same way as in previous stages but in reversed order.

For example, your program receives 0 0 00 0000 0 000 00 0000 0 00. You can split blocks of zeros and group those blocks by two. Then you need to decode these blocks like in the previous stage:

0 0 is 1
00 0000 is 0000
0 000 is 111
00 0000 is 0000
0 00 is 11
Concatenation of the lines above gives us 10000111000011.

After that, you need to split the result into blocks of seven symbols (binary form) and convert these blocks to characters. In this case, splitting 10000111000011 by seven symbols gives us two characters — 1000011 1000011 , convert them into characters and the result will be CC (C is 1000011).

In this stage, your program should:

Read a string from a console. The input contains a single line of spaces and 0 characters.
Print The result: line, followed by a line with a decoded message.
The Integer.parseInt() method might be useful at this stage.

Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1:

Input encoded string:
> 0 0 00 0000 0 000 00 0000 0 00

The result:
CC
Example 2:

Input encoded string:
> 0 0 00 00 0 0 00 000 0 00 00 0 0 0 00 00 0 0 00 0 0 0 00 000000 0 0000 00 000 0 00 00 00 0 00

The result:
Hi <3

Stage 5/5: Cooler than Chuck Norris

Description
Let's finish our encryption-decryption software by adding a simple user interface. The program asks the user for the desired option (encode/decode/exit), performs it, and all that in a loop until the user wants to finish.

Objectives
In this stage, your program should:

Ask users what they want to do, encode a string, decode a string or quit the program with
Please input operation (encode/decode/exit):
If user inputs encode as the desired operation, the program should print Input string: to the output, read a line and output two lines — Encoded string: followed by the encoded string;
If user inputs decode as the desired operation, the program should print Input encoded string: to the output, read a line and output two lines — Decoded string: followed by the actual decoded string;
If user inputs exit as the desired operation, the program should say Bye! and finish its execution.
The program should be looped to terminate only if the user inputs exit as an operation. Otherwise, it should continue asking users Please input operation (encode/decode/exit): after each iteration.

Also, let's prevent some incorrect input.

If the user misspells the operation name, the program should print out There is no '<input>' operation
If the user provided an incorrect encoded message as input to decode, the program should print out appropriate feedback containing not valid substring
List of not valid encoded messages:

The encoded message includes characters other than 0 or spaces;
The first block of each sequence is not 0 or 00;
The number of blocks is odd;
The length of the decoded binary string is not a multiple of 7.
Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1:

Please input operation (encode/decode/exit):
> encode
Input string:
> Hey!
Encoded string:
0 0 00 00 0 0 00 000 0 00 00 00 0 0 00 0 0 00000 00 00 0 0 00 0 0 0 00 0000 0 0

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00 000 0 00 00 00 0 0 00 0 0 00000 00 00 0 0 00 0 0 0 00 0000 0 0
Decoded string:
Hey!

Please input operation (encode/decode/exit):
> exit
Bye!
Example 2:

Please input operation (encode/decode/exit):
> smile
There is no 'smile' operation

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00 000
Decoded string:
H

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 1 00 0 0 1 000
Encoded string is not valid.

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 000 0 00 00 0000 0 00 000
Encoded string is not valid.

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00
Encoded string is not valid.

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00 00
Encoded string is not valid.

Please input operation (encode/decode/exit):
> exit
Bye!
