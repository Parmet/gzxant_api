package com.gzxant.gzxant_api.base.system.role.api;

import org.beetl.sql.core.engine.PageQuery;

import com.gzxant.gzxant_api.base.system.role.bean.BaseRole;

public interface IBaseRole<T extends BaseRole> {

	public T create(T t);
	
	public T get(T t);
	
	public PageQuery<T> getByPage(PageQuery<T> page);
	
	public T edit(T t);
	
	public void delete(T t);
}