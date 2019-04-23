package com.uguryasar.edu.marketing.da.repository;

import com.uguryasar.edu.marketing.da.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<ItemEntity, Long> {
}
