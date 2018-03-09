package in.zemy.com.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import in.zemy.com.dao.GrabInfoFromMysqlDao;
import in.zemy.com.service.ResponseModel;

public class GrabInfoFromMysqlDaoImpl implements GrabInfoFromMysqlDao {

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;

	public GrabInfoFromMysqlDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<ResponseModel> GetAllInfoFromMysql() {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlString = "Select * from magento_config";
		List<Map<String, Object>> results = jdbcTemplate.queryForList(sqlString);
		List<ResponseModel> respModelList = new ArrayList<ResponseModel>();

		for (int i = 0; i < results.size(); i++) {
			ResponseModel responseModel = new ResponseModel();
			Map<String, Object> map = results.get(i);
			responseModel.setClient_id((String) map.get("client_id"));
			responseModel.setClient_base_url((String) map.get("client_base_url"));
			responseModel.setCompany_name((String) map.get("company_name"));
			responseModel.setConsumer_key((String) map.get("consumer_key"));
			responseModel.setConsumer_secret((String) map.get("consumer_secret"));
			responseModel.setOauth_access_token((String) map.get("oauth_access_token"));
			responseModel.setOauth_token_secret((String) map.get("oauth_token_secret"));
			respModelList.add(responseModel);
		}

 		return respModelList;
	}

	public List<ResponseModel> GetSpecificInfoFromMysql(String baseUrl) {
		jdbcTemplate = new JdbcTemplate();
		String sqlString = "Select * from magento_config Where client_base_url='" + baseUrl + "'";
		List<ResponseModel> results = jdbcTemplate.queryForList(sqlString, ResponseModel.class);
		return results;
	}

}
