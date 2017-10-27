package com.observer.action;

public interface ICat {

	//添加观察者
	abstract void addObserver(Observers o);
	//删除观察者
	void removeObserver(Observers o);
	//对观察者实现通知
	void notifys();
}
