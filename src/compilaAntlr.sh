rm lang/parser/LangParser*.class;
rm lang/parser/LangLexer*.class;
java -jar tools/antlr-4.13.2-complete.jar lang/parser/LangLexer.g4;
echo 'Compilado analisador léxico';
java -jar tools/antlr-4.13.2-complete.jar -visitor -no-listener lang/parser/LangParser.g4;
echo 'Compilado analisador sintático';
javac -cp .:tools/antlr-4.13.2-complete.jar lang/parser/Lang*.java;

javac -cp .:tools/antlr-4.13.2-complete.jar Demo.java;