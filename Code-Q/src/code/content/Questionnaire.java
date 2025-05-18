
package code.content;
import code.model.Question;
import code.model.Option;
import java.util.*;


public class Questionnaire {
 
    public static List<Question> lessonQuestion(int lessonNumber){
        List<Question> easyQuestion = new ArrayList<>();  
        List<Question> mediumQuestion = new ArrayList<>();  
        List<Question> hardQuestion = new ArrayList<>();  
   
        switch(lessonNumber){
            case 1 -> {  
        
                easyQuestion.add(new Question( 
                    "What does PDLC stand for?",
                    Arrays.asList(
                        new Option("Programming Defined Language Code", false),
                        new Option("Program Development Life Cycle", true),
                        new Option("Process Development Lifecycle", false),
                        new Option("Project Deployment Logical Code", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( 
                    "What is the first phase of the PDLC?",
                    Arrays.asList(
                        new Option("Testing", false),
                        new Option("Deployment", false),
                        new Option("Conceptualization", true),
                        new Option("Design", false)
                        ),
                    "easy"
                ));
        
                 easyQuestion.add(new Question( 
                    "In which PDLC phase is code written?",
                    Arrays.asList(
                        new Option("Maintenance", false),
                        new Option("Implementation", true),
                        new Option("Testing", false),
                        new Option("Design", false)
                        ),
                    "easy"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which PDLC phase includes defining project scope, budget, and timeline?",
                    Arrays.asList(
                        new Option("Design Phase", false),
                        new Option("Conceptualization Phase", true),
                        new Option("Deployment Phase", false),
                        new Option("Testing Phase", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "What does the Java compiler generate after compiling .java code?",
                    Arrays.asList(
                        new Option("Machine code", false),
                        new Option("Object file", false),
                        new Option("Bytecode", true),
                        new Option("Source code", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which of the following best describes a “method header” in Java?",
                    Arrays.asList(
                        new Option("It defines a class name", false),
                        new Option("It defines the beginning of a method", true),
                        new Option("It declares a package", false),
                        new Option("It closes a method", false)
                        ),
                    "medium"
                )); 

                hardQuestion.add(new Question( 
                    "A banking application must hide customer details from being directly accessed. Which Java principle should be applied?",
                    Arrays.asList(
                        new Option("Inheritance", false),
                        new Option("Polymorphism", false),
                        new Option("Encapsulation", true),
                        new Option("Abstraction", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "You're developing a mobile app using Java for Android. Which Java feature ensures your app runs on any Android phone regardless of the brand?",
                    Arrays.asList(
                        new Option("Machine-level coding", false),
                        new Option("JVM and Bytecode", true),
                        new Option("Native Libraries", false),
                        new Option("Compiler optimization", false)
                        ),
                    "hard"
                ));
        
                hardQuestion.add(new Question( 
                    "A hospital management system needs to represent Doctor, Patient, and Employee with some shared behaviors. Which concept helps here?",
                    Arrays.asList(
                        new Option("Overloading", false),
                        new Option("Inheritance", true),
                        new Option("Static Method", false),
                        new Option("Method Chaining", false)
                        ),
                    "hard"
                ));                  
            }
            case 2 ->{

                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is the capital of CVSU",
                    Arrays.asList(
                        new Option("Quiboloy", false),
                        new Option("Robin Padilla", false),
                        new Option("Manny Pacquio", false),
                        new Option("Lito Eyara", true)
                        ),
                    "hard"
                ));
        
                easyQuestion.add(new Question(
                    "Which is a fruit?",
                    Arrays.asList(
                        new Option("Carrot", false),
                        new Option("Banana", true),
                        new Option("Broccoli", false),
                        new Option("Potato", false)
                        ),
                    "easy"
                ));
                easyQuestion.add(new Question(
                    "What is the color of the sky?",
                    Arrays.asList(
                        new Option("Red", false),
                        new Option("Blue", true),
                        new Option("Green", false),
                        new Option("Yellow", false)
                        ),
                    "medium"
                ));

                easyQuestion.add(new Question(
                    "Which one is a programming language?",
                    Arrays.asList(
                        new Option("Python", true),
                        new Option("Snake", false),
                        new Option("Lizard", false),
                        new Option("Cobra", false)
                        ),
                    "medium"
                ));  
            }
            default ->  System.out.println(" KUpal walang ganyan");
        }
        
        Collections.shuffle(easyQuestion);
        Collections.shuffle(mediumQuestion);
        Collections.shuffle(hardQuestion);
        
        List<Question> finalSet = new ArrayList<>();
            finalSet.addAll(easyQuestion.subList(0, Math.min(2, easyQuestion.size())));
            finalSet.addAll(mediumQuestion.subList(0, Math.min(2, mediumQuestion.size())));
            finalSet.addAll(hardQuestion.subList(0, Math.min(2, hardQuestion.size())));
            
        Collections.shuffle(finalSet);
        
        return finalSet;
    }
}

