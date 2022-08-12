package com.maria.adelaida.patino.ocampo.Model.Model.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maria.adelaida.patino.ocampo.Model.Model.Util.JDBCUtilities;
import com.maria.adelaida.patino.ocampo.Model.Model.Vo.ProyectosVo;

public class ProyectosDao {

    public List<ProyectosVo> listar() throws SQLException{
        List<ProyectosVo> respuesta = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet rset = null;        

        try{
            connection = JDBCUtilities.getConnection();
            statement = connection.createStatement();
            rset = statement.executeQuery("SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad" 
            + " FROM Proyecto p"
            + " WHERE (Clasificacion = 'Casa Campestre'"
            + " AND (Ciudad = 'Santa Marta'" 
            + " OR Ciudad = 'Cartagena'"
            + " OR Ciudad = 'Barranquilla'));");
            
            respuesta = new ArrayList<ProyectosVo>(); 

            while (rset.next()){
                ProyectosVo objeto = new ProyectosVo();
                objeto.setId(rset.getInt("ID_Proyecto"));
                objeto.setConstructora(rset.getString("Constructora"));
                objeto.setHabitaciones(rset.getInt("Numero_Habitaciones"));
                objeto.setBanco(rset.getString("Ciudad"));
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
