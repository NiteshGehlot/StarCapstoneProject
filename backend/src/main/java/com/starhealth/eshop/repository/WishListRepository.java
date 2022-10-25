package com.starhealth.eshop.repository;


import com.starhealth.eshop.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {

    List<WishList> findAllByUserIdOrderByCreatedDateDesc(Integer userId);


}
