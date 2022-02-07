import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TweetLoader {
    
    public static ArrayList<Tweet> loadAsArrayList(String filename) throws IOException {
        // create a new file reader
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        //create the arraylist that will store the tweets
        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
        
        // String variable that will be used when parsing the data file
        String line = null;

        // create a loop to aprse the entire file
        while ((line = reader.readLine()) != null){
            //convert line into an array by splitting that line up at the commas
            String[] tweet_data = line.split(",");

            //create a new tweet
            Tweet new_tweet = new Tweet(Integer.parseInt(tweet_data[1]), tweet_data[0], tweet_data[2]);

            // add tweet to the arraylist
            tweetList.add(new_tweet);
        }
        return tweetList;

    } 

    public static Tweet[] loadAsArray(String filename) throws IOException {
        // Create reader
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        // Create the initial array (will use an initial size of 100)
        Tweet[] tweetList = new Tweet[100];

        // String that will be used when parsing the file
        String line = null;

        // Loop to read from file till file is empty
        int counter = 0;
        while ((line = reader.readLine()) != null){
            // if the counter is same as length of tweetList (indicating the array is full)
            if (counter == tweetList.length){
                // Create a temp array that is double the size of tweetList
                Tweet[] tempArray = new Tweet[tweetList.length + 1];

                // copy the contents of tweetList into the temp array
                for (int i = 0; i < tweetList.length; i++){
                    tempArray[i] = tweetList[i];
                }

                // set tweetList equal to the temp array thereby doubling its size but keeping the already present values
                tweetList = tempArray;
            }

            String[] tweet_data = line.split(",");

            Tweet new_tweet = new Tweet(Integer.parseInt(tweet_data[1]), tweet_data[0], tweet_data[2]);

            tweetList[counter] = new_tweet;
            
            counter++;
        }

        return tweetList;
    }
}
