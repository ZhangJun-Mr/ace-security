package com.github.wxiaoqi.security.auth.mapper;

import com.github.wxiaoqi.security.auth.entity.Client;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ClientMapper extends Mapper<Client> {

    List<String> selectAllowedClient(String serviceId);

    List<Client> selectAuthorityServiceInfo(int clientId);
}