/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ErrorModelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("hu/bme/mit/parser/antlr/internal/InternalErrorModel.tokens");
	}
}
