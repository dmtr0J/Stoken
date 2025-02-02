package com.dmtr.stoken.domain.repositories;

import com.dmtr.stoken.domain.entities.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssetRepository extends JpaRepository<Asset, UUID> {
}
