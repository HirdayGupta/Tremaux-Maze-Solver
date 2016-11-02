package mazeSolverV1;

import mazeSolverV1.Maze;
import mazeSolverV1.Player;

public class Launcher {

	public static void main(String[] args) {
		Maze maze = new Maze();
		Player p1 = new Player();
		maze.printMaze();
		p1.run();
	}

}