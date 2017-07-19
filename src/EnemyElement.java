/*
 * Participant: ConcreteElement
 */

public class EnemyElement implements GameElement {
    
    private String name;
    
    public EnemyElement(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public void setKilled(boolean b) {
        // this enemy is killed
    }
    
    public int getPower() {
        return (int)(Math.random() * 10);
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
