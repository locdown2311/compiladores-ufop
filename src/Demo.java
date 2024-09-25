import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;

import lang.nodes.visitor.EvalVisitor;
import lang.parser.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    public static void main(String[] args) throws IOException {
        // Certifique-se de que o argumento do main seja o caminho do arquivo de entrada
        String inputFile = args.length > 0 ? args[0] : "input.txt";
        
        // Cria um lexer que lê do arquivo de entrada
        LangLexer lexer = new LangLexer(CharStreams.fromFileName(inputFile));
        
        // Cria um fluxo de tokens a partir do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();  // Alimenta todos os tokens

        // Itera sobre todos os tokens e imprime-os
        for (Token token : tokens.getTokens()) {
            String symbolicName = LangLexer.VOCABULARY.getSymbolicName(token.getType());
            String literalName = LangLexer.VOCABULARY.getLiteralName(token.getType());
            String tokenName = symbolicName == null ? literalName : symbolicName;
            System.out.printf("(%d,%d), %s -> %s\n",
            token.getLine(), token.getCharPositionInLine(), tokenName, token.getText());
        }

        // Cria um parser com os tokens
        LangParser parser = new LangParser(tokens);
        
        // Inicia a análise sintática a partir da regra prog
        ParseTree tree = parser.prog();

        // Imprime a árvore sintática
        
        String stringTree = tree.toStringTree(parser);
        // Salva a árvore sintática em um arquivo
        /*
        try (FileWriter writer = new FileWriter("parseTree.txt")) {
            writer.write(stringTree);
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
        System.out.println(stringTree);

        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
    
}