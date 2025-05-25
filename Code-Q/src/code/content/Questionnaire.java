
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
                        new Option("Java Virtual Machine", true),
                        new Option("Java Verified Machine", false),
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
                        new Option("Needs no Computer", false),
                        new Option("Write once, write anywhere", true),
                        new Option("Uses no Memory", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What Java keyword is used to print something to the console?",
                    Arrays.asList(
                        new Option("echo", false),
                        new Option("print", false),
                        new Option("output", false),
                        new Option("System.out.println", true)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is the extension of the compiled Java bytecode file?",
                    Arrays.asList(
                        new Option("java", false),
                        new Option("exe", false),
                        new Option("class", true),
                        new Option("obj", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "Which Phase in PDLC include Bug fixing?",
                    Arrays.asList(
                        new Option("Planning", false),
                        new Option("Implementation", false),
                        new Option("Testing", true),
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
                        new Option("only subclasses can accses it", false),
                        new Option("it is accessible from anywhere", true),
                        new Option("it is private by default", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What does void mean in a method declaration?",
                    Arrays.asList(
                        new Option("The method returns a value", false),
                        new Option("The method is static", false),
                        new Option("The method returns nothing", true),
                        new Option("The method is private", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is the correct syntax to create a scanner object?",
                    Arrays.asList(
                        new Option("Scanner scan = System.in;", false),
                        new Option("Scanner scan = new Scanner(System.in);", false),
                        new Option("new Scanner = scan(System.in);", true),
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
                        new Option("Combining numbers", false),
                        new Option("sorting numbers", true),
                        new Option("sorting strings", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "Which Keyword is used to iclude libraries in Java?",
                    Arrays.asList(
                        new Option("Include", false),
                        new Option("using", false),
                        new Option("import", true),
                        new Option("require", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "Which method in Scanner reads integer input?",
                    Arrays.asList(
                        new Option("nextString()", false),
                        new Option("nextLine()", false),
                        new Option("nextInt()", true),
                        new Option("nextInput()", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What symbol is used for escape squences?",
                    Arrays.asList(
                        new Option("/", false),
                        new Option("]", false),
                        new Option("#", true),
                        new Option("%", false)
                        ),
                    "easy"
                )); 
                 
                 easyQuestion.add(new Question( 
                    "What is a Java class?",
                    Arrays.asList(
                        new Option("A file", false),
                        new Option("A compiler", false),
                        new Option("A blueprin for objects", true),
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
                        new Option("Bytecode is translated to machine code", false),
                        new Option("The code is checked for errors and security violations", true),
                        new Option("The program is terminated", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "What type of Java method can be accessed without creating an object?",
                    Arrays.asList(
                        new Option("Abstract method", false),
                        new Option("Instance method", false),
                        new Option("Static method", true),
                        new Option("Void method", false)
                        ),
                    "medium"
                )); 
              
                 mediumQuestion.add(new Question( 
                    "What kind of access modifier allows visibility only within the same class?",
                    Arrays.asList(
                        new Option("Public", false),
                        new Option("Protected", false),
                        new Option("Default", false),
                        new Option("Private", true)
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
                        new Option("java.io", false),
                        new Option("java.util", true),
                        new Option("java.net", false)
                        ),
                    "medium"
                )); 
              
                 mediumQuestion.add(new Question( 
                    "In Java, what is the purpose of garbage collection?",
                    Arrays.asList(
                        new Option("Execute the program faster", false),
                        new Option("Remove unused variables", false),
                        new Option("Free up memory by removing unused objects", true),
                        new Option("Delete temp files", false)
                        ),
                    "medium"
                )); 
              
                 mediumQuestion.add(new Question( 
                    "What escape sequence is used to move to a new line in java?",
                    Arrays.asList(
                        new Option("Java", false),
                        new Option("/t", false),
                        new Option("/n", true),
                        new Option("/b", false)
                        ),
                    "medium"
                )); 
                 mediumQuestion.add(new Question( 
                    "What is required for a method to be recognized as tha starting point of a Java application?",
                    Arrays.asList(
                        new Option("It must be named run", false),
                        new Option("It must be a private method", false),
                        new Option("It must be name main and be static", true),
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
                        new Option("HelloWorld", false),
                        new Option("Hello World", true),
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
                        new Option("Procedural", false),
                        new Option("Functional", true),
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
                        new Option("import package", false),
                        new Option("package java.util", true),
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
                        new Option("null", false),
                        new Option("empty", false),
                        new Option("void", true)
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
        
                hardQuestion.add(new Question( 
                    "An e-commerce site needs to show different layouts for users, admins, and guests using the same method. what OOP concept is suitable?",
                    Arrays.asList(
                        new Option("Encapsulation", false),
                        new Option("Method Overloading", false),
                        new Option("Polymorphism", true),
                        new Option("Abstract Method", false)
                        ),
                    "hard"
                ));                  
        
                hardQuestion.add(new Question( 
                    "A programmer accidentallu writes a class that alloes other programs to directly modify private data. Which access modifier should have been used?",
                    Arrays.asList(
                        new Option("Default", false),
                        new Option("Protected", false),
                        new Option("Public", false),
                        new Option("Private", true)
                        ),
                    "hard"
                ));                  
        
                hardQuestion.add(new Question( 
                    "A programmer accidentallu writes a class that alloes other programs to directly modify private data. Which access modifier should have been used?",
                    Arrays.asList(
                        new Option("Default", false),
                        new Option("Protected", false),
                        new Option("Public", true),
                        new Option("Private", false)
                        ),
                    "hard"
                ));                  
        
                hardQuestion.add(new Question( 
                    "In a chatbot program, each user input creates a new scanner object Over time, the system slows down. what concept is causing this issue?",
                    Arrays.asList(
                        new Option("Static Methods", false),
                        new Option("Method Overloading", false),
                        new Option("Memory Leak due to poor instantiation", true),
                        new Option("Bytcode Optimization", false)
                        ),
                    "hard"
                ));                  
        
                hardQuestion.add(new Question( 
                    "You want to build a smart appliance that reads temprature sensors using Java Which Java application domain are you working in?",
                    Arrays.asList(
                        new Option("Desktop Applications", false),
                        new Option("Web Developement", false),
                        new Option("Internet of things", true),
                        new Option("Game developement", false)
                        ),
                    "hard"
                ));                  
        
                hardQuestion.add(new Question( 
                    "A system crashes because it tries to access a method from a non-instantiated object. Which rule did the developer forget?",
                    Arrays.asList(
                        new Option("Methods should be public", false),
                        new Option("Classes must be static", false),
                        new Option("Non-static methods require object creation", true),
                        new Option("use only void methods", false)
                        ),
                    "hard"
                ));                  
        
                hardQuestion.add(new Question( 
                    "In a classroom grading app. you must restrict access to grade calculations from outside the class. What would you use?",
                    Arrays.asList(
                        new Option("Public methods", false),
                        new Option("Private methods", true),
                        new Option("Abstract classes", false),
                        new Option("Packages", false)
                        ),
                    "hard"
                ));                  
        
                hardQuestion.add(new Question( 
                    "You're working on a health tracker app. When a user clicks START TRACKING, a method begins executing. What term describes this block of code?",
                    Arrays.asList(
                        new Option("Scanner", false),
                        new Option("Variable", false),
                        new Option("Method", true),
                        new Option("Import", false)
                        ),
                    "hard"
                ));   
                
                hardQuestion.add(new Question( 
                    "A developer uses System.out.println(Temp: +temp+C); to display sensor data. What is Happening with the + operator here?",
                    Arrays.asList(
                        new Option("Arithmetic", false),
                        new Option("Concatenation", true),
                        new Option("Overloading", false),
                        new Option("Escape sequencing", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "Your game uses System.out.println(Game Over/nTry Again); What will the output look like?",
                    Arrays.asList(
                        new Option("Game Over Try Again", false),
                        new Option("Game Over/nTryAgain", false),
                        new Option("Game Over Try Again", true),
                        new Option("Error", false)
                        ),
                    "hard"
                ));                  
                
                hardQuestion.add(new Question( 
                    "A program recieves customer input using Scanner scan = new Scanner(System.in);. What kind of operation is this?",
                    Arrays.asList(
                        new Option("Inheritance", false),
                        new Option("Intantiation", false),
                        new Option("Compilation", true),
                        new Option("Encapsulation", false)
                        ),
                    "hard"
                ));                  
                
                hardQuestion.add(new Question( 
                    "You're building a robot using Java. The command moveForward(); must be available to all subclasses. What access modifier should used?",
                    Arrays.asList(
                        new Option("Private", false),
                        new Option("Protected", true),
                        new Option("Default", false),
                        new Option("Final", false)
                        ),
                    "hard"
                ));                  
                
                hardQuestion.add(new Question( 
                    "A student app has methods for computeAverage() and compute Total(). if both methods have the same name but different parameters, what is this called?",
                    Arrays.asList(
                        new Option("Method Overriding", false),
                        new Option("Method Hiding", true),
                        new Option("Method Overloading", false),
                        new Option("Inheritance", false)
                        ),
                    "hard"
                ));                  
                
                hardQuestion.add(new Question( 
                    "A program prints: Result: 10 + 20 = 1020. Why did this happen?",
                    Arrays.asList(
                        new Option("The values are added before printing", false),
                        new Option("The + operator added numbers correctly", false),
                        new Option("Java treated numbers as strings", true),
                        new Option("It's an escape sequence issue", false)
                        ),
                    "hard"
                ));                  
                
                hardQuestion.add(new Question( 
                    "A weather system processes thousands of update every minute. Which Java feature helps manage memory  automatically for unused objects?",
                    Arrays.asList(
                        new Option("JVM Loader", false),
                        new Option("Compilation", false),
                        new Option("Garbage Collection", true),
                        new Option("Bytecode", false)
                        ),
                    "hard"
                ));                  
                
                hardQuestion.add(new Question( 
                    "You're building an education app. What Java concept would you use to group related classes like Math, Science, and English?",
                    Arrays.asList(
                        new Option("Access Modifier", false),
                        new Option("Packages", true),
                        new Option("Inheritance", false),
                        new Option("Import", false)
                        ),
                    "hard"
                ));                  
                
                hardQuestion.add(new Question( 
                    "A factory automation system must run on both Linux and Windows without Changing the Java program. Which Java principle makes this possible?",
                    Arrays.asList(
                        new Option("Access Modifier", false),
                        new Option("Packages", true),
                        new Option("Inheritance", false),
                        new Option("Import", false)
                        ),
                    "hard"
                ));                  
                
                hardQuestion.add(new Question( 
                    "A factory automation system must run on both Linux and Windows without changing the Java program. which Java principle makes this possible?",
                    Arrays.asList(
                        new Option("Platform", false),
                        new Option("Just-in-time compillation",false),
                        new Option("Write Once, Run Anywhere", true),
                        new Option("JVM Isolation", false)
                        ),
                    "hard"
                ));                  
            }
            case 2 ->{

                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What are control structures used for in Java",
                    Arrays.asList(
                        new Option("To store Data", false),
                        new Option("To manage memory", false),
                        new Option("To control flow of the program", true),
                        new Option("To display input", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which of the following is NOT a type of control Logic",
                    Arrays.asList(
                        new Option("Sequence Logic", false),
                        new Option("Selection Logic", true),
                        new Option("Storage Logic", false),
                        new Option("Iteration Logic", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is another name for Sequential Logic?",
                    Arrays.asList(
                        new Option("Looping Flow", false),
                        new Option("Conditional Flow", false),
                        new Option("Sequential Flow", true),
                        new Option("Binary Flow", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is the main characteristc of Sequential Logic?",
                    Arrays.asList(
                        new Option("Repeats instructions", false),
                        new Option("Executes instructions one by one", false),
                        new Option("Makes Decisions", true),
                        new Option("Skips all instructions", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which control logic uses conditions to choose between actions?",
                    Arrays.asList(
                        new Option("Sequence Logic", false),
                        new Option("Selection Logic", true),
                        new Option("Iteration Logic", false),
                        new Option("Parallel Logic", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is the keyword used for a simple IF condition in java?",
                    Arrays.asList(
                        new Option("When", false),
                        new Option("if", false),
                        new Option("Then", true),
                        new Option("case", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What type of selection structure has an if and else block?",
                    Arrays.asList(
                        new Option("Single alternatives", false),
                        new Option("Double alternatives", true),
                        new Option("Multiple Alternatives", false),
                        new Option("Loop", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What control structure uses else-if statements?",
                    Arrays.asList(
                        new Option("Single alternatives", false),
                        new Option("Double alternatives", false),
                        new Option("Multiple Alternatives", true),
                        new Option("Loop", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which keyword is used in a switch statement?",
                    Arrays.asList(
                        new Option("if", false),
                        new Option("select", false),
                        new Option("switch", true),
                        new Option("choose", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is used to end each case in a switch block?",
                    Arrays.asList(
                        new Option("stop", false),
                        new Option("end", false),
                        new Option("exit", false),
                        new Option("break", true)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What does a default block do in a switch?",
                    Arrays.asList(
                        new Option("Ends the program", false),
                        new Option("Repeats the last case", false),
                        new Option("Runs if no case matches", true),
                        new Option("Skips all cases", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "How many times does a do... while loop execute at minimum?",
                    Arrays.asList(
                        new Option("0 times", false),
                        new Option("1 times", true),
                        new Option("2 times", false),
                        new Option("infinite times", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Where is the condition tested in a while loop?",
                    Arrays.asList(
                        new Option("At the end", false),
                        new Option("At the top", true),
                        new Option("In the middle", false),
                        new Option("after 1 iteration", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "which loop checks the condition after the loop body?",
                    Arrays.asList(
                        new Option("for loop", false),
                        new Option("do while loop", false),
                        new Option("while loop", true),
                        new Option("switch loop", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What are the three parts of a for loop?",
                    Arrays.asList(
                        new Option("int, test, finish", false),
                        new Option("init, condition, increment", false),
                        new Option("condition, loop, end", true),
                        new Option("start, repeat, stop", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What kind of loop is best when the number of repetions is known?",
                    Arrays.asList(
                        new Option("while loop", false),
                        new Option("do...while loop",false),
                        new Option("for loop", true),
                        new Option("start, repeat, stop", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which loop is best when you want to ensure the code runs at least once?",
                    Arrays.asList(
                        new Option("while loop", false),
                        new Option("do...while loop",false),
                        new Option("for loop", true),
                        new Option("start, repeat, stop", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which loop continues while the condition is true?",
                    Arrays.asList(
                        new Option("do...while loop",false),
                        new Option("if statement", false),
                        new Option("switch", false),
                        new Option("while loop", true)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What happens if the condition in a while loop is false at first?",
                    Arrays.asList(
                        new Option("the loop runs once",false),
                        new Option("the loop doesn't run", true),
                        new Option("the loop repeats", false),
                        new Option("An error occurs", false)
                        ),
                    "easy"
                ));
                
                easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is the purpose of a loop?",
                    Arrays.asList(
                        new Option("To stop execution",false),
                        new Option("To conditionally execute", false),
                        new Option("To repeat code", true),
                        new Option("To define classes", false)
                        ),
                    "easy"
                ));
 
                 mediumQuestion.add(new Question( 
                    "Which control structure is most suitable for choosing one out of many option" ,
                    Arrays.asList(
                        new Option("for loop", false),
                        new Option("while loop", true),
                        new Option("if-else", false),
                        new Option("switch", false)
                        ),
                    "medium"
                )); 
                                 
                 mediumQuestion.add(new Question( 
                    "In a for loop, where is the loop control variable usually updated" ,
                    Arrays.asList(
                        new Option("In the condition", false),
                        new Option("In the body", true),
                        new Option("In the Increment part", false),
                        new Option("Outside the loop", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which loop is best for reading input until the user typs EXIT?" ,
                    Arrays.asList(
                        new Option("for loop", false),
                        new Option("do...while loop", true),
                        new Option("while loop", false),
                        new Option("if-else", false)
                        ),
                    "medium"
                )); 

                 
                 mediumQuestion.add(new Question( 
                    "What happens if a break statement is missing in a switch case?" ,
                    Arrays.asList(
                        new Option("error", false),
                        new Option("Only default will run", true),
                        new Option("Fall-through to the next case", false),
                        new Option("Program exits", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which loop will always execute at least once?" ,
                    Arrays.asList(
                        new Option("while", false),
                        new Option("for", true),
                        new Option("do...while", false),
                        new Option("switch", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which loop will always execute at least once?" ,
                    Arrays.asList(
                        new Option("while", false),
                        new Option("for", true),
                        new Option("do...while", false),
                        new Option("switch", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which part of the for loop is executed only once?" ,
                    Arrays.asList(
                        new Option("initialization", false),
                        new Option("Condition", true),
                        new Option("Body", false),
                        new Option("Increment", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which of the following is a valid way to write a while loop?" ,
                    Arrays.asList(
                        new Option("while x > 5{}", false),
                        new Option("while(x>5){}", true),
                        new Option("whilex: {}", false),
                        new Option("while > 5 (x)", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "What structure is ideal when checking multiple exact matches for a variable?" ,
                    Arrays.asList(
                        new Option("Nested if", false),
                        new Option("while loop", true),
                        new Option("switch", false),
                        new Option("do..while loop", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "When is the condition in a do..while loop checked?" ,
                    Arrays.asList(
                        new Option("before the loop starts", false),
                        new Option("In teh middle of the loop", true),
                        new Option("After the loop runs once", false),
                        new Option("Before an after each loop", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which of the following loops os best when the number of iterations is known beforehand?" ,
                    Arrays.asList(
                        new Option("while", false),
                        new Option("do...while", true),
                        new Option("for", false),
                        new Option("switch", false)
                        ),
                    "medium"
                )); 
                 
                 mediumQuestion.add(new Question( 
                    "Which of the following is a valid switch syntax?" ,
                    Arrays.asList(
                        new Option("switch = x{}", false),
                        new Option("switch (x) {case 1:...}", true),
                        new Option("switch{x=1:...}", false),
                        new Option("switch(x):{}", false)
                        ),
                    "medium"
                )); 
                 
                                 
                hardQuestion.add(new Question( 
                    "A vending machine program must decide what product to dispense base on the selected number. Which structure is most appropriate?",
                    Arrays.asList(
                        new Option("for loop", false),
                        new Option("if-else-if",false),
                        new Option("switch", true),
                        new Option("do-while", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "You are programming a smart home system. The header should turn on if the temprature drops below 18C Which structure should be used?",
                    Arrays.asList(
                        new Option("switch", false),
                        new Option("for",false),
                        new Option("if", true),
                        new Option("while", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "You are programming a smart home system. The header should turn on if the temprature drops below 18C Which structure should be used?",
                    Arrays.asList(
                        new Option("switch", false),
                        new Option("for",false),
                        new Option("if", true),
                        new Option("while", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "You are programming a smart home system. The header should turn on if the temprature drops below 18C Which structure should be used?",
                    Arrays.asList(
                        new Option("switch", false),
                        new Option("for",false),
                        new Option("if", true),
                        new Option("while", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "A student attendance system should allow checking students until the teacher enters DONE. What loop should be used?",
                    Arrays.asList(
                        new Option("for", false),
                        new Option("do-while",false),
                        new Option("while", true),
                        new Option("switch", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "A program that calculates a monthly electricity bills for 100 houses a best written using which loop?",
                    Arrays.asList(
                        new Option("while", false),
                        new Option("for",false),
                        new Option("switch", true),
                        new Option("if", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "You need to ensure a login form is shown at least once before validationg credentials. What loop guarantess this?",
                    Arrays.asList(
                        new Option("while", false),
                        new Option("for",false),
                        new Option("do-while", true),
                        new Option("if", false)
                        ),
                    "hard"
                ));
                
                hardQuestion.add(new Question( 
                    "You are programming a traffic light system: green, yellow, red. Each state follows the other in order. Which structure is best?",
                    Arrays.asList(
                        new Option("switch", false),
                        new Option("nested if",false),
                        new Option("loop", true),
                        new Option("recursive function", false)
                        ),
                    "hard"
                ));
                
                                
                hardQuestion.add(new Question( 
                    "A coffee machine should keep asking for a valid selection untile one is made. Which is the best loop to use?",
                    Arrays.asList(
                        new Option("for", false),
                        new Option("while",false),
                        new Option("do-While", true),
                        new Option("if-else", false)
                        ),
                    "hard"
                ));
                                
                hardQuestion.add(new Question( 
                    "A mobile app menu has 6 options. What is the most efficient way to check which button was clicked?",
                    Arrays.asList(
                        new Option("switch-case", true),
                        new Option("if",false),
                        new Option("while",false),
                        new Option("for", false)
                        ),
                    "hard"
                ));
                
                                
                hardQuestion.add(new Question( 
                    "In a quiz app, users must answer 10 questions. if the number is fixed, which loop is preffered?",
                    Arrays.asList(
                        new Option("while", false),
                        new Option("do-while",false),
                        new Option("for", true),
                        new Option("switch", false)
                        ),
                    "hard"
                ));
                
                                
                hardQuestion.add(new Question( 
                    "Which condition allows infinite execution of a while loop?",
                    Arrays.asList(
                        new Option("while(x == 5)", false),
                        new Option("while(true)",false),
                        new Option("while(x != 0)", true),
                        new Option("while(x < 10)", false)
                        ),
                    "hard"
                ));
                
                                
                hardQuestion.add(new Question( 
                    "you are writing a billing system where taxes depend on the type of item. Which control structure best handles this?",
                    Arrays.asList(
                        new Option("loop", false),
                        new Option("if-else",false),
                        new Option("switch", true),
                        new Option("break", false)
                        ),
                    "hard"
                ));
                
                                
                hardQuestion.add(new Question( 
                    "You need to validate from fields one by one until a valid entry is found. What's best?",
                    Arrays.asList(
                        new Option("for loop", false),
                        new Option("while loop",false),
                        new Option("if statement", true),
                        new Option("do-while", false)
                        ),
                    "hard"
                ));
                
                                
                hardQuestion.add(new Question( 
                    "Which is true about switch-case blocks in Java?",
                    Arrays.asList(
                        new Option("break is optional but prevents fall-through", false),
                        new Option("Only numbers can be used in case",false),
                        new Option("The default must always be last", true),
                        new Option("You can't use -> in switch statements", false)
                        ),
                    "hard"
                ));
                
                                
                hardQuestion.add(new Question( 
                    "In a password checker, the system should allow three attempts only. Which control structure is most appropriate?",
                    Arrays.asList(
                        new Option("while loop with counter", false),
                        new Option("do-while loop without condition",false),
                        new Option("switch statement", true),
                        new Option("Nested if", false)
                        ),
                    "hard"
                ));
                                
                hardQuestion.add(new Question( 
                    "In which case would you use a nested if structure?",
                    Arrays.asList(
                        new Option("Comparing one variable to multiple values", false),
                        new Option("Repeating a task multiple times",false),
                        new Option("Checking multiple related conditions", true),
                        new Option("Performing arithmetic operations", false)
                        ),
                    "hard"
                ));
               
            }
            case 3 ->{
                
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is the main purpose of a data structure?",
                    Arrays.asList(
                        new Option("To compile code", false),
                        new Option("To store data efficiently", true),
                        new Option("To display graphics", false),
                        new Option("To manage memory leaks", false)
                        ),
                    "easy"
                ));
                
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which of the following is a linear data structure?",
                    Arrays.asList(
                        new Option("Graph", false),
                        new Option("Tree", false),
                        new Option("Linked List", true),
                        new Option("Hash Table", false)
                        ),
                    "easy"
                ));
                          easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which data structure follows the Last in, First Out (LIFO) principle?",
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Queue", false),
                        new Option("Stack", true),
                        new Option("Graph", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which data structure follows the Last in, First Out (LIFO) principle?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Tree", false),
                        new Option("Queue", true),
                        new Option("Array", false)
                        ),
                    "easy"
                ));
                    
                          easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is an array?",
                    Arrays.asList(
                        new Option("A set of unrelated data types", false),
                        new Option("A variable that stores only characters", false),
                        new Option("A fixe-sized collection of elements  of the same data type", true),
                        new Option("A dynamic collection of variables", false)
                        ),
                    "easy"
                ));
                          
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which structure connects elements using pointers or links?",
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Stack", false),
                        new Option("Linked List", true),
                        new Option("Hash Table", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which of the following is NOT a linear data structure?",
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Queue", false),
                        new Option("Tree", true),
                        new Option("Stack", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is a hash table used for?",
                    Arrays.asList(
                        new Option("Sorting elements", false),
                        new Option("Fast data retrieval using keys", true),
                        new Option("Displaying data", false),
                        new Option("Traversing a tree", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which if the following structures is best for hiearchical relationships?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Tree", true),
                        new Option("Graph", false),
                        new Option("Queue", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What does the term 'node' typically refer to in data strutures?",
                    Arrays.asList(
                        new Option("A memory error", false),
                        new Option("A compiler setting", false),
                        new Option("An element in a data structure", true),
                        new Option("A programming language", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which structure is ideal for modelling social network or road maps?",
                    Arrays.asList(
                        new Option("tree", false),
                        new Option("Array", false),
                        new Option("Hash Table", false),
                        new Option("Graph", true)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "In  an array, elements are accesed using: ?",
                    Arrays.asList(
                        new Option("Keys", false),
                        new Option("Links", false),
                        new Option("Index", true),
                        new Option("Nodes", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "which of the following structures uses a 'parent-child' relationship?",
                    Arrays.asList(
                        new Option("Linked List", false),
                        new Option("Queue", false),
                        new Option("Tree", true),
                        new Option("Stack", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What does FIFO Stand for?",
                    Arrays.asList(
                        new Option("First on, First Out", true),
                        new Option("Fast Input, Fast Output", false),
                        new Option("Fixed Input, Fixed Output", false),
                        new Option("Final In, Final Out", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which structure does not depend on order or position to access data?",
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Stack", false),
                        new Option("Hash Table", true),
                        new Option("Queue", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which of these in a non-linear data structure?",
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Stack", false),
                        new Option("Queue", false),
                        new Option("Graph", true)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which of the following allows only one end to insert and remove data?",
                    Arrays.asList(
                        new Option("Tree", false),
                        new Option("Stack", true),
                        new Option("Graph", false),
                        new Option("Hash Table", false)
                        ),
                    "easy"
                ));
                 
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What kind of data structure is used in function call management (call stack)?",
                    Arrays.asList(
                        new Option("Queue", false),
                        new Option("Array", false),
                        new Option("Graph", false),
                        new Option("Stack", true)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which structure is used when order matters and you want to process elements first inserted first?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Queue", true),
                        new Option("tree", false),
                        new Option("Graph", false)
                        ),
                    "easy"
                ));
                    
                    easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which data structure is made up of nodes connected arbitrarily?",
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Linked List", false),
                        new Option("Graph", true),
                        new Option("Stack", false)
                        ),
                    "easy"
                ));
                               
                 mediumQuestion.add(new Question( 
                    "Which of the following best describes a linked list?" ,
                    Arrays.asList(
                        new Option("A fixed-size array of data elements", false),
                        new Option("A collection of nodes connected by links", true),
                        new Option("A hierarchical tree of data", false),
                        new Option("A sequential list with random access", false)
                        ),
                    "medium"
                )); 
                 
                            
                 mediumQuestion.add(new Question( 
                    "What is a key advantage of using a linked list over an array?" ,
                    Arrays.asList(
                        new Option("Faster indexing", false),
                        new Option("Dynamic memory allocation", true),
                        new Option("Less memory usage", false),
                        new Option("Easier to sort", false)
                        ),
                    "medium"
                )); 
                            
                 mediumQuestion.add(new Question( 
                    "In a stack, if the last element inserted is X, what will be the first one to be removed?" ,
                    Arrays.asList(
                        new Option("The oldest element", false),
                        new Option("X", true),
                        new Option("A random element", false),
                        new Option("Depends on sorting", false)
                        ),
                    "medium"
                )); 
                                             
                 mediumQuestion.add(new Question( 
                    "Which of the following data structures uses hashing to access data?" ,
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Stack", false),
                        new Option("Tree", false),
                        new Option("Hash Table", true)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "What is the maing disadvantage of an array?" ,
                    Arrays.asList(
                        new Option("Elements can't be accessed using index", false),
                        new Option("It stores data in hierarchical form", false),
                        new Option("Fixed size", true),
                        new Option("It's slower than all other structures", false)
                        ),
                    "medium"
                ));
                 
                                             
                 mediumQuestion.add(new Question( 
                    "Which operation is typically not efficeint in a singly linke list?" ,
                    Arrays.asList(
                        new Option("Insertion at head", false),
                        new Option("Access by index", true),
                        new Option("Deletion from front", false),
                        new Option("Traversal", false)
                        ),
                    "medium"
                ));
                 
                                             
                 mediumQuestion.add(new Question( 
                    "Which data structure allows insertion at on end and deletion at the other?" ,
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Queue", true),
                        new Option("Array", false),
                        new Option("Tree", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "What kind of data structure is best suited for implementing undo operations in text editors?" ,
                    Arrays.asList(
                        new Option("Queue", false),
                        new Option("Graph", false),
                        new Option("Stack", true),
                        new Option("Hash Table", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "In a tree, what do we call a node with no children?" ,
                    Arrays.asList(
                        new Option("Parent", false),
                        new Option("Leaf", true),
                        new Option("Root", false),
                        new Option("Internal node", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "Which of the following is true for a hash table?" ,
                    Arrays.asList(
                        new Option("It maintains element in sorted order", false),
                        new Option("It uses a stack-based structure", false),
                        new Option("It maps keys to values using hash functions", true),
                        new Option("It is a type of tree", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "Which traversal technique is used in binary trees to visit all nodes in depth-first order?" ,
                    Arrays.asList(
                        new Option("Level-order", false),
                        new Option("Breadth-first", false),
                        new Option("Preorder/Inorder/Postorder", true),
                        new Option("Random traversal", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "Which data structure is most appropriate for breadth-first search(BFS) in a graph?" ,
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Queue", true),
                        new Option("Tree", false),
                        new Option("Linked List", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "What type of data structure is a graph considered to be?" ,
                    Arrays.asList(
                        new Option("Linear", false),
                        new Option("Sequential", false),
                        new Option("Non-linear", true),
                        new Option("Tree-based", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "Which of the following best describes a queue's access mode?" ,
                    Arrays.asList(
                        new Option("LIFO", false),
                        new Option("FIFO", true),
                        new Option("FILO", false),
                        new Option("Random", false)
                        ),
                    "medium"
                ));
                                                
                 mediumQuestion.add(new Question( 
                    "Which of these can represent a network of roads between-cities?" ,
                    Arrays.asList(
                        new Option("Tree", false),
                        new Option("Array", false),
                        new Option("Graph", true),
                        new Option("Stack", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "In an array of size 10, what is the index of the last element?" ,
                    Arrays.asList(
                        new Option("10", false),
                        new Option("1", false),
                        new Option("9", true),
                        new Option("11", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "What is the role of a hash function in a hash table?" ,
                    Arrays.asList(
                        new Option("To sort values", false),
                        new Option("To map a key to an index", true),
                        new Option("To compare values", false),
                        new Option("To generate random numbers", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "What does a node in a linked list typically contain?" ,
                    Arrays.asList(
                        new Option("Only data", false),
                        new Option("Data and a link to the next node", true),
                        new Option("Only the link", false),
                        new Option("Data and an index", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "Which operation is more efficient in a stack than in a array?" ,
                    Arrays.asList(
                        new Option("Push and Pop", true),
                        new Option("sorting", false),
                        new Option("Random access", false),
                        new Option("Indexing", false)
                        ),
                    "medium"
                ));
                                             
                 mediumQuestion.add(new Question( 
                    "In tree terminology, the topmost node is called?" ,
                    Arrays.asList(
                        new Option("Leaf", false),
                        new Option("Root", true),
                        new Option("Parent", false),
                        new Option("Branch", false)
                        ),
                    "medium"
                ));
                 
                                                 
                hardQuestion.add(new Question( 
                    "When designing a navigation system (e.g., Google Maps), which data structure would best represent road networks between cities?",
                    Arrays.asList(
                        new Option("Tree", false),
                        new Option("Stack",false),
                        new Option("Graph", true),
                        new Option("Hash Table", false)
                        ),
                    "hard"
                ));
                
                                                
                hardQuestion.add(new Question( 
                    "Which data structure is most suitable for managing browser history, where the most recent page visited is the first to be removed on BACK button click?",
                    Arrays.asList(
                        new Option("Queue", false),
                        new Option("Stack",true),
                        new Option("Array", false),
                        new Option("Graph", false)
                        ),
                    "hard"
                ));
                
                                                
                hardQuestion.add(new Question( 
                    "In a music streaming app, which data structure is ideal for implementing a RECENTLY PLAYED song list where songs are accessed in the oreder they were played?",
                    Arrays.asList(
                        new Option("Queue", true),
                        new Option("Stack",false),
                        new Option("Tree", false),
                        new Option("Hash Table", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "You are implementing an autocomplete feature (like in  Google Search). Which combination is most effective for storing prefixes of words for fast lookup?",
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Hash Table",false),
                        new Option("Trie(Prefix tree)", true),
                        new Option("Graphh", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "In a scheduling system wher tasks are assigne based on priority (e.g, hospital emergency room), which stucture wiuld be most suitvale?",
                    Arrays.asList(
                        new Option("stack", false),
                        new Option("Priority Queue",true),
                        new Option("Linked List", false),
                        new Option("Tree", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "Which structure allows the most efficiently allocate and manage seat assignments (with fixed positions), which data structure would be best?",
                    Arrays.asList(
                        new Option("Queue", false),
                        new Option("Hash Table",false),
                        new Option("Graph", false),
                        new Option("Stack", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "In an airline booking system, to efficiently allocat and manage seat assignments (with fixed positions), which data structure would be best?",
                    Arrays.asList(
                        new Option("2D Array", false),
                        new Option("Stack",false),
                        new Option("Graph", false),
                        new Option("Linked List", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "Which data structure is most efficient for implementing a LEAST RECENTLY USED (LRU) cache in applications like operating systems or web browsers?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Hash map + doubly Linked List",false),
                        new Option("Queue", true),
                        new Option("Binary tree", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "A filt system hierarchal on a computer (with folders and sibfolders) is best represented by which structure?",
                    Arrays.asList(
                        new Option("Graph", false),
                        new Option("Tree",false),
                        new Option("Array", true),
                        new Option("Queue", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "When designing a chatbot, to ensure the conversation context is preserved in order, which structure is ideal for storing messages chronologically?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Queue",false),
                        new Option("Graph", true),
                        new Option("Tree", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "In online ticket booking, where customers are served in the order of arrival, what is the best data structure?",
                    Arrays.asList(
                        new Option("Queue", false),
                        new Option("Stack",false),
                        new Option("Tree", true),
                        new Option("Heap", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "Which data structure would be most efficient to detect cycles (e,g, deadlocks) in operating system process management?",
                    Arrays.asList(
                        new Option("Tree", false),
                        new Option("Graph",false),
                        new Option("Stack", true),
                        new Option("Queue", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "To track dependencies among software packages before installation which data structure should be used?",
                    Arrays.asList(
                        new Option("Linked List", false),
                        new Option("Stack",false),
                        new Option("Directed Acyclic Graph", true),
                        new Option("Hash Table", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "When implementing a real-time leadeboard (e.g., gaming app). what data structure helps to maintain sorted scores with frequent insertions and deletions?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Array",false),
                        new Option("Balanced Binary Search Tree (like AVL or Red-Black Tree)", true),
                        new Option("Hash Table", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "To efficently reverse the order of words in a sentence (e.g., in a text editor), which structure is most useful?",
                    Arrays.asList(
                        new Option("Queue", false),
                        new Option("Stack",false),
                        new Option("Tree", true),
                        new Option("Graph", false)
                        ),
                    "hard"
                ));
                                             
                hardQuestion.add(new Question( 
                    "In a virtual memory system, to track and replace memory pages, which data structure is often combined with a hash  map for quick access and removal?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Doubly Linked List",false),
                        new Option("Tree", true),
                        new Option("Array", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "What structure should be used to model airline routes where flights can go back and forth between cities (bi-directional)  ?",
                    Arrays.asList(
                        new Option("Tree", false),
                        new Option("Stack",false),
                        new Option("Undirected Graph", true),
                        new Option("Queue", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "Which of the following is best suited for modelling a FRIEND SUGGESTION system on social media based on mutual connections?",
                    Arrays.asList(
                        new Option("Array", false),
                        new Option("Graph",false),
                        new Option("Stack", true),
                        new Option("Tree", false)
                        ),
                    "hard"
                ));
                                                
                hardQuestion.add(new Question( 
                    "If you were to simulate a call center system where the earliest customer is served first and new customer join the end, which data structure applies?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Queue",false),
                        new Option("Graph", true),
                        new Option("Tree", false)
                        ),
                    "hard"
                ));
                
                
            }
            case 4 -> {
                                
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is an array?",
                    Arrays.asList(
                        new Option("A type of loop", false),
                        new Option("A data structure that stores a fixed-size collection of elements", true),
                        new Option("A programming error", false),
                        new Option("A variable that stores strings only", false)
                        ),
                    "easy"
                ));
                      
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which type of elements can an array store?",
                    Arrays.asList(
                        new Option("Mixed types", false),
                        new Option("Only Characters", true),
                        new Option("Elements of the same type", false),
                        new Option("Only integers", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "How are elements in an array accessed?",
                    Arrays.asList(
                        new Option("Random names", false),
                        new Option("Hash keys", true),
                        new Option("Index numbers", false),
                        new Option("By searching manually", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Where is the first element of an array stored?",
                    Arrays.asList(
                        new Option("Last memory address", false),
                        new Option("Lowest memory address", true),
                        new Option("Midddle of memory", false),
                        new Option("Random location", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is the index of the first element in a Java array?",
                    Arrays.asList(
                        new Option("1", false),
                        new Option("-1", true),
                        new Option("0", false),
                        new Option("10", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                   "What is the syntax to declare an array in Java?",
                    Arrays.asList(
                        new Option("array int[10];", false),
                        new Option("Int array[10];", true),
                        new Option("Int[] array = new intp[10];", false),
                        new Option("array = new int;", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which of the following is a valid array declaration in Java?",
                    Arrays.asList(
                        new Option("double balnce = {1,2,3};", false),
                        new Option("double[] balance = new double[10];", true),
                        new Option("new array double[10];", false),
                        new Option("array double = new;", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What does a one-dimensional array represent?",
                    Arrays.asList(
                        new Option("A table", false),
                        new Option("A triangle", true),
                        new Option("A single row or line of elements", false),
                        new Option("a network", false)
                        ),
                    "easy"
                ));      
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which of the following best describes a multi-dimensional array?",
                    Arrays.asList(
                        new Option("An array with only one index", false),
                        new Option("A collection of strings", true),
                        new Option("Arrays inside an array", false),
                        new Option("An array with random values", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which is true about array memory layout?",
                    Arrays.asList(
                        new Option("Each element is in a separate block", false),
                        new Option("All elements are stored in contiguous memory locations", true),
                        new Option("Memory is assigned randomly", false),
                        new Option("Each value is in a separate file", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "How many indices are needed for a two-dimensional array?",
                    Arrays.asList(
                        new Option("1", false),
                        new Option("3", true),
                        new Option("2", false),
                        new Option("4", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which of these is an example of initializing an array with values?",
                    Arrays.asList(
                        new Option("new int[] = {1,2,3};", false),
                        new Option("int[] nums = 1,2,3;", true),
                        new Option("int[] nums = {1,2,3};", false),
                        new Option("int nums = new array[3] ", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is the purpose of using arrays in programming?",
                    Arrays.asList(
                        new Option("To decorate code", false),
                        new Option("To avoid using variables", true),
                        new Option("To store multiple values efficiently", false),
                        new Option("To make errors", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which array has more than one dimesnion?",
                    Arrays.asList(
                        new Option("int[] x = new int[5];", false),
                        new Option("int[][] x = new int [3][3];", true),
                        new Option("int x = {5};", false),
                        new Option("array x;", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What will be the index of the last element in an array of size 10?",
                    Arrays.asList(
                        new Option("10", false),
                        new Option("1", true),
                        new Option("9", false),
                        new Option("-1", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is required to access a specific value in an array?",
                    Arrays.asList(
                        new Option("A keyword", false),
                        new Option("An index", true),
                        new Option("A loop", false),
                        new Option("A pointer", false)
                        ),
                    "easy"
                ));
                      
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "How do you access the second element of an array named numbers?",
                    Arrays.asList(
                        new Option("numbers(2)", false),
                        new Option("numbers{2}", true),
                        new Option("numbers[1]", false),
                        new Option("numbers[2] ", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What does the following do: int[] nums = new int[5];?",
                    Arrays.asList(
                        new Option("Assigns 5 to nums", false),
                        new Option("Creates an array of 5 integers", true),
                        new Option("Adds 5 integers to nums", false),
                        new Option("Creates a loop", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "Which statement is true about arrays in Java?",
                    Arrays.asList(
                        new Option("They can grow automatically", false),
                        new Option("They store values randomly", true),
                        new Option("Their size is fixed once declared", false),
                        new Option("They can only store characters", false)
                        ),
                    "easy"
                ));
                            
                      easyQuestion.add(new Question( //new as of 05-08-2025 / adds question with its 3 parameter
                    "What is one benefit of using arrays?",
                    Arrays.asList(
                        new Option("reduce", false),
                        new Option("Makes storing multiple values easier", true),
                        new Option("Increases code size", false),
                        new Option("Avoid using variables", false)
                        ),
                    "easy"
                ));
                                                                   
                 mediumQuestion.add(new Question( 
                    "Which of the following correctly creates an array of 10 doubles in Java?" ,
                    Arrays.asList(
                        new Option("double balance[10];", false),
                        new Option("double balance = new double();", true),
                        new Option("double[] balance = new double[10];", false),
                        new Option("new double balance[10];", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "What does the expression numbers[3] refer to?" ,
                    Arrays.asList(
                        new Option("The 4th element in the array", false),
                        new Option("The element at index 3", true),
                        new Option("The 3rd value in memory", false),
                        new Option("An error", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "How are arrays stored in memory?" ,
                    Arrays.asList(
                        new Option("In separate memory blocks", false),
                        new Option("In contiguous memory locations", true),
                        new Option("Random memory addresses", false),
                        new Option("Indexed by the OS", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "What is teh output of this code? int[] nums = {2,4,6}; System.out.println(nums[1]);" ,
                    Arrays.asList(
                        new Option("2", false),
                        new Option("4", true),
                        new Option("6", false),
                        new Option("1", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "Which of the following will cause an ArrayIndexOutOfBoundsException?" ,
                    Arrays.asList(
                        new Option("Accessing array[0]", false),
                        new Option("Accessing array[array.length - 1]", true),
                        new Option("Accessong array[array.length]", false),
                        new Option("Initializing an array", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "What happens when an array is declared but not initialized in Java?" ,
                    Arrays.asList(
                        new Option("It stores garbage values", false),
                        new Option("It is null", true),
                        new Option("It throws an error immediately", false),
                        new Option("It stores 0  by default", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "How do you initialize a one dimensional array with specific values?" ,
                    Arrays.asList(
                        new Option("int arr = 1,2,3;", false),
                        new Option("new int[] = {1,2,3};", true),
                        new Option("int[] arr = {1,2,3};", false),
                        new Option("int[] arr(3) = 1,2,3", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "What is the default value of an int in a newly created Java array?" ,
                    Arrays.asList(
                        new Option("1", false),
                        new Option("null", true),
                        new Option("0", false),
                        new Option("undefined", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "Which of the following best describes a two-dimensional array?" ,
                    Arrays.asList(
                        new Option("A single list of elements", false),
                        new Option("A dynamic data structure", true),
                        new Option("An array of arrays", false),
                        new Option("A linked list", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "Which syntax correctly declares a 3x3 matrix in Java?" ,
                    Arrays.asList(
                        new Option("Int matrix(3)(3);", false),
                        new Option("int[][] matrix = new int [3][3];", true),
                        new Option("int matrix =[3][3];", false),
                        new Option("int matrix = int[3][3]", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "What happens when you try to access an index less than 0 in an array?" ,
                    Arrays.asList(
                        new Option("Java ignores it", false),
                        new Option("Java throws an exception", true),
                        new Option("It returns 0", false),
                        new Option("It loops to the last value", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "Which is true about array length in Java?" ,
                    Arrays.asList(
                        new Option("It is dynamic", false),
                        new Option("It is fixed after declaration", true),
                        new Option("It depends on system memory", false),
                        new Option("It can be changed with a method", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "How would you copy all elements from one array to another?" ,
                    Arrays.asList(
                        new Option("Use = operator", false),
                        new Option("Call array.copy()", true),
                        new Option("Use a loop or System.arraycopy()", false),
                        new Option("Arrays are copied automatically", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "Which of these can best represent a table rows and columns in code?" ,
                    Arrays.asList(
                        new Option("1D array", false),
                        new Option("2D array", true),
                        new Option("Hash Table", false),
                        new Option("Stack", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "Which access pattern is used in arrays?" ,
                    Arrays.asList(
                        new Option("LIFO", false),
                        new Option("FIFO", true),
                        new Option("Direct(random)access", false),
                        new Option("Sequential only", false)
                        ),
                    "medium"
                ));
                 
                                                              
                 mediumQuestion.add(new Question( 
                    "If you declare int[][] matrix = new int [2][3]; how many elements are in the array?" ,
                    Arrays.asList(
                        new Option("2", false),
                        new Option("3", true),
                        new Option("6", false),
                        new Option("5", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "What does arr.length give you in Java?" ,
                    Arrays.asList(
                        new Option("Size of a string", false),
                        new Option("Number of elements in the array", true),
                        new Option("The last index", false),
                        new Option("Total memory", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "Which of the following is not a valid array operation?" ,
                    Arrays.asList(
                        new Option("Traversal", false),
                        new Option("Updating an element", true),
                        new Option("Sorting", false),
                        new Option("Adding elements beyond declared size", false)
                        ),
                    "medium"
                ));
                                                              
                 mediumQuestion.add(new Question( 
                    "What does the following code do? int[] scores = new int[5];"  ,
                    Arrays.asList(
                        new Option("Declares 5 variables", false),
                        new Option("Creates an array of 5 integers with default values(0)", true),
                        new Option("Creates a dynamic list", false),
                        new Option("Fills array with user input", false)
                        ),
                    "medium"
                ));
                                                     
                hardQuestion.add(new Question( 
                    "What will be the result of trying to access arr[-1] in Java?",
                    Arrays.asList(
                        new Option("Returns the last element", false),
                        new Option("Returns 0",false),
                        new Option("Throws ArrayIndexOutOfBoundsException", true),
                        new Option("Wraps around to the end", false)
                        ),
                    "hard"
                ));
                                                    
                hardQuestion.add(new Question( 
                    "Given int[] arr = new int[3]; arr[3] = 10; what happens?",
                    Arrays.asList(
                        new Option("Stack", false),
                        new Option("Queue",false),
                        new Option("Graph", true),
                        new Option("Tree", false)
                        ),
                    "hard"
                ));
                                                    
                hardQuestion.add(new Question( 
                    "What does this code print? int[] arr = {10,20,30}; System.out.println(arr.length);",
                    Arrays.asList(
                        new Option("2", false),
                        new Option("4",false),
                        new Option("3", true),
                        new Option("0", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "If you want to represent a chess board in code which data structure would you use?",
                    Arrays.asList(
                        new Option("1D array", false),
                        new Option("2D array",false),
                        new Option("Linked List", true),
                        new Option("Stack", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "What is the main drawback of using arrays for dynamic data management(e.g,. user registration system)?",
                    Arrays.asList(
                        new Option("Arrays can't be sorted", false),
                        new Option("Arrays don't store strings",false),
                        new Option("Arrays have fixed size", true),
                        new Option("Arrays are too slow", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "Which Java utility can be used to copy the contents of one array to another efficiently?",
                    Arrays.asList(
                        new Option("Arrays.fill()", false),
                        new Option("System.arraycopy()",false),
                        new Option("array.clone()", true),
                        new Option("Math.copy()", false)
                        ),
                    "hard"
                ));                                                    
                hardQuestion.add(new Question( 
                    "Which of the following can dynamically resize during execution?",
                    Arrays.asList(
                        new Option("int[] fixedArray = new int[5];", false),
                        new Option("double[] values = {1,0,2,0}",false),
                        new Option("ArrayList<Integer>", true),
                        new Option("char[] name = new char[10]", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "Which concept allows multi-dimesional arrays to be stored in a flat memory structure?",
                    Arrays.asList(
                        new Option("Row-pointer compression", false),
                        new Option("Row-major or column-major order",false),
                        new Option("Linked memory allocation", true),
                        new Option("Vertical memory layouy", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "What is output? int[] nums = {1,2,3}; nums[0] = nums[1]; System.out.println(nums[0])",
                    Arrays.asList(
                        new Option("1", false),
                        new Option("2",false),
                        new Option("3", true),
                        new Option("0", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "What's the result of comparing two arrays using ==in Java?",
                    Arrays.asList(
                        new Option("Compares element values", false),
                        new Option("Compares references (memory addresses)",false),
                        new Option("Returens true if size matches", true),
                        new Option("Compiles but always returns false", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "which of the following is a valid way to iterate through a 2D array?",
                    Arrays.asList(
                        new Option("Single loop", false),
                        new Option("Nested loops",false),
                        new Option("Recursion only", true),
                        new Option("HashMap", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "If you initialize int[][] arr = new int[2][3];, how do you access the last element?" , 
                    Arrays.asList(
                        new Option("arr[3][2]", false),
                        new Option("arr[2][3]",false),
                        new Option("arr[1][2]", true),
                        new Option("arr[2][1]", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "What's the output? int[] a = {1,2,3}; int[] b = a; b[1] = 99; System.out.println(a[1]);",
                    Arrays.asList(
                        new Option("2", false),
                        new Option("99",false),
                        new Option("0", true),
                        new Option("Error", false)
                        ),
                    "hard"
                ));                                                    
                hardQuestion.add(new Question( 
                    "Which method from java.util.Arrays is used to sort an array?",
                    Arrays.asList(
                        new Option("Array.sortArray()", false),
                        new Option("Arrays.sort{}",false),
                        new Option("sort()", true),
                        new Option("Array.sortValues", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "How are multidimensional arrays stored in Java memory?",
                    Arrays.asList(
                        new Option("In one block like in C", false),
                        new Option("As arrays of arrays (jagged arrays)",false),
                        new Option("In a single linked list", true),
                        new Option("As binary trees", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "if arr.length = 5, what is the highest valid index you can access?",
                    Arrays.asList(
                        new Option("5", false),
                        new Option("6",false),
                        new Option("4", true),
                        new Option("-1", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "What best describes the structure of a three-dimensional array?",
                    Arrays.asList(
                        new Option("An array with three types", false),
                        new Option("A flat array",false),
                        new Option("An array of 2D arrays", true),
                        new Option("A matrix", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "How would you describe int[][] scores = new int[3][];?",
                    Arrays.asList(
                        new Option("A fully defined 2D array", false),
                        new Option("A 2D array with only the first dimension define",false),
                        new Option("A syntax error", true),
                        new Option("An unintialized array", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "If you want to prevent changes to an array, what should you do?",
                    Arrays.asList(
                        new Option("Use a final variable", false),
                        new Option("Make a defensive copy of an the array",false),
                        new Option("Use array.lock()", true),
                        new Option("Declare with protected", false)
                        ),
                    "hard"
                ));
                                                                    
                hardQuestion.add(new Question( 
                    "Which real-life system could be modeled using a multi-dimensional array?",
                    Arrays.asList(
                        new Option("Login form", false),
                        new Option("Seating chart in a theater",false),
                        new Option("Stopwatch", true),
                        new Option("Calculator", false)
                        ),
                    "hard"
                ));
            }
            
            default ->  System.out.println(" KUpal walang ganyan");
        }
        
        Collections.shuffle(easyQuestion);
        Collections.shuffle(mediumQuestion);
        Collections.shuffle(hardQuestion);
        
        List<Question> finalSet = new ArrayList<>();
            finalSet.addAll(easyQuestion.subList(0, Math.min(10, easyQuestion.size())));
            finalSet.addAll(mediumQuestion.subList(0, Math.min(10, mediumQuestion.size())));
            finalSet.addAll(hardQuestion.subList(0, Math.min(10, hardQuestion.size())));
            
        Collections.shuffle(finalSet);
        
        return finalSet;
    }
}

