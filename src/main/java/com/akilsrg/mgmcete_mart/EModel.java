package com.akilsrg.mgmcete_mart;

public class EModel {

    private String ed1, ed2, ed3;
    private String imgView;

    public EModel() {
    }

    public EModel(String ed1, String ed2, String ed3, String imgView) {
        this.ed1 = ed1;
        this.ed2 = ed2;
        this.ed3 = ed3;
        this.imgView = imgView;
    }

    public String getEd1() {
        return ed1;
    }

    public void setEd1(String ed1) {
        this.ed1 = ed1;
    }

    public String getEd2() {
        return ed2;
    }

    public void setEd2(String ed2) {
        this.ed2 = ed2;
    }

    public String getEd3() {
        return ed3;
    }

    public void setEd3(String ed3) {
        this.ed3 = ed3;
    }

    public String getImgView() {
        return imgView;
    }

    public void setImgView(String imgView) {
        this.imgView = imgView;
    }
}
