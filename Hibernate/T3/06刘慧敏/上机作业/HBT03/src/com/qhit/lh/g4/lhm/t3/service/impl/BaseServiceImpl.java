/**
 * 
 */
package com.qhit.lh.g4.lhm.t3.service.impl;

import java.util.List;

import com.qhit.lh.g4.lhm.t3.dao.BaseDao;
import com.qhit.lh.g4.lhm.t3.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.lhm.t3.service.BaseService;



/**
 * @author 刘慧敏
 *2017-12-13下午5:16:38
 * TODO
 */
public class BaseServiceImpl implements BaseService {

	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> queryAll(String tableName) {
		// TODO Auto-generated method stub
		return baseDao.queryAll(tableName);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.lhm.t3.service.BaseService#getObjectById(java.lang.Class, int)
	 */
	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

}
