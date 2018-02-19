package ch.heigvd.res.lab00;

public class Clavier implements IInstrument {

    public Clavier() {
    }

    @Override
    public String play() {
        return "dayyyn";
    }

    @Override
    public String getColor() {
        return "ivory";
    }

    @Override
    public int getSoundVolume() {
        return 5;
    }
}
