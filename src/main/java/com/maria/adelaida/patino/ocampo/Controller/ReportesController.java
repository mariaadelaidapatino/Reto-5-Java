package com.maria.adelaida.patino.ocampo.Controller;

import com.maria.adelaida.patino.ocampo.Model.Model.Dao.LiderDao;
import com.maria.adelaida.patino.ocampo.Model.Model.Dao.ProyectosDao;
import com.maria.adelaida.patino.ocampo.Model.Model.Vo.ComprasVo;
import com.maria.adelaida.patino.ocampo.Model.Model.Vo.LiderVo;
import com.maria.adelaida.patino.ocampo.Model.Model.Vo.ProyectosVo;

import java.sql.SQLException;
import java.util.List;

import com.maria.adelaida.patino.ocampo.Model.Model.Dao.ComprasDao;

public class ReportesController {
    private ProyectosDao proyectosDao;
    private LiderDao liderDao;
    private ComprasDao comprasDao;

    public ReportesController(){
        this.proyectosDao = new ProyectosDao();
        this.comprasDao = new ComprasDao();
        this.liderDao = new LiderDao();
    }

    public List<ProyectosVo> proyectos() throws SQLException{
        return proyectosDao.listar();     
    }
     
    public List<LiderVo> lideres() throws SQLException{
        return liderDao.listar();
    }

    public List<ComprasVo> compras() throws SQLException{
        return  comprasDao.listar();
    }
}
