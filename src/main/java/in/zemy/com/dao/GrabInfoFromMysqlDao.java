package in.zemy.com.dao;

import java.util.List;

import in.zemy.com.service.ResponseModel;

public interface GrabInfoFromMysqlDao {

	List<ResponseModel> GetAllInfoFromMysql();

	List<ResponseModel> GetSpecificInfoFromMysql(String baseUrl);

}
