package com.gzxant.gzxant_api.base.shop.product.api;

import org.beetl.sql.core.engine.PageQuery;

import com.gzxant.gzxant_api.base.shop.product.bean.BaseProduct;

public interface IBaseProduct<T extends BaseProduct> {

	public T create(T t);
	
	public PageQuery<T> getByPage(PageQuery<T> page);
	
	public T get(T t);
	
	public T update(T t);
	
	public void delete(T t);
}
