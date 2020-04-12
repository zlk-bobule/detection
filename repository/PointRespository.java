package com.nju.detection.repository;

import com.nju.detection.domain.PointNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PointRespository extends Neo4jRepository<PointNode,Long> {
}
