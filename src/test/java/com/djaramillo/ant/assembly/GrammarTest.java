package com.djaramillo.ant.assembly;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.io.IOUtils;
import org.junit.Ignore;
import org.junit.Test;

import com.atcas.grammar.antrl.assembly.UnderlineListener;
import com.atcas.grammar.antrl.assembly.base.AssemblyLexer;
import com.atcas.grammar.antrl.assembly.base.AssemblyParser;







public class GrammarTest {
	
	
	  private String getFile(String fileName){
		  String result = "";

		  ClassLoader classLoader = getClass().getClassLoader();
		  try {
			result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
		  } catch (IOException e) {
			e.printStackTrace();
		  }

		  return result;

	  }
	
	
		
	    @Test
	    public void Example1Grammar()  {

		 	String result = getFile("Example1.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
		
	    @Test
	    public void ExampleForGrammar()  {

		 	String result = getFile("ExampleFor.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void ExampleFunctionsGrammar()  {

		 	String result = getFile("ExampleFunctions.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void ExampleLiteralsGrammar()  {

		 	String result = getFile("ExampleLiterals.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    

	
	    @Test
	    public void ExampleAssignmentsGrammar()  {

		 	String result = getFile("ExampleAssignments.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void ExampleFunctions2Grammar()  {

		 	String result = getFile("ExampleFunctions2.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	

	    
	    @Test
	    public void ExampleLabelGrammar()  {

		 	String result = getFile("ExampleLabel.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void ExampleLabel2Grammar()  {

		 	String result = getFile("ExampleLabel2.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	
	    
	    @Test
	    public void ExampleLabel3Grammar()  {

		 	String result = getFile("ExampleLabel3.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void ExampleLocalGrammar()  {

		 	String result = getFile("ExampleLocal.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    

	
	    
	    @Test
	    public void ExampleLoopsGrammar()  {

		 	String result = getFile("ExampleLoops.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }
	    
	    
	    @Test
	    public void ExampleSwitchGrammar()  {

		 	String result = getFile("ExampleSwitch.sol");
		 	
		 	
			ANTLRInputStream input = new ANTLRInputStream(result);
			// create a lexer that feeds off of input CharStream
			AssemblyLexer lexer = new AssemblyLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			AssemblyParser parser = new AssemblyParser(tokens);
			//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
			UnderlineListener underlineListener = new UnderlineListener();
			parser.removeErrorListeners(); // remove ConsoleErrorListener
			parser.addErrorListener(underlineListener); // add ours
			
			ParseTree tree = parser.assemblyBlockProgram(); // begin parsing at init rule
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			
			assertEquals(false, underlineListener.hasError());
			
	    }

	
	    
}
