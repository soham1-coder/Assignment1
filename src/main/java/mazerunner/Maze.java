package mazerunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Maze 
{
    private char[][] maze; //stores the maze in a 2d array

    public void loadMaze(String filePath) throws FileNotFoundException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

    }

    public char[][] getMaze()
    {
        return maze;
    }

    public void printMaze()
    {
        for (int i = 0; i < maze.length; i++) 
        {
            for (int j = 0; j < maze[i].length; j++) 
            {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }

    }
}
