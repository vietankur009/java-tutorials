package com.lhotse.core.team.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Test5 {

    public void rethrow() throws SQLException, IOException {
        /*try{
            int i;
        }catch(IOException | SQLException e){
            e = new IOException();
            throw e;
        }catch(Exception e){
            e = new SQLException();
            throw e;
        }*/
    }
}
