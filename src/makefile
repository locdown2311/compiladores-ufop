# Variáveis
ST_JAR = tools/ST-4.3.4.jar
ANTLR_JAR=tools/antlr-4.13.2-complete.jar
SRC_DIR=lang/parser
CLEAN_DIR=lang
LEXER=LangLexer.g4
PARSER=LangParser.g4
JAVA_FILES=$(wildcard $(SRC_DIR)/Lang*.java)
DEMO_FILE=Demo.java

# Regras padrão
all: compile

# Remove os arquivos .class antigos
clean:
	find $(CLEAN_DIR) -name "*.class" -type f -delete
# Compila o analisador léxico
$(SRC_DIR)/LangLexer.java: $(SRC_DIR)/$(LEXER)
	java -jar $(ANTLR_JAR) $(SRC_DIR)/$(LEXER)
	@echo 'Compilado analisador léxico'

# Compila o analisador sintático
$(SRC_DIR)/LangParser.java: $(SRC_DIR)/$(PARSER) $(SRC_DIR)/LangLexer.java
	java -jar $(ANTLR_JAR) -visitor -no-listener $(SRC_DIR)/$(PARSER)
	@echo 'Compilado analisador sintático'

# Compila todos os arquivos Java necessários
compile: clean $(SRC_DIR)/LangLexer.java $(SRC_DIR)/LangParser.java $(JAVA_FILES) $(DEMO_FILE)
	javac -cp .:$(ANTLR_JAR):$(ST_JAR) $(SRC_DIR)/Lang*.java $(DEMO_FILE)

.PHONY: all clean compile