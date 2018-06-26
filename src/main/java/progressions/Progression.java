package progressions;

public class Progression {

    private String _type;
    private int _start;
    private int _difference;
    private int _elementCount;

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public int get_start() {
        return _start;
    }

    public void set_start(int _start) {
        this._start = _start;
    }

    public int get_difference() {
        return _difference;
    }

    public void set_difference(int _difference) {
        this._difference = _difference;
    }

    public int get_elementCount() {
        return _elementCount;
    }

    public void set_elementCount(int _elementCount) {
        this._elementCount = _elementCount;
    }
}
