## Lombok is a popular Java library that helps developers eliminate boilerplate code by automatically generating 
   common methods (getters, setters, constructors, etc.) at compile time via annotations.

1. Key Features of Lombok

✔ Reduces Verbose Code – No need to manually write getters/setters
✔ Compile-Time Generation – No runtime overhead
✔ Seamless IDE Support – Works with IntelliJ, Eclipse, VS Code
✔ Improves Readability – Keeps classes clean and focused

2. How to Install Lombok

a. Maven Dependency

<dependency>
<groupId>org.projectlombok</groupId>
<artifactId>lombok</artifactId>
<version>1.18.30</version> <!-- Check latest version -->
<scope>provided</scope>
</dependency>

3. Most Useful Lombok Annotations

a. @Data (All-in-One)

Generates:
-- Getters for all fields
-- Setters for non-final fields
-- toString()
-- equals() and hashCode()
-- Constructor for all final fields

@Data
public class User {
private final Long id;
private String name;
private int age;
}

b. @Getter / @Setter

@Getter @Setter
public class Product {
private String name;
private double price;
}

c. @NoArgsConstructor, @AllArgsConstructor, @RequiredArgsConstructor

@NoArgsConstructor          // Empty constructor
@AllArgsConstructor         // Constructor with all fields
@RequiredArgsConstructor    // Constructor with final/NonNull fields
public class Student {
private Long id;
private final String name;
@NonNull private Integer age;
}

## @RequiredArgsConstructor is used to create constructor of final member(variable, method)

d. @ToString

@ToString(exclude = "password")  // Exclude sensitive fields
public class Account {
private String username;
private String password;
}

e. @EqualsAndHashCode

@EqualsAndHashCode(of = {"id", "email"})  // Only use these fields
public class Employee {
private Long id;
private String name;
private String email;
}

f. @Builder (Design Pattern)
@Builder
public class Order {
private Long id;
private List<String> items;
}

// Usage:
Order order = Order.builder()
.id(1L)
.items(Arrays.asList("Book", "Pen"))
.build();

g. @Slf4j (Logging)

@Slf4j
public class Service {
public void process() {
log.info("Processing started");  // No need to declare Logger
}
}

h. @SneakyThrows (Checked Exceptions)

@SneakyThrows  // No need for try-catch
public void readFile() {
Files.readAllBytes(Paths.get("file.txt"));
}

5. How Lombok Works

-- Compile-Time Annotation Processing
   Lombok hooks into Java's annotation processor
   Modifies Abstract Syntax Tree (AST) before bytecode generation
-- No Runtime Dependency
   All code is generated during compilation
   Deployed JARs don't need Lombok

6. Advanced Features

a. Customizing Lombok

@Getter(lazy = true)  // Lazy initialization
private final double[] cachedData = expensiveCalculation();

@With  // Immutable "setter"
@AllArgsConstructor
public class Point {
private final int x;
private final int y;
}

Point p1 = new Point(1, 2);
Point p2 = p1.withX(5);  // Returns new instance

b. Lombok Configuration

Create lombok.config:

# Disable @Data's toString() generation
lombok.data.flagUsage = WARNING

7. Comparison with Alternatives

Tool	                Approach	                 Pros	                            Cons
Lombok	        Compile-time generation	    Clean code, no runtime cost     	Magic-like behavior
AutoValue	        Immutable codegen	     Google-supported, explicit	            More verbose
Records (Java 16+)	Language feature	       Standard, simple	                    Less flexible
