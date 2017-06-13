grammar Assembly;

assemblyBlockProgram :'assembly' assemblyBlock+ EOF;
assemblyBlock :  '{' assemblyItem* '}';
assemblyItem :
    Identifier |
    assemblyBlock |
 //   assemblyCase assemblyBlock |
  //  assemblySwitch |
    functionalAssemblyExpression |
    assemblyLocalDefinition |
    functionalAssemblyAssignment |
    assemblyAssignment |
    labelDefinition |
    assemblySwitch |
    assemblyFunctionDefinition |
    assemblyFor |
    'break' | 'continue' |
    subAssembly | 'dataSize' '(' Identifier ')' |
    linkerSymbol |
    'errorLabel' | 'bytecodeSize' |
    numberLiteral | StringLiteral
    | HexLiteral
    ;


dataValue : numberLiteral | StringLiteral
    | HexLiteral|Identifier    ;
Identifier : [a-zA-Z_$] [a-zA-Z_0-9]*;
functionalAssemblyExpression : Identifier '(' ( assemblyItem ( ',' assemblyItem )* )? ')';
assemblyLocalDefinition : 'let' identifierOrList ':=' functionalAssemblyExpression
|'let' identifierOrList ':='dataValue;





functionalAssemblyAssignment : identifierOrList ':=' functionalAssemblyExpression
								| identifierOrList ':='dataValue;
identifierOrList : Identifier | '(' identifierList ')';
identifierList : Identifier ( ',' Identifier)*;
assemblyAssignment : '=:' Identifier;
labelDefinition : Identifier ':';

assemblySwitch : 'switch' functionalAssemblyExpression assemblyCase*
    ( 'default' ':' assemblyBlock )?
    |'switch' Identifier assemblyCase*
    ( 'default' ':' assemblyBlock )?;
assemblyCase : 'case' functionalAssemblyExpression ':' assemblyBlock
 |'case' dataValue ':' assemblyBlock
 | dataValue ':' assemblyBlock;

assemblyFunctionDefinition : 'function' Identifier '(' identifierList? ')'
    ( '->' '(' identifierList ')' )? assemblyBlock
    |'function' Identifier '(' identifierList? ')'
    ( '->'  identifierList  )? assemblyBlock;
assemblyFor : 'for' ( assemblyBlock | functionalAssemblyExpression)
    functionalAssemblyExpression ( assemblyBlock | functionalAssemblyExpression) assemblyBlock;
subAssembly : 'assembly' Identifier assemblyBlock;
linkerSymbol : 'linkerSymbol' '(' StringLiteral ')';
numberLiteral : HexNumber | DecimalNumber;
HexLiteral : 'hex' ('"' ([0-9a-fA-F] [0-9a-fA-F] )* '"' | '\'' ([0-9a-fA-F][0-9a-fA-F])* '\'');
StringLiteral : '"' ([^"\r\n\\] | '\\' .)* '"';
HexNumber : '0x' [0-9a-fA-F]+;
DecimalNumber : [0-9]+;



WhiteSpaces
 : [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN)
 ;

/// 7.4 Comments
MultiLineComment
 : '/*' .*? '*/' -> channel(HIDDEN)
 ;
/*
SingleLineComment
 : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN)
 ;
*
 [\r\n]
*/

SingleLineComment
 : '//' ~[\r\n]* -> channel(HIDDEN)
 ;




NEWLINE
  : '\r'? '\n' -> channel(HIDDEN)
  ;

WS
  : [ \t\f]+ -> channel(HIDDEN)
  ;
