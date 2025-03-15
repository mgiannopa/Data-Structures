# Data-Structures
Projects of the class Data structures, ECE AUTH
# **Java Data Structures & Board Game Implementation**

## **Overview**
This project is a collection of Java implementations of fundamental data structures and a simple board game. It includes:  

- **Circular Queue**: A dynamically expanding queue with circular functionality.  
- **Singly Linked List**: A basic linked list implementation with insertion and deletion operations.  
- **Board Game**: A grid-based game with move validation, piece flipping, and score calculation.  

The project is designed for educational purposes and demonstrates key programming concepts such as data structure manipulation, object-oriented programming (OOP), and game logic implementation.

---

## **Project Structure**
| File               | Description |
|--------------------|-------------|
| `CircularQueue.java`  | Implements a **Circular Queue** using an array with dynamic expansion. |
| `SingleList.java`  | Implements a **Singly Linked List**, supporting insertion and deletion operations. |
| `Node.java`        | Represents a **node** for the linked list. |
| `Board.java`       | Implements the **Board Game** logic, including move validation and game rules. |
| `Move.java`        | Represents a move in the game and manages coordinates. |

---

## **Detailed Descriptions**
### **1. Circular Queue (`CircularQueue.java`)**
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

### **2. Singly Linked List (`SingleList.java` & `Node.java`)**
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

### **3. Board Game (`Board.java` & `Move.java`)**
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
1. **Compile the Java files**  
   ```sh
   javac CircularQueue.java
   javac SingleList.java Node.java
   javac Board.java Move.java
