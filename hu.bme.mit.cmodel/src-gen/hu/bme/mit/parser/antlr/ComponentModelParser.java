/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.parser.antlr;

import com.google.inject.Inject;
import hu.bme.mit.parser.antlr.internal.InternalComponentModelParser;
import hu.bme.mit.services.ComponentModelGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ComponentModelParser extends AbstractAntlrParser {

	@Inject
	private ComponentModelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalComponentModelParser createParser(XtextTokenStream stream) {
		return new InternalComponentModelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ComponentModel";
	}

	public ComponentModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
