/*
 * Participant: Visitor
 */

public interface Visitor {
    
    void visit(EnemyElement e);
    void visit(BonusElement e);
    
}
