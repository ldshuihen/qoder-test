package com.example.qodertest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.qodertest.entity.User;
import com.example.qodertest.mapper.UserMapper;
import com.example.qodertest.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
