package Section3_1.wildcards;

public class Pair<K, V>

{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "A Chave é: " + key + ", O valor é: " + value;
    }

}
