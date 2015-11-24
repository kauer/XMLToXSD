// Generated from .\XMLParser.g4 by ANTLR 4.5.1

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link XMLParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class XMLParserBaseListener implements XMLParserListener {
	/*	private XMLParser parser;
	public XMLParserBaseListener(XMLParser parser){
		//this.parser = parser;
	}*/
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDocument(XMLParser.DocumentContext ctx) {
		//System.out.println("enterDocument" + ctx.getTokens(2).toString());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDocument(XMLParser.DocumentContext ctx) {
		//System.out.println("exitDocument" + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProlog(XMLParser.PrologContext ctx) {
		//shows version of xml
		//System.out.println("Prolog: " + ctx.start.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProlog(XMLParser.PrologContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterContent(XMLParser.ContentContext ctx) {
		if(!ctx.start.getText().trim().equals("")){
			String typeOfContent = TypeOfContent.getTypeOfString(ctx.start.getText());
			System.out.println("type=\"xs" +
								typeOfContent + 
								"\"");
		}else{ 
				System.out.println("<xs:complexType>");
				System.out.println("<xs:sequence>");
		}
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitContent(XMLParser.ContentContext ctx) {
		if(ctx.start.getText().trim().equals("")){
				System.out.println("</xs:complexType>");
				System.out.println("</xs:sequence>");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElement(XMLParser.ElementContext ctx) { 
		if(!ctx.content().isEmpty()){
			System.out.println("<xs:element name=\"" + 
					   ctx.Name(0).getText() +
					   "\">");		
		}


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElement(XMLParser.ElementContext ctx) {
		//System.out.println("Saiu da tag: " + ctx.Name(0).getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReference(XMLParser.ReferenceContext ctx) { 
		System.out.println("</xs:element>");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReference(XMLParser.ReferenceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttribute(XMLParser.AttributeContext ctx) {
		System.out.println("<xs:element name=\"" + 
				   ctx.Name().getText() +
				   "\">");
		String value =  ctx.STRING().getText().replaceAll("\"", "");
		String typeOfContent = TypeOfContent.getTypeOfString( value);
		System.out.println("type=\"" +
				typeOfContent +
				"\"");
		/*System.out.println("type=\"" +
							typeOfContent + 
							" " +
							value +
							"\"");*/
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttribute(XMLParser.AttributeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterChardata(XMLParser.ChardataContext ctx) {
		//get value inside the tag
		// seems to be the same as content
		//System.out.println("tag " + ctx.start.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitChardata(XMLParser.ChardataContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMisc(XMLParser.MiscContext ctx) {}
		//useless	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMisc(XMLParser.MiscContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}