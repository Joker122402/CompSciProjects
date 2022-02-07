public class Tweet {

    // Attributes
    public int tweetId;
    public String tweetSentiment; // Sentiment value (Pos / Neg)
    public String tweetText; // Tweet Text

    //construtor
    public Tweet(int id, String Sentiment, String text) {
        this.tweetId = id;
        this.tweetSentiment = Sentiment;
        this.tweetText = text;
    }

    // toString Override. Format: <ID> (<SENTIMENT>): <TWEET TEXT>
    // Example: 1152(Pos): I love this course; @CUS1126exposes me to so many interesting materials
    public String toString(){
        return String.format("%d (%s): %s", this.tweetId, this.tweetSentiment, this.tweetText);
    }
}
