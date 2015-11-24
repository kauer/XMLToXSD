import java.io.*;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			InputStream is;
			ANTLRInputStream input = null;
			try {
				is = new FileInputStream(".\\exemplos\\lessbooks.xml");
				input = new ANTLRInputStream(is);
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	        XMLLexer lexer = new XMLLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        XMLParser parser = new XMLParser(tokens);
	        ParseTree tree = parser.document(); // parse
	        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
	        XMLParserBaseListener extractor = new XMLParserBaseListener();
	        walker.walk(extractor, tree); // initiate walk of tree with listener 

	}

}
