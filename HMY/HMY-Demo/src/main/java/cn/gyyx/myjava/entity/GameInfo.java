package cn.gyyx.myjava.entity;

import java.io.Serializable;
/*
 * ”Œœ∑ µÃÂ*
 */
public class GameInfo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -865689314551382884L;
	private int code;
	private String name; 
	
	public int getCode()
	{
		return code;
	}
	
	public void setCode(int code)
	{
		this.code = code;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}