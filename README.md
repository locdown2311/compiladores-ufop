# Relatório de Projeto: Gerador de Código

**Autores:** Igor Carvalho Guimarães, Rafael Henrique Suzuki

## 1. Decisões de Projeto

O grupo optou por escolher a ferramenta ANTLR4 devido à simplicidade no momento de criar o lexer e o parser, além de maior referência disponível online.

Todos os testes executados foram realizados em servidor Linux na arquitetura ARM, juntamente com testes automatizados em arquitetura AMD.

### 1.1 Escolha de Ferramentas

- Ferramenta principal: ANTLR4 (ANother Tool for Language Recognition)

### 1.2 Descrição das Ferramentas Utilizadas

**ANTLR4:** É um poderoso gerador de analisadores sintáticos que pode ser usado para ler, processar, executar ou traduzir texto estruturado ou arquivos binários. É amplamente utilizado para construir linguagens, ferramentas e frameworks.

### 1.3 Estratégia de Implementação do Gerador de código

- Ferramenta: String Template

A implementação do gerador de código foi baseada na ferramenta String Template, que permite a criação de templates para a geração dinâmica de código. A estratégia envolveu as seguintes etapas:

- Definição dos Templates: Criamos templates para as diferentes construções da linguagem alvo, garantindo que cada parte da AST fosse traduzida corretamente em código.
- Integração com ANTLR4: Integramos a geração de código ao processo de análise sintática, de modo que, ao construir a AST, o gerador de código fosse chamado para produzir a saída desejada.
Manutenção da Estrutura: Durante a implementação, focamos em manter uma estrutura clara e modular, permitindo fácil manutenção e extensibilidade no futuro.
- Testes Automatizados: Desenvolvemos uma série de testes automatizados para garantir que a saída gerada correspondia às expectativas e que as modificações nos templates não introduzissem erros.
Documentação: A documentação dos templates e do processo de geração de código foi realizada para facilitar o entendimento e a utilização por outros desenvolvedores.


### 1.4 Estratégia de Interpretação

O grupo utilizou o padrão Visitor, com AST criadas manualmente conforme demonstradas pelo professor.

### 1.5 Representação da Árvore de Sintaxe Abstrata (AST)

![Figura 1: Representação da AST após a execução do arquivo data.lan]([AST.png](https://github.com/locdown2311/compiladores-ufop/blob/914c1e6b224802d3f8e1e8756495f4c97e423ee2/src/output.png))


### 1.6 Exemplo de Código de Execução

Para compilar e executar o analisador, utilizamos os seguintes comandos:

```bash
# Compilação
make
javac -cp .:tools/antlr-4.13.2-complete.jar:tools/ST-4.3.4.jar Demo.java

# Execução
java -cp .:tools/antlr-4.13.2-complete.jar:tools/ST-4.3.4.jar Demo -g arquivotexto

```

## 2. Conclusão

Neste projeto, conseguimos implementar com sucesso um analisador sintático utilizando a ferramenta ANTLR4. A escolha desta ferramenta provou-se acertada devido à sua facilidade de uso na criação do lexer e parser, bem como à abundância de recursos disponíveis online.

Alcançamos os seguintes objetivos:

1. Implementação bem-sucedida do analisador léxico e sintático.
2. Geração da Árvore de Sintaxe Abstrata (AST) para os arquivos de entrada.
3. Geração de código Source to Source

Este projeto tem sido uma excelente oportunidade de aprendizado, permitindo-nos aplicar conceitos teóricos em um cenário prático de desenvolvimento de compiladores.
