## refer to book

## What Is a Lambda Expression?
A lambda expression is an unnamed block of code (or an unnamed function) with a list of formal 
parameters and a body. Sometimes a lambda expression is simply called a lambda. The body of a 
lambda expression can be a block statement or an expression. An arrow (->) is used to separate
the list of parameters and the body. The term “lambda” in "lambda expression" has its origin in 
Lambda calculus that uses the Greek letter lambda (l) to denote a function
abstraction. The following are some examples of lambda expressions in Java:
// Takes an int parameter and returns the parameter value incremented by 1
(int x) -> x + 1
// Takes two int parameters and returns their sum
(int x, int y) -> x + y
// Takes two int parameters and returns the maximum of the two
(int x, int y) -> { int max = x > y ? x : y;
return max;
}
// Takes no parameters and returns void
() -> { }

## Tip : Java is a strongly-typed language, which means that the compiler must know the type of 
   all expressions used in a Java program. A lambda expression by itself does not have a type, 
   and therefore, it cannot be used as a standalone expression. The type of a lambda expression 
   is always inferred by the compiler by the context in which it is used.

## Tip : a lambda expression is not a method, although its declaration looks similar to a method. 
   As the name suggests, a lambda expression is an expression that represents an instance of a 
   functional interface.

## Type of lambda ?
   Every expression in Java has a type; so does a lambda expression. The type of a lambda expression
   is a functional interface type. When the abstract method of the functional interface is called, 
   the body of the lambda expression is executed.
   Consider the lambda expression that takes a String parameter and returns its length:
   (String str) -> str.length()
   What is the type of this lambda expression? The answer is that we do not know. By looking at the 
   lambda expression, all you can say is that it takes a String parameter and returns an int, 
   which is the length of the String. Its type can be any functional interface type with an 
   abstract method that takes a String as a parameter and returns an int. The following is an example of such a functional interface:
@FunctionalInterface
interface StringToIntMapper {
int map(String str);
}
   The lambda expression represents an instance of the StringToIntMapper functional interface when
   it appears in the assignment statement, like so:
StringToIntMapper mapper = (String str) -> str.length();
In this statement, the compiler finds that the right-hand side of the assignment operator is a 
   lambda expression. To infer its type, it looks at the left-hand side of the assignment operator
   that expects an instance of the StringToIntMapper interface; it verifies that the lambda 
   expression conforms to the declaration of the map() method in the StringToIntMapper interface; 
   finally, it infers that the type of the lambda expression is the StringToIntMapper interface type.
## Why do we need lambda ?
  Java has supported object-oriented programming since the beginning. In object-oriented 
  programming, the program logic is based on mutable objects. Methods of classes contain the 
  logic. Methods are invoked on objects, which typically modify their states. In object-oriented
  programming, the order of method invocation matters as each method invocation may potentially
  modify the state of the object, thus producing side effects. Static analysis of the program
  logic is difficult as the program state depends on the order in which the code will be executed
  but in lambda, they don't care about the execution order of statement.

Java 8 introduced lambda expressions that represent an instance of a functional interface. You 
were able to do everything prior to Java 8 using anonymous classes what you can do with lambda 
expressions. Functional interfaces are not a new addition in Java 8; they have existed since the
beginning.
So why and where do we need lambda expressions? Anonymous classes use a bulky syntax. Lambda 
expressions use a very concise syntax to achieve the same result. Lambda expressions are not a 
complete replacement for anonymous classes. You will still need to use anonymous classes in a 
few situations. Just to appreciate the conciseness of the lambda expressions, compare the 
following two statements from the previous section that create an instance of the StringToIntMapper 
interface; one uses an anonymous class, taking six lines of code, and another uses a lambda
expression, taking just one line of code:
// Using an anonymous class
StringToIntMapper mapper = new StringToIntMapper() {
@Override
public int map(String str) {
return str.length();
}
};
// Using a lambda expression
StringToIntMapper mapper = (String str) -> str.length();