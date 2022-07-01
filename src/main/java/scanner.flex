import java_cup.runtime.Symbol;

/*
Directivas:
public: classe publica
cup: compatibilidade com cup
full: estende o alfabeto com todos os valores de 8 bits
linha: adicionar a variável int yyline, para indicar a linha do lexema
char: adicionar a variável int yychar, para indicar o índice do primeiro caractere do lexema
ignorecase: validar, independentemente de a letra ser maiúscula ou minúscula
eofval: especifica um valor de retorno no final do arquivo
*/

%%

%class Scanner
%cup
%line
%char
%ignorecase
%eofval{
	return new Symbol(Tokens.EOF,new String("Fim do arquivo"));
%eofval}

digito = [0-9]
letra = [a-zA-Z]
id = {letra}({letra}|{digito}|"_")*
bool = true | false
espaco = \t|\f|" "|\r|\n
string = \"(\\.|[^\"])*\"

%%

";"			            {return new Symbol(Tokens.SEMI, yytext());}
"guarde"	            {return new Symbol(Tokens.GUARDE, yytext());}
"em"	                {return new Symbol(Tokens.EM, yytext());}
"se"		            {return new Symbol(Tokens.IF, yytext());}
"entao" 	            {return new Symbol(Tokens.ENTAO, yytext());}
"senao" 	            {return new Symbol(Tokens.ELSE, yytext());}
"escreva"       	    {return new Symbol(Tokens.ESCREVA, yytext());}
"eh maior que"          {return new Symbol(Tokens.MAIOR, yytext());}
"eh menor que"          {return new Symbol(Tokens.MENOR, yytext());}
"eh igual a"    	    {return new Symbol(Tokens.IGUAL, yytext());}
"vez(es)"               {return new Symbol(Tokens.VEZES, yytext());}
"vezes"                 {return new Symbol(Tokens.VEZES_MULT, yytext());}
"mais"                  {return new Symbol(Tokens.MAIS, yytext());}
"menos"                 {return new Symbol(Tokens.MENOS, yytext());}
"dividido por"          {return new Symbol(Tokens.DIVIDIDO, yytext());}
"qual eh o dobro de"    {return new Symbol(Tokens.DOBRO, yytext());}
"qual eh o triplo de"   {return new Symbol(Tokens.TRIPLO, yytext());}
"qual eh a metade de"   {return new Symbol(Tokens.METADE, yytext());}
"("                     {return new Symbol(Tokens.APAR, yytext());}
")"                     {return new Symbol(Tokens.FPAR, yytext());}
"?"                     {return new Symbol(Tokens.INTERROGACAO, yytext());}
{id}	        	    {return new Symbol(Tokens.ID, yytext());}
{string}        	    {return new Symbol(Tokens.STRING, yytext());}
{bool}		            {return new Symbol(Tokens.BOOL, new Boolean(Boolean.parseBoolean(yytext())));}
{digito}+	            {return new Symbol(Tokens.NUMERO, new Integer(yytext()));}
{espaco}	            {}
.                       {System.out.println("Caracter ilegal: " + yytext());}