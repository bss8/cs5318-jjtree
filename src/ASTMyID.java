/* Generated By:JJTree: Do not edit this line. ASTMyID.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTMyID extends SimpleNode {
    private String name;

    public ASTMyID(int id) {
        super(id);
    }

    public ASTMyID(eg2 p, int id) {
        super(p, id);
    }

    public void setName(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }

    @Override
    public void printExpr() {
        System.out.print(toString());
    }

}
/* JavaCC - OriginalChecksum=168a8284059212b37012ab7c53de3257 (do not edit this line) */