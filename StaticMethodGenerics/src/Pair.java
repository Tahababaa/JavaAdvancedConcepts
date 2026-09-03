public class Pair <T,V>{
    private T x;
    private V y;
    public static <X> void print(X something){// separate generic for static methods

        System.out.println(something);
    }
    public Pair(T x, V y) {
        this.x = x;
        this.y = y;
    }
    public Pair() {

    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }
}
