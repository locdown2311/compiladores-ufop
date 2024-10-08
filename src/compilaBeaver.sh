rm lang/parser/LangParser*.class;
rm lang/parser/LangLexer*.class;
java -jar tools/JFlex.jar -nobak lang/parser/Lexer.flex
echo 'Compilado analisador léxico';
java -jar tools/beaver-cc-0.9.11.jar  -T -t  lang/parser/lang.grammar
echo 'Compilado analisador sintático';
javac -cp .:lang/parser/beaver-rt-0.9.11.jar CompilaBeaver.java
