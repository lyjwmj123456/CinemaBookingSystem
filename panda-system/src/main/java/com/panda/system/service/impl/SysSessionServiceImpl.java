package com.panda.system.service.impl;

import com.panda.system.domin.SysSession;
import com.panda.system.domin.vo.SysSessionVo;
import com.panda.system.mapper.SysSessionMapper;
import com.panda.system.service.SysSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysSessionServiceImpl implements SysSessionService {

    @Autowired
    private SysSessionMapper sysSessionMapper;

    @Override
    public List<SysSession> findByVo(SysSessionVo sysSessionVo) {
        return sysSessionMapper.findByVo(sysSessionVo);
    }

    @Override
    public List<SysSession> findByMovieIdOrHallId(SysSession sysSession) {
        return sysSessionMapper.findByMovieIdOrHallId(sysSession);
    }

    @Override
    public SysSession findById(Long id) {
        return sysSessionMapper.findById(id);
    }

    @Override
    public SysSession findOne(Long id) {
        return sysSessionMapper.findOne(id);
    }

    @Override
    public int add(SysSession sysSession) {
        return sysSessionMapper.add(sysSession);
    }

    @Override
    public int update(SysSession sysSession) {
        return sysSessionMapper.update(sysSession);
    }

    @Override
    public int delete(Long[] ids) {
        int rows = 0;
        for (Long id : ids) {
            rows += sysSessionMapper.delete(id);
        }
        return rows;
    }

    @Override
    public List<SysSession> findByCinemaAndMovie(Long cinemaId, Long movieId) {
        return sysSessionMapper.findByCinemaAndMovie(cinemaId, movieId);
    }
}
