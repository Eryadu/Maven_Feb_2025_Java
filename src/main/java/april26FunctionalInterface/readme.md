queue??
functional interface
lambdas
optional
stream
method ref
date time
volatile ?
atomic memory ?
AtomicInteger?
AtomicReference ?


@FunctionInterface : annotation just for validation not interface
Don't allow to implement more than 2 classes due to multiple inheritence
default method and instance/instant method ?
default and static method?

Diamond problem ?

lambda to use functional programming in java , we can pass function instead of object

Why java 1.8 and why java 8 ?
why lambda important ?
why functional programming ?

Lambda limitation?
Lambda variation
Predicate ?
Function ?
Consumer?
Comparator ?
Supplier ?
Bi Function?
Bi Consumer ?


// For functional Programming
https://www.scaler.com/topics/java/functional-programming-in-java/ 

## default is new keyword in Java 8 . Default method are neither Static method nor instance 
method. To use default method, we override the method
-- In functional interface, variables are by-default public, static, final

we use functional programming because in this we can pass logic / method directly instead of
objects. Advantage of passing logic/method directly is that, we don't need to create different 
classes to implement different methods/ideas. With method passing, we can change it in single
line. refer validator example

## what is difference between default and instant variable ?

## Instance Variable:
-- A variable that belongs to an object (instance) of a class.
-- Each object gets its own copy of the instance variables.
Example:
class Car {
String color;  // instance variable
}

Car car1 = new Car();
car1.color = "Red";

Car car2 = new Car();
car2.color = "Blue";
Here, car1 and car2 have different color values.

## Default Value:
This is what Java automatically assigns to a variable if you don't explicitly set a value.
For instance variables:
int ➔ 0
float ➔ 0.0f
boolean ➔ false
object references ➔ null
Example:

class Bike {
int speed;  // instance variable
}

Bike b = new Bike();
System.out.println(b.speed);  // prints 0, the default value for int
🔵 In short:

"Instance variable" talks about where the variable belongs (inside an object).
"Default value" talks about what value it gets if you don't manually set one.


## default and static variable

Default Value (not a variable type!)
"Default" just means:
➔ If you don't manually assign a value, Java automatically gives it a default value based on the type.
Example:

class Test {
int num;    // no value assigned
}

Test t = new Test();
System.out.println(t.num);  // prints 0
Here, num gets 0 because int's default value is 0.

Default values:

Data Type	Default Value
int	0
float	0.0f
boolean	false
object ref.	null
⚡ Note: Local variables (inside methods) do not get default values — you must initialize them.

## Static Variable
-- A static variable is shared among all objects of a class.
-- Belongs to the class itself, not to instances.
-- Only one copy exists in memory.
Example:

class Student {
static String schoolName = "ABC School"; // static variable
String studentName;                       // instance variable
}

Student s1 = new Student();
Student s2 = new Student();

System.out.println(s1.schoolName);  // ABC School
System.out.println(s2.schoolName);  // ABC School

Student.schoolName = "XYZ School";   // changed at class level

System.out.println(s1.schoolName);  // XYZ School
System.out.println(s2.schoolName);  // XYZ School
Here, changing the static variable changes it for all objects.

## Anonymous Class
  An anonymous class is an inner class without a name, which means that we can declare and 
  instantiate a class at the same time. An anonymous class is used primarily when we want to 
  use the class declaration once. Anonymous classes usually extend a subclass or implement an
  interface.

Example:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>(
Arrays.asList(1, 3, 4, 5, 2)
);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        list.sort(comparator);

        System.out.println(Arrays.toString(list.toArray())); 
    }
}

Output

[1, 2, 3, 4, 5]

Explanation:

In this example, we created an anonymous inner class i.e. new Comparator<Integer>() {} 
that implements the Comparator interface and overrides the compare() method.

## Introduction to Programming Paradigm
Programming Paradigm is a way or style of programming. The programming paradigm can be 
classified into two types:

1. Imperative programming paradigm
2. Declarative programming paradigm

1. Imperative Programming Paradigm
   Imperative programming paradigm consists of a sequence of statements that changes the 
   program's state until the target result is achieved. The main focus is on how to achieve 
   the goal. It consists of three main programming approaches:
-- Procedural programming
-- Object-Oriented programming
-- Parallel Processing Approach
2. Declarative Programming Paradigm
   Declarative programming is a paradigm in which we define what needs to be accomplished without
   defining how it has to be implemented. In the declarative programming paradigm, for the same 
   input arguments, the program produces the same result. The order of execution of statements 
   is not important in the declarative programming paradigm. It consists of three main programming
   approaches:
-- Logic programming paradigm
-- Functional programming
-- Database processing approach