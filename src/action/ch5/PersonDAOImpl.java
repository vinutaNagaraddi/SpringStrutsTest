package action.ch5;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import domain.Person;
public class PersonDAOImpl extends SimpleJdbcDaoSupport implements PersonDAO{

	private static final String SQL_INSERT_SPITTER = 
		      "insert into VINUTA.person (P_ID,LAST_NAME, FIRST_NAME,CITY) " +
		      "values (:personID, :lastName,:firstName,:city)";

	public static final String SQL_SELECT_BY_ID="select * from VINUTA.person where p_id = 1";
	private static final String SQL_UPDATE="update VINUTA.person set LAST_NAME = :lastName," +
			"FIRST_NAME = :firstName, CITY=:city where P_ID = :personID";
	
	//@PreAuthorize ("hasrole('ROLE_ADMIN')")
	public void addPerson(Person person){
		Map<String,Object>  params = new HashMap<String,Object>();
		params.put("personID", person.getPersonID());
		params.put("lastName", person.getLastName());
		params.put("firstName", person.getFirstName());
		params.put("city", person.getCity());
		this.getSimpleJdbcTemplate().update(SQL_INSERT_SPITTER, params);
	}
	
	//@PreAuthorize ("hasrole('ROLE_ADMIN')")
	public void updatePerson(Person person){
		Map<String,Object>  params = new HashMap<String,Object>();
		params.put("personID", person.getPersonID());
		params.put("lastName", person.getLastName());
		params.put("firstName", person.getFirstName());
		params.put("city", person.getCity());
		this.getSimpleJdbcTemplate().update(SQL_UPDATE, params);
		logger.debug(person + "updated!");
	}

	@SuppressWarnings("deprecation")
	//@PreAuthorize ("hasrole('ROLE_SPITTER')")
	//@PostAuthorize("returnObject.person.lastName == 'Naga'")
	public Person getPersonById(Integer personID) {
		// TODO Auto-generated method stub
		return this.getSimpleJdbcTemplate().queryForObject(SQL_SELECT_BY_ID, 
				new RowMapper<Person>(){
			@Override
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Person person = new Person();
				person.setPersonID(rs.getInt(1));
				person.setLastName(rs.getString(2));
				person.setFirstName(rs.getString(3));
				person.setCity(rs.getString(4));
				return person;
			}
		});
	}
}
