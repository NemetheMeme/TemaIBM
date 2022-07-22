package Main;
                                            // 3. Clasa pentru compozitie
public class Engine {

    private String type;
    private boolean isON;

    public Engine() {
        this.isON = false;
    }

    public Engine(String type) {
        this.type = type;
        this.isON = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", isON=" + isON +
                '}';
    }
}
