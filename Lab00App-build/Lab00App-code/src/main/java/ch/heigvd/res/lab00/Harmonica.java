package ch.heigvd.res.lab00;

public class Harmonica implements IInstrument {

    public Harmonica() {
    }

    @Override
    public String play() {
        return "dap dap";
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public int getSoundVolume() {
        return 0;
    }
}
