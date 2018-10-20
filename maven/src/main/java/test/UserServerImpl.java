package test;

import mybatis.simple.model.User;
import mybatis.simple.model.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserServerImpl implements UserServer{
    @Autowired
    private UserMapper mapper;

    @Override
    public boolean add(User user) {
        return mapper.insert(user) > 0;
    }

    public List<User> findAll() {
        return mapper.selectByExample(null);
    }
}
