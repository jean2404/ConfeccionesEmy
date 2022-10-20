/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;

/**
 *
 * @author sagit
 */
public class CategoriaDaoImp implements CategoriaDao {

    @Override
    public List listar() {
        return Operacion.listar("select * from categoria");
    }

}
