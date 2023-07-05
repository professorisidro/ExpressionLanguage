# ExpressionLanguage
Para gerar o Lexer e o Parser a partir da gramática (arquivo com extensão .g4)

`java -cp antlr-4.13.0-complete.jar;. org.antlr.v4.Tool GrammarExpression.g4 -o ./src/br/edu/ufabc/compiler/core -package br.edu.ufabc.compiler.core`

usamos o aplicativo org.antlr.v4.Tool


-cp para apontar no CLASSPATH a bibliioteca
-o indica que você irá gravar os arquivos na pasta correspondente]
-package indica que cada classe gerada terá o cabeçalho do package definido
