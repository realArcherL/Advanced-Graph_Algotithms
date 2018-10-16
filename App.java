package WebCrawler;

/**
 * @author ArcherL
 */
public class App {
    public static void main(String[] args){
        String root = "https://www.google.com";
        BFS bbfs = new BFS();
        bbfs.dicoverWeb(root);
    }
}

// http://tutorials.jenkov.com/java-regex/matcher.html for reference