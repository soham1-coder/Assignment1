package mazerunner;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args)
    {

        logger.info("** Starting Maze Runner");
        Options options = new Options();
        options.addOption("i", true, "Input file containing the maze");

        CommandLineParser parser = new DefaultParser();

        try {

            //parses command line arguments for options
            CommandLine cmd = parser.parse(options, args); 
            String inputFilePath = cmd.getOptionValue("i");

            if (inputFilePath == null) {
                logger.error("No input file provided");
                return;
            }

            logger.info("**** Reading the maze from file " + inputFilePath);

            Maze maze = new Maze(inputFilePath); //creates maze based on given maze
            maze.printMaze(); 

            MazeExplorer explorer = new MazeExplorer(); //creates explorer

            Solver solver = new Solver(maze);   
            solver.solve();         
        }

        catch (ParseException e) {
            logger.error("Error parsing command line arguments");
        }
        catch(Exception e) {
            logger.error("/!\\ An error has occured /!\\");
        }

        logger.info("**** Computing path");
        logger.info("PATH NOT COMPUTED");
        logger.info("** End of MazeRunner");
    }
}

    

    

