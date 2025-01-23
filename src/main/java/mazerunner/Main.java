package mazerunner;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("** Starting Maze Runner");

        Options options = new Options();
        options.addOption("i", true, "Input file containing the maze");

        CommandLineParser parser = new DefaultParser();

        try {

            CommandLine cmd = parser.parse(options, args); //Parse command line arguments
            String inputFilePath = cmd.getOptionValue("i");

            if (inputFilePath == null) {
                logger.error("No input file provided");
                return;
            }

            logger.info("**** Reading the maze from file " + inputFilePath);
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                for (int idx = 0; idx < line.length(); idx++) {
                    if (line.charAt(idx) == '#') {
                        logger.info("WALL ");
                    } else if (line.charAt(idx) == ' ') {
                    logger.info("PASS ");
                    }
                }
                logger.info(System.lineSeparator());
            }
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

    

    

