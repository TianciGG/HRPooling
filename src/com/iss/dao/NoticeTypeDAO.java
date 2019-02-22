package com.iss.dao;

import java.util.List;

import com.iss.modal.NoticeType;

public interface NoticeTypeDAO {
	int deleteByPrimaryKey(Integer noticetypeid);

	int insert(NoticeType record);

	int insertSelective(NoticeType record);

	NoticeType selectByPrimaryKey(Integer noticetypeid);

	int updateByPrimaryKeySelective(NoticeType record);

	int updateByPrimaryKey(NoticeType record);

	List<NoticeType> selectAll();
}