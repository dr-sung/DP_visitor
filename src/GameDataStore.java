
import java.util.ArrayList;

/*
 * Participant: ObjectStructure
 */

public class GameDataStore {
    
    private final ArrayList<GameElement> gameFigures;
    
    public GameDataStore() {
        gameFigures = new ArrayList<>();
        
        gameFigures.add(new EnemyElement("enemy1"));
        gameFigures.add(new EnemyElement("enemy2"));
        gameFigures.add(new EnemyElement("enemy3"));
        gameFigures.add(new BonusElement("bonus1"));
        gameFigures.add(new BonusElement("bonus2"));
    }
    
    public ArrayList<GameElement> getGameFigures() {
        return gameFigures;
    }
    
}
