/* The following code was generated by JFlex 1.4.3 on 8/7/24, 1:19 PM */

import java.lang.String;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/7/24, 1:19 PM from the specification file
 * <tt>Lexer.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\22\1\26\1\20"+
    "\2\0\1\23\1\24\1\15\1\51\1\50\1\23\1\23\1\54\1\5"+
    "\1\14\1\23\1\12\11\13\1\55\1\53\1\26\1\27\1\26\2\0"+
    "\32\11\1\52\1\16\1\21\1\0\1\10\1\0\1\44\1\17\1\45"+
    "\1\47\1\32\1\31\1\7\1\36\1\30\2\7\1\33\1\7\1\42"+
    "\1\43\2\7\1\37\1\34\1\40\1\41\1\46\1\35\3\7\1\4"+
    "\1\25\1\6\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\2\10\1\11\1\1\1\6\1\1\1\12\1\4\2\1"+
    "\1\4\11\6\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\0\1\2\2\0\1\21\2\0\1\6\1\0\1\22"+
    "\1\23\12\6\1\24\1\0\1\25\1\6\1\26\11\6"+
    "\1\0\3\6\1\27\2\6\1\30\1\31\1\32\1\33"+
    "\1\6\1\34\1\35\1\36\2\6\1\37\1\40";

  private static int [] zzUnpackAction() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\56\0\212\0\270\0\56\0\346"+
    "\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\56"+
    "\0\56\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a"+
    "\0\u0398\0\u03c6\0\u03f4\0\u0422\0\u0450\0\56\0\56\0\56"+
    "\0\56\0\56\0\u047e\0\u04ac\0\u04da\0\u0142\0\u019e\0\u019e"+
    "\0\u0508\0\u0536\0\u0564\0\u0228\0\u0228\0\346\0\u0592\0\u05c0"+
    "\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702\0\u0730"+
    "\0\56\0\u075e\0\56\0\u078c\0\346\0\u07ba\0\u07e8\0\u0816"+
    "\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\u0958\0\u0986"+
    "\0\u09b4\0\u09e2\0\346\0\u0a10\0\u0a3e\0\346\0\346\0\346"+
    "\0\346\0\u0a6c\0\346\0\346\0\346\0\u0a9a\0\u0ac8\0\346"+
    "\0\346";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\1\13\1\14\1\15\1\2\1\16\1\17"+
    "\1\20\1\4\1\21\1\22\1\23\2\24\1\25\1\26"+
    "\1\27\2\10\1\30\1\10\1\31\1\32\1\10\1\33"+
    "\2\10\1\34\1\35\1\10\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\60\0\1\4\60\0\1\44\55\0\1\45"+
    "\57\0\5\10\3\0\1\10\10\0\20\10\15\0\5\11"+
    "\3\0\1\11\10\0\20\11\20\0\2\46\1\47\53\0"+
    "\2\13\1\47\53\0\2\50\42\0\1\51\2\0\12\51"+
    "\1\0\1\52\37\51\7\0\5\10\3\0\1\10\10\0"+
    "\13\10\1\53\4\10\6\0\1\54\2\0\13\54\2\0"+
    "\1\55\2\0\2\54\1\0\11\54\2\0\1\54\1\0"+
    "\7\54\1\0\3\54\24\0\1\21\56\0\1\21\57\0"+
    "\1\21\35\0\5\10\3\0\1\10\10\0\1\10\1\56"+
    "\10\10\1\57\5\10\15\0\5\10\3\0\1\10\10\0"+
    "\3\10\1\60\10\10\1\61\3\10\15\0\5\10\3\0"+
    "\1\10\10\0\3\10\1\62\14\10\15\0\5\10\3\0"+
    "\1\10\10\0\6\10\1\63\11\10\15\0\5\10\3\0"+
    "\1\10\10\0\2\10\1\64\15\10\15\0\5\10\3\0"+
    "\1\10\10\0\7\10\1\65\10\10\15\0\5\10\3\0"+
    "\1\10\10\0\11\10\1\66\6\10\15\0\5\10\3\0"+
    "\1\10\10\0\6\10\1\67\11\10\15\0\5\10\3\0"+
    "\1\10\10\0\13\10\1\70\4\10\63\0\1\71\5\72"+
    "\1\0\50\72\1\45\1\3\1\4\53\45\15\0\1\73"+
    "\55\0\3\51\17\0\2\51\1\0\1\51\22\0\5\10"+
    "\3\0\1\10\10\0\13\10\1\74\4\10\15\0\5\10"+
    "\3\0\1\10\10\0\10\10\1\75\7\10\15\0\5\10"+
    "\3\0\1\10\10\0\13\10\1\76\4\10\15\0\5\10"+
    "\3\0\1\10\10\0\3\10\1\77\14\10\15\0\5\10"+
    "\3\0\1\10\10\0\4\10\1\100\13\10\15\0\5\10"+
    "\3\0\1\10\10\0\1\101\17\10\15\0\5\10\3\0"+
    "\1\10\10\0\10\10\1\102\7\10\15\0\5\10\3\0"+
    "\1\10\10\0\11\10\1\103\6\10\15\0\5\10\3\0"+
    "\1\10\10\0\3\10\1\104\14\10\15\0\5\10\3\0"+
    "\1\10\10\0\14\10\1\105\3\10\15\0\5\10\3\0"+
    "\1\10\10\0\1\106\17\10\6\0\5\72\1\107\50\72"+
    "\7\0\5\10\3\0\1\10\10\0\3\10\1\110\14\10"+
    "\15\0\5\10\3\0\1\10\10\0\14\10\1\111\3\10"+
    "\15\0\5\10\3\0\1\10\10\0\4\10\1\112\13\10"+
    "\15\0\5\10\3\0\1\10\10\0\2\10\1\113\15\10"+
    "\15\0\5\10\3\0\1\10\10\0\3\10\1\114\14\10"+
    "\15\0\5\10\3\0\1\10\10\0\11\10\1\115\6\10"+
    "\15\0\5\10\3\0\1\10\10\0\2\10\1\116\15\10"+
    "\15\0\5\10\3\0\1\10\10\0\3\10\1\117\14\10"+
    "\15\0\5\10\3\0\1\10\10\0\7\10\1\120\10\10"+
    "\15\0\5\10\3\0\1\10\10\0\17\10\1\121\6\0"+
    "\5\72\1\107\1\4\47\72\7\0\5\10\3\0\1\10"+
    "\10\0\2\10\1\122\15\10\15\0\5\10\3\0\1\10"+
    "\10\0\10\10\1\123\7\10\15\0\5\10\3\0\1\10"+
    "\10\0\2\10\1\124\15\10\15\0\5\10\3\0\1\10"+
    "\10\0\2\10\1\125\15\10\15\0\5\10\3\0\1\10"+
    "\10\0\7\10\1\126\10\10\15\0\5\10\3\0\1\10"+
    "\10\0\14\10\1\127\3\10\15\0\5\10\3\0\1\10"+
    "\10\0\12\10\1\130\5\10\15\0\5\10\3\0\1\10"+
    "\10\0\12\10\1\131\5\10\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2806];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1\1\11\10\1\2\11"+
    "\14\1\5\11\1\1\1\0\1\1\2\0\1\1\2\0"+
    "\1\1\1\0\14\1\1\11\1\0\1\11\13\1\1\0"+
    "\22\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

    private static java.util.ArrayList<Token> tokens;

    public static java.util.ArrayList<Token> getTokens() {
        return tokens;
    }
 
    private void addToken(TK type, String text) {
        tokens.add(new Token(yyline + 1, yycolumn + 1, type, text));
    }

    public boolean isZzAtEOF() {
        return zzAtEOF;
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      tokens = new java.util.ArrayList<>();
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 126) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 28: 
          { addToken(TK.FLOAT,null);
          }
        case 33: break;
        case 4: 
          { addToken(TK.OPERATOR, yytext());
          }
        case 34: break;
        case 31: 
          { addToken(TK.RETURN,null);
          }
        case 35: break;
        case 24: 
          { addToken(TK.TRUE,null);
          }
        case 36: break;
        case 3: 
          { addToken(TK.LBRACE,null);
          }
        case 37: break;
        case 26: 
          { addToken(TK.CHAR,null);
          }
        case 38: break;
        case 10: 
          { addToken(TK.RBRACK,null);
          }
        case 39: break;
        case 32: 
          { addToken(TK.BOOLEAN,null);
          }
        case 40: break;
        case 8: 
          { addToken(TK.INTEGER_LITERAL, yytext());
          }
        case 41: break;
        case 20: 
          { addToken(TK.DOUBLE_COLON, null);
          }
        case 42: break;
        case 12: 
          { addToken(TK.LPAREN,null);
          }
        case 43: break;
        case 25: 
          { addToken(TK.NULL,null);
          }
        case 44: break;
        case 30: 
          { addToken(TK.WHILE,null);
          }
        case 45: break;
        case 21: 
          { addToken(TK.CHARACTER_LITERAL, yytext());
          }
        case 46: break;
        case 14: 
          { addToken(TK.SEMICOLON,null);
          }
        case 47: break;
        case 27: 
          { addToken(TK.VOID,null);
          }
        case 48: break;
        case 16: 
          { addToken(TK.COLON, null);
          }
        case 49: break;
        case 15: 
          { addToken(TK.COMMA,null);
          }
        case 50: break;
        case 17: 
          { addToken(TK.FLOATING_POINT_LITERAL, yytext());
          }
        case 51: break;
        case 7: 
          { addToken(TK.TYPE_NAME, yytext());
          }
        case 52: break;
        case 18: 
          { addToken(TK.STRING_LITERAL, yytext());
          }
        case 53: break;
        case 13: 
          { addToken(TK.LBRACK,null);
          }
        case 54: break;
        case 19: 
          { addToken(TK.IF,null);
          }
        case 55: break;
        case 1: 
          { System.err.println("Lexical error: Illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1));
          }
        case 56: break;
        case 5: 
          { addToken(TK.RBRACE,null);
          }
        case 57: break;
        case 6: 
          { addToken(TK.IDENTIFIER, yytext());
          }
        case 58: break;
        case 9: 
          { addToken(TK.DOT,null);
          }
        case 59: break;
        case 22: 
          { addToken(TK.INT,null);
          }
        case 60: break;
        case 11: 
          { addToken(TK.RPAREN,null);
          }
        case 61: break;
        case 29: 
          { addToken(TK.FALSE,null);
          }
        case 62: break;
        case 23: 
          { addToken(TK.ELSE,null);
          }
        case 63: break;
        case 2: 
          { /* ignore */
          }
        case 64: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case YYINITIAL: {
              return new Token(yyline,yycolumn,TK.EOF,null);
            }
            case 90: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
