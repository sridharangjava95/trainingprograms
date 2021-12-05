package com.hsbc.springboottrainingdatafromtodb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.springboottrainingdatafromtodb.model.RoomTenant;

public interface RoomTenantDao  extends JpaRepository<RoomTenant, Integer>{

}
