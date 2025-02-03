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

        while (!solvingMaze.checkExit(explorer.getX(), explorer.getY()))
        {   
            if (!wallChecker(explorer.getX()+1, explorer.getY())) //check for right wall
            {
                explorer.turnRight();
            }

            if (!wallChecker(explorer.getX(), explorer.getY()+1)) //check for forward wall
            {
                explorer.move();
            } 
            
            else 
            {
                explorer.turnLeft();
            }
        }
    }   

    boolean wallChecker(int x, int y)
    {
        return solvingMaze.wallCheck(x,y); 
    }

}




