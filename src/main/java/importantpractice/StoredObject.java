package importantpractice;

public class StoredObject {
    private String key;
    private Integer value;

    public StoredObject(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StoredObject{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
