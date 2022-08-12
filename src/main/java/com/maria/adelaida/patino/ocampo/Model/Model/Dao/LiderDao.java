package com.maria.adelaida.patino.ocampo.Model.Model.Dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maria.adelaida.patino.ocampo.Model.Model.Util.JDBCUtilities;
import com.maria.adelaida.patino.ocampo.Model.Model.Vo.LiderVo;

public class LiderDao {
    public List<LiderVo> listar() throws SQLException{
        List<LiderVo> respuesta = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet rset = null;        

        try{
            connection = JDBCUtilities.getConnection();
            statement = (Statement) connection.createStatement();            
            rset =statement.executeQuery("SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia" 
            + " FROM Lider l" 
            + " ORDER BY Ciudad_Residencia;");
            respuesta = new ArrayList<LiderVo>(); 

            while (rset.next()){
                LiderVo objeto = new LiderVo();
                objeto.setId(rset.getInt("ID_Lider"));                
                objeto.setNombre(rset.getString("Nombre"));
                objeto.setPrimer_apellido(rset.getString("Primer_Apellido"));
                objeto.setCiudad(rset.getString("Ciudad_Residencia"));
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
