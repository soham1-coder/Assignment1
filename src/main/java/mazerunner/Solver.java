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
        explorer.setPosition(0,solvingMaze.findEntrance()); //sets y position to entrance

        while (wallChecker(explorer.getX()+1,explorer.getY()))
        {   
            explorer.move();
            explorer.turnRight();
            explorer.move();
            System.out.println(explorer.getX());
            System.out.println(explorer.getY());

        }
    }   

    boolean wallChecker(int x, int y)
    {
        return solvingMaze.wallCheck(x,y); 
    }

}    




