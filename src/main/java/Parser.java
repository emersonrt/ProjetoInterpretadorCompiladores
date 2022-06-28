
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Tokens.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\005\000\002\002\004\000\002\002" +
    "\004\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\004\000\002\003\006\000\002\003\010\000" +
    "\002\003\006\000\002\003\005\000\002\003\005\000\002" +
    "\003\005\000\002\003\005\000\002\003\007\000\002\003" +
    "\007\000\002\003\007\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\003\003\000\002\003\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\066\000\026\005\010\007\015\010\017\011\014\016" +
    "\012\024\016\025\005\026\006\033\013\034\004\001\002" +
    "\000\032\004\uffee\006\uffee\012\uffee\013\uffee\014\uffee\015" +
    "\uffee\017\uffee\021\uffee\022\uffee\023\uffee\030\uffee\032\uffee" +
    "\001\002\000\004\027\065\001\002\000\004\027\061\001" +
    "\002\000\022\004\060\013\032\014\034\015\030\021\025" +
    "\022\031\023\033\032\027\001\002\000\026\005\010\007" +
    "\015\010\017\011\014\016\012\024\016\025\005\026\006" +
    "\033\013\034\004\001\002\000\030\002\053\005\010\007" +
    "\015\010\017\011\014\016\012\024\016\025\005\026\006" +
    "\033\013\034\004\001\002\000\032\004\uffef\006\uffef\012" +
    "\uffef\013\uffef\014\uffef\015\uffef\017\uffef\021\uffef\022\uffef" +
    "\023\uffef\030\uffef\032\uffef\001\002\000\032\004\ufff0\006" +
    "\ufff0\012\ufff0\013\ufff0\014\ufff0\015\ufff0\017\ufff0\021\ufff0" +
    "\022\ufff0\023\ufff0\030\ufff0\032\ufff0\001\002\000\026\005" +
    "\010\007\015\010\017\011\014\016\012\024\016\025\005" +
    "\026\006\033\013\034\004\001\002\000\032\004\uffed\006" +
    "\uffed\012\uffed\013\uffed\014\uffed\015\uffed\017\uffed\021\uffed" +
    "\022\uffed\023\uffed\030\uffed\032\uffed\001\002\000\004\027" +
    "\023\001\002\000\004\016\020\001\002\000\034\004\ufffb" +
    "\006\ufffb\012\ufffb\013\ufffb\014\ufffb\015\ufffb\017\ufffb\021" +
    "\ufffb\022\ufffb\023\ufffb\030\ufffb\032\ufffb\033\021\001\002" +
    "\000\004\020\022\001\002\000\032\004\ufffa\006\ufffa\012" +
    "\ufffa\013\ufffa\014\ufffa\015\ufffa\017\ufffa\021\ufffa\022\ufffa" +
    "\023\ufffa\030\ufffa\032\ufffa\001\002\000\026\005\010\007" +
    "\015\010\017\011\014\016\012\024\016\025\005\026\006" +
    "\033\013\034\004\001\002\000\022\013\032\014\034\015" +
    "\030\021\025\022\031\023\033\030\026\032\027\001\002" +
    "\000\026\005\010\007\015\010\017\011\014\016\012\024" +
    "\016\025\005\026\006\033\013\034\004\001\002\000\004" +
    "\031\043\001\002\000\026\005\010\007\015\010\017\011" +
    "\014\016\012\024\016\025\005\026\006\033\013\034\004" +
    "\001\002\000\026\005\010\007\015\010\017\011\014\016" +
    "\012\024\016\025\005\026\006\033\013\034\004\001\002" +
    "\000\026\005\010\007\015\010\017\011\014\016\012\024" +
    "\016\025\005\026\006\033\013\034\004\001\002\000\026" +
    "\005\010\007\015\010\017\011\014\016\012\024\016\025" +
    "\005\026\006\033\013\034\004\001\002\000\026\005\010" +
    "\007\015\010\017\011\014\016\012\024\016\025\005\026" +
    "\006\033\013\034\004\001\002\000\026\005\010\007\015" +
    "\010\017\011\014\016\012\024\016\025\005\026\006\033" +
    "\013\034\004\001\002\000\032\004\ufffd\006\ufffd\012\ufffd" +
    "\013\ufffd\014\ufffd\015\ufffd\017\ufffd\021\ufffd\022\ufffd\023" +
    "\ufffd\030\ufffd\032\ufffd\001\002\000\032\004\ufff4\006\ufff4" +
    "\012\ufff4\013\032\014\034\015\030\017\ufff4\021\ufff4\022" +
    "\ufff4\023\ufff4\030\ufff4\032\ufff4\001\002\000\032\004\ufffe" +
    "\006\ufffe\012\ufffe\013\ufffe\014\ufffe\015\ufffe\017\ufffe\021" +
    "\ufffe\022\ufffe\023\ufffe\030\ufffe\032\ufffe\001\002\000\032" +
    "\004\ufff6\006\ufff6\012\ufff6\013\032\014\034\015\030\017" +
    "\ufff6\021\ufff6\022\ufff6\023\033\030\ufff6\032\027\001\002" +
    "\000\032\004\ufffc\006\ufffc\012\ufffc\013\ufffc\014\ufffc\015" +
    "\ufffc\017\ufffc\021\ufffc\022\ufffc\023\ufffc\030\ufffc\032\ufffc" +
    "\001\002\000\032\004\ufff5\006\ufff5\012\ufff5\013\032\014" +
    "\034\015\030\017\ufff5\021\ufff5\022\ufff5\023\ufff5\030\ufff5" +
    "\032\ufff5\001\002\000\032\004\ufff2\006\ufff2\012\ufff2\013" +
    "\ufff2\014\ufff2\015\ufff2\017\ufff2\021\ufff2\022\ufff2\023\ufff2" +
    "\030\ufff2\032\ufff2\001\002\000\032\004\ufff7\006\ufff7\012" +
    "\ufff7\013\032\014\034\015\030\017\ufff7\021\ufff7\022\ufff7" +
    "\023\033\030\ufff7\032\027\001\002\000\022\013\032\014" +
    "\034\015\030\017\046\021\025\022\031\023\033\032\027" +
    "\001\002\000\026\005\010\007\015\010\017\011\014\016" +
    "\012\024\016\025\005\026\006\033\013\034\004\001\002" +
    "\000\032\004\ufff8\006\ufff8\012\050\013\032\014\034\015" +
    "\030\017\ufff8\021\025\022\031\023\033\030\ufff8\032\027" +
    "\001\002\000\026\005\010\007\015\010\017\011\014\016" +
    "\012\024\016\025\005\026\006\033\013\034\004\001\002" +
    "\000\032\004\ufff9\006\ufff9\012\ufff9\013\ufff9\014\ufff9\015" +
    "\ufff9\017\ufff9\021\ufff9\022\ufff9\023\ufff9\030\ufff9\032\ufff9" +
    "\001\002\000\022\004\054\013\032\014\034\015\030\021" +
    "\025\022\031\023\033\032\027\001\002\000\004\002\000" +
    "\001\002\000\030\002\001\005\001\007\001\010\001\011" +
    "\001\016\001\024\001\025\001\026\001\033\001\034\001" +
    "\001\002\000\022\006\056\013\032\014\034\015\030\021" +
    "\025\022\031\023\033\032\027\001\002\000\004\007\057" +
    "\001\002\000\032\004\uffec\006\uffec\012\uffec\013\uffec\014" +
    "\uffec\015\uffec\017\uffec\021\uffec\022\uffec\023\uffec\030\uffec" +
    "\032\uffec\001\002\000\030\002\uffff\005\uffff\007\uffff\010" +
    "\uffff\011\uffff\016\uffff\024\uffff\025\uffff\026\uffff\033\uffff" +
    "\034\uffff\001\002\000\026\005\010\007\015\010\017\011" +
    "\014\016\012\024\016\025\005\026\006\033\013\034\004" +
    "\001\002\000\022\013\032\014\034\015\030\021\025\022" +
    "\031\023\033\030\063\032\027\001\002\000\004\031\064" +
    "\001\002\000\032\004\ufff3\006\ufff3\012\ufff3\013\ufff3\014" +
    "\ufff3\015\ufff3\017\ufff3\021\ufff3\022\ufff3\023\ufff3\030\ufff3" +
    "\032\ufff3\001\002\000\026\005\010\007\015\010\017\011" +
    "\014\016\012\024\016\025\005\026\006\033\013\034\004" +
    "\001\002\000\022\013\032\014\034\015\030\021\025\022" +
    "\031\023\033\030\067\032\027\001\002\000\004\031\070" +
    "\001\002\000\032\004\ufff1\006\ufff1\012\ufff1\013\ufff1\014" +
    "\ufff1\015\ufff1\017\ufff1\021\ufff1\022\ufff1\023\ufff1\030\ufff1" +
    "\032\ufff1\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\066\000\006\002\010\003\006\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\054\001\001\000\004\003\051\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\044\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\023\001\001\000\002\001\001\000\004\003\043\001" +
    "\001\000\002\001\001\000\004\003\041\001\001\000\004" +
    "\003\040\001\001\000\004\003\037\001\001\000\004\003" +
    "\036\001\001\000\004\003\035\001\001\000\004\003\034" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\003\046\001\001\000\002\001\001\000\004\003\050" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\061\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\065\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
  
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    // conectar esse parser ao scanner!
    Scanner s;
    Parser(Scanner s){ this.s=s; }

    // tabela de símbolos
    java.util.Map<String, Integer> simbolos = new java.util.HashMap<String, Integer>();


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // inicio ::= inicio exp SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println(e);         
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= exp SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println(e);         
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // exp ::= exp MAIOR exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = (int)e1 > (int)e2;          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // exp ::= exp MENOR exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = (int)e1 < (int)e2;          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // exp ::= exp IGUAL exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1.equals(e2);              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // exp ::= ESCREVA STRING 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = s;                          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // exp ::= ESCREVA STRING NUMERO VEZES 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 if (n >= 1) {RESULT = s;} for (int i = 1; i < n; i++) {System.out.println(s);}; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // exp ::= IF exp ENTAO exp ELSE exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e3 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 if ((Boolean) (e1)) RESULT = e2; else RESULT = e3; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exp ::= IF exp ENTAO exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 if ((Boolean) (e1)) RESULT = e2;     
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exp ::= exp MAIS exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = (int)e1 + (int)e2;          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exp ::= exp MENOS exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = (int)e1 - (int)e2;          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exp ::= exp VEZES_MULT exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = (int)e1 * (int)e2;          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exp ::= exp DIVIDIDO exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = (int)e1 / (int)e2;          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exp ::= METADE APAR exp FPAR INTERROGACAO 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 RESULT = (int)e1 / 2;                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp ::= DOBRO APAR exp FPAR INTERROGACAO 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 RESULT = 2 * (int)e1;                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exp ::= TRIPLO APAR exp FPAR INTERROGACAO 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 RESULT = 3 * (int)e1;                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // exp ::= NUMERO 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n;                          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // exp ::= STRING 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = s;                          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // exp ::= BOOL 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = b;                          
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // exp ::= ID 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = simbolos.get(i);            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // exp ::= GUARDE exp EM ID 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 simbolos.put(i.toString(), (int) e); RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}