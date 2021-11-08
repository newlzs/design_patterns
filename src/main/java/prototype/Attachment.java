package prototype;

import java.io.Serializable;

/**
 * @author Lzs
 * @date 2021/11/3 22:36
 * @description
 */
public class Attachment implements Serializable {
    private int id;
    private String name;

    public Attachment(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}