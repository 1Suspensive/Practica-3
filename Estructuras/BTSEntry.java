package Estructuras;

public class BTSEntry {
    private Object data;
    private int k;

    public BTSEntry(Object e, int k) {
        this.data = e;
        this.k = k;
    }

    public Object getData() {
        return data;
    }

    public int getKey() {
        return k;
    }

    public void setData(Object d) {
        data = d;
    }

    public void setKey(int k) {
        this.k = k;
    }
}
