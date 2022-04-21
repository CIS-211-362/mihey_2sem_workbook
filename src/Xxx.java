public class Xxx {
    private int _attr;

    public Xxx(int attr) {
        _attr = attr;
    }

    public int getAttr() {
        return _attr;
    }

    public static int min(int a, int b, int c) {
        int min = a;
        min = Math.min(min, b);
        min = Math.min(min, c);
        return min;
    }

    public int div(int a){
        return this._attr/a;
    }
}
