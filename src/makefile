
all: Compiler.class

Compiler.class:  Lexer.java
	javac -cp . Lexer.java
	javac -cp . Compiler.java

Lexer.java:
	java -jar JFlex.jar Lexer.flex

clean:
	rm -r *.class
	rm Lexer.java*
