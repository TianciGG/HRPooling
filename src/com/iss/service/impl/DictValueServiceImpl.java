package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.DictValueMapper;
import com.iss.modal.DictValue;
import com.iss.service.DictValueService;

@Service
public class DictValueServiceImpl implements DictValueService {

	@Autowired
	private DictValueMapper dictValueMapper;

	@Override
	public List<DictValue> DictTypeId(Integer id) {

		List<DictValue> dictValueList = dictValueMapper.selectByTypeId(id);

		return dictValueList;
	}

}
