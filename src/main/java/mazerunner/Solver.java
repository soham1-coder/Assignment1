package mazerunner;

public class Solver 
{

    private Maze solvingMaze;
    private MazeExplorer explorer;
    private Path path;


    public Solver(Maze solvingMaze) 
    { 
        this.solvingMaze = solvingMaze;
        this.explorer = new MazeExplorer();
        this.path = new Path();
    }

    void solve()
    {
        explorer.setPosition(0, solvingMaze.findEntrance()); //set position at the entrance
    
        while (!solvingMaze.checkExit(explorer.getX(), explorer.getY()))
        {  
            System.out.println(explorer.getX()); 
            System.out.println(explorer.getY());
    
            //get coordinates to check the right and forward movements
            int rightX = explorer.getX() + explorer.getDirectionY();  
            int rightY = explorer.getY() - explorer.getDirectionX();  
    
            int forwardX = explorer.getX() + explorer.getDirectionX();
            int forwardY = explorer.getY() + explorer.getDirectionY();
    
            
            if (!wallChecker(rightX, rightY)) //checks if right is clear
            {
                explorer.turnRight();
                explorer.move();
                path.addMovement('R');
            }

            else if (!wallChecker(forwardX, forwardY)) //checks if forward is clear
            {
                explorer.move();
                path.addMovement('F');
            } 

            else 
            {
                explorer.turnLeft();
                path.addMovement('L');
            }
        }
    }   

    public void printPath()
    {
        path.printPath();
    }

    boolean wallChecker(int x, int y)
    {
        return solvingMaze.wallCheck(x,y); 
    }

}




