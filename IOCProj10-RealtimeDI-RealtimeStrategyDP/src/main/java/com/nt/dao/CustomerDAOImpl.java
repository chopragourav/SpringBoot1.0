package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class CustomerDAOImpl implements ICustomerDAO {
	private  static final String  REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIME_CUSTOMER VALUES(CUSTID_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource ds;
	
	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override 
	public int insert(CustomerBO bo) throws Exception {
		int count=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY)){
			//set values to query parameter
			ps.setString(1, bo.getCustName());
			ps.setString(2, bo.getCustAddrs());
			ps.setFloat(3, bo.getpAmt());
			ps.setFloat(4, bo.getTime());
			ps.setFloat(5, bo.getRate());
			ps.setFloat(6, bo.getIntrestAmount());
			//execute query
			count=ps.executeUpdate();
		}
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
