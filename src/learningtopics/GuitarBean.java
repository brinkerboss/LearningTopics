package learningtopics;

/**
 *
 * @author brinkerboss
 */
public class GuitarBean {
    String guitarmake;
    String guitarmodel;

    public String getGuitarmake() {
        return guitarmake;
    }

    public void setGuitarmake(String guitarmake) {
        this.guitarmake = guitarmake;
    }

    public String getGuitarmodel() {
        return guitarmodel;
    }

    public void setGuitarmodel(String guitarmodel) {
        this.guitarmodel = guitarmodel;
    }

    @Override
    public String toString() {
        return "GuitarBean{" + "guitarmake=" + guitarmake + ", guitarmodel=" + guitarmodel + '}';
    }

    
}
