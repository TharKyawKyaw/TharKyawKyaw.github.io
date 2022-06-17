package day20;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseHandler {

	public static boolean promoteSalary(double salary) {
		
		boolean result = false;
		try(Connection con = MyConnection.createConnection()) {
			
			String query = "UPDATE employees SET salary =  salary + ?";
			
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setDouble(1, salary);
			
			int i = pstm.executeUpdate();
			if(i > 0)
				result = true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
		
	}

	public static void deleteByCity(String city) {
		
		try(Connection con = MyConnection.createConnection()) {
			
			String query = "DELETE FROM employees WHERE city = ?";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, city);
			
			pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	public static void manageTransction(ArrayList<Employee> empList) throws SQLException {
		
		Connection con = null;
		try {
			con = MyConnection.createConnection();
			String insert1 = "INSERT INTO employees(empNo,email,password,city,salary,birthday)"
					+ "VALUES(?,?,?,?,?,?)";
			String insert2 = "INSERT INTO employees(empNo,email,password,city,salary,birthday)"
					+ "VALUES(?,?,?,?,?,?)";
			
			Employee emp1 = empList.get(0);
			Employee emp2 = empList.get(1);
			
			// disable auto-commit
			con.setAutoCommit(false);
			
			// query
			PreparedStatement pstm = con.prepareStatement(insert1);
			pstm.setInt(1, emp1.getEmpId());
			pstm.setString(2, emp1.getEmail());
			pstm.setString(3, emp1.getPassword());
			pstm.setString(4, emp1.getCity());
			pstm.setDouble(5,emp1.getSalary());
			pstm.setDate(6,Date.valueOf(emp1.getBirthday()));
			
			pstm.executeUpdate();	// 1
			
			pstm = con.prepareStatement(insert2);
			pstm.setInt(1, emp2.getEmpId());
			pstm.setString(2, emp2.getEmail());
			pstm.setString(3, emp2.getPassword());
			pstm.setString(4, emp2.getCity());
			pstm.setDouble(5,emp2.getSalary());
			pstm.setDate(6,Date.valueOf(emp2.getBirthday()));

			pstm.executeUpdate();	// 2
			
			// commit
			con.commit();
			
			
			
			
			
		} catch (Exception e) {
			con.rollback();
			e.printStackTrace();
		}
		finally {
			if(con != null)
				con.close();
		}
	}
	
	
	public static void saveEmployee(ArrayList<Employee> empList) {
		
		try(Connection con = MyConnection.createConnection()) {
			
			String query = "INSERT INTO employees(empNo,email,password,city,salary,birthday)"
					+ "VALUES(?,?,?,?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			for(var emp: empList) {
				pstm.setInt(1, emp.getEmpId());
				pstm.setString(2, emp.getEmail());
				pstm.setString(3, emp.getPassword());
				pstm.setString(4, emp.getCity());
				pstm.setDouble(5,emp.getSalary());
				pstm.setDate(6,Date.valueOf(emp.getBirthday()));
				
				pstm.addBatch();
			}
			
			pstm.executeBatch();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
