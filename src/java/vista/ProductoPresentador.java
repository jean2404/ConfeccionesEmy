package vista;

import java.util.ArrayList;
import java.util.List;

public class ProductoPresentador {

    private String msg = "";
    private Object[] fil = {"", "", "", "", "", "", "", ""};
    private List lis = new ArrayList();

    public ProductoPresentador() {
        lis.add(fil);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object[] getFil() {
        return fil;
    }

    public void setFil(Object[] fil) {
        this.fil = fil;
    }

    public List getLis() {
        return lis;
    }

    public void setLis(List lis) {
        this.lis = lis;
    }

}
