package br.edu.ufabc.compiler.main;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.edu.ufabc.compiler.core.GrammarExpressionLexer;
import br.edu.ufabc.compiler.core.GrammarExpressionParser;

public class MainClass {
	public static void main(String[] args) {
		try {
			GrammarExpressionLexer lexer;
			GrammarExpressionParser parser;
			
			// crio o lexer a partir da leitura do arquivo de entrada
			lexer = new GrammarExpressionLexer(CharStreams.fromFileName("input.expr"));
			
			// crio o TokenStream (o fluxo de tokens) a partir do lexer
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// crio o parser a partir do tokenStream
			parser = new GrammarExpressionParser(tokenStream);
			
			System.out.println("Starting file parsing...");
			parser.programa();
			System.out.println("Compilation Success - Good Job!");
			parser.exibirTodosTokens();
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
