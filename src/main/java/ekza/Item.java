package ekza;

/**
 * Created by elmk93 on 15/04/16.
 */
public class Item {

    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object object){
        value = object;
    }
    Item(Object value){
        setValue(value);
    }
}
