import java.util.Scanner; 
import java.util.ArrayList;
public class Move {
    int x,y;
    Move(){
        
    }
    Move(int x, int y)
    {this.x=x;
    this.y=y;}

}

public class Board extends Move{
	 int N;
	 char[][] board;
	 char name;
	   
	Board(){
	    name='O';
		
	}
	Board(int N){
	    this.N=N;
	    board = new char[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if((i==N/2-1 && j == N/2-1) || (i==N/2 && j == N/2)) {
					board[i][j] = 'X';
				}
				else if((i==N/2-1 && j == N/2) || (i==N/2 && j == N/2-1)) {
					board[i][j] = 'O';
				}
				else
					board[i][j] = '.';
			}
	}
	}
	
	
	
	//methods
	void printBoard() {
	    for (int i =0; i<N;i++)
	        {
	        for (int j=0; j<N;j++)
	            {
	    System.out.print(board[i][j]+ "|");
	            }
	            System.out.println();
	        }
	}
	char getWhosePiece()
	{
	    return name;
	}

	char getOpponentPiece()
	{
	    if (name=='O')
		     return 'X';
		return 'O';
	}
	void setCurrentPlayer(char player)
	{
	        name=player;
	}

	// Checks a direction from x,y to see if we can make a move
	boolean checkFlip(int x, int y, int dX, int dY) { 
	    
		if(x<0 || x>=N || y>=N || y<0) {
			return false;
		}
		if(board[x][y] != getOpponentPiece()) {
			return false;
		}
		x+=dX;
		y+=dY;
		if(x<0 || x>=N || y>=N || y<0) {
			return false;
	}
	while(x>=0 && x<N && y<N && y>=0) {
			if(board[x][y] == '.')
				return false;
			else if(board[x][y] == getOpponentPiece()) {
				x+=dX;
				y+=dY;
			}
			else if(board[x][y] == getWhosePiece()) {
				return true;
			}
		}
		
		return false;
		
	}
	void flipPieces(int x, int y, int dX, int dY) {
		while(x>-1 && y>-1 && x<N && y<N) {
			if(board[x][y]==getOpponentPiece()){
				board[x][y] = getWhosePiece();
			}
			else if(board[x][y]==getWhosePiece())
				break;
			x+=dX;
			y+=dY;
			
		}
		}

	boolean validMove(int x, int y) 
	{
	     if(x>=N || x<0 || y<0 || y>=N)
			return false;
		if(board[x][y]!='.')
			return false;
		if(checkFlip(x-1, y, -1, 0)==true)
			return true;
		if(checkFlip(x+1, y, 1, 0)==true)  
			return true;
		if(checkFlip(x, y+1, 0, +1)==true)  
			return true;
		if(checkFlip(x, y-1, 0, -1)==true)  
			return true;
		if(checkFlip(x+1, y+1, 1, 1)==true)  
			return true;
		if(checkFlip(x+1, y-1, 1, -1)==true) 
			return true;
		if(checkFlip(x-1, y+1, -1, 1)==true)  
			return true;
		if(checkFlip(x-1, y-1, -1, -1)==true)  
			return true;
		return false;
}

	// Makes a move on the board, assumes the move is valid.
	void makeMove(int x, int y)
	{
		board[x][y] = name;
		if(checkFlip(x-1, y, -1, 0)==true) {
			flipPieces(x-1, y, -1, 0);
		}
		
		if(checkFlip(x+1, y, 1, 0)==true) {  
			flipPieces(x+1, y, 1, 0);
			
		}
		
		if(checkFlip(x, y+1, 0, +1)==true) {  
			flipPieces(x, y+1, 0, +1);
		}
		
		if(checkFlip(x, y-1, 0, -1)==true) {  
			flipPieces(x, y-1, 0, -1);
		}
		
		if(checkFlip(x+1, y+1, 1, 1)==true) {  
			flipPieces(x+1, y+1, 1, 1);	
		}
		if(checkFlip(x+1, y-1, 1, -1)==true) { 
			flipPieces(x+1, y-1, 1, -1);		
		}
		if(checkFlip(x-1, y+1, -1, 1)==true) {  
			flipPieces(x-1, y+1, -1, 1);
		}
		
		if(checkFlip(x-1, y-1, -1, -1)==true) {  
			flipPieces(x-1, y-1, -1, -1);
		}
		
	}
	
	// returns the array list with valid moves for the piece.
	ArrayList<Move> getMoveList(char piece)
	{
		 ArrayList <Move> list = new ArrayList<Move>();
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++)
				if(validMove(i,j)==true)
				{
					Move temp = new Move(i,j); 
					list.add(temp);
				}
		}
		return list;
}

		
	

	
	// True if the game is over, false if not over
	boolean gameOver()
	{
		boolean full=false;
		char tempname = name;
		int count=0;
		for (int i=0;i<N;i++)
		    {
		        for (int j=0;j<N;j++)
		        {
		            if (validMove(i, j)==true)
					full = true;
		        }
		    }
		    name = getOpponentPiece();
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++) {
				if(validMove(i, j)==true)
					full = true;
			}
		name = tempname;
		return !full;
	}
               

	// Using the move list, gets a random move out of this list
	Move getFirstMove(ArrayList<Move> possibleMoves)
	{
		return possibleMoves.get(0);
	}

	// Returns the score for the piece
	int score(char piece)
	{
	 int score =0;
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(board[i][j] == piece)
					score++;}
		}
		return score;
	}
}


