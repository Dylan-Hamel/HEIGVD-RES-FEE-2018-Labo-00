package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

    public Trumpet() {
    }

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public int getSoundVolume() {
        return 2;
    }
}
