/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sagit
 */
public class PerfilPresentador {
     private String msg = "";
    private Object[] fil = {"", "", "", "", "",""}; //datos del perfil del empleado
    private List lis = new ArrayList();

    public PerfilPresentador() {
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
