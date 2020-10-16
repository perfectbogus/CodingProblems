# CodingProblems

# Issues
# 1: Default JUnit
When you start a new project from IntelliJ
will use JUnit 4, but right now its available 
JUnite 5.

To use it on the project you need to:
Add on build.gradle dependencies:

    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.3.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.3.1'
    
and reload your gradle configuration on the 
gear settings of the IntelliJ
