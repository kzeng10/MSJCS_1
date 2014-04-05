import java.lang.*;
import java.util.*;
public class Main {
	public static void main( String[] args){
		Scanner in = new Scanner(System.in); //input object
		System.out.println("Current state: \n[] [] [] \n[] [] [] \n[] [] [] \nConsider the board a matrix.\nEnter in the ordered pair of the location of your move in the form (x,y)");
		char[][] cur_state = new char[3][3];
		int[] next_move = new int[2];
		System.out.println("x: ");
		next_move[0] = in.nextInt();
		System.out.println("y: ");
		next_move[1] = in.nextInt();
		//move(next_move, cur_state)
		//check if you win
		//make an ai to play against
		in.close();
	}
}