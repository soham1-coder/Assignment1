package mazerunner;

public class Solver 
{

    private Maze solvingMaze;
    private MazeExplorer explorer;

    public Solver(Maze solvingMaze) 
    { 
        this.solvingMaze = solvingMaze;
        this.explorer = new MazeExplorer();
    }
    void solve()
    {
        explorer.start(solvingMaze.findEntrance());
        explorer.move();
        explorer.turnRight();
        explorer.move();
        System.out.println(explorer.getX());
        System.out.println(explorer.getY());
    }   

}    




