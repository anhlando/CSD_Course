package processors;

import progressions.Progression;

import java.util.ArrayList;
import java.util.List;

public class APProcessor implements IProcessor {

    private Progression _progression;

    public APProcessor(Progression p){
        this._progression = p;
    }

    public List<Integer> process() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(this._progression.get_start());

        for (int i = 0; i < this._progression.get_elementCount() - 1; i++){
            result.add(result.get(i) + this._progression.get_difference());
        }

        return result;
    }
}
