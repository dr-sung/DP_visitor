/*
 * Participant: ConcreteVisitor
 */

public class PowerCalcVisitor implements Visitor {

    @Override
    public void visit(EnemyElement e) {
        System.out.println(e + "'s power level: " + e.getPower());
    }

    @Override
    public void visit(BonusElement e) {
        System.out.println(e + "'s bonus credits: " + e.getBonusCredit());
    }
    
}
