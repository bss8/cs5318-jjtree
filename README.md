# JJTree - Borislav S. Sabotinov

## To compile with JavaCC
1. Install JavaCC
2. `jjtree eg2.jjt`
3. `javacc eg2.jj`
4. Classes will be generated

## Run the program via IDE

1. Run the main class eg2.java
2. When prompted, enter a valid expression. Example `1 + 23 * 4 + x + 5`
3. Press Enter
4. Press Ctrl + D for end-of-stream character signal "\u0004"
5. Results will display and program will terminate

![Run via JAR](resources/img/run_via_jar.PNG)

## Run the program via provided JAR

1. `java -jar JJTree.jar`
2. When prompted, enter a valid expression. Example `1 + 23 * 4 + x + 5`
3. Press Enter
4. Press Ctrl + Z for end of stream signal 

**NOTE:** Ctrl + D did not work for me when I executed the JAR, only when I executed via IntelliJ IDE terminal. 
To get the JAR working, I had to do Ctrl + Z. 

![Run via IntelliJ IDE](resources/img/run_via_IntelliJ_IDE.PNG)