package ua.inf.sviat.springsecurityapp.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.inf.sviat.springsecurityapp.dao.ProducerGpuDao;
import ua.inf.sviat.springsecurityapp.model.ProducerGpu;
import ua.inf.sviat.springsecurityapp.service.ProducerGpuService;

import java.util.List;

/**
 * Created by Sviatoslav on 23.04.2017.
 */
@Service
public class ProducerGpuServiceImpl implements ProducerGpuService {

    @Autowired
    private ProducerGpuDao producerGpuDao;

    @Override
    public ProducerGpu findOne(Long id) {
        return producerGpuDao.findOne(id);
    }

    @Override
    public List<ProducerGpu> findAll() {
        return producerGpuDao.findAll();
    }

    @Override
    public void save(ProducerGpu entity) {
        producerGpuDao.save(entity);
    }

    @Override
    public void delete(Long id) {
        producerGpuDao.delete(id);
    }
}
