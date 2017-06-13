package com.atcas.grammar;

import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;
import org.apache.commons.io.IOUtils;

import com.atcas.grammar.antrl.assembly.UnderlineListener;
import com.atcas.grammar.antrl.assembly.base.AssemblyLexer;
import com.atcas.grammar.antrl.assembly.base.AssemblyParser;




public class Example {
	
	  public static  String getFile(String fileName){
		  String result = "";

		  ClassLoader classLoader = Example.class.getClassLoader();
		  try {
			result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
		  } catch (IOException e) {
			e.printStackTrace();
		  }

		  return result;

	  }
	  

		public static void main(String[] args) throws Exception {
			// create a CharStream that reads from standard input
			ANTLRInputStream input = new ANTLRInputStream(Example.getFile("example.sol"));
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
			//
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
		
			
		     //show AST in GUI
	        JFrame frame = new JFrame("Antlr AST");
	        JPanel panel = new JPanel();
	        TreeViewer viewr = new TreeViewer(Arrays.asList(
	                parser.getRuleNames()),tree);
	        viewr.setScale(0.8);//scale a little
	        panel.add(viewr);
	        
	        JScrollPane scrollPane = new JScrollPane(panel);
	        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        
	        frame.add(scrollPane);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(700,700);
	        frame.setVisible(true);
	        
			
			
			}
		
		
		

}
