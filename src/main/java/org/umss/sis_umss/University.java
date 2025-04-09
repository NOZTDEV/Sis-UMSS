package org.umss.sis_umss;

public class University {
    private String name;
    private String code;
    private Long id;
    private String uuid;

    public University(String code, String name) {
        this.code = code;
        this.name = name;
    }
    //Gets
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public Long getId(){
        return id;
    }
    public String getUuid(){
        return uuid;
    }
    //Sets
    public void setName(String name){
        this.name = name;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setUuid(String uuid){
        this.uuid = uuid;
    }
}
