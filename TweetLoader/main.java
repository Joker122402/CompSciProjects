import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // create an empty ArrayList
        ArrayList<Tweet> myList = null;

        // load data from file into ArrayList
        try {
            myList = TweetLoader.loadAsArrayList("tweet_data.csv");
        } catch (IOException e) {
            System.out.println(e);
        }

        // call loadAsArray
        Tweet[] myListTwo = null;

        try {
            myListTwo = TweetLoader.loadAsArray("tweet_data.csv");
        } catch (IOException e) {
            System.out.println(e);
        }

        // print head of ArrayList
        printHead(myList, 3);
        // print tail of array list
        printTail(myList, 3);

        //blank line to make the outputs more readable
        System.out.println("");

        // print head of Array
        printHead(myListTwo, 3);
        // Print tail of Array
        printTail(myListTwo, 3);
    }
    
    
    public static void printHead(ArrayList<Tweet>list, int n){
        // Display a list of the first n entries in the ArrayList
        for (int i = 0; i < n; i++){
            System.out.println(list.get(i));
        }
    } 

    public static void printHead(Tweet[]list, int n){
        // Display a list of the first n entries in the array
        for (int i = 0; i < n; i++){
            System.out.println(list[i]);
        }
    }

    public static void printTail (ArrayList<Tweet>list, int n){
        // Print the last n entires in the arraylist
        for (int i = list.size() - n; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void printTail (Tweet[]list, int n){
        // display the last n entries in the array
        for (int i = list.length - n; i < list.length; i++){
            System.out.println(list[i]);
        }
    }

}
