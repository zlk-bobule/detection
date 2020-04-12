package com.nju.detection.repository;


import com.nju.detection.domain.NodeEdge;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface NodeEdgeRepository extends Neo4jRepository<NodeEdge,Long>{
}
