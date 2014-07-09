package cn.gyyx.myjava.entity;

import java.io.Serializable;
/*
 * 服务器实体
 * */
public class ServerInfo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 591379754231892432L;
	private int code;
	private int gameId;
	private String name;
	
	public int getCode()
	{
		return code;
	}
	
	public void setCode(int code)
	{
		this.code = code;
	}
	
	public int getGameId()
	{
		return gameId;
	}
	
	public void setGameId(int gameId)
	{
		this.gameId = gameId;
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