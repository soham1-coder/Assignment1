package mazerunner;

public class MazeExplorer
{
    private int x;
    private int y;

    DirectionStorage currentDirection; 
    Maze maze;

    public MazeExplorer(Maze maze)
    {
        this.x = 0;
        this.y = 0;
        this.currentDirection = DirectionStorage.RIGHT; //start facing RIGHT
        this.y = maze.findEntrance(); //sets starting y position to entrance

    }
}
