package com.jayce.service.impl.auth;

import com.jayce.common.auth.realm.StatelessRealm;
import com.jayce.common.auth.token.AuthenticateInfo;
import com.jayce.dao.auth.StatelessSessionMapper;
import com.jayce.pojo.auth.StatelessSession;
import com.jayce.pojo.auth.StatelessSessionExample;
import com.jayce.service.def.auth.SessionService;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Jaycejia on 2016/12/4.
 */
@Transactional
@Service("sessionService")
public class SessionServiceImpl implements SessionService{
    @Autowired
    private StatelessSessionMapper sessionMapper;
    @Autowired
    private StatelessRealm realm;
    private static final byte[] lock = new byte[0];
    @Override
    public StatelessSession getSessionByClientId(String clientId) {
        return null;
    }

    @Override
    public boolean isExpired(StatelessSession session) {
        return false;
    }

    @Override
    public boolean userHasLogin(Long userId) {
        return false;
    }

    @Override
    public void register(StatelessSession session) throws Exception {

    }

    @Override
    public void refresh(StatelessSession session) throws Exception {

    }

    @Override
    public void clean(StatelessSession session) throws AuthenticationException {

    }

    @Override
    public String registerAccessToken(AuthenticateInfo authcInfo) throws Exception {
        return null;
    }

    /**
     * 初始化查询参数
     */
    private StatelessSessionExample getExampleBySession(StatelessSession session) {
        StatelessSessionExample example = new StatelessSessionExample();
        StatelessSessionExample.Criteria clientIdCriteria = example.createCriteria();
        StatelessSessionExample.Criteria userIdCriteria = example.createCriteria();
        StatelessSessionExample.Criteria tokenCriteria = example.createCriteria();
        clientIdCriteria.andClientIdEqualTo(session.getClientId());
        tokenCriteria.andTokenEqualTo(session.getToken());
        userIdCriteria.andUserIdEqualTo(session.getUserId());
        example.or(userIdCriteria);
        example.or(tokenCriteria);
        return example;
    }
}
