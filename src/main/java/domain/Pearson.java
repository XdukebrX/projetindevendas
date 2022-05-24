package domain;

public class Pearson {
    private  Integer id;
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pearson() {
        super();
    }

    public Pearson(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
