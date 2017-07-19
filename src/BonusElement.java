/*
 * Participant: ConcreteElement
 */

public class BonusElement implements GameElement {
    
    private String name;
    
    public BonusElement(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public void setUsed(boolean b) {
        // this bonus item is used.
    }
    
    public int getBonusCredit() {
        return (int) (Math.random() * 15);
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
