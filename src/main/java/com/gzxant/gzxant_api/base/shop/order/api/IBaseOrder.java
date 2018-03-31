package com.gzxant.gzxant_api.base.shop.order.api;

import org.beetl.sql.core.engine.PageQuery;

import com.gzxant.gzxant_api.base.shop.order.bean.BaseOrder;

public interface IBaseOrder<T extends BaseOrder> {
	
	public T create(T t);
	
	public PageQuery<T> getByPage(PageQuery<T> page);
	
	public T get(T t);
	
	public void delete(T t);
	
	public void cancel(T t);
}
