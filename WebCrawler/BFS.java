package WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BFS {

    private Queue<String> queue;
    private List<String> discoveredWebsiteList;

    public BFS(){
        this.queue = new LinkedList<>();
        this.discoveredWebsiteList = new ArrayList<>();
    }
    /**
     * Works on the simple BFS search over sites URL using Matcher methods
     * @param root
     * @author ArcherL
     */

    public void dicoverWeb(String root){
        this.queue.add(root);
        this.discoveredWebsiteList.add(root);

        while(!queue.isEmpty()){
            String variableVertex = this.queue.remove();
            String rawHTML = readURL(variableVertex);

            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHTML);

            while (matcher.find()){

                String variableString =  matcher.group();

                if (!discoveredWebsiteList.contains(variableString)){
                    discoveredWebsiteList.add(variableString);
                    System.out.println("Web Site found with URL: "+variableString);
                    queue.add(variableString);
                }
            }
        }
    }

    private String readURL (String variableVertex) {

        String rawHTML = "";

        try {
            URL url = new URL(variableVertex);
            BufferedReader bbfr = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine = "";

            while( (inputLine = bbfr.readLine()) != null){
                rawHTML+=inputLine;
            }

            bbfr.close();;

        }catch (Exception ex){
            ex.printStackTrace();    // poor programming practice although
        }

        return rawHTML;
    }


}
