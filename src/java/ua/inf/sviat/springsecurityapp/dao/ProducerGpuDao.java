package ua.inf.sviat.springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.inf.sviat.springsecurityapp.model.ProducerGpu;

/**
 * Created by Sviatoslav on 24.04.2017.
 */
public interface ProducerGpuDao extends JpaRepository<ProducerGpu, Long> {
}
