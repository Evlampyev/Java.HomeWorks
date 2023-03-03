package Les6;
public class Nout {
    private Integer id;
    private Integer RAM;
    private Integer HDD;
    private String Os;
    private String Color;

    public Nout(Integer id, Integer RAM, Integer HDD, String Os, String Color) {
        this.id = id;
        this.RAM = RAM;
        this.HDD = HDD;
        this.Os = Os;
        this.Color = Color;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public void setOs(String Os) {
        this.Os = Os;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRAM() {
        return this.RAM;
    }

    public Integer getHDD() {
        return this.HDD;
    }

    public Integer getId() {
        return this.id;
    }

    public String getOs() {
        return this.Os;
    }

    public String getColor() {
        return this.Color;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Id: %d, RAM: %d, HDD: %d,  ОС: %s, цвет: %s.",
                id, RAM, HDD, Os, Color);
    }

}
