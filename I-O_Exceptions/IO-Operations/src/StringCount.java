import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringCount {
    public static void main(String[] args){
        String sourceFile = "src/input.txt";
        String targetFile = "src/target.txt";

        Map<String, Integer> wordMap = new HashMap<>();
        try(
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile)
        ){
            while(true){
                String line = bReader.readLine();
                if(line == null){
                    break;
                }
                else{
                    line = line.trim();
                    String[] words = line.split(" ");
                    for(String word : words){
                        if(!wordMap.containsKey(word)){
                            wordMap.put(word,1);
                        }
                        else{
                            wordMap.replace(word,wordMap.get(word)+1);
                        }
                    }
                }
            }
            Set<String> keyList = wordMap.keySet();
            for (String key : keyList){
                writer.write(key + " : " + wordMap.get(key) + "\n");
            }
            System.out.println("File copied!");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
