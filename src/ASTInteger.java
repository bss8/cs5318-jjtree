/* Generated By:JJTree: Do not edit this line. ASTInteger.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTInteger extends SimpleNode {
    private String val;

    public ASTInteger(int id) {
        super(id);
    }

    public ASTInteger(eg2 p, int id) {
        super(p, id);
    }

    public void setName(String s) {
        this.val = s;
    }

    public int getInt() {
        return Integer.parseInt(toString());
    }

    @Override
    public String toString() {
        return val;
    }


    @Override
    public void setInt(int num) {
        this.val = Integer.toString(num);
    }

    @Override
    public void printExpr() {
        System.out.print(toString());
    }

    @Override
    public SimpleNode reduce() {
        return (SimpleNode) this;
    }
}
/* JavaCC - OriginalChecksum=ba6ca17f4260eb922b3a5b9c63bc3238 (do not edit this line) */
