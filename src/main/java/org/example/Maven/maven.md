## Maven It helps to automatically write code with the help of annotations come from different libraries like LOMBOK,
   auto value.. 
## Maven is a powerful build automation and dependency management tool primarily used for Java projects. It simplifies
   the build process by providing a standardized way to compile, test, package, and deploy applications.

1. Key Features of Maven

-- Dependency Management (Auto-downloads libraries)
✔ Standardized Project Structure
✔ Build Lifecycle Management (compile, test, package, install, deploy)
✔ Plugin Ecosystem (Customizable build process)
✔ POM (Project Object Model) - XML-based configuration


3. Maven Project Structure : A standard Maven project follows this directory layout:

my-project/
├── src/
│   ├── main/
│   │   ├── java/       # Java source code
│   │   └── resources/  # Config files (e.g., application.properties)
│   └── test/
│       ├── java/       # Test code
│       └── resources/  # Test configs
├── target/            # Compiled output
└── pom.xml            # Project configuration

4. The pom.xml File : This is the heart of a Maven project. It defines:
-- Dependencies
-- Plugins
-- Build settings
-- Project metadata
Example pom.xml
/* <project>
<modelVersion>4.0.0</modelVersion>
<groupId>com.mycompany</groupId>
<artifactId>my-app</artifactId>
<version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>11</source>
                    <target>11</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project> */

5. Maven Lifecycle & Common Commands: Maven follows a build lifecycle with phases:

## Command	Description
-- mvn clean	Deletes the target/ directory
-- mvn compile	Compiles source code
-- mvn test	Runs unit tests
-- mvn package	Creates JAR/WAR file
-- mvn install	Installs artifact to local .m2 repository
-- mvn deploy	Deploys to remote repository (e.g., Nexus)
Run All Phases
mvn clean install

6. Dependency Management: Maven downloads dependencies from Maven Central (or other repositories).

Adding a Dependency
<dependencies>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-core</artifactId>
<version>5.3.8</version>
</dependency>
</dependencies>


Scope	Description
compile	Default (available in all phases)
test	Only for testing
provided	Expected to be provided by JDK/container
runtime	Needed at runtime but not compile-time

7. Maven Plugins: Plugins extend Maven's functionality:

Example: Build a Fat JAR (with dependencies)

<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-assembly-plugin</artifactId>
<version>3.3.0</version>
<configuration>
<descriptorRefs>
<descriptorRef>jar-with-dependencies</descriptorRef>
</descriptorRefs>
</configuration>
<executions>
<execution>
<phase>package</phase>
<goals>
<goal>single</goal>
</goals>
</execution>
</executions>
</plugin>
</plugins>
</build>

Run:
mvn clean package

8. Maven vs. Gradle

Feature	                      Maven	                          Gradle
Configuration	          XML (pom.xml)	                  Groovy/Kotlin DSL
Performance	          Slower (due to XML parsing)	  Faster (incremental builds)
Flexibility	              Strict conventions	        Highly customizable
Learning Curve	          Easier for beginners	         Steeper due to DSL

9. Common Issues & Fixes

❌ Dependency not found → Check repository settings
❌ Build fails → Run mvn clean install
❌ Slow downloads → Use a mirror in settings.xml


Conclusion

Maven is essential for:
✅ Managing dependencies
✅ Standardizing builds
✅ Integrating with CI/CD pipelines

## Gradle vs Maven

Feature	                            Gradle	               Maven
Configuration	             Groovy/Kotlin DSL	            XML
Performance	               Faster (incremental builds)	    Slower
Flexibility	                  Highly customizable	     Rigid structure
Learning Curve	                    Steeper	                Easier
Dependency Management	         More flexible	         Standardized
Plugin System	                 More powerful	      Mature but limited
