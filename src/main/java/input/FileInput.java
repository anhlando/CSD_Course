package input;

import progressions.Progression;

public class FileInput implements I_Input {

    private Progression _progression;

    public FileInput(Progression p){
        this._progression = p;
    }

    public Progression input() throws Exception{

        return this._progression;
    }
}
