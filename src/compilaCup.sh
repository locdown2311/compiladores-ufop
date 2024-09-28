rm lang/parser/LangParser*.class;
rm lang/parser/LangLexer*.class;
java -jar tools/JFlex.jar -nobak lang/parser/LexerCup.flex
echo 'Compilado analisador léxico';
java -jar tools/java-cup-11b.jar -parser Parser -symbols Sym lang/parser/lang.cup
mv Parser.java lang/parser;
mv Sym.java lang/parser;
echo 'Compilado analisador sintático';
javac -cp .:lang/parser/java-cup-11b-runtime.jar CompilaCup.java 
