# Data-Structures
Projects of the class Data structures, ECE AUTH
# **Java Data Structures & Board Game Implementation**

## **Overview**
This project contains Java implementations of fundamental data structures and a simple board game. The included components are:  

- **Circular Queue**: A queue with circular functionality that dynamically expands.  
- **Singly Linked List**: A basic implementation of a singly linked list with insertion and deletion operations.  
- **Board Game**: A grid-based game with move validation, piece flipping, and game state checking.  

The project demonstrates core concepts of data structure manipulation and object-oriented programming (OOP).

---

## **Project Structure**
| File                 | Description |
|----------------------|-------------|
| `Project_1a.txt`  | Implements a **Circular Queue** using an array with dynamic expansion. |
| `Project_1b.txt`  | Implements a **Singly Linked List**, supporting insertion and deletion operations. |
| `Project_2.txt`   | Implements a **Board Game** with game state management, move validation, and piece flipping. |

---

## **Detailed Descriptions**
### **1. Circular Queue (`Project_1a.txt`)**
- Implements a **FIFO (First In, First Out)** queue using an array.  
- Supports **enqueue (insertion)** and **dequeue (removal)** operations.  
- Dynamically **expands capacity** when the queue is full.  
- Uses **modulo arithmetic** for circular behavior.  

**Key Methods:**
- `enqueue(int element)`: Adds an element to the queue.
- `dequeue()`: Removes and returns the front element.
- `size()`: Returns the number of elements.
- `isEmpty()`: Checks if the queue is empty.
- `expandCapacity()`: Doubles the queue size when full.
- `queuetoString()`: Returns a string representation of the queue.

---

### **2. Singly Linked List (`Project_1b.txt`)**
- Implements a **linked list** with dynamic memory allocation.  
- Supports **insertion at the end** and **deletion of first two elements**.  
- Uses **nodes** to store values and pointers to the next element.  

**Key Methods:**
- `makeEmpty()`: Clears the list.  
- `isEmpty()`: Checks if the list is empty.  
- `insertLast(int val)`: Inserts a node at the end.  
- `insertAfter(Node n, int val)`: Inserts a node after a given node.  
- `deleteFirstTwo()`: Deletes the first two elements.  

---

### **3. Board Game (`Project_2.txt`)**
- Implements a **grid-based game** similar to Reversi/Othello.  
- Supports **move validation, piece flipping, and score tracking**.  
- Uses **object-oriented principles** with `Move` and `Board` classes.  

**Key Features:**
- **Game Board**: Initializes a grid with starting positions.
- **Move Validation**: Ensures only valid moves are allowed.
- **Flipping Mechanism**: Changes opponent pieces upon a valid move.
- **Score Calculation**: Counts pieces of each player.
- **Game Over Detection**: Determines when no more valid moves are available.

**Key Methods:**
- `printBoard()`: Displays the game board.
- `validMove(int x, int y)`: Checks if a move is valid.
- `makeMove(int x, int y)`: Executes a move and updates the board.
- `gameOver()`: Determines if the game has ended.
- `score(char piece)`: Returns the score for a player.

---

## **How to Run**
### **Prerequisites**
- Java Development Kit (JDK) installed.  

### **Steps**
1. **Ensure the files are renamed to `.java` format before compilation.**  

