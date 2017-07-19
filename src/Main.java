/*
 * Visitor pattern
 */

public class Main {
    
    public static void main(String[] args) {
        
        GameDataStore data = new GameDataStore();
        
        Bullet shooter = new Bullet();
        
        AfterCollisionVisitor visitor = new AfterCollisionVisitor();
        
        for (GameElement e: data.getGameFigures()) {
            if (shooter.collidesWith(e)) {
                e.accept(visitor);
            }
        }
        
        PowerCalcVisitor visitor2 = new PowerCalcVisitor();
        
        for (GameElement e: data.getGameFigures()) {
            e.accept(visitor2);
        }
        
    }
    
}

class Bullet {
    
    public boolean collidesWith(GameElement e) {
        if (Math.random() < 0.5)
            return true;
        else
            return false;
    }
}
