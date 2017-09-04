package antlr;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Teste {

	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("teste.txt");
		ANTLRInputStream input = new ANTLRInputStream(stream);
		impLexer lexer = new impLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		impParser parser = new impParser(token);
		parser.pgm();

	/*	ParseTree tree = parser.pgm();
		Processs visit = new Processs();
		visit.visit(tree);  */
	}
}
