
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

