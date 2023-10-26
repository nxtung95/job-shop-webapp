package job_shop.dao;

import job_shop.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao extends BaseDao {
	public List<Customer> findAll() {
		Connection connection = null;
		PreparedStatement ps = null;
		List<Customer> customerList = new ArrayList<>();
		try {
			connection = getConnection();
			StringBuilder sql = new StringBuilder("SELECT * FROM customer ORDER BY name ASC");
			ps = connection.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int customerId = rs.getInt("customer_id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int category = rs.getInt("category");
				Customer customer = new Customer(customerId, name, address, category);
				customerList.add(customer);
			}
			return customerList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(connection, ps, null);
		}
		return customerList;
	}

	public List<Customer> findAllByCategory(int categoryId1, int categoryId2) {
		Connection connection = null;
		PreparedStatement ps = null;
		List<Customer> customerList = new ArrayList<>();
		try {
			connection = getConnection();
			StringBuilder sql = new StringBuilder("SELECT * FROM customer WHERE category BETWEEN ? AND ? ORDER BY name ASC");
			ps = connection.prepareStatement(sql.toString());
			ps.setInt(1, categoryId1);
			ps.setInt(2, categoryId2);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int customerId = rs.getInt("customer_id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int category = rs.getInt("category");
				Customer customer = new Customer(customerId, name, address, category);
				customerList.add(customer);
			}
			return customerList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(connection, ps, null);
		}
		return customerList;
	}
}
