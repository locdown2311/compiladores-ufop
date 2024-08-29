all: Compiler.class


Compiler.class:  lang/parser/Lexer.java lang/parser/LangParser.java
	javac -cp .:lang/beaver-rt-0.9.11.jar Compiler.java

lang/parser/LangParser.java:  lang/parser/lang.grammar lang/parser/Lexer.java
	java -jar tools/beaver-cc-0.9.11.jar  -T -t  lang/parser/lang.grammar

lang/parser/Lexer.java:
	java -jar tools/JFlex.jar -nobak lang/parser/Lexer.flex

cleanAll:
	find -name "*.class" -delete
	rm lang/parser/Lexer.java
	rm lang/parser/LangParser.java

clean:
	find -name "*.class" -delete

