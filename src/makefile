SOURCES = Lexer.java Compiler.java
CLASSES = $(SOURCES:.java=.class)
JFLEX = JFlex.jar

all: $(CLASSES)

%.class: %.java
	javac -cp . $<

Lexer.java: Lexer.flex
	java -jar $(JFLEX) $<

$(CLASSES): $(SOURCES)

clean:
	rm -rf *.class Lexer.java