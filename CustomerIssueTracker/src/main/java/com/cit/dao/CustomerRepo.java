package com.cit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cit.model.IssueDetail;

public interface CustomerRepo extends JpaRepository<IssueDetail,Integer> {
	public List<IssueDetail> findBycustIssueId(String custIssueId);
}

