package model.music;

/**
 * Created by Administrator on 2017/2/19.
 */
public class MusicDetail {
    private long id;
    private long eid;
    private String source;
    private String name;
    private String pic;
    private long almbid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public long getAlmbid() {
        return almbid;
    }

    public void setAlmbid(long almbid) {
        this.almbid = almbid;
    }
}
