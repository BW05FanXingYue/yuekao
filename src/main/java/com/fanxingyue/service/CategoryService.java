package com.fanxingyue.service;

import java.util.List;

import com.fanxingyue.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
