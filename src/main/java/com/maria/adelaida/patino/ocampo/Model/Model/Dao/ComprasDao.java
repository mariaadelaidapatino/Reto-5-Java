package com.maria.adelaida.patino.ocampo.Model.Model.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maria.adelaida.patino.ocampo.Model.Model.Util.JDBCUtilities;
import com.maria.adelaida.patino.ocampo.Model.Model.Vo.ComprasVo;

public class ComprasDao {
    public List<ComprasVo> listar() throws SQLException{
        List<ComprasVo> respuesta = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet rset = null;        

        try{
            connection = JDBCUtilities.getConnection();
            statement = (Statement) connection.createStatement();            
            rset =statement.executeQuery("SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado" 
            + " FROM Compra c" 
            + " JOIN Proyecto p ON (c.ID_Proyecto = p.ID_Proyecto)"
            + " WHERE (Proveedor = 'Homecenter'"
            + " AND p.Ciudad = 'Salento');");
            respuesta = new ArrayList<ComprasVo>(); 

            while (rset.next()){
                ComprasVo objeto = new ComprasVo();
                objeto.setId(rset.getInt("ID_Compra"));                
                objeto.setConstructora(rset.getString("Constructora"));
                objeto.setBanco(rset.getString("Banco_Vinculado"));
                respuesta.add(objeto);
            }

        } finally {
            if (rset != null){
                rset.close();
            }
            if (statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
    return respuesta;
    }
}
