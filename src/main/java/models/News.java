package models;

import java.util.Objects;

public class News {
    private String heading;
    private String content;
    private int departId;
    private int id;


    public News(String heading,String content,int departId ){
        this.heading=heading;
        this.content=content;
        this.departId=departId;
    }

    public String getDepartName(){
        return heading;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }
    public String getDepartDescription(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public int getDepartId(){
        return departId;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News) )return false;
        News news = (News) o;
        return id == news.id &&
                departId == news.departId &&
                Objects.equals(content, news.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, id, departId);
    }

}
