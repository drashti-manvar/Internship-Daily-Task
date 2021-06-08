package com.example.gridlayout;

public class movieData {

    private String iname;
    private String desc;
    private String iprice;
    private int image;



    public movieData(String iname, String desc, String iprice, int image) {
        this.iname = iname;
        this.desc = desc;
        this.iprice = iprice;
        this.image = image;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIprice() {
        return iprice;
    }

    public void setIprice(String iprice) {
        this.iprice = iprice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
