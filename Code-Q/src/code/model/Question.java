
package code.model;

import java.util.List;


public class Question {
    
    private String text;
    private List<Option>options; 
    private String difficulty; 

    
    public Question(String text, List<Option> options, String difficulty){
        this.text = text; 
        this.options = options;
        this.difficulty = difficulty;
    }
   
    public String getText(){
        return this.text;
    }
    
    public List<Option> getOptions(){
        return this.options;    
    }
    
    public String getDifficulty() {
        return difficulty;
    }

    public int getPoints() {  
        return switch (difficulty.toLowerCase()) {
            case "easy" -> 1;
            case "medium" -> 2;
            case "hard" -> 5;
            default -> 0;
        };
    }
}
