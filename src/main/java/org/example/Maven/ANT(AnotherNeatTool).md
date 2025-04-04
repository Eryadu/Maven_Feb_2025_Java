## Apache ANT (Another Neat Tool) is a Java-based build tool that was widely used before Maven and Gradle became 
   popular. Unlike Maven (which uses conventions) or Gradle (which uses a DSL), ANT uses XML-based configuration 
   and provides fine-grained control over the build process.

1. Key Features of ANT

✔ Flexible – No predefined project structure
✔ Extensible – Supports custom tasks via Java
✔ Platform-independent – Runs anywhere Java runs
✔ No dependency management (unlike Maven/Gradle)


2. Basic Project Structure
   Unlike Maven/Gradle, ANT does not enforce a standard structure. A typical project might look like:
my-project/
├── build.xml      # ANT build file
├── src/           # Source code
├── lib/           # External JARs
└── build/         # Compiled output (created by ANT)

4. build.xml (ANT Configuration File)
ANT uses an XML file (build.xml) to define build tasks.

Command	                    Description
ant	Runs                  the default target (compile in the example above)
ant clean	              Runs the clean target
ant compile	              Compiles Java source files
ant jar	                  Creates a JAR file
ant -f custom-build.xml	  Uses a different build file


5. ## ANT vs Maven vs Gradle

Feature	           ANT	            Maven	         Gradle
Configuration	   XML	             XML	       Groovy/Kotlin DSL
Dependency Mgmt   Manual	      Automatic	         Automatic
Conventions	      None	            Strong	          Flexible
Learning Curve	  Medium        	 Low	        Medium-High
Performance	      Fast	            Slow	        Very Fast (incremental builds)

6. When to Use ANT Today?

✔ Maintaining old Java projects
✔ Non-Java builds (C/C++, legacy systems)
✔ Custom build processes (where Maven/Gradle are too restrictive)

