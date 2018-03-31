package com.gzxant.gzxant_api.base.shop.pay.api;

import com.gzxant.gzxant_api.base.shop.pay.bean.BasePay;

public interface IBasePay<T extends BasePay> {
    
	public T pay(T t);
	
	public T get(T t);
	
	public int getState();
	
	public boolean isPay(T t);
	
	public void cancel(T t);
	
}
