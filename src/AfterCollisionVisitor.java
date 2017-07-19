/*
 * ConcreteVisitor
 */
public class AfterCollisionVisitor implements Visitor {

    @Override
    public void visit(EnemyElement e) {
        e.setKilled(true);
        // take an action when the enemy is killed
        System.out.println(e + " killed!");
    }

    @Override
    public void visit(BonusElement e) {
        e.setUsed(true);
        // take an action according to the bonus item
        System.out.println(e+ " You've got a bonus!");
    }

}
