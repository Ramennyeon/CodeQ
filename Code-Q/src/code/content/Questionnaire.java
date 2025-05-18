
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
        
                 
                 easyQuestion.add(new Question( 
                    "JVM stands for?",
                    Arrays.asList(
                        new Option("Java Virtual Machine", false),
                        new Option("Java Verified Machine", true),
                        new Option("Joint Virtual Machine", false),
                        new Option("Java Version Module", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "Who is one of the creator of Java?",
                    Arrays.asList(
                        new Option("Elon Musk", false),
                        new Option("James Gosling", true),
                        new Option("Mark Zuckerberg", false),
                        new Option("Dennis Richie", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is the main feature of Java",
                    Arrays.asList(
                        new Option("Runs only on Java", false),
                        new Option("Needs no Computer", true),
                        new Option("Write once, write anywhere", false),
                        new Option("Uses no Memory", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What Java keyword is used to print something to the console?",
                    Arrays.asList(
                        new Option("echo", false),
                        new Option("print", true),
                        new Option("output", false),
                        new Option("System.out.println", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is the extension of the compiled Java bytecode file?",
                    Arrays.asList(
                        new Option("java", false),
                        new Option("exe", true),
                        new Option("class", false),
                        new Option("obj", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "Which Phase in PDLC include Bug fixing?",
                    Arrays.asList(
                        new Option("Planning", false),
                        new Option("Implementation", true),
                        new Option("Testing", false),
                        new Option("Deployment", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What type of method is MAIN in java?",
                    Arrays.asList(
                        new Option("Private", false),
                        new Option("static", true),
                        new Option("Non-static", false),
                        new Option("Abstract", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What does the keyword PUBLIC in Java mean?",
                    Arrays.asList(
                        new Option("Only the same class can access it", false),
                        new Option("only subclasses can accses it", true),
                        new Option("it is accessible from anywhere", false),
                        new Option("it is private by default", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What does void mean in a method declaration?",
                    Arrays.asList(
                        new Option("The method returns a value", false),
                        new Option("The method is static", true),
                        new Option("The method returns nothing", false),
                        new Option("The method is private", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is the correct syntax to create a scanner object?",
                    Arrays.asList(
                        new Option("Scanner scan = System.in;", false),
                        new Option("Scanner scan = new Scanner(System.in);", true),
                        new Option("new Scanner = scan(System.in);", false),
                        new Option("Scanner = new Scanner(scan);", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "Which of the following is NOT a Java access?",
                    Arrays.asList(
                        new Option("Protected", false),
                        new Option("Open", true),
                        new Option("Public", false),
                        new Option("Private", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is concatenation in Java?",
                    Arrays.asList(
                        new Option("Splitting strings", false),
                        new Option("Combining numbers", true),
                        new Option("sorting numbers", false),
                        new Option("sorting strings", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "Which Keyword is used to iclude libraries in Java?",
                    Arrays.asList(
                        new Option("Include", false),
                        new Option("using", true),
                        new Option("import", false),
                        new Option("require", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "Which method in Scanner reads integer input?",
                    Arrays.asList(
                        new Option("nextString()", false),
                        new Option("nextLine()", true),
                        new Option("nextInt()", false),
                        new Option("nextInput()", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What symbol is used for escape squences?",
                    Arrays.asList(
                        new Option("/", false),
                        new Option("]", true),
                        new Option("!", false),
                        new Option("%", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is a Java class?",
                    Arrays.asList(
                        new Option("A file", false),
                        new Option("A compiler", true),
                        new Option("A blueprin for objects", false),
                        new Option("A method", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is the first line of a basic Java program called?",
                    Arrays.asList(
                        new Option("Method declaration", false),
                        new Option("Class header", true),
                        new Option("Package name", false),
                        new Option("Function call", false)
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
                 
                 mediumQuestion.add(new Question( 
                    "What happens during the verification step in Java execution?",
                    Arrays.asList(
                        new Option("the program is compiled", false),
                        new Option("Bytecode is translated to machine code", true),
                        new Option("The code is checked for errors and security violations", false),
                        new Option("The program is terminated", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "What type of Java method can be accessed without creating an object?",
                    Arrays.asList(
                        new Option("Abstract method", false),
                        new Option("Instance method", true),
                        new Option("Static method", false),
                        new Option("Void method", false)
                        ),
                    "medium"
                )); 
              
                 mediumQuestion.add(new Question( 
                    "What kind of access modifier allows visibility only within the same class?",
                    Arrays.asList(
                        new Option("Public", false),
                        new Option("Protected", true),
                        new Option("Default", false),
                        new Option("Private", false)
                        ),
                    "medium"
                )); 
              
                 mediumQuestion.add(new Question( 
                    "Which of these is NOT a valid Scanner method?",
                    Arrays.asList(
                        new Option("nextLine()", false),
                        new Option("nextChar()", true),
                        new Option("nextInt()", false),
                        new Option("nextDouble()", false)
                        ),
                    "medium"
                 ));         
              
                 mediumQuestion.add(new Question( 
                    "Which package must be imported to use the scanner class?",
                    Arrays.asList(
                        new Option("java.lang", false),
                        new Option("java.io", true),
                        new Option("java.util", false),
                        new Option("java.net", false)
                        ),
                    "medium"
                )); 
              
                 mediumQuestion.add(new Question( 
                    "In Java, what is the purpose of garbage collection?",
                    Arrays.asList(
                        new Option("Execute the program faster", false),
                        new Option("Remove unused variables", true),
                        new Option("Free up memory by removing unused objects", false),
                        new Option("Delete temp files", false)
                        ),
                    "medium"
                )); 
              
                 mediumQuestion.add(new Question( 
                    "What escape sequence is used to move to a new line in java?",
                    Arrays.asList(
                        new Option("Java", false),
                        new Option("/t", true),
                        new Option("/r", false),
                        new Option("/b", false)
                        ),
                    "medium"
                )); 
                 mediumQuestion.add(new Question( 
                    "What is required for a method to be recognized as tha starting point of a Java application?",
                    Arrays.asList(
                        new Option("It must be named run", false),
                        new Option("It must be a private method", true),
                        new Option("It must be name main and be static", false),
                        new Option("It must return an int", false)
                        ),
                    "medium"
                ));
                 
                 mediumQuestion.add(new Question( 
                    "Which of the following describes a CUSTOM CLASS in Java?" ,
                    Arrays.asList(
                        new Option("A class imported from a package", false),
                        new Option("A user defined class tailored to specific needs", true),
                        new Option("A default class from Java libraries", false),
                        new Option("A read-only class", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "What will the output of this line be? System.out.println(Hello/tWorld);" ,
                    Arrays.asList(
                        new Option("Hello World", false),
                        new Option("HelloWorld", true),
                        new Option("Hello World", false),
                        new Option("Hello/World", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "What does System.in represent in java" ,
                    Arrays.asList(
                        new Option("File input stream", false),
                        new Option("Keyboard input stream", true),
                        new Option("Output screen", false),
                        new Option("File system", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which is a feature of Object-Oriented Programming" ,
                    Arrays.asList(
                        new Option("Compilation", false),
                        new Option("Abstraction", true),
                        new Option("Linking", false),
                        new Option("Parsing", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which of the following is not part of Java's core programming paradigms? ?" ,
                    Arrays.asList(
                        new Option("Object-Oriented", false),
                        new Option("Procedural", true),
                        new Option("Functional", false),
                        new Option("Imperative", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which of the following is true about the main method's argument?" ,
                    Arrays.asList(
                        new Option("It must always be int[] args", false),
                        new Option("It holds command-line-arguments as Strings", true),
                        new Option("It is afloat array", false),
                        new Option("it is unused and unnecessary", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "How do you define a package in Java?" ,
                    Arrays.asList(
                        new Option("package = java.util", false),
                        new Option("import package", true),
                        new Option("package java.util", false),
                        new Option("new package();", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "What is the output of the following? System.out.println(5+2=5+2);" ,
                    Arrays.asList(
                        new Option("5+2=7", false),
                        new Option("5+2=52", true),
                        new Option("7", false),
                        new Option("Error", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which Keyword us used to define a method that doesn't return any value?" ,
                    Arrays.asList(
                        new Option("static", false),
                        new Option("null", true),
                        new Option("empty", false),
                        new Option("void", false)
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

