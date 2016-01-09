package com.hjd.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class StudentDao {
	
	@Resource(name="jdbcTemplate")
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/*
	 * insert语句
	 */
	public void save(){
		String sql = "insert into Student(id,name,gender) values(5,'hjd','m')";
		jdbcTemplate.update(sql);
	}
	
	/*
	 * 根据id查询
	 */
	public void findById(int id){
		String sql = "select * from student where id = ?";
		Map<String,Object> result = jdbcTemplate.queryForMap(sql, id);
		System.out.println(result);
	}
	
	/*
	 *查询所有 
	 */
	public void findAll(){
		String sql = "select * from student";
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
		System.out.println(result);
	}
	
	/*
	 * 查询所有,手动封装
	 */
	public void findAllByHanlde(){
		String sql = "select * from student";
		List<Map<String, Object>> result = jdbcTemplate.query(sql, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int index) throws SQLException {
				
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setGener(rs.getString(3));
				
				return student;
			}
		});
		System.out.println(result);
	}
	
	/*
	 * 根据id查询,手动封装
	 */
	public void findByIdByHanlde(int id){
		String sql = "select * from student where id = ?";
		List<Map<String, Object>> result = jdbcTemplate.query(sql, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int index) throws SQLException {
				
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setGener(rs.getString(3));
				
				return student;
			}
		},id);
		System.out.println(result);
	}
}
