/* Generated By:JJTree: Do not edit this line. ASTStart.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTStart extends SimpleNode {
    public ASTStart(int id) {
        super(id);
    }

    public ASTStart(eg2 p, int id) {
        super(p, id);
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void printExpr() {
        ((SimpleNode) children[0]).printExpr();
    }

    @Override
    public SimpleNode reduce() {
        return ((SimpleNode) children[0]).reduce();
    }

}
/* JavaCC - OriginalChecksum=e18dfbd1759a8c4c928ac9b0e36d5fe8 (do not edit this line) */