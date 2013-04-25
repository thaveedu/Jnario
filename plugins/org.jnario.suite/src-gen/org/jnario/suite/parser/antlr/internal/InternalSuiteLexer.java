package org.jnario.suite.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSuiteLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=12;
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_COMMENT_RICH_TEXT_END=14;
    public static final int EOF=-1;
    public static final int RULE_PATTERN=5;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=15;
    public static final int T__90=90;
    public static final int RULE_RICH_TEXT_END=13;
    public static final int RULE_DECIMAL=17;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_TEXT=7;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=18;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=19;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_SUITE_NAME=4;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_RICH_TEXT_START=10;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int RULE_RICH_TEXT=9;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=16;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=20;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RICH_TEXT_INBETWEEN=11;
    public static final int RULE_WS=21;

    // delegates
    // delegators

    public InternalSuiteLexer() {;} 
    public InternalSuiteLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSuiteLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g"; }

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:11:7: ( 'package' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:12:7: ( ';' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:13:7: ( '-' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:14:7: ( '.' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:15:7: ( 'class' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:15:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:16:7: ( '<' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:17:7: ( ',' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:18:7: ( '>' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:19:7: ( 'extends' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:19:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:20:7: ( 'implements' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:20:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:21:7: ( '{' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:22:7: ( '}' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:23:7: ( 'interface' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:23:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:24:7: ( 'enum' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:24:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:25:7: ( 'annotation' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:25:9: 'annotation'
            {
            match("annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:26:7: ( '=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:27:7: ( 'extension' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:27:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:28:7: ( '(' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:29:7: ( ')' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:30:7: ( 'throws' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:30:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:31:7: ( 'new' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:31:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:32:7: ( 'public' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:32:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:33:7: ( 'private' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:33:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:34:7: ( 'protected' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:34:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:35:7: ( 'abstract' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:35:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:36:7: ( 'static' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:36:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:37:7: ( 'dispatch' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:37:9: 'dispatch'
            {
            match("dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:38:7: ( 'final' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:38:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:39:7: ( 'val' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:39:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:40:7: ( 'var' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:40:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:41:7: ( 'def' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:41:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:42:7: ( 'override' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:42:9: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:43:7: ( 'create' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:43:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:44:7: ( ':' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:44:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:45:7: ( 'import' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:45:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:46:7: ( '...' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:46:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:47:7: ( 'FOR' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:47:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:48:7: ( 'BEFORE' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:48:9: 'BEFORE'
            {
            match("BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:49:7: ( 'SEPARATOR' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:49:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:50:7: ( 'AFTER' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:50:9: 'AFTER'
            {
            match("AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:51:7: ( 'ENDFOR' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:51:9: 'ENDFOR'
            {
            match("ENDFOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:52:7: ( 'IF' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:52:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:53:7: ( 'ELSE' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:53:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:54:7: ( 'ENDIF' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:54:9: 'ENDIF'
            {
            match("ENDIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:55:7: ( 'ELSEIF' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:55:9: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:56:7: ( '@' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:56:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:57:7: ( '+' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:57:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:58:7: ( '+=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:58:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:59:7: ( '-=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:59:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:60:7: ( '||' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:60:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:61:7: ( '&&' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:61:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:62:7: ( '==' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:62:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:63:7: ( '!=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:63:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:64:7: ( '===' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:64:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:65:7: ( '!==' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:65:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:66:7: ( 'instanceof' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:66:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:67:7: ( '>=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:67:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:68:7: ( '<=' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:68:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:69:7: ( '->' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:69:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:70:7: ( '..<' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:70:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:71:7: ( '..' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:71:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:72:7: ( '=>' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:72:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:73:7: ( '<>' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:73:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:74:7: ( '?:' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:74:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:75:7: ( '<=>' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:75:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:76:7: ( '*' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:76:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:77:7: ( '**' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:77:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:78:7: ( '/' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:78:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:79:7: ( '%' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:79:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:80:7: ( '!' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:80:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:81:7: ( 'as' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:81:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:82:7: ( '?.' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:82:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:83:7: ( '*.' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:83:9: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:84:7: ( '#' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:84:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:85:7: ( '[' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:85:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:86:7: ( ']' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:86:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:87:7: ( '|' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:87:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:88:8: ( 'if' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:88:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:89:8: ( 'else' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:89:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:90:8: ( 'switch' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:90:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:91:8: ( 'default' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:91:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:92:8: ( 'case' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:92:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:93:8: ( 'for' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:93:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:94:8: ( 'while' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:94:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:95:8: ( 'do' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:95:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:96:8: ( 'super' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:96:10: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:97:8: ( '::' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:97:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:98:8: ( 'false' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:98:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:99:8: ( 'true' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:99:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:100:8: ( 'null' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:100:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:101:8: ( 'typeof' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:101:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:102:8: ( 'throw' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:102:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:103:8: ( 'return' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:103:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:104:8: ( 'try' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:104:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:105:8: ( 'finally' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:105:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:106:8: ( 'catch' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:106:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:107:8: ( '?' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:107:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:108:8: ( '&' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:108:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "RULE_SUITE_NAME"
    public final void mRULE_SUITE_NAME() throws RecognitionException {
        try {
            int _type = RULE_SUITE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9471:17: ( ( '#' )+ ~ ( '-' ) ( '\\\\' ( '#' | '-' ) | ~ ( ( '-' | '#' ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9471:19: ( '#' )+ ~ ( '-' ) ( '\\\\' ( '#' | '-' ) | ~ ( ( '-' | '#' ) ) )*
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9471:19: ( '#' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='#') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\\') ) {
                        alt1=1;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<=',')||(LA1_1>='.' && LA1_1<='[')||(LA1_1>=']' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9471:19: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9471:31: ( '\\\\' ( '#' | '-' ) | ~ ( ( '-' | '#' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2=='#'||LA2_2=='-') ) {
                        alt2=1;
                    }

                    else {
                        alt2=2;
                    }

                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\"')||(LA2_0>='$' && LA2_0<=',')||(LA2_0>='.' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9471:32: '\\\\' ( '#' | '-' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='#'||input.LA(1)=='-' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9471:47: ~ ( ( '-' | '#' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUITE_NAME"

    // $ANTLR start "RULE_PATTERN"
    public final void mRULE_PATTERN() throws RecognitionException {
        try {
            int _type = RULE_PATTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9473:14: ( '\\\\' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9473:16: '\\\\' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n'
            {
            match('\\'); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9473:21: (~ ( ( '\\r' | '\\n' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9473:21: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9473:37: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9473:37: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATTERN"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9475:11: ( ':' ( '\\\\' ( '#' | '-' ) | ~ ( ( '-' | '#' ) ) )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9475:13: ':' ( '\\\\' ( '#' | '-' ) | ~ ( ( '-' | '#' ) ) )*
            {
            match(':'); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9475:17: ( '\\\\' ( '#' | '-' ) | ~ ( ( '-' | '#' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2=='#'||LA5_2=='-') ) {
                        alt5=1;
                    }

                    else {
                        alt5=2;
                    }

                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\"')||(LA5_0>='$' && LA5_0<=',')||(LA5_0>='.' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9475:18: '\\\\' ( '#' | '-' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='#'||input.LA(1)=='-' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9475:33: ~ ( ( '-' | '#' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9477:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9477:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9477:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9477:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9477:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='$'||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:27: ( RULE_IN_RICH_STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\'') ) {
                        int LA8_4 = input.LA(3);

                        if ( ((LA8_4>='\u0000' && LA8_4<='&')||(LA8_4>='(' && LA8_4<='\u00AA')||(LA8_4>='\u00AC' && LA8_4<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='&')||(LA8_1>='(' && LA8_1<='\u00AA')||(LA8_1>='\u00AC' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\u00AA')||(LA8_0>='\u00AC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\'') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\'') ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3=='\'') ) {
                        alt11=1;
                    }
                    else {
                        alt11=2;}
                }
                else {
                    alt11=2;}
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:58: ( '\\'' ( '\\'' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\'') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:64: ( '\\'' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='\'') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9479:64: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9481:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9481:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9481:33: ( RULE_IN_RICH_STRING )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\'') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='\'') ) {
                        int LA12_4 = input.LA(3);

                        if ( ((LA12_4>='\u0000' && LA12_4<='&')||(LA12_4>='(' && LA12_4<='\u00AA')||(LA12_4>='\u00AC' && LA12_4<='\uFFFF')) ) {
                            alt12=1;
                        }


                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='&')||(LA12_1>='(' && LA12_1<='\u00AA')||(LA12_1>='\u00AC' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\u00AA')||(LA12_0>='\u00AC' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9481:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9481:54: ( '\\'' ( '\\'' )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\'') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9481:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9481:60: ( '\\'' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\'') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9481:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:31: ( RULE_IN_RICH_STRING )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\'') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='\'') ) {
                        int LA15_4 = input.LA(3);

                        if ( ((LA15_4>='\u0000' && LA15_4<='&')||(LA15_4>='(' && LA15_4<='\u00AA')||(LA15_4>='\u00AC' && LA15_4<='\uFFFF')) ) {
                            alt15=1;
                        }


                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='&')||(LA15_1>='(' && LA15_1<='\u00AA')||(LA15_1>='\u00AC' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\'') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='\'') ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3=='\'') ) {
                        alt18=1;
                    }
                    else {
                        alt18=2;}
                }
                else {
                    alt18=2;}
            }
            else {
                alt18=2;}
            switch (alt18) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:62: ( '\\'' ( '\\'' )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\'') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:68: ( '\\'' )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='\'') ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9483:68: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9485:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9485:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9485:37: ( RULE_IN_RICH_STRING )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\'') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='\'') ) {
                        int LA19_4 = input.LA(3);

                        if ( ((LA19_4>='\u0000' && LA19_4<='&')||(LA19_4>='(' && LA19_4<='\u00AA')||(LA19_4>='\u00AC' && LA19_4<='\uFFFF')) ) {
                            alt19=1;
                        }


                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='&')||(LA19_1>='(' && LA19_1<='\u00AA')||(LA19_1>='\u00AC' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='\u00AA')||(LA19_0>='\u00AC' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9485:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9485:58: ( '\\'' ( '\\'' )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\'') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9485:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9485:64: ( '\\'' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\'') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9485:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mRULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:34: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:36: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:51: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:68: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:79: ( RULE_IN_RICH_STRING )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\'') ) {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1=='\'') ) {
                                int LA24_4 = input.LA(3);

                                if ( ((LA24_4>='\u0000' && LA24_4<='&')||(LA24_4>='(' && LA24_4<='\u00AA')||(LA24_4>='\u00AC' && LA24_4<='\uFFFF')) ) {
                                    alt24=1;
                                }


                            }
                            else if ( ((LA24_1>='\u0000' && LA24_1<='&')||(LA24_1>='(' && LA24_1<='\u00AA')||(LA24_1>='\u00AC' && LA24_1<='\uFFFF')) ) {
                                alt24=1;
                            }


                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='\u00AA')||(LA24_0>='\u00AC' && LA24_0<='\uFFFF')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:100: ( '\\'' ( '\\'' )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\'') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:106: ( '\\'' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0=='\'') ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9487:106: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_END"
    public final void mRULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:28: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:30: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:45: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\n'||LA34_0=='\r') ) {
                alt34=1;
            }
            else {
                alt34=2;}
            switch (alt34) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:62: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:73: ( RULE_IN_RICH_STRING )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\'') ) {
                            int LA30_1 = input.LA(2);

                            if ( (LA30_1=='\'') ) {
                                int LA30_4 = input.LA(3);

                                if ( ((LA30_4>='\u0000' && LA30_4<='&')||(LA30_4>='(' && LA30_4<='\u00AA')||(LA30_4>='\u00AC' && LA30_4<='\uFFFF')) ) {
                                    alt30=1;
                                }


                            }
                            else if ( ((LA30_1>='\u0000' && LA30_1<='&')||(LA30_1>='(' && LA30_1<='\u00AA')||(LA30_1>='\u00AC' && LA30_1<='\uFFFF')) ) {
                                alt30=1;
                            }


                        }
                        else if ( ((LA30_0>='\u0000' && LA30_0<='&')||(LA30_0>='(' && LA30_0<='\u00AA')||(LA30_0>='\u00AC' && LA30_0<='\uFFFF')) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='\'') ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1=='\'') ) {
                            int LA33_3 = input.LA(3);

                            if ( (LA33_3=='\'') ) {
                                alt33=1;
                            }
                            else {
                                alt33=2;}
                        }
                        else {
                            alt33=2;}
                    }
                    else {
                        alt33=2;}
                    switch (alt33) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:104: ( '\\'' ( '\\'' )? )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0=='\'') ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:110: ( '\\'' )?
                                    int alt31=2;
                                    int LA31_0 = input.LA(1);

                                    if ( (LA31_0=='\'') ) {
                                        alt31=1;
                                    }
                                    switch (alt31) {
                                        case 1 :
                                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:110: '\\''
                                            {
                                            match('\''); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9489:123: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9491:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9491:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9491:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\'') ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1=='\'') ) {
                    alt35=1;
                }
                else if ( ((LA35_1>='\u0000' && LA35_1<='&')||(LA35_1>='(' && LA35_1<='\u00AA')||(LA35_1>='\u00AC' && LA35_1<='\uFFFF')) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA35_0>='\u0000' && LA35_0<='&')||(LA35_0>='(' && LA35_0<='\u00AA')||(LA35_0>='\u00AC' && LA35_0<='\uFFFF')) ) {
                alt35=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9491:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9491:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9491:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:12: ( '0x' | '0X' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='0') ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1=='x') ) {
                    alt36=1;
                }
                else if ( (LA36_1=='X') ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='0' && LA37_0<='9')||(LA37_0>='A' && LA37_0<='F')||LA37_0=='_'||(LA37_0>='a' && LA37_0<='f')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='#') ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='B'||LA38_0=='b') ) {
                        alt38=1;
                    }
                    else if ( (LA38_0=='L'||LA38_0=='l') ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9493:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9495:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9495:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9495:21: ( '0' .. '9' | '_' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>='0' && LA40_0<='9')||LA40_0=='_') ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9497:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9497:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9497:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='E'||LA42_0=='e') ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9497:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9497:36: ( '+' | '-' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='+'||LA41_0=='-') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9497:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='B'||LA43_0=='b') ) {
                alt43=1;
            }
            else if ( (LA43_0=='D'||LA43_0=='F'||LA43_0=='L'||LA43_0=='d'||LA43_0=='f'||LA43_0=='l') ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9497:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9497:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='\"') ) {
                alt46=1;
            }
            else if ( (LA46_0=='\'') ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop44:
                    do {
                        int alt44=3;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0=='\\') ) {
                            alt44=1;
                        }
                        else if ( ((LA44_0>='\u0000' && LA44_0<='!')||(LA44_0>='#' && LA44_0<='[')||(LA44_0>=']' && LA44_0<='\uFFFF')) ) {
                            alt44=2;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop45:
                    do {
                        int alt45=3;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0=='\\') ) {
                            alt45=1;
                        }
                        else if ( ((LA45_0>='\u0000' && LA45_0<='&')||(LA45_0>='(' && LA45_0<='[')||(LA45_0>=']' && LA45_0<='\uFFFF')) ) {
                            alt45=2;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9499:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9501:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9501:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9501:24: ( options {greedy=false; } : . )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0=='*') ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1=='/') ) {
                        alt47=2;
                    }
                    else if ( ((LA47_1>='\u0000' && LA47_1<='.')||(LA47_1>='0' && LA47_1<='\uFFFF')) ) {
                        alt47=1;
                    }


                }
                else if ( ((LA47_0>='\u0000' && LA47_0<=')')||(LA47_0>='+' && LA47_0<='\uFFFF')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9501:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9503:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9503:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9503:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>='\u0000' && LA48_0<='\t')||(LA48_0>='\u000B' && LA48_0<='\f')||(LA48_0>='\u000E' && LA48_0<='\uFFFF')) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9503:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9503:40: ( ( '\\r' )? '\\n' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='\n'||LA50_0=='\r') ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9503:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9503:41: ( '\\r' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0=='\r') ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9503:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9505:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9505:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9505:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>='\t' && LA51_0<='\n')||LA51_0=='\r'||LA51_0==' ') ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9507:16: ( . )
            // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:9507:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | RULE_SUITE_NAME | RULE_PATTERN | RULE_TEXT | RULE_ID | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt52=116;
        alt52 = dfa52.predict(input);
        switch (alt52) {
            case 1 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:10: T__23
                {
                mT__23(); 

                }
                break;
            case 2 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:16: T__24
                {
                mT__24(); 

                }
                break;
            case 3 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:22: T__25
                {
                mT__25(); 

                }
                break;
            case 4 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:28: T__26
                {
                mT__26(); 

                }
                break;
            case 5 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:34: T__27
                {
                mT__27(); 

                }
                break;
            case 6 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:40: T__28
                {
                mT__28(); 

                }
                break;
            case 7 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:46: T__29
                {
                mT__29(); 

                }
                break;
            case 8 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:52: T__30
                {
                mT__30(); 

                }
                break;
            case 9 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:58: T__31
                {
                mT__31(); 

                }
                break;
            case 10 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:64: T__32
                {
                mT__32(); 

                }
                break;
            case 11 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:70: T__33
                {
                mT__33(); 

                }
                break;
            case 12 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:76: T__34
                {
                mT__34(); 

                }
                break;
            case 13 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:82: T__35
                {
                mT__35(); 

                }
                break;
            case 14 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:88: T__36
                {
                mT__36(); 

                }
                break;
            case 15 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:94: T__37
                {
                mT__37(); 

                }
                break;
            case 16 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:100: T__38
                {
                mT__38(); 

                }
                break;
            case 17 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:106: T__39
                {
                mT__39(); 

                }
                break;
            case 18 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:112: T__40
                {
                mT__40(); 

                }
                break;
            case 19 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:118: T__41
                {
                mT__41(); 

                }
                break;
            case 20 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:124: T__42
                {
                mT__42(); 

                }
                break;
            case 21 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:130: T__43
                {
                mT__43(); 

                }
                break;
            case 22 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:136: T__44
                {
                mT__44(); 

                }
                break;
            case 23 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:142: T__45
                {
                mT__45(); 

                }
                break;
            case 24 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:148: T__46
                {
                mT__46(); 

                }
                break;
            case 25 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:154: T__47
                {
                mT__47(); 

                }
                break;
            case 26 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:160: T__48
                {
                mT__48(); 

                }
                break;
            case 27 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:166: T__49
                {
                mT__49(); 

                }
                break;
            case 28 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:172: T__50
                {
                mT__50(); 

                }
                break;
            case 29 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:178: T__51
                {
                mT__51(); 

                }
                break;
            case 30 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:184: T__52
                {
                mT__52(); 

                }
                break;
            case 31 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:190: T__53
                {
                mT__53(); 

                }
                break;
            case 32 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:196: T__54
                {
                mT__54(); 

                }
                break;
            case 33 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:202: T__55
                {
                mT__55(); 

                }
                break;
            case 34 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:208: T__56
                {
                mT__56(); 

                }
                break;
            case 35 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:214: T__57
                {
                mT__57(); 

                }
                break;
            case 36 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:220: T__58
                {
                mT__58(); 

                }
                break;
            case 37 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:226: T__59
                {
                mT__59(); 

                }
                break;
            case 38 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:232: T__60
                {
                mT__60(); 

                }
                break;
            case 39 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:238: T__61
                {
                mT__61(); 

                }
                break;
            case 40 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:244: T__62
                {
                mT__62(); 

                }
                break;
            case 41 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:250: T__63
                {
                mT__63(); 

                }
                break;
            case 42 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:256: T__64
                {
                mT__64(); 

                }
                break;
            case 43 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:262: T__65
                {
                mT__65(); 

                }
                break;
            case 44 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:268: T__66
                {
                mT__66(); 

                }
                break;
            case 45 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:274: T__67
                {
                mT__67(); 

                }
                break;
            case 46 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:280: T__68
                {
                mT__68(); 

                }
                break;
            case 47 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:286: T__69
                {
                mT__69(); 

                }
                break;
            case 48 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:292: T__70
                {
                mT__70(); 

                }
                break;
            case 49 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:298: T__71
                {
                mT__71(); 

                }
                break;
            case 50 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:304: T__72
                {
                mT__72(); 

                }
                break;
            case 51 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:310: T__73
                {
                mT__73(); 

                }
                break;
            case 52 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:316: T__74
                {
                mT__74(); 

                }
                break;
            case 53 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:322: T__75
                {
                mT__75(); 

                }
                break;
            case 54 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:328: T__76
                {
                mT__76(); 

                }
                break;
            case 55 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:334: T__77
                {
                mT__77(); 

                }
                break;
            case 56 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:340: T__78
                {
                mT__78(); 

                }
                break;
            case 57 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:346: T__79
                {
                mT__79(); 

                }
                break;
            case 58 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:352: T__80
                {
                mT__80(); 

                }
                break;
            case 59 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:358: T__81
                {
                mT__81(); 

                }
                break;
            case 60 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:364: T__82
                {
                mT__82(); 

                }
                break;
            case 61 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:370: T__83
                {
                mT__83(); 

                }
                break;
            case 62 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:376: T__84
                {
                mT__84(); 

                }
                break;
            case 63 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:382: T__85
                {
                mT__85(); 

                }
                break;
            case 64 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:388: T__86
                {
                mT__86(); 

                }
                break;
            case 65 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:394: T__87
                {
                mT__87(); 

                }
                break;
            case 66 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:400: T__88
                {
                mT__88(); 

                }
                break;
            case 67 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:406: T__89
                {
                mT__89(); 

                }
                break;
            case 68 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:412: T__90
                {
                mT__90(); 

                }
                break;
            case 69 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:418: T__91
                {
                mT__91(); 

                }
                break;
            case 70 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:424: T__92
                {
                mT__92(); 

                }
                break;
            case 71 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:430: T__93
                {
                mT__93(); 

                }
                break;
            case 72 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:436: T__94
                {
                mT__94(); 

                }
                break;
            case 73 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:442: T__95
                {
                mT__95(); 

                }
                break;
            case 74 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:448: T__96
                {
                mT__96(); 

                }
                break;
            case 75 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:454: T__97
                {
                mT__97(); 

                }
                break;
            case 76 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:460: T__98
                {
                mT__98(); 

                }
                break;
            case 77 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:466: T__99
                {
                mT__99(); 

                }
                break;
            case 78 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:472: T__100
                {
                mT__100(); 

                }
                break;
            case 79 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:479: T__101
                {
                mT__101(); 

                }
                break;
            case 80 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:486: T__102
                {
                mT__102(); 

                }
                break;
            case 81 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:493: T__103
                {
                mT__103(); 

                }
                break;
            case 82 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:500: T__104
                {
                mT__104(); 

                }
                break;
            case 83 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:507: T__105
                {
                mT__105(); 

                }
                break;
            case 84 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:514: T__106
                {
                mT__106(); 

                }
                break;
            case 85 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:521: T__107
                {
                mT__107(); 

                }
                break;
            case 86 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:528: T__108
                {
                mT__108(); 

                }
                break;
            case 87 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:535: T__109
                {
                mT__109(); 

                }
                break;
            case 88 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:542: T__110
                {
                mT__110(); 

                }
                break;
            case 89 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:549: T__111
                {
                mT__111(); 

                }
                break;
            case 90 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:556: T__112
                {
                mT__112(); 

                }
                break;
            case 91 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:563: T__113
                {
                mT__113(); 

                }
                break;
            case 92 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:570: T__114
                {
                mT__114(); 

                }
                break;
            case 93 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:577: T__115
                {
                mT__115(); 

                }
                break;
            case 94 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:584: T__116
                {
                mT__116(); 

                }
                break;
            case 95 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:591: T__117
                {
                mT__117(); 

                }
                break;
            case 96 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:598: T__118
                {
                mT__118(); 

                }
                break;
            case 97 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:605: T__119
                {
                mT__119(); 

                }
                break;
            case 98 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:612: T__120
                {
                mT__120(); 

                }
                break;
            case 99 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:619: RULE_SUITE_NAME
                {
                mRULE_SUITE_NAME(); 

                }
                break;
            case 100 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:635: RULE_PATTERN
                {
                mRULE_PATTERN(); 

                }
                break;
            case 101 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:648: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 102 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:658: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 103 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:666: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 104 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:681: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 105 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:702: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 106 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:721: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 107 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:746: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 108 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:779: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 109 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:806: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 110 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:815: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 111 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:824: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 112 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:837: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 113 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:849: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 114 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:865: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 115 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:881: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 116 :
                // ../org.jnario.suite/src-gen/org/jnario/suite/parser/antlr/internal/InternalSuite.g:1:889: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA52_eotS =
        "\1\uffff\1\73\1\uffff\1\77\1\101\1\73\1\107\1\uffff\1\112\2\73\2"+
        "\uffff\1\73\1\130\2\uffff\7\73\1\155\6\73\1\uffff\1\167\1\171\1"+
        "\173\1\175\1\u0080\1\u0083\1\u0086\1\uffff\1\u0088\2\uffff\2\73"+
        "\2\67\1\uffff\1\67\1\u0094\1\67\2\u0097\1\67\2\uffff\3\73\5\uffff"+
        "\1\u00a1\1\uffff\3\73\1\u00a7\5\uffff\5\73\1\u00ae\2\uffff\2\73"+
        "\1\u00b1\1\u00b3\4\uffff\12\73\1\u00bf\5\73\1\u00c6\2\uffff\6\73"+
        "\1\u00cd\7\uffff\1\u00cf\17\uffff\2\73\1\uffff\1\u0090\1\uffff\2"+
        "\u0094\2\uffff\1\u00d8\2\uffff\1\u0097\2\uffff\4\73\3\uffff\4\73"+
        "\2\uffff\6\73\1\uffff\2\73\3\uffff\2\73\1\u00ec\1\73\1\u00ee\5\73"+
        "\1\u00f5\1\uffff\1\73\1\u00f7\1\73\1\u00f9\1\u00fa\1\73\1\uffff"+
        "\1\u00fc\5\73\3\uffff\2\73\1\u0108\2\u0094\1\u00d8\1\uffff\1\u010c"+
        "\1\uffff\6\73\1\u0113\2\73\1\u0116\1\u0117\7\73\1\u011f\1\uffff"+
        "\1\73\1\uffff\1\u0121\5\73\1\uffff\1\73\1\uffff\1\73\2\uffff\1\73"+
        "\1\uffff\5\73\1\u0130\2\73\2\u0108\2\uffff\1\u0094\2\u010c\1\uffff"+
        "\4\73\1\u013b\1\73\1\uffff\1\u013d\1\73\2\uffff\6\73\1\u0147\1\uffff"+
        "\1\73\1\uffff\2\73\1\u014b\2\73\1\u014f\1\u0150\3\73\1\u0154\1\73"+
        "\1\u0156\1\73\1\uffff\1\u0158\1\73\2\u0108\2\u010c\1\73\1\u015d"+
        "\2\73\1\uffff\1\u0160\1\uffff\3\73\1\u0164\4\73\1\u0169\1\uffff"+
        "\1\u016a\1\u016b\1\u016c\1\uffff\3\73\2\uffff\1\73\1\u0171\1\73"+
        "\1\uffff\1\u0173\1\uffff\1\u0174\1\uffff\1\u0175\1\u0108\1\u010c"+
        "\1\u0176\1\uffff\1\u0177\1\73\1\uffff\1\u0179\2\73\1\uffff\4\73"+
        "\4\uffff\1\73\1\u0181\1\u0182\1\73\1\uffff\1\73\5\uffff\1\73\1\uffff"+
        "\5\73\1\u018b\1\u018c\2\uffff\1\u018d\1\73\1\u018f\1\u0190\1\73"+
        "\1\u0192\2\73\3\uffff\1\u0195\2\uffff\1\u0196\1\uffff\1\u0197\1"+
        "\u0198\4\uffff";
    static final String DFA52_eofS =
        "\u0199\uffff";
    static final String DFA52_minS =
        "\1\0\1\141\1\uffff\1\75\1\56\1\141\1\75\1\uffff\1\75\1\154\1\146"+
        "\2\uffff\1\142\1\75\2\uffff\1\150\1\145\1\164\1\145\2\141\1\166"+
        "\1\0\1\117\2\105\1\106\1\114\1\106\1\uffff\1\75\1\174\1\46\1\75"+
        "\1\56\2\52\1\uffff\1\0\2\uffff\1\150\1\145\1\0\1\44\1\uffff\2\0"+
        "\1\u00ab\2\60\1\0\2\uffff\1\143\1\142\1\151\5\uffff\1\56\1\uffff"+
        "\1\141\1\145\1\163\1\76\5\uffff\1\164\1\165\1\163\1\160\1\163\1"+
        "\44\2\uffff\1\156\1\163\1\44\1\75\4\uffff\1\162\1\165\1\160\1\167"+
        "\1\154\1\141\1\151\1\160\1\163\1\146\1\44\1\156\1\162\2\154\1\145"+
        "\1\0\2\uffff\1\122\1\106\1\120\1\124\1\104\1\123\1\44\7\uffff\1"+
        "\75\17\uffff\1\151\1\164\1\uffff\1\47\1\uffff\2\0\2\uffff\1\0\2"+
        "\uffff\1\60\2\uffff\1\153\1\154\1\166\1\164\3\uffff\1\163\1\141"+
        "\1\145\1\143\2\uffff\1\145\1\155\1\145\1\154\1\145\1\164\1\uffff"+
        "\1\157\1\164\3\uffff\1\157\1\145\1\44\1\145\1\44\1\154\2\164\1\145"+
        "\1\160\1\44\1\uffff\1\141\1\44\1\163\2\44\1\162\1\uffff\1\44\1\117"+
        "\1\101\1\105\1\106\1\105\3\uffff\1\154\1\165\4\0\1\12\1\0\1\uffff"+
        "\1\141\1\151\1\141\1\145\1\163\1\164\1\44\1\150\1\156\2\44\1\145"+
        "\2\162\1\141\1\164\1\162\1\167\1\44\1\uffff\1\157\1\uffff\1\44\1"+
        "\151\1\143\1\162\1\141\1\165\1\uffff\1\154\1\uffff\1\145\2\uffff"+
        "\1\162\1\uffff\3\122\1\117\1\106\1\44\1\145\1\162\2\0\2\uffff\3"+
        "\0\1\uffff\1\147\1\143\1\164\1\143\1\44\1\145\1\uffff\1\44\1\144"+
        "\2\uffff\1\155\1\164\1\146\1\156\2\141\1\44\1\uffff\1\146\1\uffff"+
        "\1\143\1\150\1\44\1\164\1\154\2\44\1\151\1\105\1\101\1\44\1\122"+
        "\1\44\1\106\1\uffff\1\44\1\156\4\0\1\145\1\44\1\145\1\164\1\uffff"+
        "\1\44\1\uffff\1\163\1\151\1\145\1\44\1\141\1\143\1\164\1\143\1\44"+
        "\1\uffff\3\44\1\uffff\1\143\1\164\1\171\2\uffff\1\144\1\44\1\124"+
        "\1\uffff\1\44\1\uffff\1\44\1\uffff\1\44\2\0\1\44\1\uffff\1\44\1"+
        "\145\1\uffff\1\44\1\157\1\156\1\uffff\1\143\1\145\1\151\1\164\4"+
        "\uffff\1\150\2\44\1\145\1\uffff\1\117\5\uffff\1\144\1\uffff\1\156"+
        "\1\164\1\145\2\157\2\44\2\uffff\1\44\1\122\2\44\1\163\1\44\1\146"+
        "\1\156\3\uffff\1\44\2\uffff\1\44\1\uffff\2\44\4\uffff";
    static final String DFA52_maxS =
        "\1\uffff\1\165\1\uffff\1\76\1\56\1\162\1\76\1\uffff\1\75\1\170\1"+
        "\156\2\uffff\1\163\1\76\2\uffff\1\171\1\165\1\167\2\157\1\141\1"+
        "\166\1\uffff\1\117\2\105\1\106\1\116\1\106\1\uffff\1\75\1\174\1"+
        "\46\1\75\1\72\1\56\1\57\1\uffff\1\uffff\2\uffff\1\150\1\145\1\uffff"+
        "\1\172\1\uffff\2\uffff\1\u00ab\1\170\1\154\1\uffff\2\uffff\1\143"+
        "\1\142\1\157\5\uffff\1\74\1\uffff\1\141\1\145\1\164\1\76\5\uffff"+
        "\1\164\1\165\1\163\1\160\1\164\1\172\2\uffff\1\156\1\163\1\172\1"+
        "\75\4\uffff\1\162\1\171\1\160\1\167\1\154\1\141\1\151\1\160\1\163"+
        "\1\146\1\172\1\156\1\162\1\154\1\162\1\145\1\uffff\2\uffff\1\122"+
        "\1\106\1\120\1\124\1\104\1\123\1\172\7\uffff\1\75\17\uffff\1\151"+
        "\1\164\1\uffff\1\47\1\uffff\2\uffff\2\uffff\1\uffff\2\uffff\1\154"+
        "\2\uffff\1\153\1\154\1\166\1\164\3\uffff\1\163\1\141\1\145\1\143"+
        "\2\uffff\1\145\1\155\1\145\1\157\1\145\1\164\1\uffff\1\157\1\164"+
        "\3\uffff\1\157\1\145\1\172\1\145\1\172\1\154\2\164\1\145\1\160\1"+
        "\172\1\uffff\1\141\1\172\1\163\2\172\1\162\1\uffff\1\172\1\117\1"+
        "\101\1\105\1\111\1\105\3\uffff\1\154\1\165\4\uffff\1\12\1\uffff"+
        "\1\uffff\1\141\1\151\1\141\1\145\1\163\1\164\1\172\1\150\1\156\2"+
        "\172\1\145\2\162\1\141\1\164\1\162\1\167\1\172\1\uffff\1\157\1\uffff"+
        "\1\172\1\151\1\143\1\162\1\141\1\165\1\uffff\1\154\1\uffff\1\145"+
        "\2\uffff\1\162\1\uffff\3\122\1\117\1\106\1\172\1\145\1\162\2\uffff"+
        "\2\uffff\3\uffff\1\uffff\1\147\1\143\1\164\1\143\1\172\1\145\1\uffff"+
        "\1\172\1\163\2\uffff\1\155\1\164\1\146\1\156\2\141\1\172\1\uffff"+
        "\1\146\1\uffff\1\143\1\150\1\172\1\164\1\154\2\172\1\151\1\105\1"+
        "\101\1\172\1\122\1\172\1\106\1\uffff\1\172\1\156\4\uffff\1\145\1"+
        "\172\1\145\1\164\1\uffff\1\172\1\uffff\1\163\1\151\1\145\1\172\1"+
        "\141\1\143\1\164\1\143\1\172\1\uffff\3\172\1\uffff\1\143\1\164\1"+
        "\171\2\uffff\1\144\1\172\1\124\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\2\uffff\1\172\1\uffff\1\172\1\145\1\uffff\1\172\1\157\1\156"+
        "\1\uffff\1\143\1\145\1\151\1\164\4\uffff\1\150\2\172\1\145\1\uffff"+
        "\1\117\5\uffff\1\144\1\uffff\1\156\1\164\1\145\2\157\2\172\2\uffff"+
        "\1\172\1\122\2\172\1\163\1\172\1\146\1\156\3\uffff\1\172\2\uffff"+
        "\1\172\1\uffff\2\172\4\uffff";
    static final String DFA52_acceptS =
        "\2\uffff\1\2\4\uffff\1\7\3\uffff\1\13\1\14\2\uffff\1\22\1\23\16"+
        "\uffff\1\56\7\uffff\1\105\1\uffff\1\113\1\114\4\uffff\1\146\6\uffff"+
        "\1\163\1\164\3\uffff\1\146\1\2\1\61\1\73\1\3\1\uffff\1\4\4\uffff"+
        "\1\77\1\6\1\7\1\71\1\10\6\uffff\1\13\1\14\4\uffff\1\76\1\20\1\22"+
        "\1\23\21\uffff\1\145\1\42\7\uffff\1\56\1\60\1\57\1\62\1\115\1\63"+
        "\1\142\1\uffff\1\106\1\100\1\110\1\141\1\103\1\111\1\102\1\161\1"+
        "\162\1\104\1\105\1\112\1\143\1\113\1\114\2\uffff\1\144\1\uffff\1"+
        "\160\2\uffff\1\152\1\151\1\uffff\1\155\1\156\1\uffff\1\157\1\163"+
        "\4\uffff\1\44\1\74\1\75\4\uffff\1\101\1\72\6\uffff\1\116\2\uffff"+
        "\1\107\1\66\1\64\13\uffff\1\125\6\uffff\1\127\6\uffff\1\52\1\67"+
        "\1\65\10\uffff\1\153\23\uffff\1\136\1\uffff\1\25\6\uffff\1\37\1"+
        "\uffff\1\123\1\uffff\1\35\1\36\1\uffff\1\45\12\uffff\1\150\1\147"+
        "\3\uffff\1\154\6\uffff\1\122\2\uffff\1\16\1\117\7\uffff\1\131\1"+
        "\uffff\1\132\16\uffff\1\53\12\uffff\1\5\1\uffff\1\140\11\uffff\1"+
        "\134\3\uffff\1\126\3\uffff\1\34\1\130\3\uffff\1\50\1\uffff\1\54"+
        "\1\uffff\1\124\4\uffff\1\26\2\uffff\1\41\3\uffff\1\43\4\uffff\1"+
        "\24\1\133\1\32\1\120\4\uffff\1\46\1\uffff\1\51\1\55\1\135\1\1\1"+
        "\27\1\uffff\1\11\7\uffff\1\121\1\137\10\uffff\1\31\1\33\1\40\1\uffff"+
        "\1\30\1\21\1\uffff\1\15\2\uffff\1\47\1\12\1\70\1\17";
    static final String DFA52_specialS =
        "\1\17\27\uffff\1\20\17\uffff\1\3\4\uffff\1\23\2\uffff\1\2\1\0\3"+
        "\uffff\1\32\65\uffff\1\15\45\uffff\1\31\1\27\2\uffff\1\7\74\uffff"+
        "\1\4\1\22\1\26\1\16\1\uffff\1\5\55\uffff\1\11\1\24\2\uffff\1\30"+
        "\1\10\1\14\47\uffff\1\1\1\25\1\6\1\13\43\uffff\1\21\1\12\75\uffff}>";
    static final String[] DFA52_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\43\1\65\1\50\1\57\1\47\1"+
            "\42\1\60\1\17\1\20\1\45\1\40\1\7\1\3\1\4\1\46\1\63\11\64\1\30"+
            "\1\2\1\6\1\16\1\10\1\44\1\37\1\34\1\32\2\57\1\35\1\31\2\57\1"+
            "\36\11\57\1\33\7\57\1\51\1\55\1\52\1\56\1\57\1\67\1\15\1\57"+
            "\1\5\1\24\1\11\1\25\2\57\1\12\4\57\1\22\1\27\1\1\1\57\1\54\1"+
            "\23\1\21\1\57\1\26\1\53\3\57\1\13\1\41\1\14\55\67\1\62\17\67"+
            "\1\61\uff44\67",
            "\1\70\20\uffff\1\72\2\uffff\1\71",
            "",
            "\1\75\1\76",
            "\1\100",
            "\1\104\12\uffff\1\102\5\uffff\1\103",
            "\1\105\1\106",
            "",
            "\1\111",
            "\1\115\1\uffff\1\114\11\uffff\1\113",
            "\1\120\6\uffff\1\116\1\117",
            "",
            "",
            "\1\124\13\uffff\1\123\4\uffff\1\125",
            "\1\126\1\127",
            "",
            "",
            "\1\133\11\uffff\1\134\6\uffff\1\135",
            "\1\136\17\uffff\1\137",
            "\1\140\1\142\1\uffff\1\141",
            "\1\144\3\uffff\1\143\5\uffff\1\145",
            "\1\150\7\uffff\1\146\5\uffff\1\147",
            "\1\151",
            "\1\152",
            "\43\154\1\uffff\11\154\1\uffff\14\154\1\153\uffc5\154",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\163\1\uffff\1\162",
            "\1\164",
            "",
            "\1\166",
            "\1\170",
            "\1\172",
            "\1\174",
            "\1\177\13\uffff\1\176",
            "\1\u0081\3\uffff\1\u0082",
            "\1\u0084\4\uffff\1\u0085",
            "",
            "\55\u0089\1\uffff\uffd2\u0089",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\0\u008e",
            "\1\73\34\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\47\u0090\1\u008f\uffd8\u0090",
            "\47\u0092\1\u0091\u0083\u0092\1\u0093\uff54\u0092",
            "\1\u0095",
            "\12\u0098\10\uffff\1\u0099\1\uffff\3\u0099\5\uffff\1\u0099"+
            "\13\uffff\1\u0096\6\uffff\1\u0098\2\uffff\1\u0099\1\uffff\3"+
            "\u0099\5\uffff\1\u0099\13\uffff\1\u0096",
            "\12\u0098\10\uffff\1\u0099\1\uffff\3\u0099\5\uffff\1\u0099"+
            "\22\uffff\1\u0098\2\uffff\1\u0099\1\uffff\3\u0099\5\uffff\1"+
            "\u0099",
            "\0\u0090",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\5\uffff\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "\1\u009f\15\uffff\1\u00a0",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ad\1\u00ac",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u00b2",
            "",
            "",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\5\uffff\1\u00c4",
            "\1\u00c5",
            "\43\154\1\uffff\11\154\1\uffff\uffd2\154",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ce",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "",
            "\47\u00d4\1\u00d3\u0083\u00d4\1\u0093\uff54\u00d4",
            "\47\u0092\1\u0091\u0083\u0092\1\u0093\uff54\u0092",
            "",
            "",
            "\12\u00d5\1\u00d7\2\u00d5\1\u00d6\ufff2\u00d5",
            "",
            "",
            "\12\u0098\10\uffff\1\u0099\1\uffff\3\u0099\5\uffff\1\u0099"+
            "\22\uffff\1\u0098\2\uffff\1\u0099\1\uffff\3\u0099\5\uffff\1"+
            "\u0099",
            "",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4\2\uffff\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u00ed",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u00f4"+
            "\31\73",
            "",
            "\1\u00f6",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u00f8",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u00fb",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100\2\uffff\1\u0101",
            "\1\u0102",
            "",
            "",
            "",
            "\1\u0103",
            "\1\u0104",
            "\47\u0106\1\u0105\u0083\u0106\1\u0107\uff54\u0106",
            "\47\u0109\1\uffff\u0083\u0109\1\u0093\uff54\u0109",
            "\47\u0092\1\u0091\u0083\u0092\1\u0093\uff54\u0092",
            "\12\u00d5\1\u00d7\2\u00d5\1\u00d6\ufff2\u00d5",
            "\1\u00d7",
            "\47\u010b\1\u010a\u0083\u010b\1\u00d8\uff54\u010b",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0114",
            "\1\u0115",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\u0120",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "\1\u0127",
            "",
            "\1\u0128",
            "",
            "",
            "\1\u0129",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\73\13\uffff\12\73\7\uffff\10\73\1\u012f\21\73\4\uffff\1"+
            "\73\1\uffff\32\73",
            "\1\u0131",
            "\1\u0132",
            "\47\u0134\1\u0133\u0083\u0134\1\u0107\uff54\u0134",
            "\47\u0106\1\u0105\u0083\u0106\1\u0107\uff54\u0106",
            "",
            "",
            "\47\u0092\1\u0091\u0083\u0092\1\u0093\uff54\u0092",
            "\47\u0136\1\u0135\u0083\u0136\1\u00d8\uff54\u0136",
            "\47\u010b\1\u010a\u0083\u010b\1\u00d8\uff54\u010b",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u013c",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u013e\16\uffff\1\u013f",
            "",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22"+
            "\73\1\u0146\7\73",
            "",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u014c",
            "\1\u014d",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\13"+
            "\73\1\u014e\16\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0155",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0157",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0159",
            "\47\u015a\1\uffff\u0083\u015a\1\u0107\uff54\u015a",
            "\47\u0106\1\u0105\u0083\u0106\1\u0107\uff54\u0106",
            "\47\u015b\1\uffff\u0083\u015b\1\u00d8\uff54\u015b",
            "\47\u010b\1\u010a\u0083\u010b\1\u00d8\uff54\u010b",
            "\1\u015c",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "",
            "\1\u0170",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0172",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\47\u0106\1\u0105\u0083\u0106\1\u0107\uff54\u0106",
            "\47\u010b\1\u010a\u0083\u010b\1\u00d8\uff54\u010b",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0178",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "",
            "",
            "",
            "\1\u0180",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0183",
            "",
            "\1\u0184",
            "",
            "",
            "",
            "",
            "",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u018e",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0191",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\u0193",
            "\1\u0194",
            "",
            "",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "\1\73\13\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32"+
            "\73",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    static class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | RULE_SUITE_NAME | RULE_PATTERN | RULE_TEXT | RULE_ID | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_49 = input.LA(1);

                        s = -1;
                        if ( (LA52_49=='\'') ) {s = 145;}

                        else if ( ((LA52_49>='\u0000' && LA52_49<='&')||(LA52_49>='(' && LA52_49<='\u00AA')||(LA52_49>='\u00AC' && LA52_49<='\uFFFF')) ) {s = 146;}

                        else if ( (LA52_49=='\u00AB') ) {s = 147;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_307 = input.LA(1);

                        s = -1;
                        if ( ((LA52_307>='\u0000' && LA52_307<='&')||(LA52_307>='(' && LA52_307<='\u00AA')||(LA52_307>='\u00AC' && LA52_307<='\uFFFF')) ) {s = 346;}

                        else if ( (LA52_307=='\u00AB') ) {s = 263;}

                        else s = 264;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_48 = input.LA(1);

                        s = -1;
                        if ( (LA52_48=='\'') ) {s = 143;}

                        else if ( ((LA52_48>='\u0000' && LA52_48<='&')||(LA52_48>='(' && LA52_48<='\uFFFF')) ) {s = 144;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_40 = input.LA(1);

                        s = -1;
                        if ( ((LA52_40>='\u0000' && LA52_40<=',')||(LA52_40>='.' && LA52_40<='\uFFFF')) ) {s = 137;}

                        else s = 136;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_210 = input.LA(1);

                        s = -1;
                        if ( (LA52_210=='\'') ) {s = 261;}

                        else if ( ((LA52_210>='\u0000' && LA52_210<='&')||(LA52_210>='(' && LA52_210<='\u00AA')||(LA52_210>='\u00AC' && LA52_210<='\uFFFF')) ) {s = 262;}

                        else if ( (LA52_210=='\u00AB') ) {s = 263;}

                        else s = 264;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_215 = input.LA(1);

                        s = -1;
                        if ( (LA52_215=='\'') ) {s = 266;}

                        else if ( ((LA52_215>='\u0000' && LA52_215<='&')||(LA52_215>='(' && LA52_215<='\u00AA')||(LA52_215>='\u00AC' && LA52_215<='\uFFFF')) ) {s = 267;}

                        else if ( (LA52_215=='\u00AB') ) {s = 216;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_309 = input.LA(1);

                        s = -1;
                        if ( ((LA52_309>='\u0000' && LA52_309<='&')||(LA52_309>='(' && LA52_309<='\u00AA')||(LA52_309>='\u00AC' && LA52_309<='\uFFFF')) ) {s = 347;}

                        else if ( (LA52_309=='\u00AB') ) {s = 216;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA52_149 = input.LA(1);

                        s = -1;
                        if ( ((LA52_149>='\u0000' && LA52_149<='\t')||(LA52_149>='\u000B' && LA52_149<='\f')||(LA52_149>='\u000E' && LA52_149<='\uFFFF')) ) {s = 213;}

                        else if ( (LA52_149=='\r') ) {s = 214;}

                        else if ( (LA52_149=='\n') ) {s = 215;}

                        else s = 216;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA52_266 = input.LA(1);

                        s = -1;
                        if ( (LA52_266=='\'') ) {s = 309;}

                        else if ( ((LA52_266>='\u0000' && LA52_266<='&')||(LA52_266>='(' && LA52_266<='\u00AA')||(LA52_266>='\u00AC' && LA52_266<='\uFFFF')) ) {s = 310;}

                        else if ( (LA52_266=='\u00AB') ) {s = 216;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA52_261 = input.LA(1);

                        s = -1;
                        if ( (LA52_261=='\'') ) {s = 307;}

                        else if ( ((LA52_261>='\u0000' && LA52_261<='&')||(LA52_261>='(' && LA52_261<='\u00AA')||(LA52_261>='\u00AC' && LA52_261<='\uFFFF')) ) {s = 308;}

                        else if ( (LA52_261=='\u00AB') ) {s = 263;}

                        else s = 264;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA52_347 = input.LA(1);

                        s = -1;
                        if ( (LA52_347=='\'') ) {s = 266;}

                        else if ( (LA52_347=='\u00AB') ) {s = 216;}

                        else if ( ((LA52_347>='\u0000' && LA52_347<='&')||(LA52_347>='(' && LA52_347<='\u00AA')||(LA52_347>='\u00AC' && LA52_347<='\uFFFF')) ) {s = 267;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA52_310 = input.LA(1);

                        s = -1;
                        if ( (LA52_310=='\'') ) {s = 266;}

                        else if ( (LA52_310=='\u00AB') ) {s = 216;}

                        else if ( ((LA52_310>='\u0000' && LA52_310<='&')||(LA52_310>='(' && LA52_310<='\u00AA')||(LA52_310>='\u00AC' && LA52_310<='\uFFFF')) ) {s = 267;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA52_267 = input.LA(1);

                        s = -1;
                        if ( (LA52_267=='\'') ) {s = 266;}

                        else if ( ((LA52_267>='\u0000' && LA52_267<='&')||(LA52_267>='(' && LA52_267<='\u00AA')||(LA52_267>='\u00AC' && LA52_267<='\uFFFF')) ) {s = 267;}

                        else if ( (LA52_267=='\u00AB') ) {s = 216;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA52_107 = input.LA(1);

                        s = -1;
                        if ( ((LA52_107>='\u0000' && LA52_107<='\"')||(LA52_107>='$' && LA52_107<=',')||(LA52_107>='.' && LA52_107<='\uFFFF')) ) {s = 108;}

                        else s = 198;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA52_213 = input.LA(1);

                        s = -1;
                        if ( (LA52_213=='\r') ) {s = 214;}

                        else if ( (LA52_213=='\n') ) {s = 215;}

                        else if ( ((LA52_213>='\u0000' && LA52_213<='\t')||(LA52_213>='\u000B' && LA52_213<='\f')||(LA52_213>='\u000E' && LA52_213<='\uFFFF')) ) {s = 213;}

                        else s = 216;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA52_0 = input.LA(1);

                        s = -1;
                        if ( (LA52_0=='p') ) {s = 1;}

                        else if ( (LA52_0==';') ) {s = 2;}

                        else if ( (LA52_0=='-') ) {s = 3;}

                        else if ( (LA52_0=='.') ) {s = 4;}

                        else if ( (LA52_0=='c') ) {s = 5;}

                        else if ( (LA52_0=='<') ) {s = 6;}

                        else if ( (LA52_0==',') ) {s = 7;}

                        else if ( (LA52_0=='>') ) {s = 8;}

                        else if ( (LA52_0=='e') ) {s = 9;}

                        else if ( (LA52_0=='i') ) {s = 10;}

                        else if ( (LA52_0=='{') ) {s = 11;}

                        else if ( (LA52_0=='}') ) {s = 12;}

                        else if ( (LA52_0=='a') ) {s = 13;}

                        else if ( (LA52_0=='=') ) {s = 14;}

                        else if ( (LA52_0=='(') ) {s = 15;}

                        else if ( (LA52_0==')') ) {s = 16;}

                        else if ( (LA52_0=='t') ) {s = 17;}

                        else if ( (LA52_0=='n') ) {s = 18;}

                        else if ( (LA52_0=='s') ) {s = 19;}

                        else if ( (LA52_0=='d') ) {s = 20;}

                        else if ( (LA52_0=='f') ) {s = 21;}

                        else if ( (LA52_0=='v') ) {s = 22;}

                        else if ( (LA52_0=='o') ) {s = 23;}

                        else if ( (LA52_0==':') ) {s = 24;}

                        else if ( (LA52_0=='F') ) {s = 25;}

                        else if ( (LA52_0=='B') ) {s = 26;}

                        else if ( (LA52_0=='S') ) {s = 27;}

                        else if ( (LA52_0=='A') ) {s = 28;}

                        else if ( (LA52_0=='E') ) {s = 29;}

                        else if ( (LA52_0=='I') ) {s = 30;}

                        else if ( (LA52_0=='@') ) {s = 31;}

                        else if ( (LA52_0=='+') ) {s = 32;}

                        else if ( (LA52_0=='|') ) {s = 33;}

                        else if ( (LA52_0=='&') ) {s = 34;}

                        else if ( (LA52_0=='!') ) {s = 35;}

                        else if ( (LA52_0=='?') ) {s = 36;}

                        else if ( (LA52_0=='*') ) {s = 37;}

                        else if ( (LA52_0=='/') ) {s = 38;}

                        else if ( (LA52_0=='%') ) {s = 39;}

                        else if ( (LA52_0=='#') ) {s = 40;}

                        else if ( (LA52_0=='[') ) {s = 41;}

                        else if ( (LA52_0==']') ) {s = 42;}

                        else if ( (LA52_0=='w') ) {s = 43;}

                        else if ( (LA52_0=='r') ) {s = 44;}

                        else if ( (LA52_0=='\\') ) {s = 45;}

                        else if ( (LA52_0=='^') ) {s = 46;}

                        else if ( (LA52_0=='$'||(LA52_0>='C' && LA52_0<='D')||(LA52_0>='G' && LA52_0<='H')||(LA52_0>='J' && LA52_0<='R')||(LA52_0>='T' && LA52_0<='Z')||LA52_0=='_'||LA52_0=='b'||(LA52_0>='g' && LA52_0<='h')||(LA52_0>='j' && LA52_0<='m')||LA52_0=='q'||LA52_0=='u'||(LA52_0>='x' && LA52_0<='z')) ) {s = 47;}

                        else if ( (LA52_0=='\'') ) {s = 48;}

                        else if ( (LA52_0=='\u00BB') ) {s = 49;}

                        else if ( (LA52_0=='\u00AB') ) {s = 50;}

                        else if ( (LA52_0=='0') ) {s = 51;}

                        else if ( ((LA52_0>='1' && LA52_0<='9')) ) {s = 52;}

                        else if ( (LA52_0=='\"') ) {s = 53;}

                        else if ( ((LA52_0>='\t' && LA52_0<='\n')||LA52_0=='\r'||LA52_0==' ') ) {s = 54;}

                        else if ( ((LA52_0>='\u0000' && LA52_0<='\b')||(LA52_0>='\u000B' && LA52_0<='\f')||(LA52_0>='\u000E' && LA52_0<='\u001F')||LA52_0=='`'||(LA52_0>='~' && LA52_0<='\u00AA')||(LA52_0>='\u00AC' && LA52_0<='\u00BA')||(LA52_0>='\u00BC' && LA52_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA52_24 = input.LA(1);

                        s = -1;
                        if ( (LA52_24==':') ) {s = 107;}

                        else if ( ((LA52_24>='\u0000' && LA52_24<='\"')||(LA52_24>='$' && LA52_24<=',')||(LA52_24>='.' && LA52_24<='9')||(LA52_24>=';' && LA52_24<='\uFFFF')) ) {s = 108;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA52_346 = input.LA(1);

                        s = -1;
                        if ( (LA52_346=='\'') ) {s = 261;}

                        else if ( ((LA52_346>='\u0000' && LA52_346<='&')||(LA52_346>='(' && LA52_346<='\u00AA')||(LA52_346>='\u00AC' && LA52_346<='\uFFFF')) ) {s = 262;}

                        else if ( (LA52_346=='\u00AB') ) {s = 263;}

                        else s = 264;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA52_211 = input.LA(1);

                        s = -1;
                        if ( ((LA52_211>='\u0000' && LA52_211<='&')||(LA52_211>='(' && LA52_211<='\u00AA')||(LA52_211>='\u00AC' && LA52_211<='\uFFFF')) ) {s = 265;}

                        else if ( (LA52_211=='\u00AB') ) {s = 147;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA52_45 = input.LA(1);

                        s = -1;
                        if ( ((LA52_45>='\u0000' && LA52_45<='\uFFFF')) ) {s = 142;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA52_262 = input.LA(1);

                        s = -1;
                        if ( (LA52_262=='\'') ) {s = 261;}

                        else if ( (LA52_262=='\u00AB') ) {s = 263;}

                        else if ( ((LA52_262>='\u0000' && LA52_262<='&')||(LA52_262>='(' && LA52_262<='\u00AA')||(LA52_262>='\u00AC' && LA52_262<='\uFFFF')) ) {s = 262;}

                        else s = 264;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA52_308 = input.LA(1);

                        s = -1;
                        if ( (LA52_308=='\'') ) {s = 261;}

                        else if ( ((LA52_308>='\u0000' && LA52_308<='&')||(LA52_308>='(' && LA52_308<='\u00AA')||(LA52_308>='\u00AC' && LA52_308<='\uFFFF')) ) {s = 262;}

                        else if ( (LA52_308=='\u00AB') ) {s = 263;}

                        else s = 264;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA52_212 = input.LA(1);

                        s = -1;
                        if ( (LA52_212=='\'') ) {s = 145;}

                        else if ( (LA52_212=='\u00AB') ) {s = 147;}

                        else if ( ((LA52_212>='\u0000' && LA52_212<='&')||(LA52_212>='(' && LA52_212<='\u00AA')||(LA52_212>='\u00AC' && LA52_212<='\uFFFF')) ) {s = 146;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA52_146 = input.LA(1);

                        s = -1;
                        if ( (LA52_146=='\'') ) {s = 145;}

                        else if ( (LA52_146=='\u00AB') ) {s = 147;}

                        else if ( ((LA52_146>='\u0000' && LA52_146<='&')||(LA52_146>='(' && LA52_146<='\u00AA')||(LA52_146>='\u00AC' && LA52_146<='\uFFFF')) ) {s = 146;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA52_265 = input.LA(1);

                        s = -1;
                        if ( (LA52_265=='\'') ) {s = 145;}

                        else if ( ((LA52_265>='\u0000' && LA52_265<='&')||(LA52_265>='(' && LA52_265<='\u00AA')||(LA52_265>='\u00AC' && LA52_265<='\uFFFF')) ) {s = 146;}

                        else if ( (LA52_265=='\u00AB') ) {s = 147;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA52_145 = input.LA(1);

                        s = -1;
                        if ( (LA52_145=='\'') ) {s = 211;}

                        else if ( ((LA52_145>='\u0000' && LA52_145<='&')||(LA52_145>='(' && LA52_145<='\u00AA')||(LA52_145>='\u00AC' && LA52_145<='\uFFFF')) ) {s = 212;}

                        else if ( (LA52_145=='\u00AB') ) {s = 147;}

                        else s = 148;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA52_53 = input.LA(1);

                        s = -1;
                        if ( ((LA52_53>='\u0000' && LA52_53<='\uFFFF')) ) {s = 144;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}